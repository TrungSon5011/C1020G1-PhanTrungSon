drop procedure if exists xoa_room;
delimiter //
create procedure xoa_room()
begin
delete from dich_vu
where dich_vu.id_loai_dich_vu in (select loai_dich_vu.id_loai_dich_vu from loai_dich_vu
where loai_dich_vu.ten_loai_dich_vu = 'room' ) and dich_vu.id_dich_vu in (select hop_dong.id_dich_vu from hop_dong
where year(hop_dong.ngay_lam_hop_dong) in (2015, 2016, 2017, 2018, 2019) )  ;
end ;
// delimiter ;

-- test 
call xoa_room();

