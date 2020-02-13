CREATE TABLE student (
stu_id INT PRIMARY KEY NOT NULL,
NAME VARCHAR(50)
);

CREATE TABLE marks (
mark INT PRIMARY KEY NOT NULL,
stu_id INT,
CONSTRAINT stu_id FOREIGN KEY (stu_id) REFERENCES student (stu_id)
);

INSERT INTO student (stu_id, name) VALUES 
(001, 'Lucy'),
(002, 'Linda'),
(003, 'Max'),
(004, 'Paul');

INSERT INTO marks (mark, stu_id) VALUE 
(81, 001),
(79, 002),
(80, 003),
(78, 004);


SELECT stu_id FROM marks WHERE mark < 81;

SELECT mark FROM marks WHERE stu_id = (SELECT stu_id FROM marks WHERE NAME ='Max'); <!-- wrong -->

SELECT mark FROM marks WHERE stu_id = (SELECT stu_id FROM student WHERE NAME = 'Max'); 

SELECT stu_id FROM marks WHERE mark > (SELECT mark FROM marks WHERE stu_id = 004);



SELECT stu_id FROM student WHERE NAME = 'Max'; 

SELECT mark FROM marks WHERE stu_id = (SELECT stu_id FROM student WHERE NAME = 'Max'); 

SELECT mark FROM marks WHERE mark > 
(SELECT mark FROM marks WHERE stu_id = 
(SELECT stu_id FROM student WHERE NAME = 'Max')); 

SELECT mark, name FROM marks JOIN student USING(stu_id) WHERE mark > 
(SELECT mark FROM marks WHERE stu_id = 
(SELECT stu_id FROM student WHERE NAME = 'Max')); 

INSERT INTO student (NAME, stu_id) VALUES ('Max', 005); 
INSERT INTO marks (mark) VALUES (82);

-- these two statements are the same result --
SELECT mark FROM marks JOIN student USING(stu_id) WHERE NAME='Max';
SELECT mark FROM marks WHERE stu_id = (SELECT stu_id FROM student WHERE NAME = 'Max'); 
--                                          --

SELECT mark, name FROM marks JOIN student USING(stu_id) WHERE mark > 
(SELECT mark FROM marks WHERE stu_id = 
(SELECT stu_id FROM student WHERE NAME = 'Max')); 

SELECT mark FROM marks WHERE mark > 
(SELECT mark, name FROM marks JOIN student USING(stu_id) WHERE NAME = 'Max');

SELECT stu_id FROM marks WHERE mark > 
(SELECT mark FROM marks WHERE stu_id = 
(SELECT stu_id FROM student WHERE NAME = 'Max')); 

SELECT stu_id FROM student WHERE stu_id IN (1,5);

INSERT INTO student (stu_id) VALUE (005);

SELECT stu_id FROM student WHERE stu_id IN 
(SELECT stu_id FROM marks WHERE mark > 
(SELECT mark FROM marks JOIN student USING (stu_id) WHERE NAME = 'Max'))
AND NAME IS NOT NULL;

UPDATE marks SET mark = 324 WHERE (SELECT stu_id FROM marks WHERE stu_id = 2); 


ALTER TABLE marks DROP PRIMARY KEY;
ALTER TABLE student DROP PRIMARY KEY;

ALTER TABLE marks ADD PRIMARY KEY (mark);
ALTER TABLE student ADD PRIMARY KEY (stu_id);

ALTER TABLE marks ADD CONSTRAINT FOREIGN KEY (stu_id) REFERENCES student(stu_id);

SELECT * FROM marks;
SELECT * FROM student;

-- Using JOIN to see which student has not been graded yet --
SELECT * FROM student LEFT JOIN marks USING(stu_id); -- This one is the one we are looking for --
SELECT * FROM student RIGHT JOIN marks USING(stu_id);

INSERT INTO student (stu_id) VALUES (5);
INSERT INTO marks (stu_id, mark) VALUES (5, 88);

SELECT stu_id, mark FROM student LEFT JOIN marks USING(stu_id);
SELECT stu_id, mark FROM student LEFT JOIN marks USING(stu_id) WHERE mark IS NULL;

SELECT * FROM student RIGHT JOIN marks ON student.stu_id = marks.stu_id
UNION 
SELECT * FROM student LEFT JOIN marks ON student.stu_id = marks.stu_id;

INSERT INTO marks (stu_id, mark) VALUES (4, 45);
