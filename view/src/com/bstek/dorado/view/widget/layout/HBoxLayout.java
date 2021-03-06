/*
 * This file is part of Dorado 7.x (http://dorado7.bsdn.org).
 * 
 * Copyright (c) 2002-2012 BSTEK Corp. All rights reserved.
 * 
 * This file is dual-licensed under the AGPLv3 (http://www.gnu.org/licenses/agpl-3.0.html) 
 * and BSDN commercial (http://www.bsdn.org/licenses) licenses.
 * 
 * If you are unsure which license is appropriate for your use, please contact the sales department
 * at http://www.bstek.com/contact.
 */

package com.bstek.dorado.view.widget.layout;

import com.bstek.dorado.annotation.ClientObject;
import com.bstek.dorado.annotation.ClientProperty;
import com.bstek.dorado.view.widget.VerticalAlign;

/**
 * @author Benny Bao (mailto:benny.bao@bstek.com)
 * @since 2011-7-20
 */
@ClientObject(shortTypeName = "HBox")
public class HBoxLayout extends AbstractBoxLayout {
	private VerticalAlign align = VerticalAlign.center;

	@ClientProperty(escapeValue = "center")
	public VerticalAlign getAlign() {
		return align;
	}

	public void setAlign(VerticalAlign align) {
		this.align = align;
	}
}
