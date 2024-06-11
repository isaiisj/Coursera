CREATE TABLE Ages ( 
  `name` VARCHAR(128), 
  age INTEGER
);

DELETE FROM Ages;
INSERT INTO Ages (`name`, age) VALUES ('Lillia', 22);
INSERT INTO Ages (`name`, age) VALUES ('Arfa', 24);
INSERT INTO Ages (`name`, age) VALUES ('Raphaela', 20);
INSERT INTO Ages (`name`, age) VALUES ('Asif', 23);

SELECT sha1(CONCAT(`name`,age)) AS X FROM Ages ORDER BY X;
