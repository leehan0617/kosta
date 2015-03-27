SELECT employee_id "사원번호" ,
       last_name "이름",
       job_id "직업"
  FROM EMPLOYEES;

SELECT department_id "부서#",
       last_name "이름2",
       NVL(manager_id,0) "관리자#"
  FROM EMPLOYEES;

SELECT first_name || '의 급여는 ' || salary || '입니다.' AS "사원의 급여"
  FROM EMPLOYEES;
--where절
--비교연산자 : =,>,>=,<,<=,<>(!=와같은뜻)

SELECT *
  FROM EMPLOYEES
 WHERE department_id=90;

SELECT employee_id "사원번호",
       salary "연봉"
  FROM EMPLOYEES
 WHERE department_id=90;

SELECT employee_id "사원번호" ,
       first_name "이름1" ,
       last_name "이름2" ,
       salary "연봉"
  FROM EMPLOYEES
 WHERE salary >=3500;

SELECT first_name ,
       last_name
  FROM EMPLOYEES;


