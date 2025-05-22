# 다음과 같이 테이블과 데이터를 준비하세요.
use sqldb;

create table empTbl (
    emp char(3),
    manager char(3),
    empTel varchar(8)
);

insert into empTbl values ('나사장', null, '0000');
insert into empTbl values ('김재무', '나사장', '2222');
insert into empTbl values ('김부장', '김재무', '2222-1');
insert into empTbl values ('이부장', '김재무', '2222-2');
insert into empTbl values ('우대리', '이부장', '2222-2-1');
insert into empTbl values ('지사원', '이부장', '2222-2-2');
insert into empTbl values ('이영업', '나사장', '1111');
insert into empTbl values ('한과장', '이영업', '1111-1');
insert into empTbl values ('최정보', '나사장', '3333');
insert into empTbl values ('윤차장', '최정보', '3333-1');
insert into empTbl values ('이주임', '윤차장', '3333-1-1');

# 앞에서 추가한 테이블에서 '우대리'의 상관 연락처 정보를 확인하세요.
# 출력할 정보 : 부하직원, 직속상관, 직속상관연락처
select a.emp as '부하직원', b.emp as '직속상관', b.empTel as '직속상관연락처'
from empTbl a
join emptbl b on a.manager = b.emp
where a.emp = '우대리';