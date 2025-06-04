use shopdb;

-- productTBL의 데이터를 출력하세요. 
select * from producttbl;

-- memberTBL의 데이터를 출력하세요. (단, memberName과 memberAddress만 출력함)
select memberName, memberAddress from membertbl;

-- memberTBL의 데이터 중 이름이 '지운이'인 데이터만 출력하세요.
select * from membertbl where memberName = '지운이';

-- 앞에서 작성한 3개의 SQL 문을 한 번에 실행하세요.
