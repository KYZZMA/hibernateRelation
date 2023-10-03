//все
select teacher.teacherName, course.coursename, course_student.courseid, student.studentname, course_student.studentid
from teacher
 join teacher_course on teacher_course.teacherid = teacher.teacherid
 join course on teacher_course.courseid = course.courseid
 join course_student on course_student.courseid = course.courseid
 join student on course_student.studentid = student.studentid

 //подсчет кол-ва студентов в группах
select teacher.teacherName, course.coursename, COUNT(course_student.courseid) as studentCount
from teacher
 join teacher_course on teacher_course.teacherid = teacher.teacherid
 join course on teacher_course.courseid = course.courseid
 join course_student on course_student.courseid = course.courseid
 join student on student.studentid = course_student.studentid
 GROUP BY  teacher.teacherName,course.coursename;


//вывести группы и количество в них учеников которые ходят только в эти группы
//(вопрос: что если один ученик ходит на один предмет, но учетеля в нем разные)

//решение верное
select course.coursename, count(course_student.courseid) as studentcount
from course_student
join course on course_student.courseid = course.courseid
where course_student.studentid in
(
	select course_student.studentid
from course_student
group by course_student.studentid
HAVING COUNT(course_student.studentid)=1

)
GROUP BY course.coursename

