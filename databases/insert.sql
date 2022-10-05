CREATE TABLE Students
(
studentId int not null,
studentLastName varchar(255),
studentFirstName varchar(255),
studentEnrollment varchar(255),
Age int,
    CHECK (Age>=18)
);

INSERT INTO Students
VALUES (1, 'Zafar', 'Adnan', 'Fall 2023', 22);

INSERT INTO Students
VALUES (2, 'Doe', 'John', 'Spring 2023', 18);

SELECT DISTINCT studentEnrollment
FROM Students;

SELECT studentFirstName
FROM Students
WHERE studentFirstName like  'A%';

DROP TABLE Students;

