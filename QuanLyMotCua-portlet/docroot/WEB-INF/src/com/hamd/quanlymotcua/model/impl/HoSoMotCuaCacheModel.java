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

package com.hamd.quanlymotcua.model.impl;

import com.hamd.quanlymotcua.model.HoSoMotCua;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HoSoMotCua in entity cache.
 *
 * @author hamd
 * @see HoSoMotCua
 * @generated
 */
public class HoSoMotCuaCacheModel implements CacheModel<HoSoMotCua>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", TenDonVi=");
		sb.append(TenDonVi);
		sb.append(", DienThoai=");
		sb.append(DienThoai);
		sb.append(", TenNguoiNop=");
		sb.append(TenNguoiNop);
		sb.append(", CMND=");
		sb.append(CMND);
		sb.append(", DienThoaiNguoiNop=");
		sb.append(DienThoaiNguoiNop);
		sb.append(", DiaChi=");
		sb.append(DiaChi);
		sb.append(", LoaiHoSo=");
		sb.append(LoaiHoSo);
		sb.append(", IDThuTuc=");
		sb.append(IDThuTuc);
		sb.append(", NgayTiepNhan=");
		sb.append(NgayTiepNhan);
		sb.append(", NgayTraKetQua=");
		sb.append(NgayTraKetQua);
		sb.append(", HinhThucNop=");
		sb.append(HinhThucNop);
		sb.append(", MaHoSo=");
		sb.append(MaHoSo);
		sb.append(", SoBoHoSo=");
		sb.append(SoBoHoSo);
		sb.append(", TrangThai=");
		sb.append(TrangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HoSoMotCua toEntityModel() {
		HoSoMotCuaImpl hoSoMotCuaImpl = new HoSoMotCuaImpl();

		hoSoMotCuaImpl.setId(id);

		if (TenDonVi == null) {
			hoSoMotCuaImpl.setTenDonVi(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setTenDonVi(TenDonVi);
		}

		if (DienThoai == null) {
			hoSoMotCuaImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setDienThoai(DienThoai);
		}

		if (TenNguoiNop == null) {
			hoSoMotCuaImpl.setTenNguoiNop(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setTenNguoiNop(TenNguoiNop);
		}

		if (CMND == null) {
			hoSoMotCuaImpl.setCMND(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setCMND(CMND);
		}

		if (DienThoaiNguoiNop == null) {
			hoSoMotCuaImpl.setDienThoaiNguoiNop(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setDienThoaiNguoiNop(DienThoaiNguoiNop);
		}

		if (DiaChi == null) {
			hoSoMotCuaImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setDiaChi(DiaChi);
		}

		hoSoMotCuaImpl.setLoaiHoSo(LoaiHoSo);
		hoSoMotCuaImpl.setIDThuTuc(IDThuTuc);

		if (NgayTiepNhan == Long.MIN_VALUE) {
			hoSoMotCuaImpl.setNgayTiepNhan(null);
		}
		else {
			hoSoMotCuaImpl.setNgayTiepNhan(new Date(NgayTiepNhan));
		}

		if (NgayTraKetQua == Long.MIN_VALUE) {
			hoSoMotCuaImpl.setNgayTraKetQua(null);
		}
		else {
			hoSoMotCuaImpl.setNgayTraKetQua(new Date(NgayTraKetQua));
		}

		hoSoMotCuaImpl.setHinhThucNop(HinhThucNop);

		if (MaHoSo == null) {
			hoSoMotCuaImpl.setMaHoSo(StringPool.BLANK);
		}
		else {
			hoSoMotCuaImpl.setMaHoSo(MaHoSo);
		}

		hoSoMotCuaImpl.setSoBoHoSo(SoBoHoSo);
		hoSoMotCuaImpl.setTrangThai(TrangThai);

		hoSoMotCuaImpl.resetOriginalValues();

		return hoSoMotCuaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		TenDonVi = objectInput.readUTF();
		DienThoai = objectInput.readUTF();
		TenNguoiNop = objectInput.readUTF();
		CMND = objectInput.readUTF();
		DienThoaiNguoiNop = objectInput.readUTF();
		DiaChi = objectInput.readUTF();
		LoaiHoSo = objectInput.readInt();
		IDThuTuc = objectInput.readInt();
		NgayTiepNhan = objectInput.readLong();
		NgayTraKetQua = objectInput.readLong();
		HinhThucNop = objectInput.readInt();
		MaHoSo = objectInput.readUTF();
		SoBoHoSo = objectInput.readInt();
		TrangThai = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (TenDonVi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDonVi);
		}

		if (DienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DienThoai);
		}

		if (TenNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenNguoiNop);
		}

		if (CMND == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CMND);
		}

		if (DienThoaiNguoiNop == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DienThoaiNguoiNop);
		}

		if (DiaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DiaChi);
		}

		objectOutput.writeInt(LoaiHoSo);
		objectOutput.writeInt(IDThuTuc);
		objectOutput.writeLong(NgayTiepNhan);
		objectOutput.writeLong(NgayTraKetQua);
		objectOutput.writeInt(HinhThucNop);

		if (MaHoSo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaHoSo);
		}

		objectOutput.writeInt(SoBoHoSo);
		objectOutput.writeInt(TrangThai);
	}

	public int id;
	public String TenDonVi;
	public String DienThoai;
	public String TenNguoiNop;
	public String CMND;
	public String DienThoaiNguoiNop;
	public String DiaChi;
	public int LoaiHoSo;
	public int IDThuTuc;
	public long NgayTiepNhan;
	public long NgayTraKetQua;
	public int HinhThucNop;
	public String MaHoSo;
	public int SoBoHoSo;
	public int TrangThai;
}