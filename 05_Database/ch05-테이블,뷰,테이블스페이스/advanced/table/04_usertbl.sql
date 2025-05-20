# 다음 조건을 만족하는 userTBL 테이블을 정의하세요.
# 기존 userTBL을 삭제하세요.
drop table usertbl;

# 컬럼
create table usertbl (
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthYear int not null default -1,
    addr char(2) not null default '서울',
    mobile1 char(3),
    mobile2 char(8),
    height smallint default 170,
    mDate date
);

# 기본값 추가를 확인할 수 있는 데이터를 추가하세요.
insert into usertbl (userID, name, mobile1, mobile2, mDate)
    values ('JDH', 'dahyun', '010', '99022504', '2025-05-20');

# mobile1 컬럼을 삭제함
alter table usertbl
drop column mobile1;

# name 컬럼명을 uName으로 변경함
alter table usertbl
rename column name to uName;

# 기본키를 제거함
alter table usertbl
drop primary key;