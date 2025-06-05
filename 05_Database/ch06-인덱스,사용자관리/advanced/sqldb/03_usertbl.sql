# usertbl의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인하고
show table status like 'usertbl';

# 내용이 없다면 실제 적용되도록 한 후, 인덱스의 크기를 확인하세요.
analyze table usertbl;
show table status like 'usertbl';