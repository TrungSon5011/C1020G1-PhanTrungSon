SET SQL_SAFE_UPDATES = 0;
update casestudy.khach_hang,
(select khach_hang.id_khach_hang from khach_hang
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
group by khach_hang.id_khach_hang
having sum(hop_dong.tong_tien) > 10000000
) as diamond_khach_hang
set khach_hang.id_loai_khach = 1
where khach_hang.id_khach_hang = diamond_khach_hang.id_khach_hang;