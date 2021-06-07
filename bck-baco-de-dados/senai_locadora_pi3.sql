-- MySQL dump 10.13  Distrib 5.7.33, for Linux (x86_64)
--
-- Host: localhost    Database: senai_locadora_pi3
-- ------------------------------------------------------
-- Server version	5.7.33-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accessories`
--

DROP TABLE IF EXISTS `accessories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accessories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_type_acessories` int(11) NOT NULL,
  `fk_status_acessories` int(11) NOT NULL,
  `fk_rental_acessories` int(11) DEFAULT NULL,
  `obs` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_type_acessories` (`fk_type_acessories`),
  KEY `fk_status_acessories` (`fk_status_acessories`),
  KEY `fk_rental_acessories` (`fk_rental_acessories`),
  CONSTRAINT `accessories_ibfk_1` FOREIGN KEY (`fk_type_acessories`) REFERENCES `typeAccessories` (`id`),
  CONSTRAINT `accessories_ibfk_2` FOREIGN KEY (`fk_status_acessories`) REFERENCES `statusAccessories` (`id`),
  CONSTRAINT `accessories_ibfk_3` FOREIGN KEY (`fk_rental_acessories`) REFERENCES `rental` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accessories`
--

LOCK TABLES `accessories` WRITE;
/*!40000 ALTER TABLE `accessories` DISABLE KEYS */;
/*!40000 ALTER TABLE `accessories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cep` varchar(11) NOT NULL,
  `numberAddress` int(11) DEFAULT NULL,
  `complement` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL,
  `fk_city_address` int(11) NOT NULL,
  `fk_uf_address` int(11) NOT NULL,
  `logradouro` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_city_address` (`fk_city_address`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`fk_city_address`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'74593610',2,'quadra 54 lote 32','centro',1,1,'rua da maria');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `fk_uf_city` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_uf_city` (`fk_uf_city`),
  CONSTRAINT `city_ibfk_1` FOREIGN KEY (`fk_uf_city`) REFERENCES `uf` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'GOIANIA',1);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_address_client` int(11) NOT NULL,
  `fk_contact_client` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_address_client` (`fk_address_client`),
  KEY `fk_contact_client` (`fk_contact_client`),
  CONSTRAINT `client_ibfk_1` FOREIGN KEY (`fk_address_client`) REFERENCES `address` (`id`),
  CONSTRAINT `client_ibfk_2` FOREIGN KEY (`fk_contact_client`) REFERENCES `contact` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,1,1);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientPf`
--

DROP TABLE IF EXISTS `clientPf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientPf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) NOT NULL,
  `identity` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `fk_client_pf` int(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `identity` (`identity`),
  KEY `fk_client_pf` (`fk_client_pf`),
  CONSTRAINT `clientPf_ibfk_1` FOREIGN KEY (`fk_client_pf`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientPf`
--

LOCK TABLES `clientPf` WRITE;
/*!40000 ALTER TABLE `clientPf` DISABLE KEYS */;
INSERT INTO `clientPf` VALUES (1,'61947459082','999999','gabriel',1);
/*!40000 ALTER TABLE `clientPf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientPj`
--

DROP TABLE IF EXISTS `clientPj`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientPj` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(15) NOT NULL,
  `fantasyName` varchar(100) NOT NULL,
  `razaoSocial` varchar(100) NOT NULL,
  `fk_client_pj` int(11) NOT NULL,
  PRIMARY KEY (`cnpj`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `cnpj` (`cnpj`),
  KEY `fk_client_pj` (`fk_client_pj`),
  CONSTRAINT `clientPj_ibfk_1` FOREIGN KEY (`fk_client_pj`) REFERENCES `client` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientPj`
--

LOCK TABLES `clientPj` WRITE;
/*!40000 ALTER TABLE `clientPj` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientPj` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'gabriel@gmail.com','+5562992358510');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `driver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `identity` varchar(20) NOT NULL,
  `cnh` varchar(15) NOT NULL,
  `category` varchar(5) NOT NULL,
  `cnhValidity` date NOT NULL,
  `urlCnh` varchar(200) NOT NULL,
  `fk_address_driver` int(11) NOT NULL,
  `fk_contact_driver` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  KEY `fk_address_driver` (`fk_address_driver`),
  KEY `fk_contact_driver` (`fk_contact_driver`),
  CONSTRAINT `driver_ibfk_1` FOREIGN KEY (`fk_address_driver`) REFERENCES `address` (`id`),
  CONSTRAINT `driver_ibfk_2` FOREIGN KEY (`fk_contact_driver`) REFERENCES `contact` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model`
--

DROP TABLE IF EXISTS `model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `fk_brand_model` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_brand_model` (`fk_brand_model`),
  CONSTRAINT `model_ibfk_1` FOREIGN KEY (`fk_brand_model`) REFERENCES `brand` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model`
--

LOCK TABLES `model` WRITE;
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
/*!40000 ALTER TABLE `model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental`
--

DROP TABLE IF EXISTS `rental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rental` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_vehicle_rental` varchar(10) NOT NULL,
  `fk_client_rental` int(11) NOT NULL,
  `fk_driver_rental` varchar(15) NOT NULL,
  `dateRental` datetime NOT NULL,
  `dateScheduledDevolution` datetime NOT NULL,
  `dateDevolution` datetime DEFAULT NULL,
  `initialMileage` int(11) NOT NULL,
  `finalMileage` int(11) NOT NULL,
  `priceRental` double NOT NULL,
  `priceGuarantee` double DEFAULT NULL,
  `priceInsuranceCar` double DEFAULT NULL,
  `priceInsuranceRental` double DEFAULT NULL,
  `priceTotal` double DEFAULT NULL,
  `lateFee` varchar(5) DEFAULT NULL,
  `litersFuel` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_vehicle_rental` (`fk_vehicle_rental`),
  KEY `fk_client_rental` (`fk_client_rental`),
  KEY `fk_driver_rental` (`fk_driver_rental`),
  CONSTRAINT `rental_ibfk_1` FOREIGN KEY (`fk_vehicle_rental`) REFERENCES `vehicle` (`licensePlate`),
  CONSTRAINT `rental_ibfk_2` FOREIGN KEY (`fk_client_rental`) REFERENCES `client` (`id`),
  CONSTRAINT `rental_ibfk_3` FOREIGN KEY (`fk_driver_rental`) REFERENCES `driver` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental`
--

LOCK TABLES `rental` WRITE;
/*!40000 ALTER TABLE `rental` DISABLE KEYS */;
/*!40000 ALTER TABLE `rental` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `situationVehicle`
--

DROP TABLE IF EXISTS `situationVehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `situationVehicle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situationVehicle`
--

LOCK TABLES `situationVehicle` WRITE;
/*!40000 ALTER TABLE `situationVehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `situationVehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statusAccessories`
--

DROP TABLE IF EXISTS `statusAccessories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statusAccessories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statusAccessories`
--

LOCK TABLES `statusAccessories` WRITE;
/*!40000 ALTER TABLE `statusAccessories` DISABLE KEYS */;
/*!40000 ALTER TABLE `statusAccessories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `typeAccessories`
--

DROP TABLE IF EXISTS `typeAccessories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `typeAccessories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `typeAccessories`
--

LOCK TABLES `typeAccessories` WRITE;
/*!40000 ALTER TABLE `typeAccessories` DISABLE KEYS */;
/*!40000 ALTER TABLE `typeAccessories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uf`
--

DROP TABLE IF EXISTS `uf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `uf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uf`
--

LOCK TABLES `uf` WRITE;
/*!40000 ALTER TABLE `uf` DISABLE KEYS */;
INSERT INTO `uf` VALUES (1,'GO'),(2,'SP');
/*!40000 ALTER TABLE `uf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `licensePlate` varchar(10) NOT NULL,
  `fk_model_vehicle` int(11) DEFAULT NULL,
  `renavam` int(11) DEFAULT NULL,
  `fk_category_vehicle` int(11) DEFAULT NULL,
  `buyPrice` double DEFAULT NULL,
  `salePrice` double DEFAULT NULL,
  `numberPassengers` int(11) DEFAULT NULL,
  `yearFabrication` varchar(4) DEFAULT NULL,
  `yearModel` varchar(4) DEFAULT NULL,
  `typeFuel` varchar(10) DEFAULT NULL,
  `mileage` int(11) DEFAULT NULL,
  `fk_type_vehicle` int(11) DEFAULT NULL,
  `fk_situation_vehicle` int(11) DEFAULT NULL,
  PRIMARY KEY (`licensePlate`),
  UNIQUE KEY `id` (`id`),
  KEY `fk_model_vehicle` (`fk_model_vehicle`),
  KEY `fk_category_vehicle` (`fk_category_vehicle`),
  KEY `fk_type_vehicle` (`fk_type_vehicle`),
  KEY `fk_situation_vehicle` (`fk_situation_vehicle`),
  CONSTRAINT `vehicle_ibfk_1` FOREIGN KEY (`fk_model_vehicle`) REFERENCES `model` (`id`),
  CONSTRAINT `vehicle_ibfk_2` FOREIGN KEY (`fk_category_vehicle`) REFERENCES `category` (`id`),
  CONSTRAINT `vehicle_ibfk_3` FOREIGN KEY (`fk_type_vehicle`) REFERENCES `vehicleType` (`id`),
  CONSTRAINT `vehicle_ibfk_4` FOREIGN KEY (`fk_situation_vehicle`) REFERENCES `situationVehicle` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicleType`
--

DROP TABLE IF EXISTS `vehicleType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicleType` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicleType`
--

LOCK TABLES `vehicleType` WRITE;
/*!40000 ALTER TABLE `vehicleType` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicleType` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-07 15:43:43
