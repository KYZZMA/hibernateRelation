INSERT INTO student (NAME_STUDENT)
VALUES ('Саша'),
       ('Дима'),
       ('Паша'),
       ('Коля');

INSERT INTO course (name_course, teacher_id)
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


INSERT INTO teacher (name_teacher)
VALUES ('Александр Олкгович'),
       ('Дмитрий Николаевич'),
       ('Светлана Николаевна');

insert into student ("id",teacher_id)
values (1,1);

UPDATE student
SET teacher_id = 2
WHERE "id" = 1

INSERT INTO student_course (student_id, course_id)
VALUES (1,6),
       (1,7),
       (2,8),
       (2,6),
       (3,9),
       (4,10);

DELETE FROM student WHERE "id" = 5
