CREATE TABLE Curators(
    id SERIAL not null,
    name varchar(501) not null check ( name != '' ),
    surname varchar(501) not null check ( surname != '' ),
    primary key (id)
);

CREATE TABLE Faculties(
  id SERIAL not null primary key,
  financing money not null  default '0.0',
  name varchar(100) unique,
  check ( financing >= '0.0' AND name != '')
);

CREATE TABLE Subjects(
    id SERIAL not null,
    name varchar(100) not null unique,
    check ( name != '' ),
    primary key (id)
);

CREATE TABLE Teachers(
    id SERIAL not null,
    name varchar(501) not null,
    salary money not null,
    surname varchar(501) not null,
    check ( name != '' AND salary > '0.0' AND surname != ''),
    primary key (id)
);

CREATE TABLE Departments(
    id SERIAL not null,
    finansing money not null default '0.0',
    name varchar(100) not null unique,
    faculty_id int not null,
    foreign key (faculty_id) references Faculties (id),
    check ( finansing >= '0.0' AND name != ''),
    primary key (id)
);

CREATE TABLE Lectures(
    id SERIAL not null,
    lectureRoom varchar(501) not null,
    subject_id INT not null,
    teacher_Id INT not null,
    foreign key (subject_id) REFERENCES Subjects (id),
    foreign key (teacher_Id) REFERENCES Teachers (id),
    check ( lectureRoom != '' ),
    primary key (id)
);

CREATE TABLE Groups(
    id SERIAL not null,
    name varchar(10) not null unique,
    year int not null,
    department_id int not null,
    foreign key (department_id) references Departments (id),
    check ( name != '' AND year > 0 AND year < 6),
    primary key (id)
);

CREATE TABLE GroupsLectures(
    id SERIAL not null,
    group_id int not null,
    lecture_id int not null,
    foreign key (lecture_id) REFERENCES Lectures (id),
    foreign key (group_id) REFERENCES Groups (id),
    primary key (id)
);

CREATE TABLE GroupsCurators(
    id SERIAL not null,
    curator_id int not null,
    group_id int not null,
    foreign key (group_id) REFERENCES Groups (id),
    foreign key (curator_id) REFERENCES Curators (id),
    primary key (id)
);