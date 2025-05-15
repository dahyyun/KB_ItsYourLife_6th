# 모든 문제는 employees 데이터베이스에서 수행한다.
use employees;

# employees db에서 각 부서별 관리자를 출력하세요.
#   단, 현 재직자만 출력한다.
select *
from dept_manager
where to_date = '9999-01-01';

# 부서번호 d005 부서의 현재 관리자 정보를 출력하세요.
select *
from dept_manager
where to_date = '9999-01-01' and dept_no = 'd005';

# employees 테이블에서 페이지네이션으로 페이지를 추출하려고 한다. 다음 조건하에서 8번 페이지의 데이터를 출력하세요.
#   입사일을 내림차순으로 정렬한다.
#   한 페이지당 20명의 정보를 출력한다.
select *
from employees
order by hire_date desc
limit 140, 20; -- offset, amount

# employees db에서 재직자의 총 수를 구하시오.
#   재직자의 to_date 값은 '9999-01-01'로 저장되어 있음
select count(*)
from dept_emp
where to_date = '9999-01-01';

# employees db에서 재직자의 평균 급여를 출력하시오.
select avg(salary)
from salaries
where to_date = '9999-01-01';

# 재직자 전체 평균 급여 보다 급여를 더 많이 받는 재직자를 출력하세요.
select *
from salaries
where to_date = '9999-01-01' and salary > (select avg(salary)
                                                    from salaries
                                                    where to_date = '9999-01-01');

# employees db에서 각 부서별 재직자의 수를 구하시오.
#   부서 번호로 구분하고, 부서 번호로 오름차순 정렬하여 출력한다.
select dept_no, count(*) as `부서별 재직자`
from dept_emp
where to_date = '9999-01-01'
group by dept_no
order by dept_no;