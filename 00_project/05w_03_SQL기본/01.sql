# 현재 서버에 존재하는 데이터베이스 확인
show databases;

# 현재 데이터베이스를 employees로 설정하기
use employees;

# employees 데이터베이스의 테이블 목록 보기
show tables;

# employees 테이블의 열 목록 출력하기
show columns
from employees;

# titles 테이블의 데이터 출력하기
select *
from titles;

# employees 테이블에서 first_name 컬럼만 출력하기
select first_name
from employees;

# employees 테이블에서 first_name, last_name, gender 컬럼 출력하기
select first_name, last_name, gender
from employees;

# employees 테이블 출력시 다음과 같이 나오도록 쿼리를 작성하세요. 상위 6개만 출력하세요.
select first_name as 이름, gender as 성별, hire_date as `회사 입사일`
from employees
limit 6;