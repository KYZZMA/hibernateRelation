--liquibase formatted sql
--changeset Alexander:2

create table course_student
(
	CourseId int references course(courseid),
	StudentId int references student(studentid),
	constraint course_student_pk primary key(CourseId, StudentId)
)

--changeset Alexander:3
insert into course_student(CourseId, StudentId)
values (1, 1),
(2, 1),
(1, 2),
(3, 2),
(3, 3),
(4, 4),
(1, 5),
(5, 5),
(3, 6),
(2, 7);