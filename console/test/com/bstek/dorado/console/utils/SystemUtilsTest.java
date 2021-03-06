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

package com.bstek.dorado.console.utils;

import org.junit.Test;

/** 
 *
 * @author Alex Tong(mailto:alex.tong@bstek.com)
 * @since  2013-3-4
 */
public class SystemUtilsTest {

	/**
	 * Test method for {@link com.bstek.dorado.console.utils.SystemUtils#getSystemProperties()}.
	 */
	@Test
	public void testGetSystemProperties() {
		SystemUtils.getSystemProperties();
	}

	/**
	 * Test method for {@link com.bstek.dorado.console.utils.SystemUtils#getMemoryInfo()}.
	 */
	@Test
	public void testGetMemoryInfo() {
		SystemUtils.getMemoryInfo();
	}

}
