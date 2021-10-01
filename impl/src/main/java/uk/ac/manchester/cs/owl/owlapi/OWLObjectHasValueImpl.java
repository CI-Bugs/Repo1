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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectHasValueImpl extends OWLValueRestrictionImpl<OWLIndividual>implements OWLObjectHasValue {

    private final @Nonnull OWLObjectPropertyExpression property;

    @Override
    protected int index() {
        return OWLObjectTypeIndexProvider.CLASS_EXPRESSION_TYPE_INDEX_BASE + 7;
    }

    /**
     * @param property
     *        property
     * @param value
     *        value
     */
    public OWLObjectHasValueImpl(OWLObjectPropertyExpression property, OWLIndividual value) {
        super(value);
        this.property = checkNotNull(property, "property cannot be null");
    }

    @Override
    public OWLObjectPropertyExpression getProperty() {
        return property;
    }

    @Override
    public ClassExpressionType getClassExpressionType() {
        return ClassExpressionType.OBJECT_HAS_VALUE;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return obj instanceof OWLObjectHasValue && getProperty().equals(((OWLObjectHasValue) obj).getProperty());
    }

    @Override
    protected int compareObjectOfSameType(OWLObject object) {
        OWLObjectHasValue other = (OWLObjectHasValue) object;
        int diff = getProperty().compareTo(other.getProperty());
        if (diff != 0) {
            return diff;
        }
        return value.compareTo(other.getFiller());
    }

    @Override
    public OWLClassExpression asSomeValuesFrom() {
        return new OWLObjectSomeValuesFromImpl(getProperty(),
            new OWLObjectOneOfImpl(getFiller()));
    }
}