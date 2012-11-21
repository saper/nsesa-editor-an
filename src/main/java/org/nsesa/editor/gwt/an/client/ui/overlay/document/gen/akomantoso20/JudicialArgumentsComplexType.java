package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Result;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Supports;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.IsAnalogTo;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Applies;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Extends;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Restricts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Derogates;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Contrasts;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Overrules;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DissentsFrom;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PutsInQuestion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Distinguishes;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class JudicialArgumentsComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public JudicialArgumentsComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    public Result getResult() {
        Result result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Result".equalsIgnoreCase(widget.getType())) {
                result = (Result)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<Supports> getSupportses() {
        java.util.List<Supports> result = new ArrayList<Supports>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Supports".equalsIgnoreCase(widget.getType())) {
                result.add((Supports)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<IsAnalogTo> getIsAnalogTos() {
        java.util.List<IsAnalogTo> result = new ArrayList<IsAnalogTo>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("IsAnalogTo".equalsIgnoreCase(widget.getType())) {
                result.add((IsAnalogTo)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Applies> getApplieses() {
        java.util.List<Applies> result = new ArrayList<Applies>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Applies".equalsIgnoreCase(widget.getType())) {
                result.add((Applies)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Extends> getExtend_s() {
        java.util.List<Extends> result = new ArrayList<Extends>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Extends".equalsIgnoreCase(widget.getType())) {
                result.add((Extends)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Restricts> getRestrictses() {
        java.util.List<Restricts> result = new ArrayList<Restricts>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Restricts".equalsIgnoreCase(widget.getType())) {
                result.add((Restricts)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Derogates> getDerogateses() {
        java.util.List<Derogates> result = new ArrayList<Derogates>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Derogates".equalsIgnoreCase(widget.getType())) {
                result.add((Derogates)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Contrasts> getContrastses() {
        java.util.List<Contrasts> result = new ArrayList<Contrasts>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Contrasts".equalsIgnoreCase(widget.getType())) {
                result.add((Contrasts)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Overrules> getOverruleses() {
        java.util.List<Overrules> result = new ArrayList<Overrules>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Overrules".equalsIgnoreCase(widget.getType())) {
                result.add((Overrules)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DissentsFrom> getDissentsFroms() {
        java.util.List<DissentsFrom> result = new ArrayList<DissentsFrom>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DissentsFrom".equalsIgnoreCase(widget.getType())) {
                result.add((DissentsFrom)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<PutsInQuestion> getPutsInQuestions() {
        java.util.List<PutsInQuestion> result = new ArrayList<PutsInQuestion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PutsInQuestion".equalsIgnoreCase(widget.getType())) {
                result.add((PutsInQuestion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Distinguishes> getDistinguisheses() {
        java.util.List<Distinguishes> result = new ArrayList<Distinguishes>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Distinguishes".equalsIgnoreCase(widget.getType())) {
                result.add((Distinguishes)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"overrules","result","dissentsFrom","derogates","extends","contrasts","restricts","applies","isAnalogTo","supports","distinguishes","putsInQuestion"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());

        return attrs;
    }

}
