-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: military_uniforms
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `appuser`
--

DROP TABLE IF EXISTS `appuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appuser` (
  `appuser_pk` int NOT NULL AUTO_INCREMENT,
  `userRole` varchar(50) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `phoneNumber` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`appuser_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appuser`
--

LOCK TABLES `appuser` WRITE;
/*!40000 ALTER TABLE `appuser` DISABLE KEYS */;
INSERT INTO `appuser` VALUES (1,'SuperAdmin','Super Admin','0397867870','superadmin@email.com','superadminpassword','VN','Active'),(3,'SuperAdmin','ngân','02212658','thaongan123@gmail.com','NGAN2212@','VN','Active'),(4,'Admin','Thảo Quyên','0966232928','dntq2212@gmail.com','TranMinhHieu','VN','Active'),(5,'Admin','testuser','012345','testuser1@gmail.com','12345','VN','Inactive'),(6,'Admin','test1','123456','test1@gmail.com','123456','VN','Active');
/*!40000 ALTER TABLE `appuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_pk` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`category_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'testCategory1'),(2,'General Officer'),(3,'Senior Officer'),(4,'Junior Officer');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distributiondetail`
--

DROP TABLE IF EXISTS `distributiondetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distributiondetail` (
  `distribution_pk` int NOT NULL AUTO_INCREMENT,
  `distributionId` varchar(200) DEFAULT NULL,
  `officer_fk` int DEFAULT NULL,
  `distributionDate` varchar(200) DEFAULT NULL,
  `totalPaid` int DEFAULT NULL,
  PRIMARY KEY (`distribution_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distributiondetail`
--

LOCK TABLES `distributiondetail` WRITE;
/*!40000 ALTER TABLE `distributiondetail` DISABLE KEYS */;
INSERT INTO `distributiondetail` VALUES (1,'Detail-354346724581400',1,'09-11-2024',5001000),(2,'Detail-354770588826500',1,'09-11-2024',5001100),(3,'Detail-354930075189700',1,'09-11-2024',5001000),(4,'Detail-355563314363800',1,'09-11-2024',100),(5,'Detail-358414442768900',2,'09-11-2024',100),(6,'Detail-365460783168900',2,'09-11-2024',200);
/*!40000 ALTER TABLE `distributiondetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `officer`
--

DROP TABLE IF EXISTS `officer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `officer` (
  `officer_pk` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `officer_rank` varchar(200) DEFAULT NULL,
  `phoneNumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`officer_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `officer`
--

LOCK TABLES `officer` WRITE;
/*!40000 ALTER TABLE `officer` DISABLE KEYS */;
INSERT INTO `officer` VALUES (1,'Nguyễn Văn B','Tá','012345'),(2,'Trần Văn B','Uý','0123');
/*!40000 ALTER TABLE `officer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uniform`
--

DROP TABLE IF EXISTS `uniform`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `uniform` (
  `uniform_pk` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category_fk` int DEFAULT NULL,
  PRIMARY KEY (`uniform_pk`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uniform`
--

LOCK TABLES `uniform` WRITE;
/*!40000 ALTER TABLE `uniform` DISABLE KEYS */;
INSERT INTO `uniform` VALUES (1,'Quan phuc thuong ngay',1000,500000,'Ao va quan (hoac vay cho nu)',3),(2,'Quan phuc da chien',999,100,'Ao, quan, mu, giay, balo',4),(3,'Quan phuc le nghi',1008,100,'Ao, quan, that lung, phu hieu, giay (mau den)',3);
/*!40000 ALTER TABLE `uniform` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-09 15:57:36
