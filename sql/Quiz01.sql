SELECT employee_id "�����ȣ" ,
       last_name "�̸�",
       job_id "����"
  FROM EMPLOYEES;

SELECT department_id "�μ�#",
       last_name "�̸�2",
       NVL(manager_id,0) "������#"
  FROM EMPLOYEES;

SELECT first_name || '�� �޿��� ' || salary || '�Դϴ�.' AS "����� �޿�"
  FROM EMPLOYEES;
--where��
--�񱳿����� : =,>,>=,<,<=,<>(!=�Ͱ�����)

SELECT *
  FROM EMPLOYEES
 WHERE department_id=90;

SELECT employee_id "�����ȣ",
       salary "����"
  FROM EMPLOYEES
 WHERE department_id=90;

SELECT employee_id "�����ȣ" ,
       first_name "�̸�1" ,
       last_name "�̸�2" ,
       salary "����"
  FROM EMPLOYEES
 WHERE salary >=3500;

SELECT first_name ,
       last_name
  FROM EMPLOYEES;


