CREATE TABLE migration_example
(
    position   SERIAL PRIMARY KEY,
    column_1   TEXT UNIQUE  NOT NULL,
    column_2   VARCHAR(50)         NOT NULL
);