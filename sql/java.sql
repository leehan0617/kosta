--����(������,�Ǽ���),����(���ڿ� �� �ѱ����̻�),��¥
--���� char(n):��������  �ִ� 4000byte
--varchar2() : �������� �ִ� 4000byte
--varchar() : varchar2 ���� �뷮�Ҹ� ŭ
--����(������,�Ǽ���) : int 4byte,float 4byte,double 8byte ��������
--number(n),number(p,s):number(6),number(8,2)(����6,�Ҽ�2) �������� 

--table ���� DDL(Data Definition Language ������ ���Ǿ�)
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
--�ٽ� �츮��
purge recyclebin; --������ ����;
drop table abc purge; --�����뿡 ���� �ʰ� ����

select * from abc;

truncate table abc; --���̺��� ����� ����
rollback;
select * from abc;

