Create Database myLunch;
drop table restaurant_Seodaemun;
drop table Administrative_district;

rename Table restaurant to restaurant_Seodaemun;

use myLunch;

show tables;

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
        

insert into Seodaemun (beopjeong, haengjeong)
values
	("남가좌동", "남가좌1동"), ("남가좌동", "남가좌2동"),
	("북가좌동", "북가좌1동"), ("북가좌동", "북가좌2동"),
	("북아현동", "북아현동"),
	("신촌동", "대신동"), ("신촌동", "대현동"),  ("신촌동", "봉원동"), ("신촌동", "신촌동"), ("신촌동", "창천동"),
	("연희동", "연희동"),
	("천연동", "냉천동"), ("천연동", "영천동"), ("천연동", "옥천동"), ("천연동", "천연동"), ("천연동", "현저동"),
	("충현동", "미근동"), ("충현동", "충정로2가"), ("충현동", "충정로3가"), ("충현동", "합동"),
	("홍은동", "홍은1동"), ("홍은동", "홍은2동"),
	("홍제동", "홍제1동"), ("홍제동", "홍제2동"), ("홍제동", "홍제3동");

    
select * from Seodaemun;

SELECT SUM(data_length+index_length)/1024/1024 "USED_MB", 
       SUM(data_free)/1024/1024 "FREE_MB"
FROM information_schema.tables;


SELECT count(address) FROM restaurant_Seodaemun  WHERE address LIKE '%연희동%';

