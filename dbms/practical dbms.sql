create table p
(pno char(3),
pname varchar(10),
color varchar(10),
weight float(10),
pcity varchar(10),
primary key(pno));


select *from p;

insert into p values("1","pallavi","red","32","baradiya");
insert into p values("2","sriya","white","33","ahemdabad");
insert into p values("3","palu","yellow","34","junagadh");
insert into p values("4","tanvi","orange","35","rajkot");

create table s
(sno char(3),
sname varchar(10),
status varchar(10),
city varchar(10),
primary key(sno));

select *from s;

insert into s values("1","abc","11","surat");
insert into s values("2","bcd","22","junagadh");
insert into s values("3","cde","33","morbi");
insert into s values("4","efg","44","mumbai");

create table sp
(sno char(3),
 pno char(10),
qty char(10),
primary key(sno,pno),
foreign key(sno) references s(sno),
foreign key(pno) references p(pno));

select * from sp;
insert into sp values("1","1","200");
insert into sp values("2","2","110");
insert into sp values("3","3","100");
insert into sp values("4","4","20");
insert into sp values("5","5","10");



create table dept
(dept_id int primary key,
 dept_name varchar(10) not null,
dept_location varchar(50) not null);

select *from dept;

insert into dept values("1","aaa","bbb");
insert into dept values("2","bbb","ccc");
insert into dept values("3","ccc","ddd");
insert into dept values("4","ddd","eee");

create table emp
(emp_id int primary key,
 emp_name varchar(35) not null,
 emp_dept_id int(10) not null,
emp_boss_id int(10) not null,
emp_salary int(20)  not null,
foreign key(emp_dept_id) references dept(dept_id));

select *from emp;

insert into emp values("1","gopi","2","3","10000");
insert into emp values("2","happy","1","301","20000");
insert into emp values("3","sriyan","3","302","1000");
insert into emp values("4","mayuri","4","303","10000");
 

select * from p where pcity="surat";

select *from p where weight=(select max(weight)from p);

select pname,pno from p where color="orange";

select sname,city from s,sp where s.sno=sp.sno and sp.qty>200;

select DISTINCT sname,city from s,sp where s.sno=sp.sno and sp.qty>200;

select max(weight) from p where weight<(select max(weight)from p);

select DISTINCT weight from p ORDER BY weight DESC limit 1,1;

select sp.sno,sp.qty from sp,p where sp.pno=p.pno and p.weight=(select max(weight)from p);

select s.sname,sp.qty from  sp,p,s where p.color="orange" and sp.pno=p.pno and sp.sno=s.sno;

select s.sname,p.pcity,sp.qty from sp,p,s where sp.pno=p.pno and sp.sno=s.sno and s.status<30;

select s.sname,sum(sp.qty) from sp,s where sp.sno=s.sno group by sp.sno;

select sp.pno,p.pname,sum(sp.qty) from sp,p where sp.pno=p.pno group by p.pno;

select p.pname,sum(sp.qty) from sp,p where sp.pno=p.pno group by p.pname;

select s.sname,s.sno,sum(sp.qty) from sp,s where sp.sno=s.sno group by sp.sno having sp.sno<"s4";

select s.sname,s.sno,sum(sp.qty)from sp,s where sp.sno=s.sno and s.status=20 group by sp.sno;




lock tables p write;
lock tables s write;

show full processlist;
unlock table;


create table account
(acc_no int(10) primary key,
 amount decimal(10,2));

select *from account;

insert into account values(1,"10000");
insert into account values(2,"20000");
insert into account values(3,"30000");
insert into account values(4,"40000");

select dept_name AS 'Department Name',
 count(*) AS 'no of employees'
from dept
INNER JOIN emp
ON emp.emp_dept_id=dept.dept_id
GROUP BY dept.dept_id,dept_name
order by dept_name;

select
	d.dept_name,
	max(e.emp_salary)
from
	dept d
	inner join emp e on d.dept_id=e.emp_dept_id
group by
	d.dept_id;

select emp.emp_name,dept.dept_name,bossemp.emp_name as "boss name",
bossdept.dept_name as "boss department" from emp,dept,emp as bossemp,dept as bossdept
where emp.emp_boss_id=bossemp.emp_id and emp.emp_dept_id=dept.dept_id and bossemp.emp_dept_id=emp.emp_dept_id;


select emp.emp_name,dept.dept_name,bossemp.emp_name,bossdept.dept_name from emp,dept,emp as bossemp,dept as bossdept
where emp.emp_dept_id=dept.dept_id and emp.emp_boss_id=bossemp.emp_id and bossemp.emp_dept_id=emp.emp_dept_id and
emp.emp_salary>bossemp.emp_salary;


create trigger amt_total1
before insert
on
account
for each row
set @sum=@sum + new.amount;


create trigger cd_amt before insert on account for each row precedes amt_total1
set
$deposits=@deposits + if(new.amount>0,-new.amount,0);

set @sum=0;
set @deposits=0;
set @withdraws=0;
select @sum;
select * from account;