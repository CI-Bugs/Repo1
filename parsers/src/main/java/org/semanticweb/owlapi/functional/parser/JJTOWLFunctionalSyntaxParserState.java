/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. JJTOWLFunctionalSyntaxParserState.java Version 5.0 */
package org.semanticweb.owlapi.functional.parser;

@SuppressWarnings("unused")
class JJTOWLFunctionalSyntaxParserState {

    private java.util.List<Node> nodes;
    private java.util.List<Integer> marks;
    // number of nodes on stack
    private int sp;
    // current mark
    private int mk;
    private boolean node_created;

    JJTOWLFunctionalSyntaxParserState() {
        nodes = new java.util.ArrayList<Node>();
        marks = new java.util.ArrayList<Integer>();
        sp = 0;
        mk = 0;
    }

    boolean nodeCreated() {
        return node_created;
    }

    void reset() {
        nodes.clear();
        marks.clear();
        sp = 0;
        mk = 0;
    }

    Node rootNode() {
        return nodes.get(0);
    }

    void pushNode(Node n) {
        nodes.add(n);
        ++sp;
    }

    Node popNode() {
        if (--sp < mk) {
            mk = marks.remove(marks.size() - 1);
        }
        return nodes.remove(nodes.size() - 1);
    }

    Node peekNode() {
        return nodes.get(nodes.size() - 1);
    }

    int nodeArity() {
        return sp - mk;
    }

    void clearNodeScope(Node n) {
        while (sp > mk) {
            popNode();
        }
        mk = marks.remove(marks.size() - 1);
    }

    void openNodeScope(Node n) {
        marks.add(mk);
        mk = sp;
        n.jjtOpen();
    }

    void closeNodeScope(Node n, int _num) {
        int num = _num;
        mk = marks.remove(marks.size() - 1);
        while (num-- > 0) {
            Node c = popNode();
            c.jjtSetParent(n);
            n.jjtAddChild(c, num);
        }
        n.jjtClose();
        pushNode(n);
        node_created = true;
    }

    void closeNodeScope(Node n, boolean condition) {
        if (condition) {
            int a = nodeArity();
            mk = marks.remove(marks.size() - 1);
            while (a-- > 0) {
                Node c = popNode();
                c.jjtSetParent(n);
                n.jjtAddChild(c, a);
            }
            n.jjtClose();
            pushNode(n);
            node_created = true;
        } else {
            mk = marks.remove(marks.size() - 1);
            node_created = false;
        }
    }
}
/*
 * JavaCC - OriginalChecksum=f9fdb4aab44f4de0f4e5ba334d66ad6b (do not edit this
 * line)
 */
