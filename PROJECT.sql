create database PROJECT_SPRING_2022
create table Categories(
	idCategories int primary key,
	nameCategories nvarchar(50),
	)
create table Product(
	idProduct int IDENTITY(1,1) primary key,
	name	nvarchar(50),
	detail nvarchar(500),
	price float,
	[image] nvarchar(500),
	idCategories int references Categories(idCategories),
	)
create table Customer(
	userName char(500) primary key,
	[passWord] varchar(100),
	nameCustomer nvarchar(50),
	DOB date,
	[Address] nvarchar(50),
	[Phone] char(10) unique check([phone] like '[0][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'),
	)
create table Orders(
	idOrders int IDENTITY(1,1) primary key,
	idProduct int references Product(idProduct),
	userName char(500) references Customer(userName),
	Quantily int,
	[Date Create] date,
)

create table OrdersDetail(
	idOrdersDetails int IDENTITY(1,1) primary key,
	idOrders int,
	Total int,
	CONSTRAINT fk3_service FOREIGN KEY (idOrders) REFERENCES Orders (idOrders),
)

