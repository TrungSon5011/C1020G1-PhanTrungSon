drop trigger  if exists trigger_after_delete;
delimiter //
create trigger trigger_after_delete 
after delete
on hop_dong for each row
begin 
set @x = (select count(hop_dong.id_hop_dong) from hop_dong);
end ;
// delimiter ;
set @x = 0;
delete from hop_dong
where hop_dong.id_hop_dong = 8;
select @x as 'abc';