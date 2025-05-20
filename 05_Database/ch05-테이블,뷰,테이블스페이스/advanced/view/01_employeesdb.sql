# 모든 문제는 employees 데이터베이스에서 수행한다.
# employees db의 ERD

# 다음 정보를 가지는 직원 정보를 출력하는 EMPLOYEES_INFO 뷰를 작성하세요.
create view EMPLOYEES_INFO as
    select e.emp_no,
           e.birth_date,
           e.first_name,
           e.last_name,
           e.gender,
           e.hire_date,
           t.title,
           t.from_date as t_from,
           t.to_date as t_to,
           s.salary,
           s.from_date as s_from,
           s.to_date as s_to
from employees e
join titles t on e.emp_no = t.emp_no
join salaries s on e.emp_no = s.emp_no;

select * from employees_info;


# EMPLOYEES_INFO 뷰에서 재직자의 현재 정보만 출력하세요.
select distinct *
from employees_info
where s_to = '9999-01-01';

drop view emp_dept_info;

# 다음 정보를 가지는 부서 정보를 출력하는 EMP_DEPT_INFO 뷰를 작성하세요.
create view EMP_DEPT_INFO as
select d.emp_no,
       d.dept_no,
       de.dept_name,
       d.from_date,
       d.to_date
from dept_emp d
join departments de on d.dept_no = de.dept_no;

select * from emp_dept_info order by emp_no;

# EMP_DEPT_INFO로 현재 재직자의 부서 정보를 출력하세요.
select *
from employees.emp_dept_info
where to_date = '9999-01-01'
order by emp_no;