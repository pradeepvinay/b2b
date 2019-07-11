/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.b2b.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.b2b.core.constants.B2bCoreConstants;
import com.b2b.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class B2bCoreManager extends GeneratedB2bCoreManager
{
	public static final B2bCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (B2bCoreManager) em.getExtension(B2bCoreConstants.EXTENSIONNAME);
	}
}
