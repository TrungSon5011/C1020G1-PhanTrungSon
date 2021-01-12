select hop_dong.id_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as
so_lan_su_dung
from hop_dong
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong.id_hop_dong
having count(hop_dong_chi_tiet.id_dich_vu_di_kem) = 1;
