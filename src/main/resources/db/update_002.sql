CREATE TABLE IF NOT EXISTS employee (
    id       SERIAL PRIMARY KEY          NOT NULL,
    name     VARCHAR(2000)               NOT NULL,
    lastname VARCHAR(2000)               NOT NULL,
    inn      VARCHAR(100)                NOT NULL,
    created  TIMESTAMP without TIME ZONE NOT NULL DEFAULT now()
);

ALTER TABLE person ADD COLUMN employee_id INT NOT NULL DEFAULT 0;

INSERT INTO employee (name, lastname, inn) VALUES ('name1', 'lastname1', 100);
INSERT INTO employee (name, lastname, inn) VALUES ('name2', 'lastname2', 200);

UPDATE person set employee_id = 1 WHERE id = 1;
UPDATE person set employee_id = 2 WHERE id = 2;
UPDATE person set employee_id = 2 WHERE id = 3;