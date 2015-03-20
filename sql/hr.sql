select * from employees;
select * from departments;
select * from locations;

select 
  first_name,
  department_name,
  city
from employees e,departments d,locations l
where e.department_id=d.department_id 
and d.location_id=l.location_id;

select e.first_name,d.department_name
from employees e,departments d
where e.department_id=d.department_id 
AND e.first_name='David'
and e.department_id=60;

select 
  e.first_name,
  e.hire_date
  from employees e,departments d
  where e.department_id=d.department_id
  and d.department_name='IT';
  
select
  e.first_name,
  d.department_name,
  j.job_title
  from employees e,departments d,jobs j
  where e.department_id=d.department_id
  and e.job_id='AD_VP'
  and e.job_id=j.job_id;
  
select
  e.employee_id,
  e.salary,
  e.job_id,
  j.job_title,
  j.max_salary,
  j.min_salary
from employees e,jobs j
where e.job_id=j.job_id;

select
  e.employee_id,
  e.salary,
  e.job_id,
  j.job_title,
  j.max_salary,
  j.min_salary
from employees e,jobs j
where e.salary > j.min_salary and e.salary < j.max_salary;  

--사원의 이름,부서코드,부서명을 출력 , 부서코드가 60이 아닌 부서 출력
select 
  e.first_name,
  e.department_id,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and e.department_id <> 60;

--self join
select * from EMPLOYEES;

select last_name,manager_id 
from employees
where last_name='Smith';

select 
  last_name,
  employee_id 
from employees
where employee_id=146 or employee_id=148;

select
  e.last_name,
  d.last_name
from employees e,employees d
where e.manager_id=d.employee_id
and e.last_name='Smith';

--steven과 같은 부서에 근무하는 사원들
select * from employees where department_id=50;
select 
  e.first_name,
  d.department_id
  from employees e,employees d
  where e.department_id=d.department_id
  and d.first_name='Steven';

--outer join
select
  e.last_name,
  e.manager_id,
  m.last_name
from employees e,employees m
where e.manager_id=m.employee_id(+);

select 
  e.last_name,
  e.department_id,
  d.department_name
from employees e,departments d
where e.department_id(+)=d.department_id;

select
  e.last_name,
  e.department_id,
  d.department_name
  from employees e
  full outer join departments d
  on e.department_id=d.department_id;
  
--①	사원들의 사원번호, 부서번호, 부서명을 출력. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id 사원번호,
  e.department_id 부서코드,
  d.department_name 부서명
  from employees e,departments d
  where e.department_id=d.department_id
  and mod(e.employee_id,10)=0;
  
--②	부서번호가 90번인 사원들의 사원번호, 직무, 부서번호, 부서명을 출력. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select 
  e.employee_id,
  e.job_id,
  e.department_id,
  d.department_name
  from employees e,departments d
  where e.department_id=d.department_id
  and d.department_id=90;

--③	커미션을 받는 사원의 사원번호, 커미션, 부서명을 출력 (커미션 NULL은 0으로 처리). TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id,
  e.commission_pct,0,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and e.commission_pct is not null;

--④	부서가 IT인 사원의 사원번호, 이름, 부서명 출력. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id,
  e.first_name,
  e.last_name,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and d.department_name='IT';

--⑤	이름에 A가 들어가는 사원들의 이름과 부서이름 출력. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.first_name,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and e.first_name like 'A%';

--⑥	사원이름, 직군코드, 직군명을 출력하세요. TABLE(EMPLOYEES, JOBS) EQUI JOIN
select
  e.first_name,
  e.job_id,
  j.job_title
from employees e,jobs j
where e.job_id=j.job_id;

--⑦	부서코드가 80보가 크고 100보다 작은 부서명, 사원번호, 부서코드를 출력 TABLE(DEPARTMENTS, EMPLOYEES) NON-EQUI JOIN
select
  d.department_name,
  e.employee_id,
  e.department_id
from employees e,departments d
where e.department_id=d.department_id
and e.department_id > 80 and e.department_id <100;

--⑧	Lex와 같은 연봉을 받는 사원의 이름과 연봉을 출력하세요. . TABLE(EMPLOYEES), SELF JOIN
select
  e2.first_name,
  e2.salary
from employees e,employees e2
where e.salary=e2.salary
and e.first_name='Lex';

--⑨	Adam과 같은 직무인 사원의 이름과 직군을 출력하세요. TABLE(EMPLOYEES), SELF JOIN
select
  e2.first_name,
  e2.job_id
from employees e,employees e2
where e.job_id=e2.job_id
and e.first_name='Adam';

--⑩	사원이름, 부서번호와 해당 사원과 같은 부서에서 근무하는 사원을 출력. TABLE(EMPLOYEES), SELF JOIN
select
  e.first_name 본인이름,
  e.department_id 본인부서코드명,
  e2.first_name 동료이름,
  e2.department_id 동료부서코드명
from employees e,employees e2
where e.department_id=e2.department_id
order by e.first_name;
