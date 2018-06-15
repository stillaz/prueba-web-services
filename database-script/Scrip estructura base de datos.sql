-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 ;
USE mydb ;

-- -----------------------------------------------------
-- Table mydb.equipo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.equipo (
  Id INT NOT NULL,
  Nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (Id))


-- -----------------------------------------------------
-- Table mydb.facultad
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.facultad (
  Id INT NOT NULL AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (Id))


-- -----------------------------------------------------
-- Table mydb.investigador
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.investigador (
  Id INT NOT NULL AUTO_INCREMENT,
  Nombre VARCHAR(45) NOT NULL,
  IdFacultad INT NOT NULL,
  PRIMARY KEY (Id),
  INDEX fk_investigador_facultad_idx (IdFacultad ASC),
  CONSTRAINT fk_investigador_facultad
    FOREIGN KEY (IdFacultad)
    REFERENCES mydb.facultad (Id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)


-- -----------------------------------------------------
-- Table mydb.reserva
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.reserva (
  Id INT NOT NULL AUTO_INCREMENT,
  IdEquipo INT NOT NULL,
  IdInvestigador INT NOT NULL,
  FechaReserva DATE NOT NULL,
  FechaEntrega DATE NULL,
  PRIMARY KEY (Id),
  INDEX fk_reserva_equipo1_idx (IdEquipo ASC),
  INDEX fk_reserva_investigador1_idx (IdInvestigador ASC),
  CONSTRAINT fk_reserva_equipo1
    FOREIGN KEY (IdEquipo)
    REFERENCES mydb.equipo (Id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_reserva_investigador1
    FOREIGN KEY (IdInvestigador)
    REFERENCES mydb.investigador (Id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

