use juevoJavaCRUD;

-- Procedimiento para buscar persona por hibilidad
DELIMITER$$
CREATE PROCEDURE buscar_persona_habilidad( in nombre_habilidad VARCHAR(50))
BEGIN
SELECT P.id_persona AS Codec_Person, SH.name AS Habilidad
FROM persons AS P 
INNER JOIN persons_skill AS PS ON P.id = PS.id
INNER JOIN skill AS SH ON PS.id = SH.id
WHERE SH.name = nombre_habilidad;

SELECT 

END$$
DELIMITER;


--Insertar habilidad a persona(tabla muchos a muchos)
INSERT into skill (name) VALUES 
("Fuego"),
("Piedra"),
("Agua"),
("Viento"),
("Rachos Lacer Boludo");




-- Eliminar persona

-- Crear Habilidad


-- Agregar persona 

SELECT * FROM gender;
INSERT INTO persons (name,lastname,idcity,address,age,email,idgender) VALUES
(?,?,?,?,?,?, ?);


SELECT * FROM persons;
INSERT INTO persons(name,lastname,idcity,address,age,email,idgender) VALUES
("Pedro", "Gomez", 3, "Calle 40 -15",17,"nihlgomez@gmail.com",1);

INSERT into stack (name) VALUES 
("Capa"),
("Condensador de energia cuantica"),
("Muñeca inflable"),
("Rosario"),
("Canalizador de Energia");

INSERT  INTO persons_skill (registration_date, idperson,idskill) VALUES;
("2023-")


