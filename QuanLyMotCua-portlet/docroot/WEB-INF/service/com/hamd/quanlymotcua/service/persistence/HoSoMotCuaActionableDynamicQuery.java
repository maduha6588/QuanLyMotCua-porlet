/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.hamd.quanlymotcua.service.persistence;

import com.hamd.quanlymotcua.model.HoSoMotCua;
import com.hamd.quanlymotcua.service.HoSoMotCuaLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author hamd
 * @generated
 */
public abstract class HoSoMotCuaActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public HoSoMotCuaActionableDynamicQuery() throws SystemException {
		setBaseLocalService(HoSoMotCuaLocalServiceUtil.getService());
		setClass(HoSoMotCua.class);

		setClassLoader(com.hamd.quanlymotcua.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}