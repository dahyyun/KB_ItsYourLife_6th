# 다음 컬럼을 가지는 usertbl을 정의하세요.
# 기존 usertbl이 존재하는 경우 삭제함
# 기본키는 테이블 레벨에서 정의하고 제약조건명을 함께 지정함

drop table buytbl;
drop table usertbl;

create table usertbl (
    userID char(8) not null,
    name varchar(10) not null,
    birthyear int not null,
    CONSTRAINT PK_userTbl_userID PRIMARY KEY (userID)
);