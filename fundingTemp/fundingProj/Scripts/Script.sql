create table exam (
id int,
name varChar(100),
kind int,
rag_date datetime
);

insert into exam (id,name,kind,rag_date)values 
(1,'바보1',10,now()),
(2,'바보2',20,now()),
(3,'바보3',30,now()),
(4,'바보4',40,now()),
(5,'바보5',50,now()),
(6,'바보6',60,now());

create table membership (
num int,
id varChar(100),
pw varChar(100),
name varChar(100),
email varChar(100)
);

create table account (
	id int not null auto_increment primary key,
	email varchar(100),
	pw varchar(100),
	name varchar(100),
	nickname varchar(100),
	addr varchar(100),
	phnum varchar(100),
	bankacc varchar(100),
	bnsnum varchar(100)
);

create table project (
	pid int not null auto_increment primary key,
	id int ,
	title varchar(100) ,
	wname varchar(100),
	content varchar(100),
	reg_date datetime,
	thum varchar(100),
	detail varchar(100),
	seq int,
	cat varchar(100),
	cid int not null unique,
	upid int not null unique,
	qid int not null unique
	/*foreign key(id) references account(id)*/
);

create table community (
	cid int not null,
	id int not null auto_increment primary key,
	wname varchar(100),
	content varchar(100),
	reg_date datetime,
	likes int ,
	level int ,
	seq int ,
	gid int 
	/*foreign key(cid) references project(cid)*/
);

create table progress (
	upid int not null,
	id int not null auto_increment primary key,
	wname varchar(100),
	content varchar(100),
	reg_date datetime,
	likes int ,
	progimg varchar(100),
	level int ,
	seq int ,
	gid int 
	/*foreign key(upid) references project(upid)*/
);

create table question (
	qid int not null,
	id int not null auto_increment primary key,
	wname varchar(100),
	content varchar(100),
	reg_date datetime,
	level int ,
	seq int ,
	gid int 
	/*foreign key(qid) references project(qid)*/
);


drop table question ;
drop table progress ;
drop table community ;
drop table project;
drop table account ;

select nickname from account where 11;

select * from account where email = 11 AND pw = 'aaaa1111'; 
select nickname from account  where email = 'dbadf@naver.com' AND pw = 'aaaa1111'; 