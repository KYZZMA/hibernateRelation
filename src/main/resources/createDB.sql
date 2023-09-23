
create table students
(
	StudentID int primary key,
	NAME_STUDENT varchar(128) not null
)

-- Заполним таблицу Employee данными.
insert into students(StudentID, NAME_STUDENT) values (1, N'John Smith')
insert into students(StudentID, NAME_STUDENT) values (2, N'Hilary White')
insert into students(StudentID, NAME_STUDENT) values (3, N'Emily Brown')


create table courses
(
	CourseID int primary key,
	NAME_COURSE varchar(128) not null
)

-- Заполним таблицу Position данными.
insert into courses(CourseID, NAME_COURSE) values(1, N'матанализ')
insert into courses(CourseID, NAME_COURSE) values(2, N'экономика')
insert into courses(CourseID, NAME_COURSE) values(3, N'информатика')


-- Заполним таблицу EmployeesPositions данными.
create table LIST_STUDENT_ON_COURSE
(
	StudentID int foreign key references student(StudentID),
	CourseID int foreign key references course(CourseID),
	primary key(PositionId, EmployeeId)
)

insert into LIST_STUDENT_ON_COURSE(StudentID, CourseID) values (1, 1)
insert into LIST_STUDENT_ON_COURSE(StudentID, CourseID) values (1, 2)
insert into LIST_STUDENT_ON_COURSE(StudentID, CourseID) values (2, 3)
insert into LIST_STUDENT_ON_COURSE(StudentID, CourseID) values (3, 3)
