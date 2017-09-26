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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the ho so mot cua service. This utility wraps {@link HoSoMotCuaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hamd
 * @see HoSoMotCuaPersistence
 * @see HoSoMotCuaPersistenceImpl
 * @generated
 */
public class HoSoMotCuaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(HoSoMotCua hoSoMotCua) {
		getPersistence().clearCache(hoSoMotCua);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HoSoMotCua> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HoSoMotCua> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HoSoMotCua> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static HoSoMotCua update(HoSoMotCua hoSoMotCua)
		throws SystemException {
		return getPersistence().update(hoSoMotCua);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static HoSoMotCua update(HoSoMotCua hoSoMotCua,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(hoSoMotCua, serviceContext);
	}

	/**
	* Caches the ho so mot cua in the entity cache if it is enabled.
	*
	* @param hoSoMotCua the ho so mot cua
	*/
	public static void cacheResult(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua) {
		getPersistence().cacheResult(hoSoMotCua);
	}

	/**
	* Caches the ho so mot cuas in the entity cache if it is enabled.
	*
	* @param hoSoMotCuas the ho so mot cuas
	*/
	public static void cacheResult(
		java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> hoSoMotCuas) {
		getPersistence().cacheResult(hoSoMotCuas);
	}

	/**
	* Creates a new ho so mot cua with the primary key. Does not add the ho so mot cua to the database.
	*
	* @param id the primary key for the new ho so mot cua
	* @return the new ho so mot cua
	*/
	public static com.hamd.quanlymotcua.model.HoSoMotCua create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ho so mot cua with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua that was removed
	* @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hamd.quanlymotcua.model.HoSoMotCua remove(int id)
		throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.hamd.quanlymotcua.model.HoSoMotCua updateImpl(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(hoSoMotCua);
	}

	/**
	* Returns the ho so mot cua with the primary key or throws a {@link com.hamd.quanlymotcua.NoSuchHoSoMotCuaException} if it could not be found.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua
	* @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hamd.quanlymotcua.model.HoSoMotCua findByPrimaryKey(
		int id)
		throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ho so mot cua with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua, or <code>null</code> if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.hamd.quanlymotcua.model.HoSoMotCua fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the ho so mot cuas.
	*
	* @return the ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ho so mot cuas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ho so mot cuas.
	*
	* @return the number of ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static HoSoMotCuaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (HoSoMotCuaPersistence)PortletBeanLocatorUtil.locate(com.hamd.quanlymotcua.service.ClpSerializer.getServletContextName(),
					HoSoMotCuaPersistence.class.getName());

			ReferenceRegistry.registerReference(HoSoMotCuaUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(HoSoMotCuaPersistence persistence) {
	}

	private static HoSoMotCuaPersistence _persistence;
}