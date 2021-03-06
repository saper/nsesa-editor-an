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
package org.nsesa.editor.gwt.an.common.server.convertor;

import com.inspiresoftware.lib.dto.geda.adapter.BeanFactory;
import com.inspiresoftware.lib.dto.geda.adapter.ValueConverter;
import org.nsesa.server.dto.AmendmentAction;
import org.nsesa.server.dto.AmendmentContainerDTO;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Date: 13/03/13 14:35
 *
 * @author <a href="mailto:philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
@Component("amendmentActionConvertor")
@Lazy
public class AmendmentActionConvertor implements ValueConverter {

    @Override
    public Object convertToDto(Object object, BeanFactory beanFactory) {

        if (object == null) return null;

        final AmendmentContainerDTO amendmentContainer = (AmendmentContainerDTO) object;
        if (amendmentContainer.getAmendmentAction() != null) {
            return org.nsesa.editor.gwt.core.shared.AmendmentAction.valueOf(amendmentContainer.getAmendmentAction().name());
        }
        return null;
    }

    @Override
    public Object convertToEntity(Object object, Object oldEntity, BeanFactory beanFactory) {

        if (object == null) return null;
        org.nsesa.editor.gwt.core.shared.AmendmentAction dto = (org.nsesa.editor.gwt.core.shared.AmendmentAction) object;

        if (oldEntity instanceof AmendmentContainerDTO) {
            final AmendmentAction amendmentAction = AmendmentAction.valueOf(dto.name());
            ((AmendmentContainerDTO) oldEntity).setAmendmentAction(amendmentAction);
            return amendmentAction;
        }
        return null;
    }
}
