-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: liangjing
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `c_contact_lens_clerk`
--

DROP TABLE IF EXISTS `c_contact_lens_clerk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `c_contact_lens_clerk` (
  `ID_card` varchar(30) NOT NULL,
  `date_of_issue` date DEFAULT NULL,
  `certificate_number` varchar(30) DEFAULT NULL,
  `evaluate_score` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_card`),
  UNIQUE KEY `contact_lens_clerk_ID_card_uindex` (`ID_card`),
  CONSTRAINT `contact_lens_clerk_staff_ID_card_fk` FOREIGN KEY (`ID_card`) REFERENCES `staff` (`ID_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_contact_lens_clerk`
--

LOCK TABLES `c_contact_lens_clerk` WRITE;
/*!40000 ALTER TABLE `c_contact_lens_clerk` DISABLE KEYS */;
INSERT INTO `c_contact_lens_clerk` VALUES ('31010819650105280x','2012-06-25','2012062510124','合格');
/*!40000 ALTER TABLE `c_contact_lens_clerk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_contact_lens_manager`
--

DROP TABLE IF EXISTS `c_contact_lens_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `c_contact_lens_manager` (
  `ID_card` varchar(30) NOT NULL,
  `date_of_issue` date DEFAULT NULL,
  `certificate_number` varchar(30) DEFAULT NULL,
  `evaluate_score` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_card`),
  UNIQUE KEY `contact_lens_manager_ID_card_uindex` (`ID_card`),
  CONSTRAINT `contact_lens_manager_staff_ID_card_fk` FOREIGN KEY (`ID_card`) REFERENCES `staff` (`ID_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_contact_lens_manager`
--

LOCK TABLES `c_contact_lens_manager` WRITE;
/*!40000 ALTER TABLE `c_contact_lens_manager` DISABLE KEYS */;
INSERT INTO `c_contact_lens_manager` VALUES ('31010819650105280x','2012-07-04','2012062800632','合格');
/*!40000 ALTER TABLE `c_contact_lens_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_optometrist`
--

DROP TABLE IF EXISTS `c_optometrist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `c_optometrist` (
  `ID_card` varchar(30) NOT NULL,
  `date_of_issue` date DEFAULT NULL,
  `certificate_number` varchar(30) NOT NULL,
  `level` varchar(10) DEFAULT NULL,
  `theoretical_score` varchar(10) DEFAULT NULL,
  `operation_score` varchar(10) DEFAULT NULL,
  `evaluate_score` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_card`),
  UNIQUE KEY `optometrist_ID_card_uindex` (`ID_card`),
  CONSTRAINT `optometrist_staff_ID_card_fk` FOREIGN KEY (`ID_card`) REFERENCES `staff` (`ID_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_optometrist`
--

LOCK TABLES `c_optometrist` WRITE;
/*!40000 ALTER TABLE `c_optometrist` DISABLE KEYS */;
INSERT INTO `c_optometrist` VALUES ('31010819650105280x','2014-07-25','1403000206100023','高级技师/一级','合格','合格','合格');
/*!40000 ALTER TABLE `c_optometrist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commodity_type`
--

DROP TABLE IF EXISTS `commodity_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `commodity_type` (
  `type` varchar(50) NOT NULL,
  `explain` varchar(200) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`type`),
  UNIQUE KEY `commodity_type_type_uindex` (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commodity_type`
--

LOCK TABLES `commodity_type` WRITE;
/*!40000 ALTER TABLE `commodity_type` DISABLE KEYS */;
INSERT INTO `commodity_type` VALUES ('其他',NULL,1),('护理液','默认不修改',1),('隐形眼镜','默认不修改',1);
/*!40000 ALTER TABLE `commodity_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `company_name` varchar(50) NOT NULL,
  PRIMARY KEY (`company_name`),
  UNIQUE KEY `company_company_name_uindex` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES ('上海亮睛眼镜商店'),('上海明华艾代眼镜有限公司'),('海昌隐形眼镜有限公司');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `r_business_license`
--

DROP TABLE IF EXISTS `r_business_license`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_business_license` (
  `credit_code` varchar(40) NOT NULL,
  `document_number` varchar(30) NOT NULL,
  `company_name` varchar(50) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `owner` varchar(20) DEFAULT NULL,
  `organization_form` varchar(20) DEFAULT NULL,
  `legal_person` varchar(20) DEFAULT NULL,
  `registered_capital` varchar(30) DEFAULT NULL,
  `establishment_date` date DEFAULT NULL,
  `scope_of_business` varchar(300) DEFAULT NULL,
  `scanning_url` varchar(100) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`credit_code`),
  UNIQUE KEY `r_business_license_credit_code_uindex` (`credit_code`),
  UNIQUE KEY `r_business_license_document_number_uindex` (`document_number`),
  UNIQUE KEY `r_business_license_company_name_uindex` (`company_name`),
  CONSTRAINT `r_business_license_company_company_name_fk` FOREIGN KEY (`company_name`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_business_license`
--

LOCK TABLES `r_business_license` WRITE;
/*!40000 ALTER TABLE `r_business_license` DISABLE KEYS */;
INSERT INTO `r_business_license` VALUES ('913101065529275414','06000000201607210148','上海明华艾代眼镜有限公司','有限责任公司（国内合资）','青云路598号一层',NULL,NULL,'郑丽双','100万元整','2010-03-26','眼镜、中标、眼镜配件、日用百货、办公用品、劳防用品、计算机软硬件、建筑装潢材料、汽车配件、二类、三类医疗器械（详见医疗器械经营企业许可证）的销售，电子商务（不得从事增值电信、金融业务），验光配镜服务',NULL,1),('91310109X355348039','09000000201603230045','上海亮睛眼镜商店','个人独资企业','万安路465号','孙志波',NULL,NULL,NULL,'2000-04-21','验光配镜，销售眼镜，中标，服装鞋帽，箱包，日用百货，厨房用品，文化办公用品，食用农产品（除生猪产品），二类医疗器械，三类医疗器械（具体项目见许可证）：理发店（取得许可证件后方可从事经营活动）。【依法须经批准的项目，经相关部门批准后方可开展经营活动】',NULL,1);
/*!40000 ALTER TABLE `r_business_license` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `r_certificate_of_authorization`
--

DROP TABLE IF EXISTS `r_certificate_of_authorization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_certificate_of_authorization` (
  `company_name` varchar(50) NOT NULL,
  `scanning_url` varchar(100) DEFAULT NULL,
  `validity_date` date NOT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`company_name`),
  UNIQUE KEY `r_certificate_of_authorization_company_name_uindex` (`company_name`),
  UNIQUE KEY `r_certificate_of_authorization_scanning_url_uindex` (`scanning_url`),
  CONSTRAINT `r_certificate_of_authorization_company_company_name_fk` FOREIGN KEY (`company_name`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_certificate_of_authorization`
--

LOCK TABLES `r_certificate_of_authorization` WRITE;
/*!40000 ALTER TABLE `r_certificate_of_authorization` DISABLE KEYS */;
INSERT INTO `r_certificate_of_authorization` VALUES ('上海明华艾代眼镜有限公司',NULL,'2018-01-01',1);
/*!40000 ALTER TABLE `r_certificate_of_authorization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `r_medical_device_license`
--

DROP TABLE IF EXISTS `r_medical_device_license`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_medical_device_license` (
  `credit_code` varchar(40) NOT NULL,
  `company_name` varchar(50) NOT NULL,
  `registration_address` varchar(50) DEFAULT NULL,
  `legal_person` varchar(20) DEFAULT NULL,
  `responsible_person` varchar(20) DEFAULT NULL,
  `quality_manager` varchar(20) DEFAULT NULL,
  `warehouse_address` varchar(50) DEFAULT NULL,
  `scope_of_business` varchar(300) DEFAULT NULL,
  `valid_from` date DEFAULT NULL,
  `valid_until` date DEFAULT NULL,
  `scanning_url` varchar(50) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`credit_code`),
  UNIQUE KEY `r_medical_device_license_credit_code_uindex` (`credit_code`),
  UNIQUE KEY `r_medical_device_license_company_name_uindex` (`company_name`),
  CONSTRAINT `r_medical_device_license_company_company_name_fk` FOREIGN KEY (`company_name`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_medical_device_license`
--

LOCK TABLES `r_medical_device_license` WRITE;
/*!40000 ALTER TABLE `r_medical_device_license` DISABLE KEYS */;
INSERT INTO `r_medical_device_license` VALUES ('沪080756','上海明华艾代眼镜有限公司','青云路598号一层','郑丽双','王海斌','王华崇','青云路598号一层','III、II类：医用光学器具，仪器及内窥镜设备（仅限角膜接触镜零售及护理液）***','2014-03-25','2019-03-04',NULL,1),('沪099495','上海亮睛眼镜商店','虹口区万安路465号','孙志波','陈贤文','陈苏香','******','III、II类：医用光学器具，仪器及内窥镜设备（仅限角膜接触镜零售）***','2012-06-21','2017-06-20',NULL,1);
/*!40000 ALTER TABLE `r_medical_device_license` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `r_medical_device_registration`
--

DROP TABLE IF EXISTS `r_medical_device_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `r_medical_device_registration` (
  `credit_code` varchar(40) NOT NULL,
  `registration_name` varchar(50) NOT NULL,
  `registration_address` varchar(50) DEFAULT NULL,
  `production_address` varchar(50) DEFAULT NULL,
  `agent_name` varchar(20) DEFAULT NULL,
  `agent_address` varchar(50) DEFAULT NULL,
  `product_name` varchar(50) NOT NULL,
  `model` varchar(50) DEFAULT NULL,
  `structure_and_composition` varchar(200) DEFAULT NULL,
  `scope_of_application` varchar(200) DEFAULT NULL,
  `enclosure` varchar(200) DEFAULT NULL,
  `remarks` varchar(300) DEFAULT NULL,
  `approval_date` date DEFAULT NULL,
  `valid_from` date DEFAULT NULL,
  `valid_until` date DEFAULT NULL,
  `scanning_url` varchar(50) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`credit_code`),
  UNIQUE KEY `r_medical_device_registration_credit_code_uindex` (`credit_code`),
  KEY `r_medical_device_registration_company_company_name_fk` (`registration_name`),
  CONSTRAINT `r_medical_device_registration_company_company_name_fk` FOREIGN KEY (`registration_name`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `r_medical_device_registration`
--

LOCK TABLES `r_medical_device_registration` WRITE;
/*!40000 ALTER TABLE `r_medical_device_registration` DISABLE KEYS */;
/*!40000 ALTER TABLE `r_medical_device_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_after_sale_service`
--

DROP TABLE IF EXISTS `s_after_sale_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_after_sale_service` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `customer_content` varchar(100) DEFAULT NULL,
  `treatment_mode` varchar(500) DEFAULT NULL,
  `processing_sheet` varchar(20) DEFAULT NULL,
  `handlers` varchar(10) DEFAULT NULL,
  `close_date` date DEFAULT NULL,
  `remarks` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `s_after_sale_service_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='售后服务记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_after_sale_service`
--

LOCK TABLES `s_after_sale_service` WRITE;
/*!40000 ALTER TABLE `s_after_sale_service` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_after_sale_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_complaint_record`
--

DROP TABLE IF EXISTS `s_complaint_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_complaint_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `customer` varchar(10) DEFAULT NULL,
  `customer_contact` varchar(50) DEFAULT NULL,
  `shop_name` varchar(50) DEFAULT NULL,
  `shop_contact` varchar(50) DEFAULT NULL,
  `buy_time` date DEFAULT NULL,
  `complaint_time` date DEFAULT NULL,
  `type_specification` varchar(50) DEFAULT NULL,
  `glasses_number` int(5) DEFAULT NULL,
  `mark_degree` varchar(50) DEFAULT NULL,
  `lens_number` varchar(50) DEFAULT NULL,
  `wear_history` int(1) DEFAULT NULL,
  `original_brand_models` varchar(50) DEFAULT NULL,
  `original_glasses_number_l` varchar(50) DEFAULT NULL,
  `original_glasses_number_r` varchar(50) DEFAULT NULL,
  `optometry_degree_l` varchar(50) DEFAULT NULL,
  `optometry_degree_r` varchar(50) DEFAULT NULL,
  `wear_sight_l` varchar(50) DEFAULT NULL,
  `wear_sight_r` varchar(50) DEFAULT NULL,
  `customer_complaint_content` varchar(500) DEFAULT NULL,
  `store_examination_result` varchar(500) DEFAULT NULL,
  `glasses_examination_result` varchar(500) DEFAULT NULL,
  `procurator` varchar(10) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `s_complaint_record_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='隐形眼镜质量投诉处理记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_complaint_record`
--

LOCK TABLES `s_complaint_record` WRITE;
/*!40000 ALTER TABLE `s_complaint_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_complaint_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_cultivate_personlist`
--

DROP TABLE IF EXISTS `s_cultivate_personlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_cultivate_personlist` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cultivate_id` int(10) NOT NULL,
  `cultivate_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `s_cultivate_personlist_s_cultivate_record_ID_fk` (`cultivate_id`),
  CONSTRAINT `s_cultivate_personlist_s_cultivate_record_ID_fk` FOREIGN KEY (`cultivate_id`) REFERENCES `s_cultivate_record` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_cultivate_personlist`
--

LOCK TABLES `s_cultivate_personlist` WRITE;
/*!40000 ALTER TABLE `s_cultivate_personlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_cultivate_personlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_cultivate_record`
--

DROP TABLE IF EXISTS `s_cultivate_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_cultivate_record` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `cultivate_content` varchar(300) DEFAULT NULL,
  `cultivate_date` datetime DEFAULT NULL,
  `cultivate_way` varchar(100) DEFAULT NULL,
  `cultivate_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `s_cultivate_record_ID_uindex` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_cultivate_record`
--

LOCK TABLES `s_cultivate_record` WRITE;
/*!40000 ALTER TABLE `s_cultivate_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_cultivate_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_nonconformity_record`
--

DROP TABLE IF EXISTS `s_nonconformity_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_nonconformity_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `today` date DEFAULT NULL,
  `batch_number` varchar(20) NOT NULL,
  `description_goods` varchar(500) DEFAULT NULL,
  `contract` varchar(500) DEFAULT NULL,
  `manufacturer` varchar(500) DEFAULT NULL,
  `quality_problem` varchar(500) DEFAULT NULL,
  `inspector_suggested` varchar(500) DEFAULT NULL,
  `audit_conclusion` varchar(500) DEFAULT NULL,
  `event_tracking` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `s_nonconformity_record_s_warehousing_record_batch_number_fk` (`batch_number`),
  CONSTRAINT `s_nonconformity_record_s_warehousing_record_batch_number_fk` FOREIGN KEY (`batch_number`) REFERENCES `s_warehousing_record` (`batch_number`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='不合计记录表（不带外键约束）';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_nonconformity_record`
--

LOCK TABLES `s_nonconformity_record` WRITE;
/*!40000 ALTER TABLE `s_nonconformity_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_nonconformity_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_returned_goods`
--

DROP TABLE IF EXISTS `s_returned_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_returned_goods` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_phone` varchar(20) DEFAULT NULL,
  `customer_postcard` varchar(20) DEFAULT NULL,
  `customer_address` varchar(100) DEFAULT NULL,
  `batch_number_l` varchar(20) DEFAULT NULL,
  `batch_number_r` varchar(20) DEFAULT NULL,
  `glasses_degree_l` varchar(20) DEFAULT NULL,
  `glasses_degree_r` varchar(20) DEFAULT NULL,
  `optician_date` date DEFAULT NULL,
  `returned_date` date DEFAULT NULL,
  `handler` varchar(20) DEFAULT NULL,
  `returned_reason` varchar(1000) DEFAULT NULL,
  `handler_findings` varchar(500) DEFAULT NULL,
  `quality_controller` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `s_returned_goods_id_uindex` (`id`),
  KEY `s_returned_goods_s_warehousing_record_batch_number_fk` (`batch_number_l`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='顾客退片/换片记录单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_returned_goods`
--

LOCK TABLES `s_returned_goods` WRITE;
/*!40000 ALTER TABLE `s_returned_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_returned_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_sales_record`
--

DROP TABLE IF EXISTS `s_sales_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_sales_record` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `sale_date` date DEFAULT NULL,
  `commodity_type` varchar(50) DEFAULT NULL,
  `batch_number` varchar(20) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  `specification_model` varchar(50) DEFAULT NULL,
  `sales_volumes` int(11) DEFAULT NULL,
  `credit_code` varchar(40) DEFAULT NULL,
  `total_price` int(10) DEFAULT NULL,
  `confirming_person` varchar(10) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `sales_record_ID_uindex` (`ID`),
  KEY `s_sales_record_commodity_type_type_fk` (`commodity_type`),
  KEY `s_sales_record_s_warehousing_record_batch_number_fk` (`batch_number`),
  KEY `s_sales_record_r_medical_device_registration_credit_code_fk` (`credit_code`),
  CONSTRAINT `s_sales_record_commodity_type_type_fk` FOREIGN KEY (`commodity_type`) REFERENCES `commodity_type` (`type`),
  CONSTRAINT `s_sales_record_s_warehousing_record_batch_number_fk` FOREIGN KEY (`batch_number`) REFERENCES `s_warehousing_record` (`batch_number`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_sales_record`
--

LOCK TABLES `s_sales_record` WRITE;
/*!40000 ALTER TABLE `s_sales_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_sales_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_trace_record`
--

DROP TABLE IF EXISTS `s_trace_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_trace_record` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `sale_id` int(10) NOT NULL,
  `batch_number` varchar(20) DEFAULT NULL,
  `specifications` varchar(50) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `feedback` varchar(300) DEFAULT NULL,
  `add_time` date NOT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `s_trace_record_ID_uindex` (`ID`),
  KEY `s_trace_record_s_warehousing_record_batch_number_fk` (`batch_number`),
  KEY `s_trace_record_company_company_name_fk` (`company_name`),
  KEY `s_trace_record_s_sales_record_ID_fk` (`sale_id`),
  CONSTRAINT `s_trace_record_company_company_name_fk` FOREIGN KEY (`company_name`) REFERENCES `company` (`company_name`),
  CONSTRAINT `s_trace_record_s_sales_record_ID_fk` FOREIGN KEY (`sale_id`) REFERENCES `s_sales_record` (`ID`),
  CONSTRAINT `s_trace_record_s_warehousing_record_batch_number_fk` FOREIGN KEY (`batch_number`) REFERENCES `s_warehousing_record` (`batch_number`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_trace_record`
--

LOCK TABLES `s_trace_record` WRITE;
/*!40000 ALTER TABLE `s_trace_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_trace_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s_warehousing_record`
--

DROP TABLE IF EXISTS `s_warehousing_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `s_warehousing_record` (
  `batch_number` varchar(20) NOT NULL,
  `commodity_type` varchar(50) NOT NULL,
  `purchase_date` date DEFAULT NULL,
  `Inspection_date` date DEFAULT NULL,
  `product_name` varchar(50) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `vertex_focus` varchar(50) DEFAULT NULL,
  `chinese_logo` varchar(50) DEFAULT NULL,
  `quantity_purchased` int(5) DEFAULT NULL,
  `stock_number` int(5) DEFAULT NULL,
  `package_integrity` int(1) DEFAULT NULL,
  `production_date` date DEFAULT NULL,
  `term_of_validity` date DEFAULT NULL,
  `buying_price` int(10) DEFAULT NULL,
  `acceptance_conclusion` varchar(10) DEFAULT NULL,
  `confirming_person` varchar(10) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`batch_number`),
  UNIQUE KEY `warehousing_record_batch_number_uindex` (`batch_number`),
  KEY `warehousing_record_commodity_type_type_fk` (`commodity_type`),
  KEY `warehousing_record_r_medical_device_registration_product_name_fk` (`product_name`),
  KEY `warehousing_record_company_company_name_fk` (`company_name`),
  CONSTRAINT `warehousing_record_commodity_type_type_fk` FOREIGN KEY (`commodity_type`) REFERENCES `commodity_type` (`type`),
  CONSTRAINT `warehousing_record_company_company_name_fk` FOREIGN KEY (`company_name`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s_warehousing_record`
--

LOCK TABLES `s_warehousing_record` WRITE;
/*!40000 ALTER TABLE `s_warehousing_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `s_warehousing_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `ID_card` varchar(30) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `education` varchar(30) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `work_unit` varchar(40) DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`ID_card`),
  UNIQUE KEY `staff_ID_card_uindex` (`ID_card`),
  KEY `staff_company_company_name_fk` (`work_unit`),
  CONSTRAINT `staff_company_company_name_fk` FOREIGN KEY (`work_unit`) REFERENCES `company` (`company_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES ('111111','小明','123456','男','小学','2001-06-01','上海亮睛眼镜商店',1),('22222','老王','123456','男','初中','2017-06-03','上海亮睛眼镜商店',1),('31010819650105280x','陈苏香','123456','女','高中','1965-01-05','上海亮睛眼镜商店',1);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-23 23:01:51
