INSERT INTO student (NAME_STUDENT)
VALUES ('Саша'),
       ('Дима'),
       ('Паша'),
       ('Коля');

INSERT INTO course (NAME_COURSE)
VALUES ('мат. анализ'),
       ('экономика'),
       ('информатика');

INSERT INTO student_course (student_id, course_id)
VALUES (1,1),
       (1,2),
       (2,2),
       (2,3),
       (3,3),
       (4,1);
