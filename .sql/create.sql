create table courses(
    id BIGINT auto_increment primary key,
    name varchar(100) not null,
    description varchar(1000),
    teacher_firstname varchar(100) not null,
    teacher_lastname varchar(100) not null,
    date DATE
);

create table lessons (
    id BIGINT auto_increment primary key,
    description varchar(1000),
    date DATE,
    course_id bigint,
    foreign key (course_id) references courses(id)
);

create table students (
    id bigint auto_increment primary key,
    firstname varchar(100) not null,
    lastname varchar(100) not null,
    email varchar(100) not null  
);

create table courses_students (
    course_id bigint,
    student_id bigint,
    foreign key (course_id) references courses(id),
    foreign key (student_id) references students(id)
);