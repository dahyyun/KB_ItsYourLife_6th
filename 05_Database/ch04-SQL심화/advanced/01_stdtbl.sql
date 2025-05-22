# 다음과 같이 테이블과 데이터를 준비하세요.
use sqldb;

drop table stdtbl;
drop table clubtbl;
drop table stdclubtbl;

create table stdtbl (
    stdName varchar(10) not null primary key,
    addr char(4) not null
);

create table clubtbl (
    clubName varchar(10) not null primary key,
    roomNo char(4) not null
);

create table stdclubtbl (
    num int auto_increment not null primary key,
    stdName varchar(10) not null,
    clubName varchar(10) not null,
    foreign key (stdName) references stdtbl(stdName),
    foreign key (clubName) references clubtbl(clubName)
);

insert into stdtbl values ('김범수', '경남'), ('성시경', '서울'), ('조용필', '경기'), ('은지원', '경북'), ('바비킴', '서울');
insert into clubtbl values ('수영', '101호'), ('바둑', '102호'), ('축구', '103호'), ('봉사', '104호');
insert into stdclubtbl
values (null, '김범수', '바둑'), (null, '김범수', '축구'), (null, '조용필', '축구'),
       (null, '은지원', '축구'), (null, '은지원', '봉사'), (null, '바비킴', '봉사');

# 앞에서 정의한 3개의 테이블을 이용해서 다음을 처리하세요.
# 학생 테이블, 동아리 테이블, 학생 동아리 테이블을 이용해서 학생을 기준으로 학생 이름/지역/가입한 동아리/동아리방을 출력하세요.
select s.stdName as '학생 이름', s.addr as '지역', c.clubName as '가입한 동아리', c.roomNo as '동아리방'
from stdclubtbl sc
join stdtbl s on s.stdName = sc.stdName
join clubtbl c on sc.clubName = c.clubName
order by s.stdName;

# 동아리를 기준으로 가입한 학생의 목록을 출력하세요.
select c.clubName, c.roomNo, s.stdName, s.addr
from stdclubtbl sc
join stdtbl s on sc.stdName = s.stdName
join clubtbl c on c.clubName = sc.clubName
order by c.clubName;