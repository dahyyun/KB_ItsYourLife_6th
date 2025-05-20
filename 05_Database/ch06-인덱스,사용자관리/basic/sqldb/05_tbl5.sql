# sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl5을 생성하고, 자동 생성된 인덱스 목록을 확인하세요.
use sqldb;

create table tbl5 (
    a int unique not null,
    b int unique,
    c int unique,
    d int primary key
);

show index from tbl5;