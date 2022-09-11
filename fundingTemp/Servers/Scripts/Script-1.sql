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
create table community (
	cid int not null auto_increment primary key,
	title varchar(100),
	nickname varchar(100),
	contentname varchar(100),
	content varchar(100),
	reg_date datetime
);
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