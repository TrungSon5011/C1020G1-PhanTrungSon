select id_nhan_vien, ho_ten, email, ngay_sinh, sdt, diachi, 'nhan vien' as chuc_vu from nhan_vien
union all 
select id_khach_hang, ho_ten, email, ngay_sinh, sdt, dia_chi, 'khach hang' as chuc_vu from khach_hang;