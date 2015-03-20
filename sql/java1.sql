select * from sungjuk;
select * from sungjuk;

create table hakjum(
  h_min number(3),
  h_max number(3),
  grade varchar2(3)
  );
  
insert into hakjum values(80,89,'B');
insert into hakjum values(70,79,'C');
insert into hakjum values(60,69,'D');
insert into hakjum values(0,59,'F');

select s.name,s.aver,h.grade
  from sungjuk s,hakjum h
  where s.aver >= h.h_min and s.aver<=h.h_max;
  
create table person(
  bunho number(2),
  p_name varchar2(15),
  phone varchar2(20),
  jumin varchar2(13),
  city varchar2(20),
  birth date
); 

insert into person values(1,'Lee','01012345678','9011111111111','Seoul',to_date('1990-01-01','YYYY-MM-DD'));
update person set jumin='901111-1111111' where bunho=1;
alter table person modify(jumin varchar2(14));
select * from person;

insert into person 
  values(2,'Kim','01054325678','800101-1022345','Busan',to_date('1980-01-01','YYYY-MM-DD'));
insert into person values(3,'Park','01012366778','701224-2121212','Suwon',to_date('1970-12-24','YYYY-MM-DD'));