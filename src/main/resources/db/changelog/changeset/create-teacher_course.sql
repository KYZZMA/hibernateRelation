--liquibase formatted sql
--changeset Alexander:1

create table teacher_course
(
	TeacherId int references teacher(teacherid),
	CourseId int references course(courseid),
	constraint teacher_course_pk primary key(TeacherId, CourseId)
)

--changeset Alexander:4
insert into teacher_course(TeacherId, CourseId)
values (1, 1),
(1, 3),
(2, 2),
(2, 4),
(3, 2),
(3, 5);