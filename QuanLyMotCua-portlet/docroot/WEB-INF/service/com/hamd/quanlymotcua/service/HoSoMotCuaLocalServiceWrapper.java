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

package com.hamd.quanlymotcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HoSoMotCuaLocalService}.
 *
 * @author hamd
 * @see HoSoMotCuaLocalService
 * @generated
 */
public class HoSoMotCuaLocalServiceWrapper implements HoSoMotCuaLocalService,
	ServiceWrapper<HoSoMotCuaLocalService> {
	public HoSoMotCuaLocalServiceWrapper(
		HoSoMotCuaLocalService hoSoMotCuaLocalService) {
		_hoSoMotCuaLocalService = hoSoMotCuaLocalService;
	}

	/**
	* Adds the ho so mot cua to the database. Also notifies the appropriate model listeners.
	*
	* @param hoSoMotCua the ho so mot cua
	* @return the ho so mot cua that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua addHoSoMotCua(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.addHoSoMotCua(hoSoMotCua);
	}

	/**
	* Creates a new ho so mot cua with the primary key. Does not add the ho so mot cua to the database.
	*
	* @param id the primary key for the new ho so mot cua
	* @return the new ho so mot cua
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua createHoSoMotCua(int id) {
		return _hoSoMotCuaLocalService.createHoSoMotCua(id);
	}

	/**
	* Deletes the ho so mot cua with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua that was removed
	* @throws PortalException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua deleteHoSoMotCua(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.deleteHoSoMotCua(id);
	}

	/**
	* Deletes the ho so mot cua from the database. Also notifies the appropriate model listeners.
	*
	* @param hoSoMotCua the ho so mot cua
	* @return the ho so mot cua that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua deleteHoSoMotCua(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.deleteHoSoMotCua(hoSoMotCua);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hoSoMotCuaLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua fetchHoSoMotCua(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.fetchHoSoMotCua(id);
	}

	/**
	* Returns the ho so mot cua with the primary key.
	*
	* @param id the primary key of the ho so mot cua
	* @return the ho so mot cua
	* @throws PortalException if a ho so mot cua with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua getHoSoMotCua(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.getHoSoMotCua(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.hamd.quanlymotcua.model.HoSoMotCua> getHoSoMotCuas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.getHoSoMotCuas(start, end);
	}

	/**
	* Returns the number of ho so mot cuas.
	*
	* @return the number of ho so mot cuas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHoSoMotCuasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.getHoSoMotCuasCount();
	}

	/**
	* Updates the ho so mot cua in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoSoMotCua the ho so mot cua
	* @return the ho so mot cua that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua updateHoSoMotCua(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hoSoMotCuaLocalService.updateHoSoMotCua(hoSoMotCua);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _hoSoMotCuaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hoSoMotCuaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _hoSoMotCuaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HoSoMotCuaLocalService getWrappedHoSoMotCuaLocalService() {
		return _hoSoMotCuaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHoSoMotCuaLocalService(
		HoSoMotCuaLocalService hoSoMotCuaLocalService) {
		_hoSoMotCuaLocalService = hoSoMotCuaLocalService;
	}

	@Override
	public HoSoMotCuaLocalService getWrappedService() {
		return _hoSoMotCuaLocalService;
	}

	@Override
	public void setWrappedService(HoSoMotCuaLocalService hoSoMotCuaLocalService) {
		_hoSoMotCuaLocalService = hoSoMotCuaLocalService;
	}

	private HoSoMotCuaLocalService _hoSoMotCuaLocalService;
}