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
-- Table structure for table `nivel de servicio`
--

DROP TABLE IF EXISTS `nivel de servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivel de servicio` (
  `ID_Nivel_servicio` int NOT NULL,
  `Nivel_Nombre` varchar(50) NOT NULL,
  `Horas de atencion` int NOT NULL,
  `Revision_Equipo` tinyint(1) DEFAULT NULL,
  `Instalacion&config_software` tinyint(1) DEFAULT NULL,
  `Comunicaciones` tinyint(1) DEFAULT NULL,
  `Seguridad` tinyint(1) DEFAULT NULL,
  `Precio` float NOT NULL,
  PRIMARY KEY (`ID_Nivel_servicio`,`Horas de atencion`),
  UNIQUE KEY `Horas de atencion_UNIQUE` (`Horas de atencion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel de servicio`
--

LOCK TABLES `nivel de servicio` WRITE;
/*!40000 ALTER TABLE `nivel de servicio` DISABLE KEYS */;
INSERT INTO `nivel de servicio` VALUES (1,'Basico',15,1,0,0,0,1500),(2,'Intermedio',20,1,1,0,0,2000),(3,'Avanzado',25,1,1,1,0,2500),(4,'Premium',30,1,1,1,1,3000);
/*!40000 ALTER TABLE `nivel de servicio` ENABLE KEYS */;
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
