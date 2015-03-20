create table mysungjuk(
  hakbun number(5) primary key,
  name varchar2(20) not null,
  kor number(3) not null,
  eng number(3) not null,
  mat number(3) not null,
  tot number(3) not null,
  avg number(5,2) not null
  );
  insert into mysungjuk values(1234,'Lee',80,70,60,(80+70+60),(80+70+60)/3,1);
    insert into mysungjuk values(1238,'Lee',80,70,60,(80+70+60),(80+70+60)/3,mysungjuk_idx_seq.nextval);
        insert into mysungjuk values(1239,'Lee',80,70,60,(80+70+60),(80+70+60)/3,mysungjuk_idx_seq.nextval);
delete mysungjuk where hakbun=1234;

alter table mysungjuk add (idx number(3));
select * from mysungjuk;

create sequence mysungjuk_idx_seq
start with 1
increment by 1;