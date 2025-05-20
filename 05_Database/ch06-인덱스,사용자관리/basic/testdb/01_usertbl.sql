# testdb에 다음 컬럼 목록을 가지는 usertbl을 만드세요.
use testdb;

drop table usertbl;

create table usertbl (
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthYear int not null,
    addr nchar(2) not null
);


# 아래 데이터를 추가하고, 클러스터형 인덱스의 테이블 내용을 확인하세요.
insert into usertbl values ('LSG', '이승기', 1987, '서울'),
                           ('KBS', '김범수', 1979, '경남'),
                           ('KKH', '김경호', 1971, '전남'),
                           ('JYP', '조용필', 1950, '경기'),
                           ('SSK', '성시경', 1979, '서울');

# ALTER를 사용하여 usertbl에서 PRIMARY KEY 제약조건을 제거하고, name 컬럼에 pk_name이라는 제약조건명으로 기본키를 설정하세요.
alter table usertbl
drop primary key;

alter table usertbl
add constraint pk_name primary key (name);


# usertbl의 내용을 출력하여, 새로운 클러스터형 인덱스를 확인하세요.
select *
from usertbl;