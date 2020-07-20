SET NAMES 'utf8';

drop database if exists PhongMachTu;
create DATABASE if not exists PhongMachTu;

USE PhongMachTu;

drop TABLE if exists VaiTro;
create TABLE VaiTro(
	MaVaiTro int not null AUTO_INCREMENT,
    TenVaiTro varchar(20),
	primary key (MaVaiTro)
);


drop TABLE if exists NguoiDung;
create TABLE NguoiDung (
	MaNguoiDung int not null AUTO_INCREMENT,
    HoTen varchar(50) not null,
    TenDangNhap varchar(50) not null,
    MatKhau varchar(50) not null,
    MaVaiTro int,
    primary key (MaNguoiDung),
	constraint Constr_NguoiDung_VaiTro
		foreign key (MaVaiTro) references VaiTro(MaVaiTro)
        ON DELETE CASCADE ON UPDATE CASCADE
);

drop TABLE if exists Thuoc;
create TABLE Thuoc (
	MaThuoc int not null AUTO_INCREMENT,
    TenThuoc varchar(50),
    GiaThuoc int,
    primary key (MaThuoc)
);

drop TABLE if exists CachDung;
create TABLE CachDung (
	MaCachDung int not null AUTO_INCREMENT,
    CachDung varchar(50),
    primary key (MaCachDung)
);

drop TABLE if exists DonVi;
create TABLE DonVi (
	MaDonVi int not null AUTO_INCREMENT,
    TenDonVi varchar(50),
    primary key (MaDonVi)
);

drop TABLE if exists Benh;
create TABLE Benh (
	MaBenh int not null AUTO_INCREMENT,
    TenBenh varchar(50),
    primary key (MaBenh)
);

drop TABLE if exists ThamSo;
create TABLE ThamSo (
	MaThamSo int not null AUTO_INCREMENT,
    TenThamSo varchar(50),
    ThamSo int,
    primary key (MaThamSo)
);

drop TABLE if exists DanhSachKham;
create TABLE DanhSachKham (
	MaDanhSachKham int not null AUTO_INCREMENT,
    NgayKham varchar(50),
    primary key (MaDanhSachKham)
);

drop TABLE if exists BenhNhan;
create TABLE BenhNhan (
	MaBenhNhan int not null AUTO_INCREMENT,
    HoTen varchar(50),
    GioiTinh varchar(10),
    DiaChi varchar(50),
    primary key (MaBenhNhan)
);

drop TABLE if exists ChiTietDanhSachKham;
create TABLE ChiTietDanhSachKham (
	MaDanhSachKham int not null AUTO_INCREMENT,
    MaBenhNhan int,
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
	MaPhieuKham int not null AUTO_INCREMENT,
    MaDanhSachKham int not null,
    MaBenhNhan int not null,
    MaBenh int not null,
    MaNguoiDung int not null,
    TrieuChung varchar(255),
    GhiChu varchar(255),
    TongTien int,
    ThanhToan boolean,
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
	MaChiTietPhieuKham int not null AUTO_INCREMENT,
    MaPhieuKham int not null,
    MaThuoc int not null,
    MaDonVi int not null,
    MaCachDung int not null,
    SoLuong int,
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

INSERT INTO VaiTro(TenVaiTro) values('admin');
INSERT INTO VaiTro(TenVaiTro) values('Tiếp Tân');
INSERT INTO VaiTro(TenVaiTro) values('Bác Sĩ');
INSERT INTO VaiTro(TenVaiTro) values('Thu Ngân');

INSERT INTO NguoiDung(HoTen, TenDangNhap, MatKhau, MaVaiTro) values('Administrator','admin','admin',1);
INSERT INTO NguoiDung(HoTen, TenDangNhap, MatKhau, MaVaiTro) values('Nguyễn Thị Anh','lt','1234',2);
INSERT INTO NguoiDung(HoTen, TenDangNhap, MatKhau, MaVaiTro) values('Trần Trung Trí','bs','1234',3);
INSERT INTO NguoiDung(HoTen, TenDangNhap, MatKhau, MaVaiTro) values('Vũ Khắc Nguyên','tn','1234',4);

insert into ThamSo(TenThamSo, ThamSo) values ('Tiền khám', 40000);

insert into Benh(TenBenh) values ('Đau đầu');
INSERT INTO Benh(TenBenh) VALUES ('Đau bụng');
INSERT INTO Benh(TenBenh) VALUES ('Viêm họng');
INSERT INTO Benh(TenBenh) VALUES ('Cảm cúm');
INSERT INTO Benh(TenBenh) VALUES ('Sốt siêu vi');

INSERT INTO DonVi(TenDonVi) VALUES ('Viên');
INSERT INTO DonVi(TenDonVi) VALUES ('Chai');
INSERT INTO DonVi(TenDonVi) VALUES ('Vỉ');
INSERT INTO DonVi(TenDonVi) VALUES ('Hộp');

INSERT INTO CachDung(CachDung) VALUES ('Ngày uống 3 viên vào sáng trưa chiều sau khi ăn.');
INSERT INTO CachDung(CachDung) VALUES ('Ngày uống 2 viên vào sáng chiều sau khi ăn.');
INSERT INTO CachDung(CachDung) VALUES ('Ngày uống 1 viên trước khi ngủ');
INSERT INTO CachDung(CachDung) VALUES ('Ngày uống 1 viên sau khi ăn sáng');

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Paracatemol', 3000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Panadol',5000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Glycerol', 10000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Codein', 2000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Aspirin', 6000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('PROSPAN', 30000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Bezut', 15000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Eugica', 5000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Bảo Thanh', 5000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Berberin', 16000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Biseptol', 50000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Mofen 400', 32000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Loperamid', 100000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Tiffy', 5000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Tamiflu', 3000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Decolgen', 12000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Cataflam', 22000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('DolFenal', 65000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Hapacol', 6000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Strepsil', 7000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('MaLarone', 31000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Ibuproféne', 500000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Slaska', 120000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Daflon', 90000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Opirid', 200000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('An Kinh bổ huyết', 32000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Bảo thanh viên ngậm', 5000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Bổ phế Nam Hà', 12000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Efferalgan', 6000);

INSERT INTO Thuoc(TenThuoc, GiaThuoc)
VALUES ('Thuốc ho P/H', 25000);

