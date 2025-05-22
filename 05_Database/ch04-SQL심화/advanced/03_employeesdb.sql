# 현재 재직 중인 직원의 정보를 출력하세요.
# 출력 항목 : emp_no, first_name, last_name, title
use employees;

select e.emp_no, e.first_name, e.last_name, t.title
from employees e
join titles t on e.emp_no = t.emp_no
where t.to_date = '9999-01-01';

# 현재 재직 중인 직원의 정보를 출력하세요.
# 출력 항목 : 직원의 기본 정보 모두, title, salary
select e.*, t.title, s.salary
from employees e
join titles t on e.emp_no = t.emp_no and t.to_date = '9999-01-01'
join salaries s on e.emp_no = s.emp_no and s.to_date = '9999-01-01';

# 현재 재직 중인 직원의 정보를 출력하세요.
# 출력 항목 : emp_no, first_name, last_name, dept_name
# 정렬 : emp_no 오름차순
select e.emp_no, e.first_name, e.last_name, d.dept_name
from employees e
join dept_emp de on e.emp_no = de.emp_no and de.to_date = '9999-01-01'
join departments d on de.dept_no = d.dept_no
order by e.emp_no;

# 부서별 재직 중인 직원의 수를 출력하세요.
# 출력 항목 : 부서 번호, 부서명, 인원 수
# 정렬 : 부서 번호 오름차순
select d.dept_no, d.dept_name, count(*)
from dept_emp de
join departments d on de.dept_no = d.dept_no and de.to_date = '9999-01-01'
group by d.dept_no
order by d.dept_no;

# 직원 번호가 10209인 직원의 부서 이동 히스토리를 출력하세요.
# 출력 항목 : emp_no, first_name, last_name, dept_name, from_date, to_date
select e.emp_no, e.first_name, e.last_name, d.dept_name, de.from_date, de.to_date
from employees e
join dept_emp de on e.emp_no = de.emp_no
join departments d on de.dept_no = d.dept_no
where e.emp_no = 10209;