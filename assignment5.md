**01)DATABASE SCHEMA:**

a database schema is the blueprint of a database.it defines how data is organized

i.e.

-how many tables are present

-how they are connected

-what are the columns

-data types of columns etc...



**02)ACID PROPERTIES**

**A-**atomicity

-it defines the transaction must be fully completed or none.

e.g--if we do transaction and money is debited from our account not credited to othe raccount then while transaction is rolled back.

C-consistency

-A transaction must bring the database from one valid state to another valid state, maintaining all defined rules (like constraints, triggers).

e.g--if there is check condition like >0 and if we insert -500 it would violate consistency.

I-isolation

-Transactions must execute independently of one another. Intermediate changes in a transaction should not be visible to other transactions until committed.

e,g-if two people are trying to book the last seat of the train,isolation ensures only one transaction succeeds.

D-durability

-once a transaction is committed is stored permanently even if the system crashes.

e.g--if a transaction gets succeeds and system crashes eventhough your transaction will be present.



**03)DROP,DELETE,TRUNCATE**

**drop-**drop clause is used to drop table..deletes structure and data

i.e drop table table\_name;

**delete**-delete clause is used to delete specific row using where clause.

i.e delete from table\_name where condition;

**truncate-** truncate clause will remove all data from database where as the structure will be present,

i.e truncate table table\_name



**04)will 90 and 100 be included between 90 and 100**

**ans:**yes



**05)aggregate functions and scalar functions**

**aggregate functions:**

these are the functions which takes multiple values as inputs and return single value.

i.e max(),min(),count(),sum(),avg()

**scalar functions:**

these are the functions which takes single values as input and return single value.

i.e upper(),lower(),concat(),length()



**06)where,having**

**ans;**

where and having clauses both are used for filtering the rows in the database where as where clause is used before the grouping and having clause is used after grouping

select \* from table\_name

where condition;



select department from table\_name

group by department

having condition;



**07)STORED PROCEDURES AND FUNCTIONS**

Both stored procedures and functions are reusable blocks of SQL code stored in the database, but they serve different purposes and have key differences.

**stored procedures:**

A Stored Procedure is a set of SQL statements that perform a specific task, and can return 0 or more values.

**functions:**

A Function is used to compute and return a single value. It is usually used inside SELECT or expressions.



