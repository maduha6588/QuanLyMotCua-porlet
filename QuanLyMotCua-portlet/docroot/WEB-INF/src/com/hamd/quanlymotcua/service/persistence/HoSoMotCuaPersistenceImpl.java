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

import com.hamd.quanlymotcua.NoSuchHoSoMotCuaException;
import com.hamd.quanlymotcua.model.HoSoMotCua;
import com.hamd.quanlymotcua.model.impl.HoSoMotCuaImpl;
import com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the ho so mot cua service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hamd
 * @see HoSoMotCuaPersistence
 * @see HoSoMotCuaUtil
 * @generated
 */
public class HoSoMotCuaPersistenceImpl extends BasePersistenceImpl<HoSoMotCua>
	implements HoSoMotCuaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HoSoMotCuaUtil} to access the ho so mot cua persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HoSoMotCuaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaModelImpl.FINDER_CACHE_ENABLED, HoSoMotCuaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaModelImpl.FINDER_CACHE_ENABLED, HoSoMotCuaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public HoSoMotCuaPersistenceImpl() {
		setModelClass(HoSoMotCua.class);
	}

	/**
	 * Caches the ho so mot cua in the entity cache if it is enabled.
	 *
	 * @param hoSoMotCua the ho so mot cua
	 */
	@Override
	public void cacheResult(HoSoMotCua hoSoMotCua) {
		EntityCacheUtil.putResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaImpl.class, hoSoMotCua.getPrimaryKey(), hoSoMotCua);

		hoSoMotCua.resetOriginalValues();
	}

	/**
	 * Caches the ho so mot cuas in the entity cache if it is enabled.
	 *
	 * @param hoSoMotCuas the ho so mot cuas
	 */
	@Override
	public void cacheResult(List<HoSoMotCua> hoSoMotCuas) {
		for (HoSoMotCua hoSoMotCua : hoSoMotCuas) {
			if (EntityCacheUtil.getResult(
						HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
						HoSoMotCuaImpl.class, hoSoMotCua.getPrimaryKey()) == null) {
				cacheResult(hoSoMotCua);
			}
			else {
				hoSoMotCua.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ho so mot cuas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HoSoMotCuaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HoSoMotCuaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ho so mot cua.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HoSoMotCua hoSoMotCua) {
		EntityCacheUtil.removeResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaImpl.class, hoSoMotCua.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<HoSoMotCua> hoSoMotCuas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (HoSoMotCua hoSoMotCua : hoSoMotCuas) {
			EntityCacheUtil.removeResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
				HoSoMotCuaImpl.class, hoSoMotCua.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ho so mot cua with the primary key. Does not add the ho so mot cua to the database.
	 *
	 * @param id the primary key for the new ho so mot cua
	 * @return the new ho so mot cua
	 */
	@Override
	public HoSoMotCua create(int id) {
		HoSoMotCua hoSoMotCua = new HoSoMotCuaImpl();

		hoSoMotCua.setNew(true);
		hoSoMotCua.setPrimaryKey(id);

		return hoSoMotCua;
	}

	/**
	 * Removes the ho so mot cua with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ho so mot cua
	 * @return the ho so mot cua that was removed
	 * @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua remove(int id)
		throws NoSuchHoSoMotCuaException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ho so mot cua with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ho so mot cua
	 * @return the ho so mot cua that was removed
	 * @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua remove(Serializable primaryKey)
		throws NoSuchHoSoMotCuaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			HoSoMotCua hoSoMotCua = (HoSoMotCua)session.get(HoSoMotCuaImpl.class,
					primaryKey);

			if (hoSoMotCua == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHoSoMotCuaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(hoSoMotCua);
		}
		catch (NoSuchHoSoMotCuaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected HoSoMotCua removeImpl(HoSoMotCua hoSoMotCua)
		throws SystemException {
		hoSoMotCua = toUnwrappedModel(hoSoMotCua);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hoSoMotCua)) {
				hoSoMotCua = (HoSoMotCua)session.get(HoSoMotCuaImpl.class,
						hoSoMotCua.getPrimaryKeyObj());
			}

			if (hoSoMotCua != null) {
				session.delete(hoSoMotCua);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (hoSoMotCua != null) {
			clearCache(hoSoMotCua);
		}

		return hoSoMotCua;
	}

	@Override
	public HoSoMotCua updateImpl(
		com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua)
		throws SystemException {
		hoSoMotCua = toUnwrappedModel(hoSoMotCua);

		boolean isNew = hoSoMotCua.isNew();

		Session session = null;

		try {
			session = openSession();

			if (hoSoMotCua.isNew()) {
				session.save(hoSoMotCua);

				hoSoMotCua.setNew(false);
			}
			else {
				session.merge(hoSoMotCua);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
			HoSoMotCuaImpl.class, hoSoMotCua.getPrimaryKey(), hoSoMotCua);

		return hoSoMotCua;
	}

	protected HoSoMotCua toUnwrappedModel(HoSoMotCua hoSoMotCua) {
		if (hoSoMotCua instanceof HoSoMotCuaImpl) {
			return hoSoMotCua;
		}

		HoSoMotCuaImpl hoSoMotCuaImpl = new HoSoMotCuaImpl();

		hoSoMotCuaImpl.setNew(hoSoMotCua.isNew());
		hoSoMotCuaImpl.setPrimaryKey(hoSoMotCua.getPrimaryKey());

		hoSoMotCuaImpl.setId(hoSoMotCua.getId());
		hoSoMotCuaImpl.setTenDonVi(hoSoMotCua.getTenDonVi());
		hoSoMotCuaImpl.setDienThoai(hoSoMotCua.getDienThoai());
		hoSoMotCuaImpl.setTenNguoiNop(hoSoMotCua.getTenNguoiNop());
		hoSoMotCuaImpl.setCMND(hoSoMotCua.getCMND());
		hoSoMotCuaImpl.setDienThoaiNguoiNop(hoSoMotCua.getDienThoaiNguoiNop());
		hoSoMotCuaImpl.setDiaChi(hoSoMotCua.getDiaChi());
		hoSoMotCuaImpl.setLoaiHoSo(hoSoMotCua.getLoaiHoSo());
		hoSoMotCuaImpl.setIDThuTuc(hoSoMotCua.getIDThuTuc());
		hoSoMotCuaImpl.setNgayTiepNhan(hoSoMotCua.getNgayTiepNhan());
		hoSoMotCuaImpl.setNgayTraKetQua(hoSoMotCua.getNgayTraKetQua());
		hoSoMotCuaImpl.setHinhThucNop(hoSoMotCua.getHinhThucNop());
		hoSoMotCuaImpl.setMaHoSo(hoSoMotCua.getMaHoSo());
		hoSoMotCuaImpl.setSoBoHoSo(hoSoMotCua.getSoBoHoSo());
		hoSoMotCuaImpl.setTrangThai(hoSoMotCua.getTrangThai());

		return hoSoMotCuaImpl;
	}

	/**
	 * Returns the ho so mot cua with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ho so mot cua
	 * @return the ho so mot cua
	 * @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHoSoMotCuaException, SystemException {
		HoSoMotCua hoSoMotCua = fetchByPrimaryKey(primaryKey);

		if (hoSoMotCua == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHoSoMotCuaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return hoSoMotCua;
	}

	/**
	 * Returns the ho so mot cua with the primary key or throws a {@link com.hamd.quanlymotcua.NoSuchHoSoMotCuaException} if it could not be found.
	 *
	 * @param id the primary key of the ho so mot cua
	 * @return the ho so mot cua
	 * @throws com.hamd.quanlymotcua.NoSuchHoSoMotCuaException if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua findByPrimaryKey(int id)
		throws NoSuchHoSoMotCuaException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ho so mot cua with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ho so mot cua
	 * @return the ho so mot cua, or <code>null</code> if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		HoSoMotCua hoSoMotCua = (HoSoMotCua)EntityCacheUtil.getResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
				HoSoMotCuaImpl.class, primaryKey);

		if (hoSoMotCua == _nullHoSoMotCua) {
			return null;
		}

		if (hoSoMotCua == null) {
			Session session = null;

			try {
				session = openSession();

				hoSoMotCua = (HoSoMotCua)session.get(HoSoMotCuaImpl.class,
						primaryKey);

				if (hoSoMotCua != null) {
					cacheResult(hoSoMotCua);
				}
				else {
					EntityCacheUtil.putResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
						HoSoMotCuaImpl.class, primaryKey, _nullHoSoMotCua);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HoSoMotCuaModelImpl.ENTITY_CACHE_ENABLED,
					HoSoMotCuaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return hoSoMotCua;
	}

	/**
	 * Returns the ho so mot cua with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ho so mot cua
	 * @return the ho so mot cua, or <code>null</code> if a ho so mot cua with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public HoSoMotCua fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the ho so mot cuas.
	 *
	 * @return the ho so mot cuas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<HoSoMotCua> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<HoSoMotCua> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<HoSoMotCua> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<HoSoMotCua> list = (List<HoSoMotCua>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HOSOMOTCUA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HOSOMOTCUA;

				if (pagination) {
					sql = sql.concat(HoSoMotCuaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<HoSoMotCua>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<HoSoMotCua>(list);
				}
				else {
					list = (List<HoSoMotCua>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the ho so mot cuas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (HoSoMotCua hoSoMotCua : findAll()) {
			remove(hoSoMotCua);
		}
	}

	/**
	 * Returns the number of ho so mot cuas.
	 *
	 * @return the number of ho so mot cuas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HOSOMOTCUA);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the ho so mot cua persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.hamd.quanlymotcua.model.HoSoMotCua")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<HoSoMotCua>> listenersList = new ArrayList<ModelListener<HoSoMotCua>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<HoSoMotCua>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(HoSoMotCuaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HOSOMOTCUA = "SELECT hoSoMotCua FROM HoSoMotCua hoSoMotCua";
	private static final String _SQL_COUNT_HOSOMOTCUA = "SELECT COUNT(hoSoMotCua) FROM HoSoMotCua hoSoMotCua";
	private static final String _ORDER_BY_ENTITY_ALIAS = "hoSoMotCua.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No HoSoMotCua exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HoSoMotCuaPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "TenDonVi", "DienThoai", "TenNguoiNop", "CMND",
				"DienThoaiNguoiNop", "DiaChi", "LoaiHoSo", "IDThuTuc",
				"NgayTiepNhan", "NgayTraKetQua", "HinhThucNop", "MaHoSo",
				"SoBoHoSo", "TrangThai"
			});
	private static HoSoMotCua _nullHoSoMotCua = new HoSoMotCuaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<HoSoMotCua> toCacheModel() {
				return _nullHoSoMotCuaCacheModel;
			}
		};

	private static CacheModel<HoSoMotCua> _nullHoSoMotCuaCacheModel = new CacheModel<HoSoMotCua>() {
			@Override
			public HoSoMotCua toEntityModel() {
				return _nullHoSoMotCua;
			}
		};
}