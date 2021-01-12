create table customers (
customer_number int primary key,
full_name varchar(50),
address varchar(50),
email varchar(50), 
phone varchar(10)
);
create table accounts (
account_number int primary key,
acount_type varchar(50),
`date` date,
balance int,
customer_number int,
foreign key( customer_number) references customers(customer_number)
);
create table transactions (
tran_number int primary key,
account_number int,
`date` date,
amounts int,
descriptions varchar(50),
account_numbers int,
foreign key( account_numbers) references accounts(account_number)
); 




