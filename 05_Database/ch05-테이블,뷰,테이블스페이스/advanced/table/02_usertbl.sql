# 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
# 기존 buyTBL, userTBL을 삭제하세요.
drop table buytbl;
drop table usertbl;

# 컬럼
# 이메일은 중복 불가
create table userTBL (
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null,
    email char(30) unique
);