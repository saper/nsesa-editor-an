/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.ItemTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Item extends ItemTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new BlockList())
,        new StructureIndicator.DefaultElement(1,1,new Tblock())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ul())
,        new StructureIndicator.DefaultElement(1,1,new Ol())
,        new StructureIndicator.DefaultElement(1,1,new Table())
,        new StructureIndicator.DefaultElement(1,1,new P())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Foreign())
,        new StructureIndicator.DefaultElement(1,1,new Block())
)
)
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "item");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget item");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Item</code> object and set up its type
*/
public Item() {
super(create());
setType("item");
}

/**
* Constructor with required attributes
*/
public Item(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>Item</code> object with the given DOM element
*/
public Item(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Item</code> instance
        */
        public Item statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Item</code> instance
        */
        public Item refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Item</code> instance
        */
        public Item wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Item</code> instance
        */
        public Item idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Item</code> instance
        */
        public Item evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Item</code> instance
        */
        public Item alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Item</code> instance
        */
        public Item classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Item</code> instance
        */
        public Item styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Item</code> instance
        */
        public Item titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Item</code> instance
        */
        public Item langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> Item</code> instance
        */
        public Item spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Item</code> instance
        */
        public Item periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
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
public Item html(String s) {
    super.html(s);
    return this;
}
}
