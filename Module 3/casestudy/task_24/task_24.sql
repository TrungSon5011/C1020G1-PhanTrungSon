drop procedure if exists insert_value;

delimiter //
create procedure insert_value(id_hop_dong_update int, id_nhan_vien_update int, id_khach_hang_update int, id_dich_vu_update int, 
ngay_lam_hop_dong_update date, ngay_ket_thuc_update date, tien_dat_coc_update int, tong_tien_update int )
begin 
if(id_hop_dong_update in (select hop_dong.id_hop_dong from hop_dong )) then 
signal sqlstate '45000'
set message_text  = 'invalid id_hop_dong';
end if;
if(id_nhan_vien_update  not in (select nhan_vien.id_nhan_vien from nhan_vien)) then
signal sqlstate '45000'
set message_text  = 'invalid id_nhan_vien';
end if;
if(id_khach_hang_update not in (select khach_hang.id_khach_hang from khach_hang)) then
signal sqlstate '45000'
set message_text  = 'invalid id_khach_hang';
end if;
if(id_dich_vu_update not in (select dich_vu.id_dich_vu from dich_vu)) then
signal sqlstate '45000'
set message_text  = 'invalid id_dich_vu';
end if;
end ;
// delimiter ;
-- test 
call insert_value(8, 7, 2, 5, '2019-11-11', '2019-12-01', 123123123, 123123123);