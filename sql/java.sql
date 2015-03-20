--숫자(정수형,실수형),문자(문자열 즉 한글자이상),날짜
--문자 char(n):고정길이  최대 4000byte
--varchar2() : 가변길이 최대 4000byte
--varchar() : varchar2 보다 용량소모 큼
--숫자(정수형,실수형) : int 4byte,float 4byte,double 8byte 고정길이
--number(n),number(p,s):number(6),number(8,2)(정수6,소수2) 가변길이 

--table 생성 DDL(Data Definition Language 데이터 정의어)
create table abc(
 bunho number(2),
 irum varchar2(15),
 ki number(4,1),
 constraint abc_pk primary key(bunho)
);

delete abc where bunho=7;
select * from abc order by bunho;

delete abc where bunho=1;
insert into abc values(1,'choi',166.4);
insert into abc values(7,'jung',156.9);

insert into abc(bunho,irum,ki) values (8,'seo',178);
insert into abc values(9,'ko',null);
select * from abc;

create table su(
 su1 number(3),
 bunho varchar(3),
 su2 number(3),
 constraint su_pk primary key (su1)
 );
 
insert into su values (1,'a',2);
insert into su values (2,'b',3);
insert into su values (3,'c',4);

flashback table abc to before drop; 
--다시 살리기
purge recyclebin; --휴지통 비우기;
drop table abc purge; --휴지통에 넣지 않고 삭제

select * from abc;

truncate table abc; --테이블의 모든행 제거
rollback;
select * from abc;

