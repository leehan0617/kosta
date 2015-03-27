--산술 연산자

SELECT employee_id,
       salary,
       salary+1000 plus,
       salary-1000 minuss,
       salary*2 mul,
       salary/2 div
  FROM EMPLOYEES;
--nvl(a,b) a가 null이면 b로 치환

SELECT salary,
       salary+NVL(commission_pct,0)
  FROM employees;

SELECT first_name,
       employee_id,
       manager_id,
       NVL(manager_id,0)
  FROM EMPLOYEES;
--명령어 alias

SELECT employee_id AS "사원번호"
  FROM EMPLOYEES; --특수문자나 소문자로 필드를 보고싶으면 ""붙이면됨

SELECT employee_id sawon
  FROM EMPLOYEES;

SELECT employee_id sawonNumber
  FROM EMPLOYEES;

SELECT employee_id "&^&^sa"
  FROM EMPLOYEES;
--명령어 concatenation, 합성문자

SELECT first_name,
       last_name
  FROM employees;

SELECT first_name || last_name "이름"
  FROM employees;

SELECT first_name || '(' || last_name || ')' AS "이름"
  FROM EMPLOYEES;

SELECT employee_id || '(' || nvl(manager_id,0) || '"관리자")' AS "사원번호"
  FROM EMPLOYEES;
--내장함수 DISTINCT() 중복값 제거

SELECT department_id
  FROM EMPLOYEES;

SELECT DISTINCT deplartment_id
  FROM EMPLOYEES;

SELECT job_id
  FROM EMPLOYEES;

SELECT DISTINCT job_id
  FROM EMPLOYEES;
WHERE FIRST_name = 'David'; --데이터값은 대소문자 구분한다.
--비교연산자 like,in,between and
--like _k% (2번째글자가 k) , __k%(3번째 글자가 k)

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE first_name LIKE 'K%';

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE FIRST_name LIKE '%n';

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE first_name LIKE '_h%';

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE first_name LIKE '%h%';

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE first_name LIKE '__a%';
--IN연산자

SELECT employee_id,
       salary,
       commission_pct
  FROM EMPLOYEES
 WHERE commission_pct IN (0.3,0.1,0.25) ;
--BETWEEN AND 연산자

SELECT employee_id,
       salary,
       commission_pct
  FROM EMPLOYEES
 WHERE commission_pct BETWEEN 0.1 AND 0.3;

SELECT *
  FROM EMPLOYEES;

SELECT FIRST_name,
       last_name
  FROM EMPLOYEES
 WHERE job_id IN('IT_PROG' , 'AD_VP' , 'SH_CLERK');

SELECT first_name ,
       last_name,
       salary
  FROM EMPLOYEES
 WHERE salary BETWEEN 2000 AND 5000;
--논리 연산자 and , or , not

SELECT FIRST_name,
       last_name,
       department_id
  FROM EMPLOYEES
 WHERE job_id='IT_PROG'
       AND department_id=60;

SELECT employee_id,
       salary,
       department_id
  FROM EMPLOYEES
 WHERE salary>=3000
       AND department_id=100;

SELECT department_id
  FROM EMPLOYEES
 WHERE department_id NOT IN 90;

SELECT department_id
  FROM EMPLOYEES
 WHERE department_id <> 90;

SELECT DISTINCT department_id
  FROM EMPLOYEES
 WHERE department_id !=90;

SELECT DISTINCT department_id
  FROM EMPLOYEES
 WHERE NOT department_id=90;

SELECT department_id
  FROM EMPLOYEES
 WHERE department_id NOT IN (10,90);

SELECT department_id
  FROM EMPLOYEES
 WHERE department_id<>10
       AND department_id<>90;

SELECT department_id
  FROM EMPLOYEES
 WHERE NOT department_id=10
       AND NOT department_id=90;

SELECT department_id
  FROM EMPLOYEES
 WHERE department_id!=10
       AND department_id!=90;

SELECT first_name,
       last_name
  FROM EMPLOYEES
 WHERE first_name NOT LIKE '%a%'
       OR first_Name NOT LIKE 'a%'
       OR first_name NOT LIKE '%a' ;

SELECT first_name
  FROM EMPLOYEES
 WHERE first_name NOT IN('%a%');

SELECT first_name
  FROM EMPLOYEES
 WHERE NOT
       (
           first_name LIKE '%a%'
           OR first_name LIKE 'a%'
           OR first_name LIKE '%a'
       )
       ;

SELECT employee_id,
       salary
  FROM EMPLOYEES
 WHERE NOT salary BETWEEN 500 AND 4000;

SELECT employee_id,
       salary
  FROM EMPLOYEES
 WHERE salary NOT BETWEEN 500 AND 4000;

SELECT first_name,
       commission_pct
  FROM EMPLOYEES
 WHERE commission_pct IS NULL;

SELECT first_name,
       commission_pct
  FROM EMPLOYEES
 WHERE NOT commission_pct IS NULL;

SELECT first_name,
       commission_pct
  FROM EMPLOYEES
 WHERE commission_pct IS NOT NULL;
--order by 절

SELECT first_name
  FROM EMPLOYEES
ORDER BY first_name DESC;

SELECT first_name
  FROM EMPLOYEES
ORDER BY first_name ASC;

SELECT employee_id,
       first_name,
       salary
  FROM EMPLOYEES
ORDER BY salary DESC,
       first_name desc;

SELECT employee_id,
       first_name,
       salary
  FROM EMPLOYEES
 WHERE salary>3000
       AND salary<=4000
ORDER BY first_name;

