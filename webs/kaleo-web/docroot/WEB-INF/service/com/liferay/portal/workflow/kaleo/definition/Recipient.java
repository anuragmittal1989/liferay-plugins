/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.definition;

/**
 * @author Michael C. Han
 */
public abstract class Recipient extends DefinitionNode {

	public Recipient(RecipientType recipientType) {
		_recipientType = recipientType;
	}

	public void configureParent(DefinitionNode parentNode) {
		Recipients recipients = (Recipients)parentNode;

		recipients.addRecipient(this);
	}

	public RecipientType getRecipientType() {
		return _recipientType;
	}

	private RecipientType _recipientType;

}