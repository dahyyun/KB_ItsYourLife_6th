# 다음과 같이 데이터베이스를 준비하세요.
# 데이터베이스명 : jdbc_ex
# 사용자 : scoula
# 비밀번호 : 1234
# jdbc_ex 데이터베이스에 대한 모든 사용권한 부여

create database jdbc_ex;

create user 'scoula'@'%' identified by '1234';
grant all privileges on jdbc_ex.* to 'scoula'@'%';
flush privileges;