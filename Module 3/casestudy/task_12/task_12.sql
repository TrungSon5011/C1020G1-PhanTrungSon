select hop_dong.id_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten, khach_hang.sdt, dich_vu.ten_dich_vu, 
count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_luong_dich_di_kem,
hop_dong.tien_dat_coc
from hop_dong
left join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where (year(hop_dong.ngay_lam_hop_dong) = 2019 and month(hop_dong.ngay_lam_hop_dong) in (10,11,12)) and 
(year(hop_dong.ngay_lam_hop_dong) = 2019 and month(hop_dong.ngay_lam_hop_dong) not in (1,2,3,4,5,6))
group by hop_dong.id_hop_dong;


