create database PROJECT_SPRING_2022
create table Categories(
	idCategories int primary key,
	nameCategories nvarchar(50),
	)
create table Product(
	idProduct int IDENTITY(1,1) primary key ,
	name	nvarchar(max) ,
	detail nvarchar(max),
	price money ,
	[image] nvarchar(max),
	idCategories int references Categories(idCategories),
	)
create table Customer(
	userName char(255) primary key,
	[passWord] varchar(100),
	nameCustomer nvarchar(50),
	DOB date,
	[Address] nvarchar(50),
	[Phone] char(10) unique check([phone] like '[0][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
	)
create table Orders(
	idOrders int IDENTITY(1,1) primary key,
	idProduct int references Product(idProduct),
	userName char(500) ,
	Quantily int,
	[Date Create] date,
)

create table OrdersDetail(
	idOrdersDetails int IDENTITY(1,1) primary key,
	idOrders int,
	Total int,
	CONSTRAINT fk3_service FOREIGN KEY (idOrders) REFERENCES Orders (idOrders),
	
)


insert into Categories values (1,'KAWASAKI')
insert into Categories values (2 ,'HONDA')
insert into Categories values (3 ,'SUZUKI')
insert into Categories values (4 ,'YAMAHA')



insert into Product VALUES ('KAWASAKI650cc' ,'N mang xe về cho mẹzz', 100000 , '2_9.jpg',1 )
insert into Product VALUES ('KAWASAKI65cc' ,'N mang xe về cho mẹzzzzz', 10000000 , '2_9.jpg',2 )
insert into Product VALUES ('KAWASAKI60cc' ,'N mang xe về cho mẹzzz', 10000 , '2_9.jpg',3 )
insert into Product VALUES ('KAWASAKI65000cc' ,'N mang xe về cho mẹzzzzz', 100000 , '2_9.jpg' ,4)
insert into Product VALUES ('YAMAHAR15', N'Mang xe di chay tron em oi' , 200000 ,'YAMAHA_R15',3)
insert into Product VALUES ('CBR250RR', N'diduavoicathegioi' , 20000000 ,'https://canary.contestimg.wish.com/api/webimage/5c4a05a08b26e56dcf17a643-normal.jpg?cache_buster=6d01b751858e14e68932bb234cdc44c1',1)



select * from Product





