select id_nhan_vien, ho_ten, email, ngay_sinh, sdt, diachi from nhan_vien
union 
select id_khach_hang, ho_ten, email, ngay_sinh, sdt, dia_chi from khach_hang;