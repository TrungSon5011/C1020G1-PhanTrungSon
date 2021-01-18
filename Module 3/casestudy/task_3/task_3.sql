SELECT * FROM casestudy.khach_hang
where (((year(curdate())-year(ngay_sinh))  > 18) or (year(curdate())-year(ngay_sinh)) < 50) 
and (dia_chi = 'Đà Nẵng' or dia_chi = 'Quảng Trị');
