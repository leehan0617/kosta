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

--����� �̸�,�μ��ڵ�,�μ����� ��� , �μ��ڵ尡 60�� �ƴ� �μ� ���
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

--steven�� ���� �μ��� �ٹ��ϴ� �����
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
  
--��	������� �����ȣ, �μ���ȣ, �μ����� ���. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id �����ȣ,
  e.department_id �μ��ڵ�,
  d.department_name �μ���
  from employees e,departments d
  where e.department_id=d.department_id
  and mod(e.employee_id,10)=0;
  
--��	�μ���ȣ�� 90���� ������� �����ȣ, ����, �μ���ȣ, �μ����� ���. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select 
  e.employee_id,
  e.job_id,
  e.department_id,
  d.department_name
  from employees e,departments d
  where e.department_id=d.department_id
  and d.department_id=90;

--��	Ŀ�̼��� �޴� ����� �����ȣ, Ŀ�̼�, �μ����� ��� (Ŀ�̼� NULL�� 0���� ó��). TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id,
  e.commission_pct,0,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and e.commission_pct is not null;

--��	�μ��� IT�� ����� �����ȣ, �̸�, �μ��� ���. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.employee_id,
  e.first_name,
  e.last_name,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and d.department_name='IT';

--��	�̸��� A�� ���� ������� �̸��� �μ��̸� ���. TABLE(EMPLOYEES, DEPARTMENTS), EQUI JOIN
select
  e.first_name,
  d.department_name
from employees e,departments d
where e.department_id=d.department_id
and e.first_name like 'A%';

--��	����̸�, �����ڵ�, �������� ����ϼ���. TABLE(EMPLOYEES, JOBS) EQUI JOIN
select
  e.first_name,
  e.job_id,
  j.job_title
from employees e,jobs j
where e.job_id=j.job_id;

--��	�μ��ڵ尡 80���� ũ�� 100���� ���� �μ���, �����ȣ, �μ��ڵ带 ��� TABLE(DEPARTMENTS, EMPLOYEES) NON-EQUI JOIN
select
  d.department_name,
  e.employee_id,
  e.department_id
from employees e,departments d
where e.department_id=d.department_id
and e.department_id > 80 and e.department_id <100;

--��	Lex�� ���� ������ �޴� ����� �̸��� ������ ����ϼ���. . TABLE(EMPLOYEES), SELF JOIN
select
  e2.first_name,
  e2.salary
from employees e,employees e2
where e.salary=e2.salary
and e.first_name='Lex';

--��	Adam�� ���� ������ ����� �̸��� ������ ����ϼ���. TABLE(EMPLOYEES), SELF JOIN
select
  e2.first_name,
  e2.job_id
from employees e,employees e2
where e.job_id=e2.job_id
and e.first_name='Adam';

--��	����̸�, �μ���ȣ�� �ش� ����� ���� �μ����� �ٹ��ϴ� ����� ���. TABLE(EMPLOYEES), SELF JOIN
select
  e.first_name �����̸�,
  e.department_id ���κμ��ڵ��,
  e2.first_name �����̸�,
  e2.department_id ����μ��ڵ��
from employees e,employees e2
where e.department_id=e2.department_id
order by e.first_name;
