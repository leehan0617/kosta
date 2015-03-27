SELECT first_name AS NAME,salary money FROM EMPLOYEES WHERE department_id=60;

--��	employees ���̺��� �޿�(salary)�� 5,000�̻��� ����� �̸�1, ���� ���.

SELECT first_name,salary FROM EMPLOYEES WHERE salary>=5000;

--��	employees ���̺��� Diana(first_name)�� ����� �����ȣ, �̸�1 ���
SELECT employee_id,first_name FROM EMPLOYEES WHERE first_name='Diana';

--��	between �����ڸ� ����Ͽ� employees ���̺��� �޿��� 
--5,000 ~ 10,000�� ����� �����ȣ, �̸�1, �޿� ���.
select employee_id,first_name,salary from employees where salary between 5000 and 10000;

--��	in�����ڸ� ����Ͽ� employees ���̺��� 90���μ��� 60���μ��� 
--�ٹ��ϴ� ����� �̸�1, �μ���ȣ ���.
select first_name,department_id from employees where department_id in (90,60);

--��	employees ���̺��� �μ���ȣ 50�� �� �޿��� 5,000 ������ 
--����� �̸�1, �޿�, �μ���ȣ ���. (and ������)
select first_name,salary,department_id from employees where department_id=50 and salary<=5000;
--��	employees ���̺��� �μ���ȣ�� 50�� �̰ų� �޿��� 7,000�̻��� ����� 
--�̸�1, �޿�, �μ���ȣ ���. (or ������)
select first_name,salary,department_id from employees where department_id=50 or salary>=7000;
--��	employees ���̺��� �̸�1(first_name)�� ��ȸ�Ͽ� ù ���ڰ� H~J�� ������ 
--����̸��� �������� ���. (Between ~ and, %������)
select first_name 
from employees 
where first_name like 'H%' or first_name like 'I%' or first_name like 'J' 
order by first_name desc;

select first_name
from employees
where first_name  between 'H%' and 'K%' order by first_name desc;

--��	employees ���̺��� email �ʵ带 �Ʒ��� ���� ���
select lower(email) from employees;

--��	employees ���̺��� �̸�2(last_name) �ʵ带 �Ʒ��� ���� ���
select upper(last_name) from EMPLOYEES;

--��	employees ���̺��� ���� �ʵ带 �Ʒ��� ���� ���
select initcap(job_id) from employees;

--��	SQL���� ��ҹ��ڸ� �������� ������ ���̺� ����� �����ʹ� ��ҹ��ڸ� �����Ѵ�. 
--�׷��� ���� SMITH (last_name)��� ����� �˻��ϰ� ������ �빮�ڷ� ������ �Ǿ� �ִ��� �ҹ��ڷ� ������ �Ǿ� �ִ��� 
--�� �� ���� ��찡 �ִ�. �� ��� ���� ��� ���� �Լ��� Ȱ���Ͽ� �˻�. 
--(lower, upper, initcap) �Լ� ��� ����ؼ� 3���� ������� �˻�

select * from employees where lower(last_name)='smith' or upper(last_name)='smith' or initcap(last_name)='smith';

--��	employees ���̺��� �̸�1(first_name) �ʵ带 �Ʒ��� ���� ��� (�� 10byte�� ����ϵ�, ���ڸ��� 1234567890)
select lpad(first_name,10,'1234567890') from employees;

--��	employees ���̺��� �̸�1(first_name) �ʵ带 �Ʒ��� ���� ��� (�� 10byte�� ����ϵ�, ���ڸ��� **********)
select rpad(first_name,10,'*') from employees;

--��	employees ���̺��� email�� r�� ��ġ�� ã�Ƽ� ��� (insrt, upper �Լ�)
select email , instr(email,upper('r')) r����ġ from employees;

--��	employees ���̺��� �̸�2(last_name)�� �� ��° �ڸ��� R�� ���� ��� (sub �Լ�)
select last_name from employees where upper(subStr(last_name,3,1))='R';

--��	employees ���̺��� �̸�2(last_name)�� ���ڸ��� N���� ������ ������ �ʵ� ��� ���. (sub �Լ�)
select * from employees where upper(substr(last_name,-1,1)) ='N';

--��	employees ���̺��� �̸�1(first_name), ��ȭ��ȣ, ������ȣ�� ���. �� ������ȣ�� �Ʒ��� ���� (sub �Լ�)
select first_name �̸�1,phone_number ��ȭ��ȣ,substr(phone_number,1,3) ������ȣ from employees;

--employees ���̺��� �̸�1(first_name)�� ��a�� ���ڸ� ������ ����� �˻� �� ��, ��#������ ġȯ
select first_name ,replace(first_name,'a','#') from employees where first_name like 'A%' or first_name like '%a' or first_name like '%a%';

--��	1993�� 01��01�� ������ �Ի��� �������� ���, ��, �̸�, �Ի���, �޿�, Ŀ�̼��� ���.
--ó������) �Ի����� 1991/12/27�� ǥ��, Ŀ�̼��� ���� ��� 0���� ���, �޿��� ���� ������ ����
select employee_id ���,
        last_name �̸�1,
        first_name �̸�2,
        to_char(hire_date,'YYYY/MM/dd') �Ի���,
        to_char(salary,'$99,999') �޿�,
        to_char(nvl(commission_pct,'0'),'$0') Ŀ�̼�
from employees
where to_char(hire_date,'YYYY') < 1993 order by salary desc;