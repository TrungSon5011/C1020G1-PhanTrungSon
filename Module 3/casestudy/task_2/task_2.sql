select * from nhan_vien
where (substring_index(ho_ten, ' ', -1) like  'H%' or substring_index(ho_ten, ' ', -1) like 'T%' or substring_index(ho_ten, ' ', -1) like 'K%') and length(ho_ten)<= 15 ;

