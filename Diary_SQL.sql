Create Database myLunch;
drop table restaurant;
drop table Administrative_district;

use myLunch;

Create Table restaurant(
		id int AUTO_INCREMENT,
        address varchar(30),
        restaurantName varchar(20),
        restaurantCondition varchar(10),
	
        primary key(id)
		);

show tables;

select * from restaurant;

Create Table Administrative_district(
		id int auto_increment,
		beopjeong varchar(10) Not Null,
        haengjeong varchar(10) Not Null,
			
		primary key (id)
		);
        
insert into Administrative_district (beopjeong, haengjeong)
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

    
select * from Administrative_district;
