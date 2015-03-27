SELECT first_name AS NAME,salary money FROM EMPLOYEES WHERE department_id=60;

--②	employees 테이블에서 급여(salary)가 5,000이상인 사원의 이름1, 연봉 출력.

SELECT first_name,salary FROM EMPLOYEES WHERE salary>=5000;

--③	employees 테이블에서 Diana(first_name)인 사원의 사원번호, 이름1 출력
SELECT employee_id,first_name FROM EMPLOYEES WHERE first_name='Diana';

--④	between 연산자를 사용하여 employees 테이블에서 급여가 
--5,000 ~ 10,000인 사원의 사원번호, 이름1, 급여 출력.
select employee_id,first_name,salary from employees where salary between 5000 and 10000;

--⑤	in연산자를 사용하여 employees 테이블에서 90번부서와 60번부서에 
--근무하는 사원의 이름1, 부서번호 출력.
select first_name,department_id from employees where department_id in (90,60);

--⑥	employees 테이블에서 부서번호 50번 중 급여가 5,000 이하인 
--사원의 이름1, 급여, 부서번호 출력. (and 연산자)
select first_name,salary,department_id from employees where department_id=50 and salary<=5000;
--⑦	employees 테이블에서 부서번호가 50번 이거나 급여가 7,000이상인 사원의 
--이름1, 급여, 부서번호 출력. (or 연산자)
select first_name,salary,department_id from employees where department_id=50 or salary>=7000;
--⑧	employees 테이블에서 이름1(first_name)을 조회하여 첫 글자가 H~J를 포함한 
--사원이름을 내림차순 출력. (Between ~ and, %연산자)
select first_name 
from employees 
where first_name like 'H%' or first_name like 'I%' or first_name like 'J' 
order by first_name desc;

select first_name
from employees
where first_name  between 'H%' and 'K%' order by first_name desc;

--①	employees 테이블의 email 필드를 아래와 같이 출력
select lower(email) from employees;

--②	employees 테이블의 이름2(last_name) 필드를 아래와 같이 출력
select upper(last_name) from EMPLOYEES;

--③	employees 테이블의 직무 필드를 아래와 같이 출력
select initcap(job_id) from employees;

--④	SQL문은 대소문자를 구별하지 않지만 테이블에 저장된 데이터는 대소문자를 구분한다. 
--그런데 만약 SMITH (last_name)라는 사람을 검색하고 싶은데 대문자로 저장이 되어 있는지 소문자로 저장이 되어 있는지 
--알 수 없는 경우가 있다. 이 경우 지금 배운 문자 함수를 활용하여 검색. 
--(lower, upper, initcap) 함수 모두 사용해서 3가지 방법으로 검색

select * from employees where lower(last_name)='smith' or upper(last_name)='smith' or initcap(last_name)='smith';

--⑤	employees 테이블의 이름1(first_name) 필드를 아래와 같이 출력 (총 10byte로 출력하되, 빈자리는 1234567890)
select lpad(first_name,10,'1234567890') from employees;

--⑥	employees 테이블의 이름1(first_name) 필드를 아래와 같이 출력 (총 10byte로 출력하되, 빈자리는 **********)
select rpad(first_name,10,'*') from employees;

--⑦	employees 테이블에서 email의 r의 위치를 찾아서 출력 (insrt, upper 함수)
select email , instr(email,upper('r')) r의위치 from employees;

--⑧	employees 테이블에서 이름2(last_name)의 세 번째 자리가 R인 직원 출력 (sub 함수)
select last_name from employees where upper(subStr(last_name,3,1))='R';

--⑨	employees 테이블에서 이름2(last_name)의 끝자리가 N으로 끝나는 직원의 필드 모두 출력. (sub 함수)
select * from employees where upper(substr(last_name,-1,1)) ='N';

--⑩	employees 테이블에서 이름1(first_name), 전화번호, 지역번호를 출력. 단 지역번호는 아래와 같이 (sub 함수)
select first_name 이름1,phone_number 전화번호,substr(phone_number,1,3) 지역번호 from employees;

--employees 테이블에서 이름1(first_name)의 ‘a’ 문자를 포함한 사원을 검색 한 후, ‘#’으로 치환
select first_name ,replace(first_name,'a','#') from employees where first_name like 'A%' or first_name like '%a' or first_name like '%a%';

--①	1993년 01월01일 이전에 입사한 직원들의 사번, 성, 이름, 입사일, 급여, 커미션을 출력.
--처리조건) 입사일은 1991/12/27로 표기, 커미션이 없는 경우 0으로 출력, 급여가 많은 순으로 정렬
select employee_id 사번,
        last_name 이름1,
        first_name 이름2,
        to_char(hire_date,'YYYY/MM/dd') 입사일,
        to_char(salary,'$99,999') 급여,
        to_char(nvl(commission_pct,'0'),'$0') 커미션
from employees
where to_char(hire_date,'YYYY') < 1993 order by salary desc;