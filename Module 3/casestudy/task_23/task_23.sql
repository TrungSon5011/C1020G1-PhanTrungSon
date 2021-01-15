delimiter // 
create procedure xoa_khach_hang(id_input int)
begin
delete from khach_hang
where khach_hang.id_khach_hang = id_input;
end ;
// delimiter ;

-- test
call xoa_khach_hang(5);