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
INSERT INTO user(user_id,name) VALUES (NULL, "Orlaith");
INSERT INTO user(user_id,name) VALUES (NULL, "Riyaj");


INSERT INTO course (course_id,title) values (NULL,"si106");
INSERT INTO course (course_id,title) values (NULL,"si110");
INSERT INTO course (course_id,title) values (NULL,"si206");


INSERT INTO member (user_id,course_id,role) VALUES (1,1,1);
