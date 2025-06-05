# usertbl에 대해 다음을 처리하세요.
# birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
#   에러가 난다면 그 이유를 설명하세요.
create index idx_usertbl_birthYear on usertbl(birthYear);
# error : Duplicate key name 'idx_usertbl_birthYear'

# name 컬럼에 대해 idx_usertbl_name 이름의 인덱스를 만드세요.
create index idx_usertbl_name on usertbl(name);

# 생성된 인덱스의 xxx목록을 확인하세요.
show index from usertbl;