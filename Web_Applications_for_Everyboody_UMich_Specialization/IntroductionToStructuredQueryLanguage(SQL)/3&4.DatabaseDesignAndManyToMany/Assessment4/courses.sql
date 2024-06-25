DROP TABLE IF EXISTS Member;
DROP TABLE IF EXISTS `User`;
DROP TABLE IF EXISTS Course;

CREATE TABLE `User` (
    user_id     INTEGER NOT NULL AUTO_INCREMENT,
    name        VARCHAR(128) UNIQUE,
    PRIMARY KEY(user_id)
) ENGINE=InnoDB CHARACTER SET=utf8;

CREATE TABLE Course (
    course_id     INTEGER NOT NULL AUTO_INCREMENT,
    title         VARCHAR(128) UNIQUE,
    PRIMARY KEY(course_id)
) ENGINE=InnoDB CHARACTER SET=utf8;

CREATE TABLE Member (
    user_id       INTEGER,
    course_id     INTEGER,
    role          INTEGER,

    CONSTRAINT FOREIGN KEY (user_id) REFERENCES `User` (user_id)
      ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY (course_id) REFERENCES Course (course_id)
       ON DELETE CASCADE ON UPDATE CASCADE,

    PRIMARY KEY (user_id, course_id)
) ENGINE=InnoDB CHARACTER SET=utf8;


---------------------------------------------------------------
-- We can insert NULL as value and the autoincrement
-- property will put the numbers automatically
-------------------------------------------------------------

INSERT INTO user(user_id,name) VALUES (NULL, "Kalin");
INSERT INTO user(user_id,name) VALUES (NULL, "Afrina");
INSERT INTO user(user_id,name) VALUES (NULL, "Eisa");
INSERT INTO user(user_id,name) VALUES (NULL, "Katharine");
INSERT INTO user(user_id,name) VALUES (NULL, "Keilee");
INSERT INTO user(user_id,name) VALUES (NULL, "Kier");
INSERT INTO user(user_id,name) VALUES (NULL, "Aleshia");
INSERT INTO user(user_id,name) VALUES (NULL, "Gomana");
INSERT INTO user(user_id,name) VALUES (NULL, "Lily");
INSERT INTO user(user_id,name) VALUES (NULL, "Rhiannan");
INSERT INTO user(user_id,name) VALUES (NULL, "Zofia");
INSERT INTO user(user_id,name) VALUES (NULL, "Hasini");
INSERT INTO user(user_id,name) VALUES (NULL, "Hussnan");
INSERT INTO user(user_id,name) VALUES (NULL, "Orlaith");
INSERT INTO user(user_id,name) VALUES (NULL, "Riyaj");


INSERT INTO course (course_id,title) values (NULL,"si106");
INSERT INTO course (course_id,title) values (NULL,"si110");
INSERT INTO course (course_id,title) values (NULL,"si206");


INSERT INTO member (user_id,course_id,role) VALUES (1,1,1);
INSERT INTO member (user_id,course_id,role) VALUES (2,1,0);
INSERT INTO member (user_id,course_id,role) VALUES (3,1,0);
INSERT INTO member (user_id,course_id,role) VALUES (4,1,0);
INSERT INTO member (user_id,course_id,role) VALUES (5,1,0);
INSERT INTO member (user_id,course_id,role) VALUES (6,2,1);
INSERT INTO member (user_id,course_id,role) VALUES (7,2,0);
INSERT INTO member (user_id,course_id,role) VALUES (8,2,0);
INSERT INTO member (user_id,course_id,role) VALUES (9,2,0);
INSERT INTO member (user_id,course_id,role) VALUES (10,2,0);
INSERT INTO member (user_id,course_id,role) VALUES (11,3,1);
INSERT INTO member (user_id,course_id,role) VALUES (12,3,0);
INSERT INTO member (user_id,course_id,role) VALUES (13,3,0);
INSERT INTO member (user_id,course_id,role) VALUES (14,3,0);
INSERT INTO member (user_id,course_id,role) VALUES (15,3,0);


-------------------------------------------------------------------------
-- To test if the data has been entered properly we run the next command
-------------------------------------------------------------------------

SELECT `User`.name, Course.title, Member.role
    FROM `User` JOIN Member JOIN Course
    ON `User`.user_id = Member.user_id AND Member.course_id = Course.course_id
    ORDER BY Course.title, Member.role DESC, `User`.name
