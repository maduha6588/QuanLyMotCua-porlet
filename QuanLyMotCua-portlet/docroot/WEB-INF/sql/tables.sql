create table mc_hosomotcua (
	id_ INTEGER not null primary key,
	ten_don_vi VARCHAR(255) null,
	dien_thoai VARCHAR(75) null,
	ten_nguoi_nop VARCHAR(255) null,
	cmnd VARCHAR(75) null,
	dien_thoai_nguoi_nop VARCHAR(75) null,
	dia_chi VARCHAR(255) null,
	loai_ho_so INTEGER,
	id_thu_tuc INTEGER,
	ngay_tiep_nhan DATE null,
	ngay_tra_ket_qua DATE null,
	hinh_thuc_nop INTEGER,
	ma_ho_so VARCHAR(75) null,
	so_bo_ho_so INTEGER,
	trang_thai INTEGER
);

create table quanlymotcua_Foo (
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);