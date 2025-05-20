# 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
# 기존 userTBL을 삭제하세요.
drop table usertbl;

# 컬럼
# birthYear은 1900 이상 2023 이하 값만 허용
create table usertbl (
    userID char(8) not null primary key,
    name varchar(10),
    birthYear int check ( birthYear between 1900 and 2023 ),
    mobile char(3) not null
);