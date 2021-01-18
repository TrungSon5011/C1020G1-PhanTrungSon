delete from khach_hang
where id_khach_hang in (
select id_khach_hang from (
select khach_hang.id_khach_hang from khach_hang 
join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong) < 2016
group by id_khach_hang) as table_subquery
);
