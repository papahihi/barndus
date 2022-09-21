
create table project (
company varChar(100), 
title  varChar(100),
content  varChar(100),
nickname  varChar(100),
wname  varChar(100),
targetamount int,
price  int,
personnel int,
reg_date datetime,
cnt int,
cat varChar(100)
);


INSERT INTO funding_db.project (company,title,content,nickname,wname,targetamount,price,personnel,reg_date,cnt,cat) VALUES
	 ('돌돌이네회사','가방1','가방1_1.jpg','돌돌이','가방1.jpg',200000,20000,0,'2022-09-05 14:44:07.0',6,'bag'),
	 ('돌돌이네회사','가방2','가방2_2.jpg','돌돌이','가방2.jpg',50000000,50000,0,'2022-09-05 14:44:28.0',6,'bag'),
	 ('돌돌이네회사','가방3','가방3_3.jpg','돌돌이','가방3.jpg',100000000,1000000,0,'2022-09-05 14:45:06.0',2,'bag'),
	 ('돌돌이네회사','옷1','옷1_1.jpg','돌돌이','옷1.jpg',300000000,120000,1,'2022-09-05 15:05:34.0',6,'clothes'),
	 ('돌돌이네회사','약1','약1_1.jpg','돌돌이','약1.jpg',1000000000,1000000,0,'2022-09-05 15:06:27.0',1,'medicine'),
	 ('돌돌이네회사','옷2','옷2_2.jpg','돌돌이','옷2.png',2000000,20000,0,'2022-09-05 15:12:20.0',2,'clothes'),
	 ('안녕회사','안녕약','약2-2.jpg','안녕하세요','약2.jpg',40000000,40000,0,'2022-09-05 15:34:48.0',0,'medicine');
