-- create table person
-- (
--    id integer not null,
--    name varchar(255) not null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
-- );

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10001,  'Don', 'NZ',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());


insert into course_details(id, course_name ) values (101,'Math');
insert into course_details(id, course_name ) values (102,'Math 1');
insert into course_details(id, course_name ) values (103,'Math 2');
insert into course_details(id, course_name ) values (104,'Math 3');
insert into course_details(id, course_name ) values (105,'Java 4');


