CREATE DATABASE  IF NOT EXISTS `db_tecnicoservicio` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_tecnicoservicio`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: db_tecnicoservicio
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tecnicos_lista`
--

DROP TABLE IF EXISTS `tecnicos_lista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tecnicos_lista` (
  `ID_Tecnico` int NOT NULL,
  `Tecnico_Nombre` varchar(50) NOT NULL,
  `Tecnico_Nivelservicio` int NOT NULL,
  `Tecnico_NumC` int DEFAULT NULL,
  PRIMARY KEY (`ID_Tecnico`),
  KEY `Tecnico_Nivelservicio_fk` (`Tecnico_Nivelservicio`),
  CONSTRAINT `Tecnico_Nivelservicio_fk` FOREIGN KEY (`Tecnico_Nivelservicio`) REFERENCES `nivel de servicio` (`ID_Nivel_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tecnicos_lista`
--

LOCK TABLES `tecnicos_lista` WRITE;
/*!40000 ALTER TABLE `tecnicos_lista` DISABLE KEYS */;
INSERT INTO `tecnicos_lista` VALUES (1,'Oscar Ramirez',1,0),(2,'Juan Perez',2,1),(3,'Indigo Masiso',3,0),(4,'Casimiro',4,1),(5,'Nimbersian V.',1,0),(6,'Melvin Aguilar',1,0);
/*!40000 ALTER TABLE `tecnicos_lista` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 20:26:22
