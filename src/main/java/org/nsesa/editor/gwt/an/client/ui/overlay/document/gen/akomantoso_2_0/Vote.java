package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Vote extends InlineComplexType  {

// CONSTRUCTORS ------------------
public Vote(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType byAttr;
private AnyURISimpleType asAttr;
private AnyURISimpleType choiceAttr;

public AnyURISimpleType getByAttr() {
return byAttr;
}

public void setByAttr(final AnyURISimpleType byAttr) {
this.byAttr = byAttr;
}
public AnyURISimpleType getAsAttr() {
return asAttr;
}

public void setAsAttr(final AnyURISimpleType asAttr) {
this.asAttr = asAttr;
}
public AnyURISimpleType getChoiceAttr() {
return choiceAttr;
}

public void setChoiceAttr(final AnyURISimpleType choiceAttr) {
this.choiceAttr = choiceAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    return  subtypes;
}
}

