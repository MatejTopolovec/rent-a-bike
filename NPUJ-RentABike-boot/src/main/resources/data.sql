INSERT INTO user(name, surname,username,password,enabled)
VALUES ('Adminko','Adminić','admin','$2a$10$62iyTepDsDslP/9tp6fQFOov32op4RqDOsmsOFaDVv8ZtM2fVd16C', true);
INSERT INTO user_role (username, role)
VALUES ('admin', 'ROLE_ADMIN');

INSERT INTO user(name, surname,username,password,enabled)
VALUES ('Userko','Userka','user','$2a$10$62iyTepDsDslP/9tp6fQFOov32op4RqDOsmsOFaDVv8ZtM2fVd16C', true);
INSERT INTO user_role (username, role)
VALUES ('user', 'ROLE_USER');

INSERT INTO user(name, surname ,username, password, enabled)
VALUES ('Ivo','Ivic','demo','$2a$10$62iyTepDsDslP/9tp6fQFOov32op4RqDOsmsOFaDVv8ZtM2fVd16C', true);
INSERT INTO user_role (username, role)
VALUES ('demo', 'ROLE_DEMO');

INSERT INTO logging(username, action, action_time) values ('TestUsername','Test action', '2018-05-15');

INSERT INTO type_bike(name) values('Cestovni');

INSERT INTO bike(name, dateAdded, quantity, available, typeid)
Values('Trek', '2018-05-15' , 5 , 1 , 1);

INSERT INTO bike(name, dateAdded, quantity, available, typeid)
Values('Scott', '2018-05-15' , 3 , 1 , 1);