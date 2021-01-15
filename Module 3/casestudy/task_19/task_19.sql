update casestudy.dich_vu_di_kem, (
select dich_vu_di_kem.id_dich_vu_di_kem 
from dich_vu_di_kem 
left join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
left join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2019
group by dich_vu_di_kem.id_dich_vu_di_kem
having count(hop_dong.ngay_lam_hop_dong) > 10
 ) as bestseller
set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
where dich_vu_di_kem.id_dich_vu_di_kem = bestseller.id_dich_vu_di_kem;

