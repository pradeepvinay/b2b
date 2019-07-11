/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.b2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.b2b.fulfilmentprocess.constants.B2bFulfilmentProcessConstants;

public class B2bFulfilmentProcessManager extends GeneratedB2bFulfilmentProcessManager
{
	public static final B2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (B2bFulfilmentProcessManager) em.getExtension(B2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
