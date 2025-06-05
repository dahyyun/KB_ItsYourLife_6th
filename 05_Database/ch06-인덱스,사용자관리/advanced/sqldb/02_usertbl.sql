# usertbl의 addr 컬럼에 대해 idx_usertbl_addr 이름으로 인덱스를 만들고
create index idx_usertbl_addr on usertbl(addr);

# 인덱스 목록을 확인하세요.
show index from usertbl;