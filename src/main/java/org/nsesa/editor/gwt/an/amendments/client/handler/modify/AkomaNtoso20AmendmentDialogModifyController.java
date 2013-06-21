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
package org.nsesa.editor.gwt.an.amendments.client.handler.modify;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.amendment.AmendmentInjectionPointFinder;
import org.nsesa.editor.gwt.an.amendments.client.AmendmentOverlayWidgetValidator;
import org.nsesa.editor.gwt.an.amendments.client.handler.common.content.AkomaNtoso20AmendmentBuilder;
import org.nsesa.editor.gwt.an.amendments.client.ui.amendment.AkomaNtoso20AmendmentControllerUtil;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.*;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import org.nsesa.editor.gwt.core.client.ServiceFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.Locator;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.visualstructure.VisualStructureController;
import org.nsesa.editor.gwt.core.client.util.OverlayUtil;
import org.nsesa.editor.gwt.core.shared.PersonDTO;
import org.nsesa.editor.gwt.dialog.client.ui.dialog.DialogContext;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.author.AuthorPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.content.ContentPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.common.meta.MetaPanelController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyController;
import org.nsesa.editor.gwt.dialog.client.ui.handler.modify.AmendmentDialogModifyView;

import java.util.List;
import java.util.logging.Logger;

/**
 * Date: 23/11/12 10:14
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20AmendmentDialogModifyController extends AmendmentDialogModifyController {

    private static final Logger LOG = Logger.getLogger(AkomaNtoso20AmendmentDialogModifyController.class.getName());

    final AuthorPanelController authorPanelController;
    final MetaPanelController metaPanelController;
    final ContentPanelController contentPanelController;
    final ServiceFactory serviceFactory;

    @Inject
    public AkomaNtoso20AmendmentDialogModifyController(final ClientFactory clientFactory,
                                                       final AmendmentDialogModifyView view,
                                                       final Locator locator,
                                                       final OverlayFactory overlayFactory,
                                                       final VisualStructureController visualStructureController,
                                                       final AuthorPanelController authorPanelController,
                                                       final ContentPanelController contentPanelController,
                                                       final MetaPanelController metaPanelController,
                                                       final ServiceFactory serviceFactory,
                                                       final AmendmentInjectionPointFinder amendmentInjectionPointFinder,
                                                       final AmendmentOverlayWidgetValidator validator
    ) {
        super(clientFactory, view, locator, overlayFactory, visualStructureController, amendmentInjectionPointFinder, validator);
        this.authorPanelController = authorPanelController;
        this.contentPanelController = contentPanelController;
        this.metaPanelController = metaPanelController;
        this.serviceFactory = serviceFactory;

        addChildControllers(contentPanelController, authorPanelController, metaPanelController);
    }

    @Override
    public void handleSave() {
        final AkomaNtoso20AmendmentBuilder builder = new AkomaNtoso20AmendmentBuilder(overlayFactory);

        final OverlayWidget overlayWidget = dialogContext.getOverlayWidget();
        final String languageIso = dialogContext.getDocumentController().getDocument().getLanguageIso();
        builder
                .setOverlayWidget(overlayWidget)
                .setDocumentController(dialogContext.getDocumentController())
                .setLanguageIso(languageIso)
                .setAuthors(authorPanelController.getSelectedPersons())
                .setLocation(locator.getLocation(overlayWidget, languageIso, true))
                .setOriginalText(contentPanelController.getView().getOriginalText())
                .setAmendmentText(view.getAmendmentContent())
                .setModifyIds(true)
                .setJustification(metaPanelController.getJustification())
                .setNotes(metaPanelController.getNotes());
        dialogContext.getAmendment().setRoot(builder.build());
        super.handleSave();
    }

    @Override
    public void setContext(DialogContext dialogContext) {
        super.setContext(dialogContext);
        // clear author panel
        authorPanelController.clear();

        // clear meta panel
        metaPanelController.clear();

        view.getRichTextEditor().setOverlayWidget(dialogContext.getOverlayWidget());

        if (dialogContext.getAmendmentController() != null) {
            // get the location from the amendable widget, if it is passed
            view.setTitle("Edit amendment");

            // set the amendment content
            final OverlayWidget amendmentBodyOverlayWidget = dialogContext.getAmendmentController().asAmendableWidget(dialogContext.getAmendmentController().getModel().getBody());

            final OverlayWidget amendmentContentFromModel = AkomaNtoso20AmendmentControllerUtil.getAmendmentContentFromModel(dialogContext.getAmendmentController());
            String content = amendmentContentFromModel.getInnerHTML();

            final OverlayWidget amendmentOverlayWidget = dialogContext.getAmendmentController().asAmendableWidget(content);

            view.setAmendmentContent(amendmentOverlayWidget.getInnerHTML());

            // set the author(s)
            final Preface preface = (Preface) OverlayUtil.findSingle("preface", amendmentBodyOverlayWidget);

            final Container container = preface.getContainers().get(0);
            if (container != null && "authors".equals(container.nameAttr().getValue())) {
                List<OverlayWidget> docProponents = OverlayUtil.find("docProponent", container);
                for (final OverlayWidget docProponent : docProponents) {
                    if (docProponent instanceof DocProponent) {
                        final DocProponent proponent = (DocProponent) docProponent;
                        final String refersToID = proponent.refersToAttr().getValue();

                        final TLCPerson tlcPerson = (TLCPerson) OverlayUtil.xpathSingle(refersToID, amendmentBodyOverlayWidget);
                        final String id = tlcPerson.hrefAttr().getValue().substring(tlcPerson.hrefAttr().getValue().lastIndexOf(":") + 1);
                        serviceFactory.getGwtService().getPerson(clientFactory.getClientContext(), id, new AsyncCallback<PersonDTO>() {
                            @Override
                            public void onFailure(Throwable caught) {
                                LOG.warning("Could not retrieve person: " + caught);
                            }

                            @Override
                            public void onSuccess(PersonDTO result) {
                                authorPanelController.addPerson(result);
                            }
                        });
                    }
                }
            }

            // set the meta (justification, notes, ...)
            final AmendmentJustification amendmentJustification = (AmendmentJustification) OverlayUtil.findSingle("amendmentJustification", amendmentBodyOverlayWidget);
            if (amendmentJustification != null) {
                final String justification = amendmentJustification.getPs().get(0).getInnerHTML().trim();
                metaPanelController.setJustification(justification);
            }
            final Mod mod = (Mod) OverlayUtil.findSingle("mod", amendmentBodyOverlayWidget);
            if (mod != null) {
                final List<AuthorialNote> authorialNotes = mod.getAuthorialNotes();
                if (authorialNotes != null && !authorialNotes.isEmpty()) {
                    metaPanelController.setNotes(authorialNotes.get(0).getPs().get(0).getInnerHTML().trim());
                }
            }


        } else {
            view.setTitle(locator.getLocation(dialogContext.getOverlayWidget(), clientFactory.getClientContext().getDocumentTranslationLanguageCode(), false));
            view.setAmendmentContent(dialogContext.getOverlayWidget().getInnerHTML());
        }
    }
}
