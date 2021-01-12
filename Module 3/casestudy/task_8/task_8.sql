select distinct khach_hang.ho_ten 
from khach_hang;

select khach_hang.ho_ten
from khach_hang
group by khach_hang.ho_ten;

select khach_hang.ho_ten from khach_hang 
union select khach_hang.ho_ten from khach_hang;
