/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd05;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * Element judgment is used for describing the structure and content of a judgment
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Judgment extends JudgmentStructureComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, 1, new Meta())
                    , new StructureIndicator.DefaultElement(0, 1, new CoverPage())
                    , new StructureIndicator.DefaultElement(1, 1, new Header())
                    , new StructureIndicator.DefaultElement(1, 1, new JudgmentBody())
                    , new StructureIndicator.DefaultElement(0, 1, new Conclusions())
                    , new StructureIndicator.DefaultElement(0, 1, new Attachments())
                    , new StructureIndicator.DefaultElement(0, 1, new Components())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("data-type", "judgment");
        span.setAttribute("data-ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05");
        span.setClassName("widget judgment");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>Judgment</code> object and set up its type
     */
    public Judgment() {
        super(create());
        setType("judgment");
    }

    /**
     * Constructor with required attributes
     */
    public Judgment(StringSimpleType nameAttr) {
        this();
        setNameAttr(nameAttr);
    }


    /**
     * Create a <code>Judgment</code> object with the given DOM element
     */
    public Judgment(Element element) {
        super(element);
    }

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>containsAttr</code> property in DSL way
     *
     * @param containsAttr new value
     * @return <code> Judgment</code> instance
     */
    public Judgment containsAttr(final VersionTypeSimpleType containsAttr) {
        setContainsAttr(containsAttr);
        return this;
    }

    /**
     * Set <code>nameAttr</code> property in DSL way
     *
     * @param nameAttr new value
     * @return <code> Judgment</code> instance
     */
    public Judgment nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
    }

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD05";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public Judgment html(String s) {
        super.html(s);
        return this;
    }
}

