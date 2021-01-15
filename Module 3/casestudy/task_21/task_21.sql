create view view_nhan_vien as
select nhan_vien.* from nhan_vien
join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
where date(hop_dong.ngay_lam_hop_dong) = '2019-12-12' and nhan_vien.diachi = 'Hải Châu';

select * from view_nhan_vien;
