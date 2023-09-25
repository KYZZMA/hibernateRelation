INSERT INTO student (NAME_STUDENT)
VALUES ('Миша');
VALUES ('Саша'),
       ('Дима'),
       ('Паша'),
       ('Коля');

INSERT INTO course (name_course, teacher_id)
VALUES ('тервер',1);
VALUES ('история',1),
       ('мат. анализ',2),
       ('экономика',2),
       ('экономика',3),
       ('информатика',3);

update course
set teacher_id = 3
where "id" = 3

INSERT INTO course (course,teacher_id)
VALUES (1,1),
       (2,2),
       (3,3);

INSERT INTO teacher_course (teacher_id,course_id)
VALUES (1,11);
VALUES (1,6),
       (2,7),
       (2,8),
       (3,9),
       (3,10);


INSERT INTO teacher (name_teacher)
VALUES ('Александр Олкгович'),
       ('Дмитрий Николаевич'),
       ('Светлана Николаевна');

insert into student ("id",teacher_id)
values (1,1);

UPDATE student_course
SET course_id = 8
WHERE "id" = 17

INSERT INTO student_course (student_id, course_id)
VALUES (8,11);
VALUES (1,6),
       (1,7),
       (2,8),
       (2,6),
       (3,9),
       (4,10);
INSERT INTO teacher_student (student_id, teacher_id)
VALUES (8,1);
VALUES (1,1),
       (1,2),
       (2,1),
       (2,2),
       (3,3),
       (4,3);

DELETE FROM student WHERE "id" = 5


select student_id, count(student_id)
 from student_course
     group by student_id

select student_id from student_course GROUP BY student_id HAVING COUNT(student_id)=1

 select student_id, course_id, count(student_id)
 from student_course
     group by student_id, course_id
     having count(student_id) = 1;

select student_id, count(student_id)
from teacher_student
     group by student_id
     having count(student_id) = 1;

