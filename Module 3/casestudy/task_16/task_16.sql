delete from nhan_vien
where id_nhan_vien in 
(
select  id_nhan_vien from
(select nhan_vien.id_nhan_vien  from nhan_vien
left join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
where year(hop_dong.ngay_lam_hop_dong)  not in  (2018, 2019, 2017)
group by nhan_vien.id_nhan_vien) as table_a
)
