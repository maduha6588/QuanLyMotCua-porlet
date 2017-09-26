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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.hamd.quanlymotcua.service.http.HoSoMotCuaServiceSoap}.
 *
 * @author hamd
 * @see com.hamd.quanlymotcua.service.http.HoSoMotCuaServiceSoap
 * @generated
 */
public class HoSoMotCuaSoap implements Serializable {
	public static HoSoMotCuaSoap toSoapModel(HoSoMotCua model) {
		HoSoMotCuaSoap soapModel = new HoSoMotCuaSoap();

		soapModel.setId(model.getId());
		soapModel.setTenDonVi(model.getTenDonVi());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setTenNguoiNop(model.getTenNguoiNop());
		soapModel.setCMND(model.getCMND());
		soapModel.setDienThoaiNguoiNop(model.getDienThoaiNguoiNop());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setLoaiHoSo(model.getLoaiHoSo());
		soapModel.setIDThuTuc(model.getIDThuTuc());
		soapModel.setNgayTiepNhan(model.getNgayTiepNhan());
		soapModel.setNgayTraKetQua(model.getNgayTraKetQua());
		soapModel.setHinhThucNop(model.getHinhThucNop());
		soapModel.setMaHoSo(model.getMaHoSo());
		soapModel.setSoBoHoSo(model.getSoBoHoSo());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static HoSoMotCuaSoap[] toSoapModels(HoSoMotCua[] models) {
		HoSoMotCuaSoap[] soapModels = new HoSoMotCuaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HoSoMotCuaSoap[][] toSoapModels(HoSoMotCua[][] models) {
		HoSoMotCuaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HoSoMotCuaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HoSoMotCuaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HoSoMotCuaSoap[] toSoapModels(List<HoSoMotCua> models) {
		List<HoSoMotCuaSoap> soapModels = new ArrayList<HoSoMotCuaSoap>(models.size());

		for (HoSoMotCua model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HoSoMotCuaSoap[soapModels.size()]);
	}

	public HoSoMotCuaSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getTenDonVi() {
		return _TenDonVi;
	}

	public void setTenDonVi(String TenDonVi) {
		_TenDonVi = TenDonVi;
	}

	public String getDienThoai() {
		return _DienThoai;
	}

	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;
	}

	public String getTenNguoiNop() {
		return _TenNguoiNop;
	}

	public void setTenNguoiNop(String TenNguoiNop) {
		_TenNguoiNop = TenNguoiNop;
	}

	public String getCMND() {
		return _CMND;
	}

	public void setCMND(String CMND) {
		_CMND = CMND;
	}

	public String getDienThoaiNguoiNop() {
		return _DienThoaiNguoiNop;
	}

	public void setDienThoaiNguoiNop(String DienThoaiNguoiNop) {
		_DienThoaiNguoiNop = DienThoaiNguoiNop;
	}

	public String getDiaChi() {
		return _DiaChi;
	}

	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;
	}

	public int getLoaiHoSo() {
		return _LoaiHoSo;
	}

	public void setLoaiHoSo(int LoaiHoSo) {
		_LoaiHoSo = LoaiHoSo;
	}

	public int getIDThuTuc() {
		return _IDThuTuc;
	}

	public void setIDThuTuc(int IDThuTuc) {
		_IDThuTuc = IDThuTuc;
	}

	public Date getNgayTiepNhan() {
		return _NgayTiepNhan;
	}

	public void setNgayTiepNhan(Date NgayTiepNhan) {
		_NgayTiepNhan = NgayTiepNhan;
	}

	public Date getNgayTraKetQua() {
		return _NgayTraKetQua;
	}

	public void setNgayTraKetQua(Date NgayTraKetQua) {
		_NgayTraKetQua = NgayTraKetQua;
	}

	public int getHinhThucNop() {
		return _HinhThucNop;
	}

	public void setHinhThucNop(int HinhThucNop) {
		_HinhThucNop = HinhThucNop;
	}

	public String getMaHoSo() {
		return _MaHoSo;
	}

	public void setMaHoSo(String MaHoSo) {
		_MaHoSo = MaHoSo;
	}

	public int getSoBoHoSo() {
		return _SoBoHoSo;
	}

	public void setSoBoHoSo(int SoBoHoSo) {
		_SoBoHoSo = SoBoHoSo;
	}

	public int getTrangThai() {
		return _TrangThai;
	}

	public void setTrangThai(int TrangThai) {
		_TrangThai = TrangThai;
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
}