-- cau a
drop function if exists count_dich_vu_lon_hon_2tr;

delimiter // 
create function count_dich_vu_lon_hon_2tr()
returns int 
deterministic
begin
declare count_dich_vu int;
set count_dich_vu = (select count(dich_vu.id_dich_vu)
from hop_dong
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where hop_dong.tong_tien > 2000000);
return count_dich_vu;
end ;
// delimiter ;
 
 select count_dich_vu_lon_hon_2tr();
 
 -- cau b
 drop function if exists max_thoi_gian_lam_hop_dong;
 delimiter //
 create function max_thoi_gian_lam_hop_dong(id_khach_hang_parameter int)
 returns int
 deterministic
 begin
 declare ngay_thue int;
 set ngay_thue = (select max(datediff(ngay_ket_thuc,ngay_lam_hop_dong)
) from khach_hang
join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where khach_hang.id_khach_hang = id_khach_hang_parameter);
return ngay_thue;
end ;
// delimiter ;
-- test 
select max_thoi_gian_lam_hop_dong(3);

