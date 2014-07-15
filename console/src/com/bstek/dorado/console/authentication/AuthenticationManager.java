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

package com.bstek.dorado.console.authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * 认证管理器接口
 * 
 * @author Alex Tong(mailto:alex.tong@bstek.com)
 * 
 */
public interface AuthenticationManager {


	
	/**
	 * 验证用户名密码是否正确
	 * 
	 * @param 
	 * @return
	 */
	boolean authenticate(String name, String password);

	/**
	 * 获得认证状态
	 * 
	 * @return
	 */
	boolean isAuthenticated(HttpServletRequest request);
}