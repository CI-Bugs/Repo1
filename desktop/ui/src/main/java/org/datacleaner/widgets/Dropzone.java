/**
 * DataCleaner (community edition)
 * Copyright (C) 2014 Neopost - Customer Information Management
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.datacleaner.widgets;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.TransferHandler;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import org.datacleaner.connection.Datastore;
import org.datacleaner.panels.DCPanel;
import org.datacleaner.user.DatastoreSelectedListener;
import org.datacleaner.user.MutableDatastoreCatalog;
import org.datacleaner.user.UserPreferences;
import org.datacleaner.util.DatastoreCreationUtil;
import org.datacleaner.util.FileFilters;
import org.datacleaner.util.IconUtils;
import org.datacleaner.util.WidgetFactory;
import org.datacleaner.util.WidgetUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A dropzone where the user can drop files to register them as datastores.
 */
public class Dropzone extends DCPanel {

    private static final Logger logger = LoggerFactory.getLogger(Dropzone.class);
    private static final long serialVersionUID = 1L;

    private final MutableDatastoreCatalog _datastoreCatalog;
    private final DatastoreSelectedListener _datastoreSelectListener;
    private final UserPreferences _userPreferences;

    public Dropzone(final MutableDatastoreCatalog datastoreCatalog,
            final DatastoreSelectedListener datastoreSelectListener, final UserPreferences userPreferences) {
        super(WidgetUtils.BG_SEMI_TRANSPARENT);
        _datastoreCatalog = datastoreCatalog;
        _datastoreSelectListener = datastoreSelectListener;
        _userPreferences = userPreferences;
        setLayout(new GridBagLayout());

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBorder(new CompoundBorder(BorderFactory.createDashedBorder(WidgetUtils.BG_COLOR_MEDIUM, 3f, 3.0f, 3.0f,
                false), new EmptyBorder(30, 30, 30, 30)));

        final DCLabel dropFileLabel = DCLabel.dark("<html><b>Drop file</b> here</html>");
        dropFileLabel.setFont(WidgetUtils.FONT_BANNER);
        add(dropFileLabel, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
                GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));

        final JButton orClickButton = WidgetFactory.createPrimaryButton("(or click to browse)", IconUtils.FILE_FILE);
        orClickButton.setFont(WidgetUtils.FONT_HEADER2);
        orClickButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(orClickButton, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER,
                GridBagConstraints.NONE, new Insets(0, 0, 10, 0), 0, 0));

        orClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFileChooser();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showFileChooser();
            }
        });

        makeDroppable();
    }

    protected void showFileChooser() {
        final DCFileChooser fileChooser = new DCFileChooser(_userPreferences.getOpenDatastoreDirectory());
        fileChooser.addChoosableFileFilter(FileFilters.ALL);
        fileChooser.setFileFilter(FileFilters.allDataFiles());

        final int result = fileChooser.showOpenDialog(Dropzone.this);
        if (result == JFileChooser.APPROVE_OPTION) {
            final File file = fileChooser.getSelectedFile();

            if (file.exists()) {
                final Datastore datastore = DatastoreCreationUtil.createAndAddUniqueDatastoreFromFile(
                        _datastoreCatalog, file);
                _datastoreSelectListener.datastoreSelected(datastore);

                final File directory;
                if (file.isFile()) {
                    directory = file.getParentFile();
                } else if (file.isDirectory()) {
                    directory = file;
                } else {
                    directory = _userPreferences.getOpenDatastoreDirectory();
                }
                _userPreferences.setOpenDatastoreDirectory(directory);
            }
        }
    }

    private void makeDroppable() {
        TransferHandler handler = new TransferHandler() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean canImport(TransferHandler.TransferSupport info) {
                // we only import FileList
                if (!info.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                    return false;
                }
                return true;
            }

            @SuppressWarnings("unchecked")
            @Override
            public boolean importData(TransferHandler.TransferSupport info) {
                if (!info.isDrop()) {
                    return false;
                }

                // Check for FileList flavor
                if (!info.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                    logger.warn("List doesn't accept a drop of this type.");
                    return false;
                }

                // Get the fileList that is being dropped.
                Transferable t = info.getTransferable();
                List<File> data;
                try {
                    data = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
                } catch (Exception e) {
                    return false;
                }
                if (data.size() != 1) {
                    logger.warn("Only one file/directory supported.");
                    return false;
                }
                File file = data.get(0);
                if (!file.exists()) {
                    return false;
                }

                Datastore datastore = DatastoreCreationUtil
                        .createAndAddUniqueDatastoreFromFile(_datastoreCatalog, file);
                _datastoreSelectListener.datastoreSelected(datastore);
                return true;
            }

        };
        setTransferHandler(handler);
    }

}
