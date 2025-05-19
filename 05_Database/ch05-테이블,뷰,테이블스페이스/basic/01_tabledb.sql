# tabledb 데이터베이스를 생성하세요.
# 만일, 이미 존재한다면 삭제하세요.
drop database if exists tabledb;

create database tabledb;

use tabledb;

# 다음 컬럼을 가지는 usertbl 테이블을 만드세요.
create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null,
    addr      char(2)     not null,
    mobile1   char(3),
    mobile2   char(8),
    height    smallint,
    mDate     date
);

# 다음 컬럼을 가지는 buytbl 테이블을 만드세요.
create table buytbl
(
    num       int      not null primary key auto_increment,
    userID    char(8)  not null,
    prodName  char(6)  not null,
    groupName char(4),
    price     int      not null,
    amount    smallint not null,

    foreign key (userID) references usertbl (userID)
);

# 회원 테이블에 다음 데이터를 입력하세요.
insert into usertbl
values ('LSG', '이승기', 1987, '서울', '011', '11111111', 182, '2008-8-8'),
       ('KBS', '김범수', 1979, '경남', '011', '22222222', 173, '2012-4-4'),
       ('KKH', '김경호', 1971, '전남', '019', '33333333', 177, '2007-7-7');

# 구매 테이블에 다음 데이터를 입력하세요.
insert into buytbl (userID, prodName, groupName, price, amount)
values ('KBS', '운동화', NULL, 30, 2);

insert into buytbl (userID, prodName, groupName, price, amount)
values ('KBS', '노트북', '전자', 1000, 1);

# 에러가 난다면, 왜 발생하는지 설명하세요.
# 외래키 userID 중 'JYP' 존재하지 않는다.
insert into buytbl (userID, prodName, groupName, price, amount)
values ('JYP', '모니터', '전자', 200, 1);
