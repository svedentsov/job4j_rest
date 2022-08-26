CREATE TABLE IF NOT EXISTS person (
    id       SERIAL PRIMARY KEY NOT NULL,
    login    VARCHAR(2000),
    password VARCHAR(2000)
);

INSERT INTO person (login, password) VALUES ('login1', 'password1');
INSERT INTO person (login, password) VALUES ('login2', 'password2');
INSERT INTO person (login, password) VALUES ('login3', 'password3');