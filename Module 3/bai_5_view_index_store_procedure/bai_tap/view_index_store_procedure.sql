drop database if exists bai_5_procedure;

create database bai_5_procedure;

create table product (
id int ,
product_code varchar(50),
product_name varchar(50),
product_price varchar(50),
product_amount int,
product_description text,
product_status varchar(50)
);

insert into product 
value
(1,'1a', 'iphone x',1000,1,'phone', 'ok'),
(2,'2a', 'iphone 11',1500,1,'phone', 'ok'),
(3,'3a', 'iphone 12',2000,1,'phone', 'ok');

-- tao index
-- index product_code
create unique index index_product_code 
on product (product_code);
-- index product_name and product_price
create unique index index_composition
on product(product_name, product_price);

explain select * from product
where product_code = '3a';

explain select * from product
where product_price = '3000' and product_name = 'iphone x';

-- tao view 
create view view_product as 
select product_code, product_name, product_price, product_status
from product;

select * from view_product;
-- update view
update view_product 
set product_code = 'xx'
where product_code = '3a';
-- drop view
drop view view_product ;
-- create stored procedure
-- store procedure hien thi thong tin
delimiter // 
create procedure product_infor()
begin
 select * from product;
 end ;
// delimiter ;

call product_infor();


-- store procedure them san pham

delimiter // 
create procedure insert_product(id_update int,product_code_update varchar(50), product_name_update varchar(50),
product_price_update int, product_amount_update varchar(50),product_description_update text, product_status_update varchar(50))
begin
insert into product
value
(id_update,product_code_update,product_name_update,product_price_update,product_amount_update,product_description_update,product_status_update);
end;
// delimiter ;

call insert_product(2,'2a','iphone 11',1500,1,'phone','okay');
-- store procedure sua san pham theo id

delimiter // 
create procedure update_product_by_id(id_input int,id_update int,product_code_update varchar(50), product_name_update varchar(50),
product_price_update int, product_amount_update varchar(50),product_description_update text, product_status_update varchar(50) )
begin 
update product
set 
id = id_update,
product_code = product_code_update,
product_name = product_name_update,
product_price = product_price_update,
product_amount = product_amount_update,
product_description = product_description_update,
product_status = product_status_update
where id = id_id_input;
end ;
// delimiter ;
-- store procedure xoa san pham theo id
delimiter //
create procedure delete_product_by_id(id_input int)
begin
delete from product
where id = id_input;
end ;
// delimiter ;

call delete_product_by_id(2);
