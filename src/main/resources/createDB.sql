create table student
(
	StudentId int primary key,
	StudentName varchar not null
)

insert into student(StudentId,StudentName) values (1,'Саша')
insert into student(StudentId,StudentName) values (2,'Дима')
insert into student(StudentId,StudentName) values (3,'Паша')
insert into student(StudentId,StudentName) values (4,'Маша')
insert into student(StudentId,StudentName) values (5,'Коля')
insert into student(StudentId,StudentName) values (6,'Володя')
insert into student(StudentId,StudentName) values (7,'Сергей')

create table teacher
(
	TeacherId int primary key,
	TeacherName varchar not null
)

insert into teacher(TeacherId,TeacherName) values (1,'Александр Олегович')
insert into teacher(TeacherId,TeacherName) values (2,'Дмитрий Николаевич')
insert into teacher(TeacherId,TeacherName) values (3,'Светлана Николаевна')

create table course
(
	CourseId int primary key,
	CourseName varchar not null
)

insert into course(CourseId,CourseName) values (1,'мат. анализ')
insert into course(CourseId,CourseName) values (2,'информатика')
insert into course(CourseId,CourseName) values (3,'тервер')
insert into course(CourseId,CourseName) values (4,'английский')
insert into course(CourseId,CourseName) values (5,'история')


create table course_student
(
	CourseId int references course(CourseId),
	StudentId int references student(StudentId),
	constraint course_student_pk primary key(CourseId, StudentId)
)

insert into course_student(CourseId, StudentId) values (1, 1)
insert into course_student(CourseId, StudentId) values (2, 1)
insert into course_student(CourseId, StudentId) values (1, 2)
insert into course_student(CourseId, StudentId) values (3, 2)
insert into course_student(CourseId, StudentId) values (3, 3)
insert into course_student(CourseId, StudentId) values (4, 4)
insert into course_student(CourseId, StudentId) values (1, 5)
insert into course_student(CourseId, StudentId) values (5, 5)
insert into course_student(CourseId, StudentId) values (3, 6)
insert into course_student(CourseId, StudentId) values (2, 7)


create table teacher_course
(
	TeacherId int references teacher(TeacherId),
	CourseId int references course(CourseId),
	constraint teacher_course_pk primary key(TeacherId, CourseId)
)

insert into teacher_course(TeacherId, CourseId) values (1, 1)
insert into teacher_course(TeacherId, CourseId) values (1, 3)
insert into teacher_course(TeacherId, CourseId) values (2, 2)
insert into teacher_course(TeacherId, CourseId) values (2, 4)
insert into teacher_course(TeacherId, CourseId) values (3, 2)
insert into teacher_course(TeacherId, CourseId) values (3, 5)

