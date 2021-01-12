select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
left join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where not (year(hop_dong.ngay_lam_hop_dong) = 2019 and (month(hop_dong.ngay_lam_hop_dong) in (1,2,3)));