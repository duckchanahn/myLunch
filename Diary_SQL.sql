Create Database myLunch;
drop table restaurant_Seodaemun;
drop table Administrative_district;

rename Table restaurant to restaurant_Seodaemun;

use myLunch;

show tables;

Create Table tableName (id int AUTO_INCREMENT, address varchar(30), restaurantName varchar(20), restaurantCondition varchar(10), primary key(id));
INSERT INTO tableName (address, restaurantName, restaurantCondition) VALUES (%s, %s, %s);

select * from restaurant_Seodaemun;

Create Table restaurant_Seodaemun(
		id int AUTO_INCREMENT,
        address varchar(30), 
        restaurantName varchar(20),
        restaurantCondition varchar(10),
	
        primary key(id)
		);

show tables;

Create Table Gangnam(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);
        
Create Table Gangdong(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Gangbuk(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Gangseo(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Gwanak(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);
        
Create Table Gwangjin(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Guro(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Geumcheon(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Nowon(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Dobong(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Dongdaemun(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Dongjak(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Mapo(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Seodaemun(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Seocho(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Seongdong(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Seongbuk(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Songpa(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Yangcheon(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Yeongdeungpo(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Yongsan(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Eunpyeong(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Jongno(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

Create Table Jung(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);
        
Create Table Jungnang(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);

        
insert into Seodaemun (beopjeong, haengjeong)
values
	("남가좌동", "남가좌1동"), ("남가좌동", "남가좌2동"),
	("북가좌동", "북가좌1동"), ("북가좌동", "북가좌2동"),
	("북아현동", "북아현동"),
	("신촌동", "대신동"), ("신촌동", "대현동"),  ("신촌동", "봉원동"), ("신촌동", "신촌동"), ("신촌동", "창천동"),
	("남가좌동", "남가좌1동"),
	("연희동", "연희동"),
	("천연동", "냉천동"), ("천연동", "영천동"), ("천연동", "옥천동"), ("천연동", "천연동"), ("천연동", "현저동"),
	("충현동", "미근동"), ("충현동", "충정로2가"), ("충현동", "충정로3가"), ("충현동", "합동"),
	("홍은동", "홍은1동"), ("홍은동", "홍은2동"),
	("홍제동", "홍제1동"), ("홍제동", "홍제2동"), ("홍제동", "홍제3동");

    
select * from Seodaemun;


