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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HoSoMotCua}.
 * </p>
 *
 * @author hamd
 * @see HoSoMotCua
 * @generated
 */
public class HoSoMotCuaWrapper implements HoSoMotCua, ModelWrapper<HoSoMotCua> {
	public HoSoMotCuaWrapper(HoSoMotCua hoSoMotCua) {
		_hoSoMotCua = hoSoMotCua;
	}

	@Override
	public Class<?> getModelClass() {
		return HoSoMotCua.class;
	}

	@Override
	public String getModelClassName() {
		return HoSoMotCua.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("TenDonVi", getTenDonVi());
		attributes.put("DienThoai", getDienThoai());
		attributes.put("TenNguoiNop", getTenNguoiNop());
		attributes.put("CMND", getCMND());
		attributes.put("DienThoaiNguoiNop", getDienThoaiNguoiNop());
		attributes.put("DiaChi", getDiaChi());
		attributes.put("LoaiHoSo", getLoaiHoSo());
		attributes.put("IDThuTuc", getIDThuTuc());
		attributes.put("NgayTiepNhan", getNgayTiepNhan());
		attributes.put("NgayTraKetQua", getNgayTraKetQua());
		attributes.put("HinhThucNop", getHinhThucNop());
		attributes.put("MaHoSo", getMaHoSo());
		attributes.put("SoBoHoSo", getSoBoHoSo());
		attributes.put("TrangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String TenDonVi = (String)attributes.get("TenDonVi");

		if (TenDonVi != null) {
			setTenDonVi(TenDonVi);
		}

		String DienThoai = (String)attributes.get("DienThoai");

		if (DienThoai != null) {
			setDienThoai(DienThoai);
		}

		String TenNguoiNop = (String)attributes.get("TenNguoiNop");

		if (TenNguoiNop != null) {
			setTenNguoiNop(TenNguoiNop);
		}

		String CMND = (String)attributes.get("CMND");

		if (CMND != null) {
			setCMND(CMND);
		}

		String DienThoaiNguoiNop = (String)attributes.get("DienThoaiNguoiNop");

		if (DienThoaiNguoiNop != null) {
			setDienThoaiNguoiNop(DienThoaiNguoiNop);
		}

		String DiaChi = (String)attributes.get("DiaChi");

		if (DiaChi != null) {
			setDiaChi(DiaChi);
		}

		Integer LoaiHoSo = (Integer)attributes.get("LoaiHoSo");

		if (LoaiHoSo != null) {
			setLoaiHoSo(LoaiHoSo);
		}

		Integer IDThuTuc = (Integer)attributes.get("IDThuTuc");

		if (IDThuTuc != null) {
			setIDThuTuc(IDThuTuc);
		}

		Date NgayTiepNhan = (Date)attributes.get("NgayTiepNhan");

		if (NgayTiepNhan != null) {
			setNgayTiepNhan(NgayTiepNhan);
		}

		Date NgayTraKetQua = (Date)attributes.get("NgayTraKetQua");

		if (NgayTraKetQua != null) {
			setNgayTraKetQua(NgayTraKetQua);
		}

		Integer HinhThucNop = (Integer)attributes.get("HinhThucNop");

		if (HinhThucNop != null) {
			setHinhThucNop(HinhThucNop);
		}

		String MaHoSo = (String)attributes.get("MaHoSo");

		if (MaHoSo != null) {
			setMaHoSo(MaHoSo);
		}

		Integer SoBoHoSo = (Integer)attributes.get("SoBoHoSo");

		if (SoBoHoSo != null) {
			setSoBoHoSo(SoBoHoSo);
		}

		Integer TrangThai = (Integer)attributes.get("TrangThai");

		if (TrangThai != null) {
			setTrangThai(TrangThai);
		}
	}

	/**
	* Returns the primary key of this ho so mot cua.
	*
	* @return the primary key of this ho so mot cua
	*/
	@Override
	public int getPrimaryKey() {
		return _hoSoMotCua.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ho so mot cua.
	*
	* @param primaryKey the primary key of this ho so mot cua
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_hoSoMotCua.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ho so mot cua.
	*
	* @return the ID of this ho so mot cua
	*/
	@Override
	public int getId() {
		return _hoSoMotCua.getId();
	}

	/**
	* Sets the ID of this ho so mot cua.
	*
	* @param id the ID of this ho so mot cua
	*/
	@Override
	public void setId(int id) {
		_hoSoMotCua.setId(id);
	}

	/**
	* Returns the ten don vi of this ho so mot cua.
	*
	* @return the ten don vi of this ho so mot cua
	*/
	@Override
	public java.lang.String getTenDonVi() {
		return _hoSoMotCua.getTenDonVi();
	}

	/**
	* Sets the ten don vi of this ho so mot cua.
	*
	* @param TenDonVi the ten don vi of this ho so mot cua
	*/
	@Override
	public void setTenDonVi(java.lang.String TenDonVi) {
		_hoSoMotCua.setTenDonVi(TenDonVi);
	}

	/**
	* Returns the dien thoai of this ho so mot cua.
	*
	* @return the dien thoai of this ho so mot cua
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _hoSoMotCua.getDienThoai();
	}

	/**
	* Sets the dien thoai of this ho so mot cua.
	*
	* @param DienThoai the dien thoai of this ho so mot cua
	*/
	@Override
	public void setDienThoai(java.lang.String DienThoai) {
		_hoSoMotCua.setDienThoai(DienThoai);
	}

	/**
	* Returns the ten nguoi nop of this ho so mot cua.
	*
	* @return the ten nguoi nop of this ho so mot cua
	*/
	@Override
	public java.lang.String getTenNguoiNop() {
		return _hoSoMotCua.getTenNguoiNop();
	}

	/**
	* Sets the ten nguoi nop of this ho so mot cua.
	*
	* @param TenNguoiNop the ten nguoi nop of this ho so mot cua
	*/
	@Override
	public void setTenNguoiNop(java.lang.String TenNguoiNop) {
		_hoSoMotCua.setTenNguoiNop(TenNguoiNop);
	}

	/**
	* Returns the c m n d of this ho so mot cua.
	*
	* @return the c m n d of this ho so mot cua
	*/
	@Override
	public java.lang.String getCMND() {
		return _hoSoMotCua.getCMND();
	}

	/**
	* Sets the c m n d of this ho so mot cua.
	*
	* @param CMND the c m n d of this ho so mot cua
	*/
	@Override
	public void setCMND(java.lang.String CMND) {
		_hoSoMotCua.setCMND(CMND);
	}

	/**
	* Returns the dien thoai nguoi nop of this ho so mot cua.
	*
	* @return the dien thoai nguoi nop of this ho so mot cua
	*/
	@Override
	public java.lang.String getDienThoaiNguoiNop() {
		return _hoSoMotCua.getDienThoaiNguoiNop();
	}

	/**
	* Sets the dien thoai nguoi nop of this ho so mot cua.
	*
	* @param DienThoaiNguoiNop the dien thoai nguoi nop of this ho so mot cua
	*/
	@Override
	public void setDienThoaiNguoiNop(java.lang.String DienThoaiNguoiNop) {
		_hoSoMotCua.setDienThoaiNguoiNop(DienThoaiNguoiNop);
	}

	/**
	* Returns the dia chi of this ho so mot cua.
	*
	* @return the dia chi of this ho so mot cua
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _hoSoMotCua.getDiaChi();
	}

	/**
	* Sets the dia chi of this ho so mot cua.
	*
	* @param DiaChi the dia chi of this ho so mot cua
	*/
	@Override
	public void setDiaChi(java.lang.String DiaChi) {
		_hoSoMotCua.setDiaChi(DiaChi);
	}

	/**
	* Returns the loai ho so of this ho so mot cua.
	*
	* @return the loai ho so of this ho so mot cua
	*/
	@Override
	public int getLoaiHoSo() {
		return _hoSoMotCua.getLoaiHoSo();
	}

	/**
	* Sets the loai ho so of this ho so mot cua.
	*
	* @param LoaiHoSo the loai ho so of this ho so mot cua
	*/
	@Override
	public void setLoaiHoSo(int LoaiHoSo) {
		_hoSoMotCua.setLoaiHoSo(LoaiHoSo);
	}

	/**
	* Returns the i d thu tuc of this ho so mot cua.
	*
	* @return the i d thu tuc of this ho so mot cua
	*/
	@Override
	public int getIDThuTuc() {
		return _hoSoMotCua.getIDThuTuc();
	}

	/**
	* Sets the i d thu tuc of this ho so mot cua.
	*
	* @param IDThuTuc the i d thu tuc of this ho so mot cua
	*/
	@Override
	public void setIDThuTuc(int IDThuTuc) {
		_hoSoMotCua.setIDThuTuc(IDThuTuc);
	}

	/**
	* Returns the ngay tiep nhan of this ho so mot cua.
	*
	* @return the ngay tiep nhan of this ho so mot cua
	*/
	@Override
	public java.util.Date getNgayTiepNhan() {
		return _hoSoMotCua.getNgayTiepNhan();
	}

	/**
	* Sets the ngay tiep nhan of this ho so mot cua.
	*
	* @param NgayTiepNhan the ngay tiep nhan of this ho so mot cua
	*/
	@Override
	public void setNgayTiepNhan(java.util.Date NgayTiepNhan) {
		_hoSoMotCua.setNgayTiepNhan(NgayTiepNhan);
	}

	/**
	* Returns the ngay tra ket qua of this ho so mot cua.
	*
	* @return the ngay tra ket qua of this ho so mot cua
	*/
	@Override
	public java.util.Date getNgayTraKetQua() {
		return _hoSoMotCua.getNgayTraKetQua();
	}

	/**
	* Sets the ngay tra ket qua of this ho so mot cua.
	*
	* @param NgayTraKetQua the ngay tra ket qua of this ho so mot cua
	*/
	@Override
	public void setNgayTraKetQua(java.util.Date NgayTraKetQua) {
		_hoSoMotCua.setNgayTraKetQua(NgayTraKetQua);
	}

	/**
	* Returns the hinh thuc nop of this ho so mot cua.
	*
	* @return the hinh thuc nop of this ho so mot cua
	*/
	@Override
	public int getHinhThucNop() {
		return _hoSoMotCua.getHinhThucNop();
	}

	/**
	* Sets the hinh thuc nop of this ho so mot cua.
	*
	* @param HinhThucNop the hinh thuc nop of this ho so mot cua
	*/
	@Override
	public void setHinhThucNop(int HinhThucNop) {
		_hoSoMotCua.setHinhThucNop(HinhThucNop);
	}

	/**
	* Returns the ma ho so of this ho so mot cua.
	*
	* @return the ma ho so of this ho so mot cua
	*/
	@Override
	public java.lang.String getMaHoSo() {
		return _hoSoMotCua.getMaHoSo();
	}

	/**
	* Sets the ma ho so of this ho so mot cua.
	*
	* @param MaHoSo the ma ho so of this ho so mot cua
	*/
	@Override
	public void setMaHoSo(java.lang.String MaHoSo) {
		_hoSoMotCua.setMaHoSo(MaHoSo);
	}

	/**
	* Returns the so bo ho so of this ho so mot cua.
	*
	* @return the so bo ho so of this ho so mot cua
	*/
	@Override
	public int getSoBoHoSo() {
		return _hoSoMotCua.getSoBoHoSo();
	}

	/**
	* Sets the so bo ho so of this ho so mot cua.
	*
	* @param SoBoHoSo the so bo ho so of this ho so mot cua
	*/
	@Override
	public void setSoBoHoSo(int SoBoHoSo) {
		_hoSoMotCua.setSoBoHoSo(SoBoHoSo);
	}

	/**
	* Returns the trang thai of this ho so mot cua.
	*
	* @return the trang thai of this ho so mot cua
	*/
	@Override
	public int getTrangThai() {
		return _hoSoMotCua.getTrangThai();
	}

	/**
	* Sets the trang thai of this ho so mot cua.
	*
	* @param TrangThai the trang thai of this ho so mot cua
	*/
	@Override
	public void setTrangThai(int TrangThai) {
		_hoSoMotCua.setTrangThai(TrangThai);
	}

	@Override
	public boolean isNew() {
		return _hoSoMotCua.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_hoSoMotCua.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _hoSoMotCua.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hoSoMotCua.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _hoSoMotCua.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _hoSoMotCua.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_hoSoMotCua.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hoSoMotCua.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_hoSoMotCua.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_hoSoMotCua.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hoSoMotCua.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HoSoMotCuaWrapper((HoSoMotCua)_hoSoMotCua.clone());
	}

	@Override
	public int compareTo(com.hamd.quanlymotcua.model.HoSoMotCua hoSoMotCua) {
		return _hoSoMotCua.compareTo(hoSoMotCua);
	}

	@Override
	public int hashCode() {
		return _hoSoMotCua.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.hamd.quanlymotcua.model.HoSoMotCua> toCacheModel() {
		return _hoSoMotCua.toCacheModel();
	}

	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua toEscapedModel() {
		return new HoSoMotCuaWrapper(_hoSoMotCua.toEscapedModel());
	}

	@Override
	public com.hamd.quanlymotcua.model.HoSoMotCua toUnescapedModel() {
		return new HoSoMotCuaWrapper(_hoSoMotCua.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _hoSoMotCua.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hoSoMotCua.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_hoSoMotCua.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HoSoMotCuaWrapper)) {
			return false;
		}

		HoSoMotCuaWrapper hoSoMotCuaWrapper = (HoSoMotCuaWrapper)obj;

		if (Validator.equals(_hoSoMotCua, hoSoMotCuaWrapper._hoSoMotCua)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HoSoMotCua getWrappedHoSoMotCua() {
		return _hoSoMotCua;
	}

	@Override
	public HoSoMotCua getWrappedModel() {
		return _hoSoMotCua;
	}

	@Override
	public void resetOriginalValues() {
		_hoSoMotCua.resetOriginalValues();
	}

	private HoSoMotCua _hoSoMotCua;
}