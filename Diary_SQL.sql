show databases;

Create Database myLunch;
drop table restaurant_seodaemun;
drop table Administrative_district;

rename Table restaurant to restaurant_seodaemun;
rename Table Seodaemun to seodaemun;



use myLunch;

show tables;

select beopjeong, count(haengjeong) from seodaemun group by beopjeong;

select * from seodaemun;

select * from restaurant_seodaemun;



select count(*) from restaurant_seodaemun WHERE zipcode = "00000";

DELETE FROM restaurant_seodaemun WHERE 7 = id ;

Create Table restaurant_seodaemun(
		id int AUTO_INCREMENT,
        restaurant_address varchar(30), 
        restaurant_name varchar(20),
        restaurant_condition varchar(10),
        zipcode varchar(0) not null default '00000',
	
        primary key(id)
		);
        
        
        
Create Table request_post_restaurant(
		id int AUTO_INCREMENT,
        restaurant_address varchar(30), 
        restaurant_name varchar(20),
        restaurant_condition varchar(10),
        explanation varchar(100),
	
        primary key(id)
		);
        
Create Table request_put_restaurant(
		id int AUTO_INCREMENT,
        restaurant_address varchar(30), 
        restaurant_name varchar(20),
        restaurant_condition varchar(10),
        explanation varchar(100),
	
        primary key(id)
		);
        
        
Create Table review_restaurant(
		id int AUTO_INCREMENT,
        restaurant_address varchar(30), 
        restaurant_name varchar(20),
        restaurant_condition varchar(10),
        explanation varchar(100),
	
        primary key(id)
		);
        
Create Table user_info(


);
        
alter table restaurant_seodaemun change address restaurant_address varchar(30);
alter table restaurant_seodaemun change restaurantName restaurant_name varchar(20);
alter table restaurant_seodaemun change restaurantCondition restaurant_condition varchar(10);
alter table restaurant_seodaemun change zipcode restaurant_zipcode varchar(5);
alter table restaurant_seodaemun change streetAddress restaurant_street_address varchar(30);

alter table restaurant_seodaemun modify restaurant_address varchar(30);
alter table restaurant_seodaemun modify restaurant_condition varchar(10);
alter table restaurant_seodaemun modify restaurant_condition varchar(10);

alter table request_post_restaurant add explanation varchar(100);
alter table request_put_restaurant add explanation varchar(100);
        
DESC restaurant_seodaemun;
DESC request_post_restaurant;
DESC request_put_restaurant;

select * from restaurant_seodaemun;

RENAME TABLE restaurant_Seodaemun TO restaurant_seodaemun;
        
Create Table restaurant_seodaemun(
		id varchar(10) not null,
        user_name varchar(30), 
        restaurant_name varchar(20),
        restaurant_condition varchar(10),
        zipcode varchar(0) not null default '00000',
	
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


SELECT * FROM restaurant_seodaemun  WHERE restaurantName LIKE "%족발%";
SELECT * FROM restaurant_seodaemun  WHERE restaurantName LIKE '%족발%';
SELECT * FROM tableName  WHERE columnName LIKE '%keyword%';

alter table restaurant_seodaemun add zipcode varchar(5) not null default '00000';
alter table restaurant_seodaemun add streetAddress varchar(30) not null default 'empty';

SELECT COUNT(*) FROM restaurant_seodaemun;

SELECT address FROM restaurant_seodaemun WHERE id = 3;

UPDATE restaurant_seodaemun SET address = '서울특별시 서대문구 냉천동 161-2번지' WHERE id = 8;

select * from restaurant_seodaemun WHERE 03700 <= zipcode AND zipcode <= 03800 order by rand() limit 1;

select * from restaurant_seodaemun WHERE zipcode = 03624 order by rand() limit 1;