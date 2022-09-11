create table project (
	pid int not null auto_increment primary key,
	id int ,
	title varchar(100) ,
	content varchar(100),
	wname varchar(100),
	reg_date datetime,
	detail varchar(100),
	cnt int,
	cat varchar(100)
);
select * from account;
select * from project;
select * from account where nickname ='나지금맞아?';
select * from account where nickname ='나지금맞아';
select * from project where cat = 'animal';

select nickname from account where nickname = '마마';
update project set cnt = cnt + 1 where id = 1;
update project set cnt = cnt + 1 where id = 1;

create table community (
	cid int not null auto_increment primary key,
	title varchar(100),
	nickname varchar(100),
	contentname varchar(100),
	content varchar(100),
	reg_date datetime,
	gid int 
);



select max(cid)+1 from community;  
drop table community;
select * from community where wname = '우주게임'
nsert into community(title,wname,content,reg_date,likes,level,seq,gid)
values('호랑이','이동물...','진짜호랑인가요?',sysdate(),0,0,0,max(cid)+1);
select * from project where id = 1;


drop table account;
drop table question ;
drop table progress ;
drop table community ;
drop table project;
drop table profunding;

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

insert into project (company,title,content,nickname,wname,targetamount,price,personnel,reg_date,cnt,cat)values 
('가가콤','가가게임','가가게임을소개함','가가','1.jpg',500000,50000,3,sysdate(),0,'game'),
('나나콤','나나게임','나나게임을소개함','나나','2.jpg',5000000,100000,4,sysdate(),0,'game'),
('다다콤','다다게임','다다게임을소개함','다다','3.jpg',300000,20000,5,sysdate(),0,'game'),
('라라콤','라라게임','라라게임을소개함','라라','4.jpg',500000,50000,1,sysdate(),0,'game'),
('마마콤','마마게임','마마게임을소개함','마마','5.jpg',50000000,1000000,2,sysdate(),0,'game'),
('바바콤','바바가방','바바가방을소개함','바바','6.jpg',300000,10000,3,sysdate(),0,'bag'),
('사사콤','사사가방','사사가방을소개함','사사','7.jpg',5000000,50000,20,sysdate(),0,'bag'),
('아아콤','아아가방','아아가방을소개함','아아','8.jpg',100000,5000,30,sysdate(),0,'bag'),
('자자콤','자자가방','자자가방을소개함','자자','9.jpg',2000000,40000,30,sysdate(),0,'bag'),
('차차콤','차차가방','차차가방을소개함','차차','10.jpg',50000000,100000,50,sysdate(),0,'bag'),
('카카콤','카카약','카카약을소개함','카카','11.jpg',500000,50000,10,sysdate(),0,'medicine'),
('타타콤','타타약','타타약을소개함','타타','12.jpg',500000,50000,5,sysdate(),0,'medicine'),
('파파콤','파파약','파파약을소개함','파파','13.jpg',500000,50000,3,sysdate(),0,'medicine'),
('하하콤','하하약','하하약소개함','하하','14.jpg',500000,50000,5,sysdate(),0,'medicine'),
('가나콤','가나약','가나약소개함','가나','2.jpg',500000,50000,6,sysdate(),0,'medicine');

create table profunding(
title varChar(100),
nickname varChar(100),
price int,
personnel int
)

create table account (
	id int not null auto_increment primary key,
	email varChar(100),
	pw varchar(100),
	name varchar(100),
	nickname varchar(100),
	addr varchar(100),
	phnum varchar(100),
	bankacc varchar(100),
	company varchar(100)
);
update account  set name = '둘둘이당', addr = '어딘가살것지', phnum = '0102328123', bankacc = '123412821', company = '둘둘회사' where nickname = '둘둘';

