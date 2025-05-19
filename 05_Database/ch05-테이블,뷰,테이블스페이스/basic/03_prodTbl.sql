# 다음 컬럼을 가지는 prodTbl을 정의하세요.
# 기존 prodTbl이 존재하는 경우 삭제함
drop table prodtbl;

create table prodtbl (
    prodCode char(3) not null,
    prodID char(4) not null,
    prodDate datetime not null,
    proCur char(10),

    constraint PK_prodTbl_prodCode_prodID PRIMARY KEY (prodCode, prodID)
);