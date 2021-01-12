create database thiet_ke_tao_csdl;
drop table customer ;
create table customer(
contact_id int not null primary key auto_increment,
first_name varchar(25),
birthday date
);
drop table customer;
alter table customer
drop last_name;
alter table customer
add last_name varchar(40) not null
after contact_id,
add test varchar(40)
after birthday;
alter table customer
change test son varchar(40);