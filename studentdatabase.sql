-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: studentmanagement
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `Admin_id` int NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'3232'),(2,'8989');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salarydetails`
--

DROP TABLE IF EXISTS `salarydetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salarydetails` (
  `lowersectionsalary` bigint NOT NULL,
  `highersectionsalary` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salarydetails`
--

LOCK TABLES `salarydetails` WRITE;
/*!40000 ALTER TABLE `salarydetails` DISABLE KEYS */;
INSERT INTO `salarydetails` VALUES (12000,18000),(12500,18500),(13000,19000),(14000,19000),(14000,18000);
/*!40000 ALTER TABLE `salarydetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffdetails`
--

DROP TABLE IF EXISTS `staffdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffdetails` (
  `stafid` int NOT NULL,
  `staffname` varchar(200) DEFAULT NULL,
  `stafaddress` varchar(100) DEFAULT NULL,
  `phonenumber` bigint NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `qualification` varchar(100) DEFAULT NULL,
  `salary` bigint NOT NULL,
  `presenteddays` bigint NOT NULL,
  PRIMARY KEY (`stafid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffdetails`
--

LOCK TABLES `staffdetails` WRITE;
/*!40000 ALTER TABLE `staffdetails` DISABLE KEYS */;
INSERT INTO `staffdetails` VALUES (101,'Deva','Chennai',9876543210,'jeo@gmail.com','Bsc',15000,30),(102,'Jeeva','Kochi',9087654321,'jeeva@gmail.com','Bcom',16000,28),(103,'Vino','Salem',9087654331,'vino@gmail.com','Bca',14000,27),(104,'Seshu','chennai',9087654301,'seshu@gmail.com','BE',18000,30),(105,'Saran','kerala',9087645301,'saran@gmail.com','Msc',18000,26),(106,'Naveen','Mumbai',9870654321,'naveen@gmail.com','BCA',17000,30);
/*!40000 ALTER TABLE `staffdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffregistration`
--

DROP TABLE IF EXISTS `staffregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffregistration` (
  `staffname` varchar(200) DEFAULT NULL,
  `stafaddress` varchar(100) DEFAULT NULL,
  `phonenumber` bigint NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `qualification` varchar(100) DEFAULT NULL,
  `experience` varchar(200) DEFAULT NULL,
  `exceptionsalary` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffregistration`
--

LOCK TABLES `staffregistration` WRITE;
/*!40000 ALTER TABLE `staffregistration` DISABLE KEYS */;
INSERT INTO `staffregistration` VALUES ('Jeeva','Kochi',9087654321,'jeeva@gmail.com','BCA','oneyear',15000),('Vino','Salem',9087654331,'vino@gmail.com','Bca','twoyears',17000),('pradeep','chennai',9898076543,'pradeep@gmail.com','Mcom','oneyear',18000),('Vinoth','Bangalore',8989076543,'vino@gmail.com','MBA','twoyear',20000);
/*!40000 ALTER TABLE `staffregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffuser`
--

DROP TABLE IF EXISTS `staffuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffuser` (
  `staffid` int NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`staffid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffuser`
--

LOCK TABLES `staffuser` WRITE;
/*!40000 ALTER TABLE `staffuser` DISABLE KEYS */;
INSERT INTO `staffuser` VALUES (1,'2323'),(2,'9090');
/*!40000 ALTER TABLE `staffuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentdetails`
--

DROP TABLE IF EXISTS `studentdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentdetails` (
  `studid` bigint NOT NULL,
  `studentname` varchar(200) DEFAULT NULL,
  `studentaddress` varchar(100) DEFAULT NULL,
  `studFathername` varchar(200) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `studStandarnd` bigint NOT NULL,
  `phonenumber` bigint NOT NULL,
  `presenteddays` bigint NOT NULL,
  PRIMARY KEY (`studid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentdetails`
--

LOCK TABLES `studentdetails` WRITE;
/*!40000 ALTER TABLE `studentdetails` DISABLE KEYS */;
INSERT INTO `studentdetails` VALUES (101,'Jeeva','Kochi','Ravi','male',10,9087654321,28),(102,'Vino','Salem','Sathish','male',12,9087654331,27),(103,'Dheeya','Chennai','Vinith','female',10,9807654321,30),(104,'Arun','Chennai','Krishan','male',12,9898765432,29),(105,'Sangeetha','kochi','Deva','female',10,9087654321,27),(106,'divya','Chennai','Sathish','female',10,9090876543,30);
/*!40000 ALTER TABLE `studentdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentfees`
--

DROP TABLE IF EXISTS `studentfees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentfees` (
  `primarilyfees` bigint NOT NULL,
  `lowersecondaryfees` bigint NOT NULL,
  `highersecondaryfees` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentfees`
--

LOCK TABLES `studentfees` WRITE;
/*!40000 ALTER TABLE `studentfees` DISABLE KEYS */;
INSERT INTO `studentfees` VALUES (10000,15000,20000),(12000,16000,23000),(12000,15000,22000),(12500,15500,20000),(10000,15000,20000);
/*!40000 ALTER TABLE `studentfees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentinformation`
--

DROP TABLE IF EXISTS `studentinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentinformation` (
  `stud_id` bigint NOT NULL,
  `stud_name` varchar(200) DEFAULT NULL,
  `stud_address` varchar(100) DEFAULT NULL,
  `phone` bigint NOT NULL,
  `stud_standard` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentinformation`
--

LOCK TABLES `studentinformation` WRITE;
/*!40000 ALTER TABLE `studentinformation` DISABLE KEYS */;
INSERT INTO `studentinformation` VALUES (201,'Anu','chennai',9876543210,8),(202,'priya','delhi',9080765432,9),(203,'Shruthi','kochi',9898765432,10),(204,'Jaya','Chennai',9807656432,10),(204,'Seshu','Chennai',9008765432,10);
/*!40000 ALTER TABLE `studentinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentregistration`
--

DROP TABLE IF EXISTS `studentregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentregistration` (
  `studentname` varchar(200) DEFAULT NULL,
  `studentaddress` varchar(100) DEFAULT NULL,
  `studFathername` varchar(200) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `studStandarnd` bigint NOT NULL,
  `phonenumber` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentregistration`
--

LOCK TABLES `studentregistration` WRITE;
/*!40000 ALTER TABLE `studentregistration` DISABLE KEYS */;
INSERT INTO `studentregistration` VALUES ('Seshu','Kochi','Ravi','male',10,9087654321),('Vicky','Salem','Sathish','male',12,9087654331);
/*!40000 ALTER TABLE `studentregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentuser`
--

DROP TABLE IF EXISTS `studentuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentuser` (
  `stud_name` varchar(200) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentuser`
--

LOCK TABLES `studentuser` WRITE;
/*!40000 ALTER TABLE `studentuser` DISABLE KEYS */;
INSERT INTO `studentuser` VALUES ('dheeya','4545'),('priya','6767');
/*!40000 ALTER TABLE `studentuser` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-02 12:13:54
