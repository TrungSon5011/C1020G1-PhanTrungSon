select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.sdt, nhan_vien.diachi, 
count(hop_dong.id_nhan_vien) as so_hop_dong_lap_duoc
from nhan_vien
join trinh_do on nhan_vien.id_trinh_do = trinh_do.id_trinh_do
join bo_phan on nhan_vien.id_bo_phan = bo_phan.id_bo_phan
join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
where year(hop_dong.ngay_lam_hop_dong) = 2018 or year(hop_dong.ngay_lam_hop_dong) = 2019
group by nhan_vien.id_nhan_vien
having so_hop_dong_lap_duoc <= 3