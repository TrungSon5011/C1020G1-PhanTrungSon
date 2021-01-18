drop trigger if exists before_update_trigger;

delimiter // 
create trigger before_update_trigger 
before update 
on hop_dong for each row
begin
declare errorMessage varchar(100);
set errorMessage = 'Ngay ket thuc hop dong phai lon hon ngay lam hop dong it nhat 2 ngay';
if(datediff(new.ngay_ket_thuc, old.ngay_lam_hop_dong) < 2) then
signal sqlstate '45000' 
set message_text = errorMessage;
end if;
end ;
// delimiter ;

-- test 
update hop_dong
set hop_dong.ngay_ket_thuc = '2018-12-15'
where hop_dong.id_hop_dong = 5;