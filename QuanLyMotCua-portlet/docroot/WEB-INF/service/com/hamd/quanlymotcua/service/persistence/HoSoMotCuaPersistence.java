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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the ho so mot cua service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hamd
 * @see HoSoMotCuaPersistenceImpl
 * @see HoSoMotCuaUtil
 * @generated
 */
public interface HoSoMotCuaPersistence extends BasePersistence<HoSoMotCua> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HoSoMotCuaUtil} to access the ho so mot cua persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ho so mot cua in the entity cache if it is enabled.
	*
	* @param hoSoMotCua the ho so mot cua
	*/
	public void cacheResult(com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua);

	/**
	* Caches the ho so mot cuas in the entity cache if it is enabled.
	*
	* @param hoSoMotCuas the ho so mot cuas
	*/
	public void cacheResult(
		java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> hoSoMotCuas);

	/**
	* Creates a new ho so mot cua with the primary key. Does not add the ho so mot cua to the database.
	*
	* @param id the primary key for the new ho so mot cua
	* @return the new ho so mot cua
	*/
	public com.hamd.quanlymotcua.model.HoSoMotCua create(int id);

	/**
	* Removes the ho so mot cua with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua that was removed
	* @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hamd.quanlymotcua.model.HoSoMotCua remove(int id)
		throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.hamd.quanlymotcua.model.HoSoMotCua updateImpl(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ho so mot cua with the primary key or throws a {@link com.hamd.quanlymotcua.NoSuchHoSoMotCuaException} if it could not be found.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua
	* @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hamd.quanlymotcua.model.HoSoMotCua findByPrimaryKey(int id)
		throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ho so mot cua with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua, or <code>null</code> if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.hamd.quanlymotcua.model.HoSoMotCua fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ho so mot cuas.
	*
	* @return the ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ho so mot cuas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ho so mot cuas
	* @param end the upper bound of the range of ho so mot cuas (not inclusive)
	* @return the range of ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ho so mot cuas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ho so mot cuas
	* @param end the upper bound of the range of ho so mot cuas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ho so mot cuas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ho so mot cuas.
	*
	* @return the number of ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}