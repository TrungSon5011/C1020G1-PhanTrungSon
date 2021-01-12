select dich_vu_di_kem.*, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as dich_vu_di_kem_nhieu_nhat from dich_vu_di_kem join hop_dong_chi_tiet 
on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.id_dich_vu_di_kem;