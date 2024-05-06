-- MariaDB dump 10.19  Distrib 10.6.12-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: Exam
-- ------------------------------------------------------
-- Server version	10.6.12-MariaDB-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `Exam`
--

/*!40000 DROP DATABASE IF EXISTS `Exam`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `Exam` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `Exam`;

--
-- Table structure for table `esleipenak`
--

DROP TABLE IF EXISTS `esleipenak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `esleipenak` (
  `idesleipenak` int(11) NOT NULL AUTO_INCREMENT,
  `lekuak_idlekua` int(11) NOT NULL,
  `kategoriak_mota` varchar(45) NOT NULL,
  PRIMARY KEY (`idesleipenak`),
  UNIQUE KEY `idesleipenak_UNIQUE` (`idesleipenak`),
  KEY `fk_esleipenak_lekuak1_idx` (`lekuak_idlekua`),
  KEY `fk_esleipenak_kategoriak1_idx` (`kategoriak_mota`),
  CONSTRAINT `fk_esleipenak_kategoriak1` FOREIGN KEY (`kategoriak_mota`) REFERENCES `kategoriak` (`mota`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_esleipenak_lekuak1` FOREIGN KEY (`lekuak_idlekua`) REFERENCES `lekuak` (`idlekua`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `esleipenak`
--

LOCK TABLES `esleipenak` WRITE;
/*!40000 ALTER TABLE `esleipenak` DISABLE KEYS */;
/*!40000 ALTER TABLE `esleipenak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kategoriak`
--

DROP TABLE IF EXISTS `kategoriak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kategoriak` (
  `mota` varchar(45) NOT NULL,
  `deskribapena` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`mota`),
  UNIQUE KEY `mota_UNIQUE` (`mota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kategoriak`
--

LOCK TABLES `kategoriak` WRITE;
/*!40000 ALTER TABLE `kategoriak` DISABLE KEYS */;
INSERT INTO `kategoriak` VALUES ('Idazkaritza','Laguntza eta administrazioa'),('Kafetegia','Edariak eta janaria'),('Vending Makina','Edariak eta janaria'),('Wifi','Interneterako sarbidea');
/*!40000 ALTER TABLE `kategoriak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lekuak`
--

DROP TABLE IF EXISTS `lekuak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lekuak` (
  `idlekua` int(11) NOT NULL AUTO_INCREMENT,
  `izena` varchar(45) DEFAULT NULL,
  `latitudea` float NOT NULL,
  `longitudea` float NOT NULL,
  `deskribapena` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idlekua`),
  UNIQUE KEY `idlekua_UNIQUE` (`idlekua`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lekuak`
--

LOCK TABLES `lekuak` WRITE;
/*!40000 ALTER TABLE `lekuak` DISABLE KEYS */;
INSERT INTO `lekuak` VALUES (1,'BIE/EIB',45.59,-4.33,'Bilboko Ingeniaritza Eskola'),(2,'Leioa',45.598,-4.31,'Leioako Kanpusa');
/*!40000 ALTER TABLE `lekuak` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-06 11:17:03
