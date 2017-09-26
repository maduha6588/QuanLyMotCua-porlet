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

package com.hamd.quanlymotcua.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HoSoMotCua service. Represents a row in the &quot;mc_hosomotcua&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hamd.quanlymotcua.model.impl.HoSoMotCuaImpl}.
 * </p>
 *
 * @author hamd
 * @see HoSoMotCua
 * @see com.hamd.quanlymotcua.model.impl.HoSoMotCuaImpl
 * @see com.hamd.quanlymotcua.model.impl.HoSoMotCuaModelImpl
 * @generated
 */
public interface HoSoMotCuaModel extends BaseModel<HoSoMotCua> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ho so mot cua model instance should use the {@link HoSoMotCua} interface instead.
	 */

	/**
	 * Returns the primary key of this ho so mot cua.
	 *
	 * @return the primary key of this ho so mot cua
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this ho so mot cua.
	 *
	 * @param primaryKey the primary key of this ho so mot cua
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this ho so mot cua.
	 *
	 * @return the ID of this ho so mot cua
	 */
	public int getId();

	/**
	 * Sets the ID of this ho so mot cua.
	 *
	 * @param id the ID of this ho so mot cua
	 */
	public void setId(int id);

	/**
	 * Returns the ten don vi of this ho so mot cua.
	 *
	 * @return the ten don vi of this ho so mot cua
	 */
	@AutoEscape
	public String getTenDonVi();

	/**
	 * Sets the ten don vi of this ho so mot cua.
	 *
	 * @param TenDonVi the ten don vi of this ho so mot cua
	 */
	public void setTenDonVi(String TenDonVi);

	/**
	 * Returns the dien thoai of this ho so mot cua.
	 *
	 * @return the dien thoai of this ho so mot cua
	 */
	@AutoEscape
	public String getDienThoai();

	/**
	 * Sets the dien thoai of this ho so mot cua.
	 *
	 * @param DienThoai the dien thoai of this ho so mot cua
	 */
	public void setDienThoai(String DienThoai);

	/**
	 * Returns the ten nguoi nop of this ho so mot cua.
	 *
	 * @return the ten nguoi nop of this ho so mot cua
	 */
	@AutoEscape
	public String getTenNguoiNop();

	/**
	 * Sets the ten nguoi nop of this ho so mot cua.
	 *
	 * @param TenNguoiNop the ten nguoi nop of this ho so mot cua
	 */
	public void setTenNguoiNop(String TenNguoiNop);

	/**
	 * Returns the c m n d of this ho so mot cua.
	 *
	 * @return the c m n d of this ho so mot cua
	 */
	@AutoEscape
	public String getCMND();

	/**
	 * Sets the c m n d of this ho so mot cua.
	 *
	 * @param CMND the c m n d of this ho so mot cua
	 */
	public void setCMND(String CMND);

	/**
	 * Returns the dien thoai nguoi nop of this ho so mot cua.
	 *
	 * @return the dien thoai nguoi nop of this ho so mot cua
	 */
	@AutoEscape
	public String getDienThoaiNguoiNop();

	/**
	 * Sets the dien thoai nguoi nop of this ho so mot cua.
	 *
	 * @param DienThoaiNguoiNop the dien thoai nguoi nop of this ho so mot cua
	 */
	public void setDienThoaiNguoiNop(String DienThoaiNguoiNop);

	/**
	 * Returns the dia chi of this ho so mot cua.
	 *
	 * @return the dia chi of this ho so mot cua
	 */
	@AutoEscape
	public String getDiaChi();

	/**
	 * Sets the dia chi of this ho so mot cua.
	 *
	 * @param DiaChi the dia chi of this ho so mot cua
	 */
	public void setDiaChi(String DiaChi);

	/**
	 * Returns the loai ho so of this ho so mot cua.
	 *
	 * @return the loai ho so of this ho so mot cua
	 */
	public int getLoaiHoSo();

	/**
	 * Sets the loai ho so of this ho so mot cua.
	 *
	 * @param LoaiHoSo the loai ho so of this ho so mot cua
	 */
	public void setLoaiHoSo(int LoaiHoSo);

	/**
	 * Returns the i d thu tuc of this ho so mot cua.
	 *
	 * @return the i d thu tuc of this ho so mot cua
	 */
	public int getIDThuTuc();

	/**
	 * Sets the i d thu tuc of this ho so mot cua.
	 *
	 * @param IDThuTuc the i d thu tuc of this ho so mot cua
	 */
	public void setIDThuTuc(int IDThuTuc);

	/**
	 * Returns the ngay tiep nhan of this ho so mot cua.
	 *
	 * @return the ngay tiep nhan of this ho so mot cua
	 */
	public Date getNgayTiepNhan();

	/**
	 * Sets the ngay tiep nhan of this ho so mot cua.
	 *
	 * @param NgayTiepNhan the ngay tiep nhan of this ho so mot cua
	 */
	public void setNgayTiepNhan(Date NgayTiepNhan);

	/**
	 * Returns the ngay tra ket qua of this ho so mot cua.
	 *
	 * @return the ngay tra ket qua of this ho so mot cua
	 */
	public Date getNgayTraKetQua();

	/**
	 * Sets the ngay tra ket qua of this ho so mot cua.
	 *
	 * @param NgayTraKetQua the ngay tra ket qua of this ho so mot cua
	 */
	public void setNgayTraKetQua(Date NgayTraKetQua);

	/**
	 * Returns the hinh thuc nop of this ho so mot cua.
	 *
	 * @return the hinh thuc nop of this ho so mot cua
	 */
	public int getHinhThucNop();

	/**
	 * Sets the hinh thuc nop of this ho so mot cua.
	 *
	 * @param HinhThucNop the hinh thuc nop of this ho so mot cua
	 */
	public void setHinhThucNop(int HinhThucNop);

	/**
	 * Returns the ma ho so of this ho so mot cua.
	 *
	 * @return the ma ho so of this ho so mot cua
	 */
	@AutoEscape
	public String getMaHoSo();

	/**
	 * Sets the ma ho so of this ho so mot cua.
	 *
	 * @param MaHoSo the ma ho so of this ho so mot cua
	 */
	public void setMaHoSo(String MaHoSo);

	/**
	 * Returns the so bo ho so of this ho so mot cua.
	 *
	 * @return the so bo ho so of this ho so mot cua
	 */
	public int getSoBoHoSo();

	/**
	 * Sets the so bo ho so of this ho so mot cua.
	 *
	 * @param SoBoHoSo the so bo ho so of this ho so mot cua
	 */
	public void setSoBoHoSo(int SoBoHoSo);

	/**
	 * Returns the trang thai of this ho so mot cua.
	 *
	 * @return the trang thai of this ho so mot cua
	 */
	public int getTrangThai();

	/**
	 * Sets the trang thai of this ho so mot cua.
	 *
	 * @param TrangThai the trang thai of this ho so mot cua
	 */
	public void setTrangThai(int TrangThai);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(HoSoMotCua hoSoMotCua);

	@Override
	public int hashCode();

	@Override
	public CacheModel<HoSoMotCua> toCacheModel();

	@Override
	public HoSoMotCua toEscapedModel();

	@Override
	public HoSoMotCua toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}