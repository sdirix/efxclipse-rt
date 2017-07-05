/*******************************************************************************
* Copyright (c) 2015 BestSolution.at and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* 	Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
*******************************************************************************/
package org.eclipse.fx.code.editor.fx.e4.internal;

import java.util.Map;

import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.fx.code.editor.e4.InputBasedContextFunction;
import org.eclipse.fx.code.editor.fx.services.SourceViewerConfigurationTypeProvider;
import org.eclipse.fx.text.ui.source.SourceViewerConfiguration;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component(service=IContextFunction.class,property={"service.context.key=org.eclipse.fx.text.ui.source.SourceViewerConfiguration"})
public class SourceViewerConfigurationContextFunction extends InputBasedContextFunction<SourceViewerConfiguration, SourceViewerConfigurationTypeProvider> {

	@Reference(cardinality=ReferenceCardinality.MULTIPLE,policy=ReferencePolicy.DYNAMIC,policyOption=ReferencePolicyOption.GREEDY)
	public void registerService(SourceViewerConfigurationTypeProvider service, Map<String, Object> properties) {
		super._registerService(service, properties);
	}

	public void unregisterService(SourceViewerConfigurationTypeProvider service) {
		super._unregisterService(service);
	}
}