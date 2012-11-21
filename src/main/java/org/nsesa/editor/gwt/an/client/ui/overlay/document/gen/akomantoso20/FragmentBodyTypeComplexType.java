package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Hcontainer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Container;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Clause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Section;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Part;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Paragraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Chapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Title;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Article;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Book;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Tome;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Division;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.List;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Point;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Indent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Alinea;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subsection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subpart;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subparagraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subchapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subtitle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subclause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sublist;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AdministrationOfOath;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.RollCall;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Prayers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.OralStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.WrittenStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PersonalStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MinisterialStatements;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Resolutions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NationalInterest;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DeclarationOfVote;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Communication;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Petitions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Papers;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.NoticesOfMotion;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Questions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Address;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ProceduralMotions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PointOfOrder;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Adjournment;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.DebateSection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Div;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class FragmentBodyTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public FragmentBodyTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private LanguageSimpleType langAttr;
    private AnyURISimpleType refersToAttr;
    private String wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType alternativeToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType periodAttr;
    public Hcontainer getHcontainer() {
        Hcontainer result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
                result = (Hcontainer)widget;
                break;
            }
        }
        return result;
    }
    public Container getContainer() {
        Container result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Container".equalsIgnoreCase(widget.getType())) {
                result = (Container)widget;
                break;
            }
        }
        return result;
    }
    public LanguageSimpleType getLangAttr() {
        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public String getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public StringSimpleType getClassAttr() {
        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public IDSimpleType getIdAttr() {
        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public Clause getClause() {
        Clause result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
                result = (Clause)widget;
                break;
            }
        }
        return result;
    }
    public Section getSection() {
        Section result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
                result = (Section)widget;
                break;
            }
        }
        return result;
    }
    public Part getPart() {
        Part result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
                result = (Part)widget;
                break;
            }
        }
        return result;
    }
    public Paragraph getParagraph() {
        Paragraph result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
                result = (Paragraph)widget;
                break;
            }
        }
        return result;
    }
    public Chapter getChapter() {
        Chapter result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
                result = (Chapter)widget;
                break;
            }
        }
        return result;
    }
    public Title getTitle_() {
        Title result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
                result = (Title)widget;
                break;
            }
        }
        return result;
    }
    public Article getArticle() {
        Article result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
                result = (Article)widget;
                break;
            }
        }
        return result;
    }
    public Book getBook() {
        Book result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
                result = (Book)widget;
                break;
            }
        }
        return result;
    }
    public Tome getTome() {
        Tome result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
                result = (Tome)widget;
                break;
            }
        }
        return result;
    }
    public Division getDivision() {
        Division result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
                result = (Division)widget;
                break;
            }
        }
        return result;
    }
    public List getList() {
        List result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
                result = (List)widget;
                break;
            }
        }
        return result;
    }
    public Point getPoint() {
        Point result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
                result = (Point)widget;
                break;
            }
        }
        return result;
    }
    public Indent getIndent() {
        Indent result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
                result = (Indent)widget;
                break;
            }
        }
        return result;
    }
    public Alinea getAlinea() {
        Alinea result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
                result = (Alinea)widget;
                break;
            }
        }
        return result;
    }
    public Subsection getSubsection() {
        Subsection result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
                result = (Subsection)widget;
                break;
            }
        }
        return result;
    }
    public Subpart getSubpart() {
        Subpart result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
                result = (Subpart)widget;
                break;
            }
        }
        return result;
    }
    public Subparagraph getSubparagraph() {
        Subparagraph result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
                result = (Subparagraph)widget;
                break;
            }
        }
        return result;
    }
    public Subchapter getSubchapter() {
        Subchapter result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
                result = (Subchapter)widget;
                break;
            }
        }
        return result;
    }
    public Subtitle getSubtitle() {
        Subtitle result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
                result = (Subtitle)widget;
                break;
            }
        }
        return result;
    }
    public Subclause getSubclause() {
        Subclause result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
                result = (Subclause)widget;
                break;
            }
        }
        return result;
    }
    public Sublist getSublist() {
        Sublist result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
                result = (Sublist)widget;
                break;
            }
        }
        return result;
    }
    public AdministrationOfOath getAdministrationOfOath() {
        AdministrationOfOath result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AdministrationOfOath".equalsIgnoreCase(widget.getType())) {
                result = (AdministrationOfOath)widget;
                break;
            }
        }
        return result;
    }
    public RollCall getRollCall() {
        RollCall result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RollCall".equalsIgnoreCase(widget.getType())) {
                result = (RollCall)widget;
                break;
            }
        }
        return result;
    }
    public Prayers getPrayers() {
        Prayers result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Prayers".equalsIgnoreCase(widget.getType())) {
                result = (Prayers)widget;
                break;
            }
        }
        return result;
    }
    public OralStatements getOralStatements() {
        OralStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("OralStatements".equalsIgnoreCase(widget.getType())) {
                result = (OralStatements)widget;
                break;
            }
        }
        return result;
    }
    public WrittenStatements getWrittenStatements() {
        WrittenStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("WrittenStatements".equalsIgnoreCase(widget.getType())) {
                result = (WrittenStatements)widget;
                break;
            }
        }
        return result;
    }
    public PersonalStatements getPersonalStatements() {
        PersonalStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PersonalStatements".equalsIgnoreCase(widget.getType())) {
                result = (PersonalStatements)widget;
                break;
            }
        }
        return result;
    }
    public MinisterialStatements getMinisterialStatements() {
        MinisterialStatements result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("MinisterialStatements".equalsIgnoreCase(widget.getType())) {
                result = (MinisterialStatements)widget;
                break;
            }
        }
        return result;
    }
    public Resolutions getResolutions() {
        Resolutions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Resolutions".equalsIgnoreCase(widget.getType())) {
                result = (Resolutions)widget;
                break;
            }
        }
        return result;
    }
    public NationalInterest getNationalInterest() {
        NationalInterest result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NationalInterest".equalsIgnoreCase(widget.getType())) {
                result = (NationalInterest)widget;
                break;
            }
        }
        return result;
    }
    public DeclarationOfVote getDeclarationOfVote() {
        DeclarationOfVote result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DeclarationOfVote".equalsIgnoreCase(widget.getType())) {
                result = (DeclarationOfVote)widget;
                break;
            }
        }
        return result;
    }
    public Communication getCommunication() {
        Communication result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Communication".equalsIgnoreCase(widget.getType())) {
                result = (Communication)widget;
                break;
            }
        }
        return result;
    }
    public Petitions getPetitions() {
        Petitions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Petitions".equalsIgnoreCase(widget.getType())) {
                result = (Petitions)widget;
                break;
            }
        }
        return result;
    }
    public Papers getPapers() {
        Papers result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Papers".equalsIgnoreCase(widget.getType())) {
                result = (Papers)widget;
                break;
            }
        }
        return result;
    }
    public NoticesOfMotion getNoticesOfMotion() {
        NoticesOfMotion result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoticesOfMotion".equalsIgnoreCase(widget.getType())) {
                result = (NoticesOfMotion)widget;
                break;
            }
        }
        return result;
    }
    public Questions getQuestions() {
        Questions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Questions".equalsIgnoreCase(widget.getType())) {
                result = (Questions)widget;
                break;
            }
        }
        return result;
    }
    public Address getAddress() {
        Address result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Address".equalsIgnoreCase(widget.getType())) {
                result = (Address)widget;
                break;
            }
        }
        return result;
    }
    public ProceduralMotions getProceduralMotions() {
        ProceduralMotions result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ProceduralMotions".equalsIgnoreCase(widget.getType())) {
                result = (ProceduralMotions)widget;
                break;
            }
        }
        return result;
    }
    public PointOfOrder getPointOfOrder() {
        PointOfOrder result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("PointOfOrder".equalsIgnoreCase(widget.getType())) {
                result = (PointOfOrder)widget;
                break;
            }
        }
        return result;
    }
    public Adjournment getAdjournment() {
        Adjournment result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Adjournment".equalsIgnoreCase(widget.getType())) {
                result = (Adjournment)widget;
                break;
            }
        }
        return result;
    }
    public DebateSection getDebateSection() {
        DebateSection result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DebateSection".equalsIgnoreCase(widget.getType())) {
                result = (DebateSection)widget;
                break;
            }
        }
        return result;
    }
    public Div getDiv() {
        Div result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Div".equalsIgnoreCase(widget.getType())) {
                result = (Div)widget;
                break;
            }
        }
        return result;
    }
    public AnyURISimpleType getPeriodAttr() {
        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome","subparagraph","paragraph","subsection","debateSection","div","resolutions","personalStatements","oralStatements","title","chapter","division","rollCall","alinea","declarationOfVote","adjournment","petitions","subchapter","administrationOfOath","indent","communication","noticesOfMotion","subclause","questions","papers","list","sublist","section","proceduralMotions","point","article","subpart","address","nationalInterest","container","writtenStatements","hcontainer","book","subtitle","pointOfOrder","prayers","ministerialStatements","part","clause"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}
