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

import com.hamd.quanlymotcua.service.ClpSerializer;
import com.hamd.quanlymotcua.service.HoSoMotCuaLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hamd
 */
public class HoSoMotCuaClp extends BaseModelImpl<HoSoMotCua>
	implements HoSoMotCua {
	public HoSoMotCuaClp() {
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
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDonVi() {
		return _TenDonVi;
	}

	@Override
	public void setTenDonVi(String TenDonVi) {
		_TenDonVi = TenDonVi;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDonVi", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, TenDonVi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _DienThoai;
	}

	@Override
	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, DienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNguoiNop() {
		return _TenNguoiNop;
	}

	@Override
	public void setTenNguoiNop(String TenNguoiNop) {
		_TenNguoiNop = TenNguoiNop;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNguoiNop", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, TenNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCMND() {
		return _CMND;
	}

	@Override
	public void setCMND(String CMND) {
		_CMND = CMND;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setCMND", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, CMND);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoaiNguoiNop() {
		return _DienThoaiNguoiNop;
	}

	@Override
	public void setDienThoaiNguoiNop(String DienThoaiNguoiNop) {
		_DienThoaiNguoiNop = DienThoaiNguoiNop;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoaiNguoiNop",
						String.class);

				method.invoke(_hoSoMotCuaRemoteModel, DienThoaiNguoiNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _DiaChi;
	}

	@Override
	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, DiaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiHoSo() {
		return _LoaiHoSo;
	}

	@Override
	public void setLoaiHoSo(int LoaiHoSo) {
		_LoaiHoSo = LoaiHoSo;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHoSo", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, LoaiHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIDThuTuc() {
		return _IDThuTuc;
	}

	@Override
	public void setIDThuTuc(int IDThuTuc) {
		_IDThuTuc = IDThuTuc;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setIDThuTuc", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, IDThuTuc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTiepNhan() {
		return _NgayTiepNhan;
	}

	@Override
	public void setNgayTiepNhan(Date NgayTiepNhan) {
		_NgayTiepNhan = NgayTiepNhan;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTiepNhan", Date.class);

				method.invoke(_hoSoMotCuaRemoteModel, NgayTiepNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTraKetQua() {
		return _NgayTraKetQua;
	}

	@Override
	public void setNgayTraKetQua(Date NgayTraKetQua) {
		_NgayTraKetQua = NgayTraKetQua;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTraKetQua", Date.class);

				method.invoke(_hoSoMotCuaRemoteModel, NgayTraKetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHinhThucNop() {
		return _HinhThucNop;
	}

	@Override
	public void setHinhThucNop(int HinhThucNop) {
		_HinhThucNop = HinhThucNop;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setHinhThucNop", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, HinhThucNop);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaHoSo() {
		return _MaHoSo;
	}

	@Override
	public void setMaHoSo(String MaHoSo) {
		_MaHoSo = MaHoSo;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHoSo", String.class);

				method.invoke(_hoSoMotCuaRemoteModel, MaHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoBoHoSo() {
		return _SoBoHoSo;
	}

	@Override
	public void setSoBoHoSo(int SoBoHoSo) {
		_SoBoHoSo = SoBoHoSo;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setSoBoHoSo", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, SoBoHoSo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThai() {
		return _TrangThai;
	}

	@Override
	public void setTrangThai(int TrangThai) {
		_TrangThai = TrangThai;

		if (_hoSoMotCuaRemoteModel != null) {
			try {
				Class<?> clazz = _hoSoMotCuaRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_hoSoMotCuaRemoteModel, TrangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHoSoMotCuaRemoteModel() {
		return _hoSoMotCuaRemoteModel;
	}

	public void setHoSoMotCuaRemoteModel(BaseModel<?> hoSoMotCuaRemoteModel) {
		_hoSoMotCuaRemoteModel = hoSoMotCuaRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _hoSoMotCuaRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_hoSoMotCuaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HoSoMotCuaLocalServiceUtil.addHoSoMotCua(this);
		}
		else {
			HoSoMotCuaLocalServiceUtil.updateHoSoMotCua(this);
		}
	}

	@Override
	public HoSoMotCua toEscapedModel() {
		return (HoSoMotCua)ProxyUtil.newProxyInstance(HoSoMotCua.class.getClassLoader(),
			new Class[] { HoSoMotCua.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HoSoMotCuaClp clone = new HoSoMotCuaClp();

		clone.setId(getId());
		clone.setTenDonVi(getTenDonVi());
		clone.setDienThoai(getDienThoai());
		clone.setTenNguoiNop(getTenNguoiNop());
		clone.setCMND(getCMND());
		clone.setDienThoaiNguoiNop(getDienThoaiNguoiNop());
		clone.setDiaChi(getDiaChi());
		clone.setLoaiHoSo(getLoaiHoSo());
		clone.setIDThuTuc(getIDThuTuc());
		clone.setNgayTiepNhan(getNgayTiepNhan());
		clone.setNgayTraKetQua(getNgayTraKetQua());
		clone.setHinhThucNop(getHinhThucNop());
		clone.setMaHoSo(getMaHoSo());
		clone.setSoBoHoSo(getSoBoHoSo());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(HoSoMotCua hoSoMotCua) {
		int primaryKey = hoSoMotCua.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HoSoMotCuaClp)) {
			return false;
		}

		HoSoMotCuaClp hoSoMotCua = (HoSoMotCuaClp)obj;

		int primaryKey = hoSoMotCua.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", TenDonVi=");
		sb.append(getTenDonVi());
		sb.append(", DienThoai=");
		sb.append(getDienThoai());
		sb.append(", TenNguoiNop=");
		sb.append(getTenNguoiNop());
		sb.append(", CMND=");
		sb.append(getCMND());
		sb.append(", DienThoaiNguoiNop=");
		sb.append(getDienThoaiNguoiNop());
		sb.append(", DiaChi=");
		sb.append(getDiaChi());
		sb.append(", LoaiHoSo=");
		sb.append(getLoaiHoSo());
		sb.append(", IDThuTuc=");
		sb.append(getIDThuTuc());
		sb.append(", NgayTiepNhan=");
		sb.append(getNgayTiepNhan());
		sb.append(", NgayTraKetQua=");
		sb.append(getNgayTraKetQua());
		sb.append(", HinhThucNop=");
		sb.append(getHinhThucNop());
		sb.append(", MaHoSo=");
		sb.append(getMaHoSo());
		sb.append(", SoBoHoSo=");
		sb.append(getSoBoHoSo());
		sb.append(", TrangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.hamd.quanlymotcua.model.HoSoMotCua");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDonVi</column-name><column-value><![CDATA[");
		sb.append(getTenDonVi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CMND</column-name><column-value><![CDATA[");
		sb.append(getCMND());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DienThoaiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDienThoaiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoaiHoSo</column-name><column-value><![CDATA[");
		sb.append(getLoaiHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IDThuTuc</column-name><column-value><![CDATA[");
		sb.append(getIDThuTuc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTiepNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayTiepNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayTraKetQua</column-name><column-value><![CDATA[");
		sb.append(getNgayTraKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>HinhThucNop</column-name><column-value><![CDATA[");
		sb.append(getHinhThucNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaHoSo</column-name><column-value><![CDATA[");
		sb.append(getMaHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoBoHoSo</column-name><column-value><![CDATA[");
		sb.append(getSoBoHoSo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TrangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _TenDonVi;
	private String _DienThoai;
	private String _TenNguoiNop;
	private String _CMND;
	private String _DienThoaiNguoiNop;
	private String _DiaChi;
	private int _LoaiHoSo;
	private int _IDThuTuc;
	private Date _NgayTiepNhan;
	private Date _NgayTraKetQua;
	private int _HinhThucNop;
	private String _MaHoSo;
	private int _SoBoHoSo;
	private int _TrangThai;
	private BaseModel<?> _hoSoMotCuaRemoteModel;
}