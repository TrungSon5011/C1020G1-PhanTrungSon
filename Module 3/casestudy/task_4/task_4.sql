select hop_dong.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, count(hop_dong.id_dich_vu) as count_hop_dong 
from hop_dong join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join loai_khach on khach_hang.id_loai_khach 
where loai_khach.ten_loai_khach = "Diamond"
group by hop_dong.id_khach_hang
order by count_hop_dong;
