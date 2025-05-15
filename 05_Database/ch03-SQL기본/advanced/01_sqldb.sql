use sqldb;

# 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
#   사용자 아이디, 총 구매 개수
select userID as '사용자 아이디', sum(amount) as '총 구매 개수'
from buytbl
group by userID;

#   사용자 아이디, 총 구매액
select userID as '사용자 아이디', sum(price * amount) as '총 구매액'
from buytbl
group by userID;

# 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
#   평균 구매 개수
select avg(amount) as '평균 구매 개수'
from buytbl;

#   userID, 평균 구매 개수
select userID, avg(amount) as '평균 구매 개수'
from buytbl
group by userID;

# 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
#   가장 키가 큰 사람과 가장 키가 작은 사람을 출력함
select name, height
from usertbl
where height = (select max(height) from usertbl)
or height = (select min(height) from usertbl);

# 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
#   휴대폰이 있는 사용자
select count(concat(mobile1, mobile2)) as '휴대폰이 있는 사용자'
from usertbl;

# buytbl 테이블로 다음을 처리하세요.
#   사용자별 총 구매액을 출력하세요.
select userID as 사용자, sum(price * amount) as 총구매액
from buytbl
group by userID;

#   총 구매액이 1,000 이상인 사용자만 출력하세요.
select userID as 사용자, sum(price * amount) as 총구매액
from buytbl
group by userID
having sum(price * amount) > 1000;

