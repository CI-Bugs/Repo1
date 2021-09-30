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
package org.datacleaner.beans;

import javax.inject.Named;

import org.datacleaner.api.Categorized;
import org.datacleaner.api.Configured;
import org.datacleaner.api.Description;
import org.datacleaner.api.InputColumn;
import org.datacleaner.api.InputRow;
import org.datacleaner.api.OutputColumns;
import org.datacleaner.api.Transformer;
import org.datacleaner.components.categories.StringManipulationCategory;

import com.ibm.icu.text.Transliterator;

@Named("Transliterate")
@Description("Converts non-latin characters to latin (or even ASCII) characters.")
@Categorized(StringManipulationCategory.class)
public class TransliterateTransformer implements Transformer {

	@Configured
	InputColumn<String> column;

	@Configured(required = false)
	@Description("Should latin characters and diacritics be converted to plain ASCII?")
	boolean latinToAscii = true;

	private final Transliterator latinTransliterator = Transliterator.getInstance("Any-Latin");
	private final Transliterator asciiTransformer = Transliterator.getInstance("Latin-ASCII");

	@Override
	public OutputColumns getOutputColumns() {
		return new OutputColumns(String.class, column.getName() + " (transliterated)");
	}

	@Override
	public String[] transform(InputRow inputRow) {
		String value = inputRow.getValue(column);
		if (value == null) {
			return new String[1];
		}
		value = latinTransliterator.transform(value);
		if (latinToAscii) {
			value = asciiTransformer.transform(value);
		}
		return new String[] { value };
	}

}
