use world;

# city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 총합을 구하시오.
select sum(Population)
from city
where CountryCode = 'KOR';

# city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최소값을 구하시오. 단, 결과를 나타내는 테이블의 필드는 "최소값"으로 표시하시오.
select min(Population) as 최소값
from city
where CountryCode = 'KOR';

# city 테이블에서 국가코드가 'KOR'인 도시들의 평균을 구하시오.
select avg(Population)
from city
where CountryCode = 'KOR';

# city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최대값을 구하시오. 단, 결과를 나타내는 테이블의 필드는 "최대값"으로 표시하시오.
select max(Population) as 최대값
from city
where CountryCode = 'KOR';

# country 테이블 각 레코드의 Name 칼럼의 글자수를 표시하시오.
select length(name) -- char_length(name)도 가능
from country;

# country 테이블의 나라명(Name 칼럼)을 앞 세글자만 대문자로 표시하시오.
select concat(upper(left(Name, 3)), substring(Name, 4))
from country;

# country 테이블의 기대수명(LifeExpectancy)을 소수점 첫째자리에서 반올림해서 표시하시오.
select round(LifeExpectancy)
from country;

