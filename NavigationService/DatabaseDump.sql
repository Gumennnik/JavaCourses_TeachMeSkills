-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: navigation_service
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `latitude` double NOT NULL,
  `longtitude` double NOT NULL,
  `hasRoad` tinyint(4) DEFAULT NULL,
  `hasAirport` tinyint(4) DEFAULT NULL,
  `hasSeaport` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`,`name`,`latitude`,`longtitude`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (1,'second',201,12.01,0,0,0),(2,'third',201,12.01,0,0,0),(3,'fourth',201,12.01,0,0,0),(4,'fifth',201,12.01,0,0,0),(5,'sixth',201,12.01,0,0,0),(6,'sixth',201,12.01,0,0,0),(7,'bereg',12.8,11.09,1,1,0),(8,'Boston',243,12,1,1,1);
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vichecle_type`
--

DROP TABLE IF EXISTS `vichecle_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vichecle_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vichecle_type_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`vichecle_type_name`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `vichecle_name_UNIQUE` (`vichecle_type_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vichecle_type`
--

LOCK TABLES `vichecle_type` WRITE;
/*!40000 ALTER TABLE `vichecle_type` DISABLE KEYS */;
INSERT INTO `vichecle_type` VALUES (1,'ground'),(2,'air'),(3,'sea');
/*!40000 ALTER TABLE `vichecle_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vichecles`
--

DROP TABLE IF EXISTS `vichecles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vichecles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vichecle_name` varchar(45) NOT NULL,
  `vichecle_speed` int(11) NOT NULL,
  `vichecle_people_count` int(11) NOT NULL,
  `vichecle_cargo_count` int(11) NOT NULL,
  `vichecle_pricing` int(11) NOT NULL,
  `vichecle_type_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`vichecle_name`),
  KEY `vichecle_type_id_idx` (`vichecle_type_id`),
  CONSTRAINT `vichecle_type_id` FOREIGN KEY (`vichecle_type_id`) REFERENCES `vichecle_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vichecles`
--

LOCK TABLES `vichecles` WRITE;
/*!40000 ALTER TABLE `vichecles` DISABLE KEYS */;
INSERT INTO `vichecles` VALUES (1,'car',10,4,2,300,1),(2,'airplane',10,4,2,300,2),(3,'boat',10,4,2,300,3);
/*!40000 ALTER TABLE `vichecles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-20  9:03:19
