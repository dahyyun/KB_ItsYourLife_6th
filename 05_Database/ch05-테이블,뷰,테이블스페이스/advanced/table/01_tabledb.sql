# 다음 컬럼을 가지는 userTBL과 buyTBL을 정의하세요.
# 기존에 테이블이 존재하면 삭제함
use tabledb;

drop table buytbl;
drop table usertbl;

# userTBL
create table userTBL (
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null
);

# buyTBL
create table buyTBL (
    num int not null primary key auto_increment,
    userID char(8) not null,
    prodName char(6) not null
);

# ALTER를 이용해 userID를 외래키로 수정하세요.
alter table buytbl
add constraint userID
foreign key (userID)
references usertbl (userID);