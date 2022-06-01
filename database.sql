CREATE DATABASE IF NOT EXISTS shopspring_db;

CREATE USER shopspring_user@localhost IDENTIFIED BY 'codeup';
GRANT ALL ON shopspring_db.* TO shopspring_user@localhost;
