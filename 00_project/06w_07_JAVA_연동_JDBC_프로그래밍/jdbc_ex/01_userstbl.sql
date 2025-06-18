# Intellij에서 다음과 같은 users 테이블을 정의하세요.

use sqldb;

create table users (
    id varchar(12) primary key,
    password varchar(12) not null,
    name varchar(30) not null,
    role varchar(6) not null
);

# 다음과 같은 테스트 데이터를 추가하세요.

insert into users values ('guest', 'guest123', '방문자', 'USER'),
                         ('admin', 'admin123', '관리자', 'ADMIN'),
                         ('member', 'member1234', '일반회원', 'USER');

