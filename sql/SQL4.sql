SELECT first_name AS NAME,salary money FROM EMPLOYEES WHERE department_id=60;

--��	employees ���̺��� �޿�(salary)�� 5,000�̻��� ����� �̸�1, ���� ���.

SELECT first_name,salary FROM EMPLOYEES WHERE salary>=5000;

--��	employees ���̺��� Diana(first_name)�� ����� �����ȣ, �̸�1 ���
SELECT employee_id,first_name FROM EMPLOYEES WHERE first_name='Diana';