SELECT first_name AS NAME,salary money FROM EMPLOYEES WHERE department_id=60;

--②	employees 테이블에서 급여(salary)가 5,000이상인 사원의 이름1, 연봉 출력.

SELECT first_name,salary FROM EMPLOYEES WHERE salary>=5000;

--③	employees 테이블에서 Diana(first_name)인 사원의 사원번호, 이름1 출력
SELECT employee_id,first_name FROM EMPLOYEES WHERE first_name='Diana';