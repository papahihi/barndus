create table community (
	cid int not null auto_increment primary key,
	title varchar(100),
	nickname varchar(100),
	contentname varchar(100),
	content varchar(100),
	reg_date datetime
);




INSERT INTO funding_db.community (title,nickname,contentname,content,reg_date) VALUES
	 ('옷1','안녕하세요','이 자켓 안녕한가요?',' 이 자켓이 안녕하지 않은거같아요.','2022-09-06 16:50:53.0');
