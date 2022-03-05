create database PROJECTPRJ_2022
create table Categories(
	idCategories int primary key,
	nameCategories nvarchar(50),
	)
create table Product(
	idProduct int IDENTITY(1,1) primary key ,
	title nvarchar (max),
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

insert into Product VALUES ('Sonyeumevagiadinh','SonDepTraiMatLai' ,'N SonSinhnam2004', 0 , 'https://www.facebook.com/photo/?fbid=1721860487955669&set=a.103278719813862',1 )
insert into Product VALUES ('SUZUKI','KAWASAKI65cc' ,'N mang xe về cho mẹzzzzz', 10000000 , '2_9.jpg',2 )
insert into Product VALUES ('YAMAHA','KAWASAKI60cc' ,'N mang xe về cho mẹzzz', 10000 , '2_9.jpg',3 )
insert into Product VALUES ('KAWASAKI','KAWASAKI65000cc' ,'N mang xe về cho mẹzzzzz', 100000 , '2_9.jpg' ,4)
insert into Product VALUES ('SUZUKI','YAMAHAR15', N'Mang xe di chay tron em oi' , 200000 ,'YAMAHA_R15',3)
insert into Product VALUES ('SUZUKI','CBR250RR', N'diduavoicathegioi' , 20000000 ,'https://canary.contestimg.wish.com/api/webimage/5c4a05a08b26e56dcf17a643-normal.jpg?cache_buster=6d01b751858e14e68932bb234cdc44c1',1)
insert into Product VALUES ('HONDA','KAWASAKI650cc' ,'N mang xe về cho mẹzz', 100000 , '2_9.jpg',1 )
insert into Product VALUES ('Sonyeumevagiadinh','SonDepTraiMatLai' ,N'SonSinhnam2004', 0, '‪C:\Users\Son\Downloads\img-project\Sondeptrai.jpg',4 )

select * from Categories
select * from Product
select top 1 * from Product
 order by idProduct desc
 
 insert into Customer values('son', '123', 'Son Pham', '2022/5/3', '57123 Viet Nam', '0231231231')
 
 select * from Customer where userName = 'son' and [passWord] = '123'