# usertbl과 buytbl을 바탕으로 다음 결과가 나오는 뷰를 정의하세요.

insert into buytbl (userID, prodName, groupName, price, amount)
values ('KBS', '청바지', NULL, 10, 1);

create view t_view
as
select u.userID,
       u.name,
       b.prodName,
       u.addr,
       concat(u.mobile1, u.mobile2) as 연락처
from usertbl u
join buytbl b on u.userID = b.userID;

SELECT * FROM t_view;

# 위에서 정의한 뷰에서 userid가 '김범수'인 데이터만 출력하세요.
select *
from t_view
where userID = 'KBS';