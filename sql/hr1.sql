select first_name,department_id from employees where first_name='Jack';
select department_name from departments where department_id=80;

select e.first_name,
  d.department_name
  from employees e,departments d
  where e.department_id=d.department_id
  and e.first_name='Jack';
  
select department_name
  from departments
  where department_id=
    (select department_id
    from employees
    where first_name='Jack'
    );
    
--jack 동일한 직군을 가진 사원을 출력
--jack 직군
select job_id from employees where first_name='Jack';
--직군과 같은 사원 출력
select first_name,job_id from employees where job_id='SA_REP';

--join
select e.first_name,j.job_id
from employees e,employees j
where e.job_id=j.job_id
and j.first_name='Jack';

select first_name,
  job_id
  from employees
  where job_id=
    (select job_id
      from employees
      where first_name='Jack'
      );
      
select 
  salary 
  from employees 
  where first_name='Jack';
  
select first_name,
  salary
  from employees
  where salary>=
    (select salary
      from employees
      where first_name='Jack'
      );

select round(avg(salary),1) from employees;

select first_name,
      salary 
      from employees
      where salary > 
        (select round(avg(salary),1) 
          from employees);
          
select first_name,
        salary
        from employees
        where salary=
          (select max(salary) 
          from employees);

select employee_id,first_name,salary
from employees where salary=(Select max(salary) from employees where department_id=60);

select first_name,department_id from employees where department_id=(
select department_id from departments where department_name='IT');

--다중행 서브쿼리:두개 이상의 행일때
--in :하나라도 일치
--any:하나 이상일치
--all:모두 일치

select employee_id,first_name from employees where employee_id in(100,102,1000);

select first_name,
      department_id 
      from employees 
      where department_id in 
          (select department_id 
              from employees 
              where first_name='Steven');
select first_name,department_id from employees where department_id in(
select department_id from employees where salary > 12000);

select first_name,hire_date from employees where department_id in
(select department_id from employees where first_name='Steven')
and first_name <>'Adam';

select employee_id from employees where employee_id > all(150,200);

select first_name,salary
from employees
where salary > all(select salary from employees where department_id=30);

select employee_id from employees where employee_id > any(150,200);

select first_name,salary from employees where salary > any(
select salary from employees where department_id=30);

--인라인 뷰 : 서브쿼리 별칭을 붙여준다 (필드(열) 값처리)
select e.first_name,
       d.department_name
from employees e,(select department_id,department_name
                  from departments) d
where e.department_id=d.department_id
and e.first_name='Jack';

--부서별 최하 연봉,최고 연봉 받는 사원출력
select department_id,max(salary) from employees group by department_id;
select department_id,min(salary) from employees group by department_id;

select e.first_name,
       e.department_id,
       e.salary
      from employees e,(select department_id,max(salary) max_salary
                        from employees 
                        group by department_id) d
where e.department_id=d.department_id
and e.salary=d.max_salary 
order by department_id;

--1
select first_name,salary from employees
where salary >=(select salary from employees where first_name='Lex');
--2
select department_id,first_name from employees where job_id='IT_PROG';
--3
select employee_id,first_name,department_id from employees where
department_id in (select department_id from employees where first_name like '%T%');
--4
select e.first_name,e.salary from employees e,departments d 
where e.department_id=d.department_id
and d.department_name='Sales';
--⑤	KING에게 보고하는 사원의 이름과 급여를 출력. (KING에게 보고하는 사원이란 의미는 상사(Mamager)가 KING사원을 의미한다)
select e.first_name,
      e.salary,
      e.manager_id
      from employees e,employees e2
      where e2.last_name='King'
      and e.manager_id=e2.employee_id;
--6⑥	자신의 급여가 평균 급여보다 많고 이름에 S가 들어가는 사원과 동일한 부서에서 근무하는 사원의 사번과 이름 및 급여 출력
select employee_id,first_name,salary from employees
where first_name in(
select first_name from employees 
where salary > (select avg(salary) from employees)
and first_name like '%S%');
--7부서별로 가장 최근에 입사한 사원을 검색
