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
	price double ,
	[image] nvarchar(max),
	idCategories int references Categories(idCategories),
	)
create table Customer(
	userName char(255) primary key,
	[passWord] varchar(100),		
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
insert into Categories values (5 ,'DUCATI')


insert into Product VALUES ('HONDA','HONDA CBR250' ,N'Loại động cơ : 2 xylanh thẳng hàng, phun xăng điện tử 4 thì,
8 van, DOHC, làm mát bằng dung dịch	Công suất tối đa : 38,1 mã lực tại 12.500 v/ph,Cỡ lốp trước/sau : 110/70-17 140/70-17	
Dài x Rộng x Cao : 2.060 x 724 x 1.098 mm
Hộp số : 6 Cấp	Độ cao yên : 790 mm
Dung tích xy-lanh : 249.5 cc	Mô men cực đại : .2 Nm tại 11.000 v/ph
Phuộc trước : Upsite-Down 41mm	Khoảng cách trục bánh xe : 1.398 mm', 6600, 'cbr-250.jpg',2 )
insert into Product VALUES ('KAWASAKI','KAWASAKI Z1000 2018' ,N'Hãng sản xuất	Kawasaki
Động cơ	4 thì, 4 xi lanh 16 van DOHC, FI , ABS
Dung tich xy lanh	1043 cc
Mô men cực đại	111 Nm / 7300 rpm
Hệ thống khởi động	Khởi động bằng điện
Dầu nhớt động cơ	4.0 L
Tỷ số nén	11.8 : 1
Công suất tối đa	142 PS / 10000 rpm
Phanh trước	ABS Đĩa Đôi
Phanh sau	ABS Đĩa Đơn
Chiều rộng (mm)	790 mm
Chiều dài (mm)	2045 mm
Chiều cao (mm)	1055 mm
Khoảng cách giữa 2 trục bánh xe	 1.435 mm
Khoảng cách gầm xe	125 mm
Độ cao yên xe	 815 mm
Trọng lượng	 221 kg (ABS)
Dung tích bình xăng	17 lit
Bánh xe trước/ sau	120/70ZR17M/C / 190/50ZR17M/C',17400, 'kawasakiz1000-2018.jpg',1 )
insert into Product VALUES ('YAMAHA','Yamaha R6 2017' ,N'Động cơ: I4, DOHC, 4 kỳ, 599 phân khối
Đường kính x hành trình piston: 67 x 42,5 mm
Công suất cực đại: 117 HP (87.1 kW)@14.500 rpm
Tỉ số nén: 13.1:1
Mô-men xoắn cực đại: 62 Nm@10.500 rpm
Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg
Hệ thống ly hợp: Ướt, đa đĩa
Bình xăng: 17 lít
Dầu máy: 3,4 lít', 15400, '2_9.jpg',4 )
insert into Product VALUES ('DUCATI','Ducati Panigale 899 2014' ,N'Kích thước Xe	Dài x Rộng x Cao : 2050mm x 730mm x 1105mm
Độ Cao Yên	830mm
Cân nặng	191,5kg ( đã kèm full bình xăng)
Hệ thống cung cấp nhiên liệu:	Phun xăng điện tử
Dung tích nhiên liệu	17 lít
Loại động cơ	Superquadro L-Twin, 4 van mỗi xi lanh Desmodromically actuated, làm mát bằng chất lỏng
Dung tích xy-lanh	898cc
Hệ thống Phanh thắng trước/sau:	 Dĩa đôi 320mm, phanh Brembo monobloc M4. ABS / Dĩa 245mm , 2 piston ABS
Tỷ số nén	12.5: 1
Phuộc trước	Up side down Showa
Phuộc sau	Mono Shock nằm ngang Sach
Hộp số	6 cấp', 15450, 'Ducati Panigale 899 2014.jpg',5 )

insert into Product VALUES ('KAWASAKI','Ninja300-2017' ,N'sẽ là mẫu moto mới nhất của Kawasaki trong phân khúc sport-bike 300cc. Có nguồn tin cho rằng Kawasaki sẽ trang bị hệ thống siêu nạp SuperCharged cho mẫu Ninja 300 bản đặc biệt. 
Bộ siêu nạp tương tự như siêu phẩm Ninja H2 và Ninja H2R đang “làm mưa làm gió” trong phân khúc sport 1000cc. 
Điển hình là clip test Ninja H2R đạt tốc độ 400 km/h.', 2300, 'ninja300-2017.jpg',1 )
insert into Product VALUES ('SUZUKI','GSX600 2017' ,N'Động cơ: I4, DOHC, 4 kỳ, 599 phân khối
Đường kính x hành trình piston: 67 x 42,5 mm
Công suất cực đại: 117 HP (87.1 kW)@14.500 rpm
Tỉ số nén: 13.1:1
Mô-men xoắn cực đại: 62 Nm@10.500 rpm
Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km', 5000, 'GSX600-2017.jpg',4 )
insert into Product VALUES ('DUCATI','Ducati 2022' ,N'Động cơ: I4, DOHC, 4 kỳ, 599 phân khối
Đường kính x hành trình piston: 67 x 42,5 mm
Công suất cực đại: 117 HP (87.1 kW)@14.500 rpm
Tỉ số nén: 13.1:1
Mô-men xoắn cực đại: 62 Nm@10.500 rpm
Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm', 13700, 'Ducati2022.jpg',5 )
insert into Product VALUES ('KAWASAKI','Ninja400-2020' ,N'Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55', 5000, 'ninja400.jpg',1 )
insert into Product VALUES ('DUCATI','Ducati Panigale 1199 2016' ,N'Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg
Hệ thống ly hợp: Ướt, đa đĩa
Bình xăng: 17 lít
Dầu máy: 3,4 lít', 17800, 'Ducati Panigale 1199 2014.jpg',5 )
insert into Product VALUES ('YAMAHA','Yamaha R3 2019' ,N'ích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg
Hệ thống ly hợp: Ướt, đa đĩa
Bình xăng: 17 lít
Dầu máy: 3,4 lít', 9217, 'R3.jpg',1 )
insert into Product VALUES ('SUZUKI','GSX-R1000 2019' ,N'Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg
Hệ thống ly hợp: Ướt, đa đĩa
Bình xăng: 17 lít
Dầu máy: 3,4 lít', 11200, 'GSX-R1000.jpg',3 )
insert into Product VALUES ('HONDA','CBR500RR-2019' ,N'Đường kính x hành trình piston: 67 x 42,5 mm
Công suất cực đại: 117 HP (87.1 kW)@14.500 rpm
Tỉ số nén: 13.1:1
Mô-men xoắn cực đại: 62 Nm@10.500 rpm
Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km', 11700, 'CBR500RR-2019.jpg',2 )
insert into Product VALUES ('YAMAHA','Yamaha R6 2021' ,N'
Loại động cơ	DOHC 4 xi-lanh đặt thẳng hàng, làm mát bằng chất lỏng
Dung tích	599cc
Công suất	117 mã lực
Momen xoắn	65 Nm tại 11500 vòng/phút
Đường kính trong xi-lanh x hành trình piston	67mm x 42.5mm
Tỉ số nén	13.1:1
Phun nhiên liệu	Hệ thống phun xăng điện tử với công nghệ YCC-T và YCC-I
Khởi động	Điện
Hộp số	6 cấp
Ly hợp 	Bộ ly hợp chống trơn', 21700, 'R6 2021.jpg',1 )
insert into Product VALUES ('DUCATI','Ducati 999cc 2018' ,N'Cỡ lốp trước/sau : 110/70-17 140/70-17	
Dài x Rộng x Cao : 2.060 x 724 x 1.098 mm
Hộp số : 6 Cấp	Độ cao yên : 790 mm
Dung tích xy-lanh : 249.5 cc	Mô men cực đại : .2 Nm tại 11.000 v/ph
Phuộc trước : Upsite-Down 41mm	Khoảng cách trục bánh xe : 1.398 mm', 12000, 'ducati999cc.jpg',5 )
insert into Product VALUES ('HONDA','CBR500R 2020' ,N'hí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg', 10500, 'CBR500R.jpg',2 )
insert into Product VALUES ('KAWASAKI','Kawasaki ZX-10R' ,N'Động cơ	4 thì, 4 xi lanh 16 van DOHC, FI , ABS
Dung tich xy lanh	1043 cc
Mô men cực đại	111 Nm / 7300 rpm
Hệ thống khởi động	Khởi động bằng điện
Dầu nhớt động cơ	4.0 L
Tỷ số nén	11.8 : 1
Công suất tối đa	142 PS / 10000 rpm
Phanh trước	ABS Đĩa Đôi
Phanh sau	ABS Đĩa Đơn
Chiều rộng (mm)	790 mm
Chiều dài (mm)	2045 mm
Chiều cao (mm)	1055 mm', 16000, 'ZX-10R.jpg',1 )
insert into Product VALUES ('YAMAHA','Yamaha R1 2015' ,N'Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm
Bánh xe: 17″, lốp trước 120/70, lốp sau 180/55
Chiều dài cơ sở: 1.375 mm
Chiều cao gầm: 130 mm
Chiều cao yên: 850 mm
Trọng lượng ướt: 190 kg
Hệ thống ly hợp: Ướt, đa đĩa
Bình xăng: 17 lít
Dầu máy: 3,4 lít', 7200, 'R1.jpg',1 )
insert into Product VALUES ('SUZUKI','Gixxer-sf-250-2019' ,N'Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm', 5400, 'suzuki-gixxer-sf-250-2019.jpg',3 )
insert into Product VALUES ('HONDA','CBR250RR 2022' ,N'Loại Máy	4-Stroke, 8-Valve, Song song
Công Suất Động Cơ	249,7 cc
Hệ Thống Cung Cấp Nhiên Liệu	PGM-FI
Đường Kính X Bước	62,0 x 41,4 mm
Hộp số	Thủ công, 6 tốc độ
Tỷ Lệ Nén	12,1: 1
Công Suất Tối Đa	40.23 mã lực /73.000 vòng/ phút
Mô-Men Xoắn Cực Đại	25 Nm (2,5 kgf.m) / 11.000 vòng / phút
Hệ Thống Làm Mát Động Cơ	
Làm mát bằng chất lỏng với quạt điện tự động
Loại Khởi Động	Điện
Loại Ly Hợp	Multiple Wet Clutch và Coil Spring
Mô Hình Sang Số	1-N-2-3-4-5-6
Tiêu hao nhiên liệu	40,1km/L', 7300, 'CBR250RR.jpg',2 )
insert into Product VALUES ('DUCATI','Panigale899 2012' ,N'Công suất cực đại: 117 HP (87.1 kW)@14.500 rpm
Tỉ số nén: 13.1:1
Mô-men xoắn cực đại: 62 Nm@10.500 rpm
Hệ thống phun xăng: Điện tử
Hệ thống làm mát: Chất lỏng
Hộp số: 6 cấp côn tay
Hệ thống khởi động: Điện
Tiêu hao nhiên liệu: 6,6 lít/100 km
Khí thải CO2: 154 g/km
Giảm xóc trước: USD 43 mm, hành trình 120 mm
Giảm xóc sau: Lò xo trụ đơn, hành trình 120 mm
Phanh: Trước đĩa kép 320 mm, sau đĩa đơn 220 mm
Kích thước (D x R x C): 2.040 x 695 x 1.150 mm', 6800, 'Panigale899.jpg',5 )



insert into Customer values('son', '123', '0231223199')
insert into Customer values('xya', '1234', '0375867892')
insert into Customer values('admin', '12345', '0231223188')
insert into Customer values('456', '123456', '0231223197')




 
insert into Customer values(?, ?, ?,?, ?)
 
select * from Categories
select * from Product
select * from Customer


select top 1 * from Product
 order by idProduct desc
  
 select * from Customer where userName = 'son' and [passWord] = '123'
 
 select * from Product 
where idCategories = 1

 delete from Product 
where idProduct = ?

select * from Product
where name like '%kawa%'

insert into Customer values('TXT', '123', 'University', '57123 ThaiLan', '0231223197')

insert into Product VALUES (?,?,?,?,?,?)