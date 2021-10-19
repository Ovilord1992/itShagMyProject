-- 1 Вывести все возможные пары строк преподавателей и групп
SELECT teachers.name teachers_name,
       surname       teachers_surname,
       g3.name       group_name
from teachers
         JOIN lectures g on teachers.id = g.teacher_id
         JOIN groupslectures g2 on g.id = g2.lecture_id
         JOIN groups g3 on g2.group_id = g3.id;
-- 2 Вывести названия факультетов, фонд финансирования
-- кафедр которых превышает фонд финансирования факультета.
SELECT faculties.name      faculties_name,
       faculties.financing faculties_finansing,
       d.name              department_name,
       d.finansing         department_finansing
from faculties
         JOIN departments d on faculties.id = d.faculty_id
where faculties.financing < d.finansing;
-- 3 Вывести фамилии кураторов групп и названия групп, которые они курируют.
SELECT surname as curators_group,
       g2.name as group_name
from curators
         JOIN groupscurators g on curators.id = g.curator_id
         JOIN groups g2 on g2.id = g.group_id;
-- 4 Вывести имена и фамилии преподавателей, которые читают
-- лекции у группы “P107”.
SELECT teachers.name teachers_name,
       surname       teachers_surname,
       g3.name       group_name
from teachers
         JOIN lectures g on teachers.id = g.teacher_id
         JOIN groupslectures g2 on g.id = g2.lecture_id
         JOIN groups g3 on g2.group_id = g3.id
where g3.name = 'p107';
-- 5 Вывести фамилии преподавателей и названия факультетов
-- на которых они читают лекции.
SELECT teachers.name    teachers_name,
       teachers.surname teachers_surname,
       f.name           facultet_name
from teachers
         JOIN lectures l on teachers.id = l.teacher_id
         JOIN groupslectures g on l.id = g.lecture_id
         JOIN groups g2 on g2.id = g.group_id
         JOIN departments d on d.id = g2.department_id
         JOIN faculties f on f.id = d.faculty_id;
-- 6 Вывести названия кафедр и названия групп, которые к
-- ним относятся.
SELECT groups.name groups_name,
       d.name      departments_name
from groups
         JOIN departments d on d.id = groups.department_id;
-- 7 Вывести названия дисциплин, которые читает преподаватель “Samantha Adams”.
SELECT subjects.name subject,
       t.name        teacher_name,
       t.surname     teacher_surname
from subjects
         JOIN lectures l on subjects.id = l.subject_id
         JOIN teachers t on t.id = l.teacher_id
where t.name = 'Samantha'
  AND t.surname = 'Adams';
-- 8 Вывести названия кафедр, на которых читается дисциплина
-- “Database Theory”.
SELECT departments.name department_name,
       s.name           subject_name
from departments
         JOIN groups g on departments.id = g.department_id
         JOIN groupslectures g2 on g.id = g2.group_id
         JOIN lectures l on l.id = g2.lecture_id
         JOIN subjects s on s.id = l.subject_id
where s.name = 'Database Theory';
-- 9 Вывести названия групп, которые относятся к факультету
-- “Computer Science”.
SELECT groups.name groups_name,
       f.name      faculties_name
from groups
         JOIN departments d on d.id = groups.department_id
         JOIN faculties f on f.id = d.faculty_id
where f.name = 'Computer Science';
-- 10 Вывести названия групп 5-го курса, а также название факультетов, к которым они относятся.
SELECT groups.name groups_name,
       groups.year group_curse,
       f.name      facultet_name
from groups
         JOIN departments d on d.id = groups.department_id
         JOIN faculties f on f.id = d.faculty_id
where groups.year = 5;
-- 11 Вывести полные имена преподавателей и лекции, которые
-- они читают (названия дисциплин и групп), причем отобрать
-- только те лекции, которые читаются в аудитории “B103”.
SELECT teachers.name || ' ' || teachers.surname full_name,
       g2.name                                  group_name,
       s.name                                   subject_name,
       l.lectureroom                            lecture_room
from teachers
         JOIN lectures l on teachers.id = l.teacher_id
         JOIN groupslectures g on l.id = g.lecture_id
         JOIN groups g2 on g2.id = g.group_id
         JOIN subjects s on s.id = l.subject_id
where l.lectureroom = 'B103';