drop database if exists bai_4_cac_ham_thong_dung;
create database bai_4_cac_ham_thong_dung;

create table sinh_vien (
id int auto_increment primary key ,
ten varchar(50),
tuoi int,
khoa_hoc varchar(50),
so_tien int
);

insert into sinh_vien
value
(1,'hoang', 21,'cntt', 400000 ),
(2,'viet', 19,'dtvt', 320000 ),
(3,'thanh', 18,'ktdn', 400000 ),
(4,'nhan', 19,'ck', 450000 ),
(5,'huong', 20,'tknh', 500000 ),
(6,'huong', 20,'tknh', 200000 );

select * from sinh_vien
where ten = 'huong';

select sum(so_tien) from sinh_vien
where ten = 'huong';

select distinct * from sinh_vien
