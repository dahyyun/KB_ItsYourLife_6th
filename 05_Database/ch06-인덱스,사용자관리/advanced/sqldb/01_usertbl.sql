# sqldb에서 usertbl 테이블에서 다음 내용들을 확인하세요.
use sqldb;

# usertbl의 내용 확인
select * from usertbl;

# usertbl의 인덱스 목록 확인
show index from usertbl;

# usertbl의 데이터 크기와 인덱스의 크기 확인
select count(*)
from usertbl;

show table status like 'usertbl';