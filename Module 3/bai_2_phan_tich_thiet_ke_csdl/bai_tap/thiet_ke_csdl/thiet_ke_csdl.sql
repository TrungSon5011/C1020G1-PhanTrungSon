drop database if exists thiet_ke_csdl;
create database thiet_ke_csdl;
use thiet_ke_csdl;
create table products_line(
product_line varchar(50) primary key not null,
text_description text,
image varchar(50)
);

create table products(
product_code int primary key not null,
product_name varchar(70) not null,
product_scale varchar(10) not null,
product_vendor varchar(50) not null,
product_description text not null,
quantity_inStock int not null,
buy_price int not null ,
msrp int not null,
product_line varchar(50) not null,
foreign key (product_line) references products_line(product_line)
);


create table offices(
office_code varchar(10) primary key not null,
city varchar(50) not null,
phone varchar(50) not null,
office_address_line1 varchar(50) not null,
office_address_line2 varchar(50),
state varchar(50),
country varchar(50) not null,
postalcode varchar(15) not null
);

create table employees(
employees_id varchar(50) primary key not null,
employee_last_name varchar(50) not null,
employee_first_name varchar(50) not null,
email varchar(50)not null,
job_title varchar(50) not null,
office_code varchar(10) not null,
foreign key (office_code) references offices(office_code)
);

create table customers(
customer_number int primary key not null,
customer_name varchar(50) not null,
contact_last_name varchar(50)not null,
contact_first_name varchar(50) not null,
customer_phone int not null,
customer_address1 varchar(50)not null,
customer_address2 varchar(50)not null,
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(50) not null,
country varchar(50),
credit_limit double,
employees_id varchar(50) not null,
foreign key (employees_id) references employees(employees_id)
);

create table orders(
order_number int primary key not null,
order_date date not null,
ship_date_require date not null,
shipped_date date,
`status` varchar(15) not null,
comments text, 
quantity_ordered int not null,
price_each double not null,
customer_number int not null,
foreign key (customer_number) references customers(customer_number)
);

create table detail_orders(
order_number int not null,
product_code int not null,
primary key(order_number, product_code),
foreign key(order_number) references orders(order_number),
foreign key (product_code) references products(product_code)
);

create table payments(
payment_code int primary key not null,
customer_number int not null,
check_number varchar(50) not null,
payment_date date not null,
amount double not null,
foreign key (customer_number) references customers(customer_number)
);







