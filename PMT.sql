SET NAMES 'utf8';

drop database if exists PhongMachTu;
create DATABASE if not exists PhongMachTu;

USE PhongMachTu;

drop TABLE if exists VaiTro;
create TABLE VaiTro(
	MaVaiTro varchar(20) not null,
    TenVaiTro varchar(20),
	primary key (MaVaiTro)
);


drop TABLE if exists NguoiDung;
create TABLE NguoiDung (
	MaNguoiDung varchar(20) not null,
    HoTen varchar(50) not null,
    TenDanNhap varchar(50) not null,
    MatKhau varchar(50) not null,
    MaVaiTro varchar(20),
    primary key (MaNguoiDung),
	constraint Constr_NguoiDung_VaiTro
		foreign key (MaVaiTro) references VaiTro(MaVaiTro)
        ON DELETE CASCADE ON UPDATE CASCADE
);

drop TABLE if exists Thuoc;
create TABLE Thuoc (
	MaThuoc varchar(20) not null,
    TenThuoc varchar(50),
    GiaThuoc int,
    primary key (MaThuoc)
);

drop TABLE if exists CachDung;
create TABLE CachDung (
	MaCachDung varchar(20) not null,
    CachDung varchar(50),
    primary key (MaCachDung)
);

drop TABLE if exists DonVi;
create TABLE DonVi (
	MaDonVi varchar(20) not null,
    TenDonVi varchar(50),
    primary key (MaDonVi)
);

drop TABLE if exists Benh;
create TABLE Benh (
	MaBenh varchar(20) not null,
    TenBenh varchar(50),
    primary key (MaBenh)
);

drop TABLE if exists ThamSo;
create TABLE ThamSo (
	MaThamSo varchar(20) not null,
    TenThamSo varchar(50),
    ThamSo int,
    primary key (MaThamSo)
);

drop TABLE if exists DanhSachKham;
create TABLE DanhSachKham (
	MaDanhSachKham varchar(20) not null,
    NgayKham varchar(50),
    primary key (MaDanhSachKham)
);

drop TABLE if exists BenhNhan;
create TABLE BenhNhan (
	MaBenhNhan varchar(20) not null,
    HoTen varchar(50),
    GioiTinh varchar(10),
    DiaChi varchar(50),
    primary key (MaBenhNhan)
);

drop TABLE if exists ChiTietDanhSachKham;
create TABLE ChiTietDanhSachKham (
	MaDanhSachKham varchar(20) not null,
    MaBenhNhan varchar(20) not null,
    primary key (MaDanhSachKham, MaBenhNhan),
    constraint Constr_CTDSK_DanhSachKham
		foreign key (MaDanhSachKham) references DanhSachKham(MaDanhSachKham)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_CTDSK_BenhNhan
		foreign key (MaBenhNhan) references BenhNhan(MaBenhNhan)
        ON DELETE CASCADE ON UPDATE CASCADE
);

drop TABLE if exists PhieuKham;
create TABLE PhieuKham (
	MaPhieuKham varchar(20) not null,
    MaDanhSachKham varchar(20) not null,
    MaBenhNhan varchar(20) not null,
    MaBenh varchar(20) not null,
    MaNguoiDung varchar(20) not null,
    TrieuChung varchar(255),
    GhiChu varchar(255),
    TongTien int,
    ThanhToan varchar(10),
    primary key (MaPhieuKham),
    constraint Constr_PhieuKham_DanhSach
		foreign key (MaDanhSachKham) references DanhSachKham(MaDanhSachKham)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_PhieuKham_BenhNhan
		foreign key (MaBenhNhan) references BenhNhan(MaBenhNhan)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_PhieuKham_Benh
		foreign key (MaBenh) references Benh(MaBenh)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_PhieuKham_NguoiDung
		foreign key (MaNguoiDung) references NguoiDung(MaNguoiDung)
        ON DELETE CASCADE ON UPDATE CASCADE
);

drop TABLE if exists ChiTietPhieuKham;
create TABLE ChiTietPhieuKham (
	MaChiTietPhieuKham varchar(20) not null,
    MaPhieuKham varchar(20) not null,
    MaThuoc varchar(20) not null,
    MaDonVi varchar(20) not null,
    MaCachDung varchar(20) not null,
    SoLuong int,
    ThanhTien int,
    primary key (MaChiTietPhieuKham),
    constraint Constr_CTPK_Thuoc
		foreign key (MaThuoc) references Thuoc(MaThuoc)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_CTPK_PhieuKham
		foreign key (MaPhieuKham) references PhieuKham(MaPhieuKham)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_CTPK_DonVi
		foreign key (MaDonVi) references DonVi(MaDonVi)
        ON DELETE CASCADE ON UPDATE CASCADE,
	constraint Constr_CTPK_CachDung
		foreign key (MaCachDung) references CachDung(MaCachDung)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO VaiTro values('VT1','admin');
INSERT INTO VaiTro values('VT2','Tiếp Tân');
INSERT INTO VaiTro values('VT3','Bác Sĩ');
INSERT INTO VaiTro values('VT4','Thu Ngân');

INSERT INTO NguoiDung values('ND01','','admin','admin','VT1');
INSERT INTO NguoiDung values('ND02','Nguyễn Thị Anh','lt','1234','VT2');
INSERT INTO NguoiDung values('ND03','Trần Trung Trí','bs','1234','VT3');
INSERT INTO NguoiDung values('ND04','Vũ Khắc Nguyên','tn','1234','VT4');

insert into ThamSo values ('TS01', 'Tiền khám', 40000);

insert into Benh values ('BENH1', 'Đau đầu');
INSERT INTO Benh VALUES ('BENH2', 'Đau bụng');
INSERT INTO Benh VALUES ('BENH3', 'Viêm họng');
INSERT INTO Benh VALUES ('BENH4', 'Cảm cúm');
INSERT INTO Benh VALUES ('BENH5', 'Sốt siêu vi');

INSERT INTO DonVi VALUES ('DV1', 'Viên');
INSERT INTO DonVi VALUES ('DV2', 'Chai');
INSERT INTO DonVi VALUES ('DV3', 'Vỉ');
INSERT INTO DonVi VALUES ('DV4', 'Hộp');

INSERT INTO CachDung VALUES ('CD1', 'Ngày uống 3 viên vào sáng trưa chiều sau khi ăn.');
INSERT INTO CachDung VALUES ('CD2', 'Ngày uống 2 viên vào sáng chiều sau khi ăn.');
INSERT INTO CachDung VALUES ('CD3', N'Ngày uống 1 viên trước khi ngủ');
INSERT INTO CachDung VALUES ('CD4', N'Ngày uống 1 viên sau khi ăn sáng');

INSERT INTO Thuoc
VALUES ('THUOC01', 'Paracatemol', 3000);

INSERT INTO Thuoc
VALUES ('THUOC02', 'Panadol',5000);

INSERT INTO Thuoc
VALUES ('THUOC03', 'Glycerol', 10000);

INSERT INTO Thuoc
VALUES ('THUOC04', 'Codein', 2000);

INSERT INTO Thuoc
VALUES ('THUOC05', 'Aspirin', 6000);

INSERT INTO Thuoc
VALUES ('THUOC06', 'PROSPAN', 30000);

INSERT INTO Thuoc
VALUES ('THUOC07', 'Bezut', 15000);

INSERT INTO Thuoc
VALUES ('THUOC08', 'Eugica', 5000);

INSERT INTO Thuoc
VALUES ('THUOC09', 'Bảo Thanh', 5000);

INSERT INTO Thuoc
VALUES ('THUOC10', 'Berberin', 16000);

INSERT INTO Thuoc 
VALUES ('THUOC11', 'Biseptol', 50000);

INSERT INTO Thuoc
VALUES ('THUOC12', 'Mofen 400', 32000);

INSERT INTO Thuoc
VALUES ('THUOC13', 'Loperamid', 100000);

INSERT INTO Thuoc
VALUES ('THUOC14', 'Tiffy', 5000);

INSERT INTO Thuoc
VALUES ('THUOC15', 'Tamiflu', 3000);

INSERT INTO Thuoc
VALUES ('THUOC16', 'Decolgen', 12000);

INSERT INTO Thuoc
VALUES ('THUOC17', 'Cataflam', 22000);

INSERT INTO Thuoc
VALUES ('THUOC18', 'DolFenal', 65000);

INSERT INTO Thuoc
VALUES ('THUOC19', 'Hapacol', 6000);

INSERT INTO Thuoc
VALUES ('THUOC20', 'Strepsil', 7000);

INSERT INTO Thuoc
VALUES ('THUOC21', 'MaLarone', 31000);

INSERT INTO Thuoc
VALUES ('THUOC22', 'Ibuproféne', 500000);

INSERT INTO Thuoc
VALUES ('THUOC23', 'Slaska', 120000);

INSERT INTO Thuoc
VALUES ('THUOC24', 'Daflon', 90000);

INSERT INTO Thuoc
VALUES ('THUOC25', 'Opirid', 200000);

INSERT INTO Thuoc
VALUES ('THUOC26', 'An Kinh bổ huyết', 32000);

INSERT INTO Thuoc
VALUES ('THUOC27', 'Bảo thanh viên ngậm', 5000);

INSERT INTO Thuoc
VALUES ('THUOC28', 'Bổ phế Nam Hà', 12000);

INSERT INTO Thuoc
VALUES ('THUOC29', 'Efferalgan', 6000);
INSERT INTO Thuoc
VALUES ('THUOC30', 'Thuốc ho P/H', 25000);

