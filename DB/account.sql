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
INSERT INTO funding_db.account (email,pw,name,nickname,addr,phnum,bankacc,company) VALUES
	 ('a','a','돌돌','돌돌이','어딘가','010-9999-1111','1231928312','돌돌이네회사'),
	 ('dbghjs@naver.com','aaaa1111','안녕이','안녕하세요','안녕이집','010-1111-1111','1234512331231','안녕회사');
