
DROP DATABASE juevoJavaCRUD;
CREATE DATABASE IF NOT EXISTS juevoJavaCRUD;

USE juevoJavaCRUD;
CREATE TABLE IF NOT EXISTS gender(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS country(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS region(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    idcountry INT NOT NULL,
    Foreign Key (idcountry) REFERENCES country(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS city(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    idregion INT NOT NULL,
    Foreign Key (idregion) REFERENCES region(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS stack(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS skill(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);


CREATE TABLE IF NOT EXISTS stack_skill(
  idskill INT NOT NULL,
  idstack INT NOT NULL,
  idstatus INT NOT NULL,
  Foreign Key (idskill) REFERENCES skill(id) ON DELETE CASCADE,
  Foreign Key (idstack) REFERENCES stack(id)  ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS persons(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    idcity INT NOT NULL,
    address VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100),
    idgender INT
);


CREATE TABLE IF NOT EXISTS persons_skill(
    id INT PRIMARY KEY AUTO_INCREMENT,
    registration_date date NOT NULL,
    idperson INT NOT NULL,
    idskill INT NOT NULL,
    Foreign Key (idperson) REFERENCES persons(id) ON DELETE CASCADE,
    Foreign Key (idskill) REFERENCES skill(id)ON DELETE CASCADE
);