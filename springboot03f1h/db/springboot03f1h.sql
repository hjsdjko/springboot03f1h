-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot03f1h
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/springboot03f1h/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/springboot03f1h/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/springboot03f1h/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hesuanjiance`
--

DROP TABLE IF EXISTS `hesuanjiance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hesuanjiance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiancedianmingcheng` varchar(200) DEFAULT NULL COMMENT '检测点名称',
  `jiancedian` varchar(200) DEFAULT NULL COMMENT '检测点',
  `jiancefeiyong` int(11) DEFAULT NULL COMMENT '检测费用',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jianceyuwei` int(11) NOT NULL COMMENT '检测余位',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `kaishishijian` datetime DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `shuoming` varchar(200) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='核酸检测';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hesuanjiance`
--

LOCK TABLES `hesuanjiance` WRITE;
/*!40000 ALTER TABLE `hesuanjiance` DISABLE KEYS */;
INSERT INTO `hesuanjiance` VALUES (61,'2021-03-23 06:12:50','检测点名称1','检测点1',1,'地区1',1,'医护工号1','医护姓名1','2021-03-23 14:12:50','2021-03-23 14:12:50','说明1'),(62,'2021-03-23 06:12:50','检测点名称2','检测点2',2,'地区2',2,'医护工号2','医护姓名2','2021-03-23 14:12:50','2021-03-23 14:12:50','说明2'),(63,'2021-03-23 06:12:50','检测点名称3','检测点3',3,'地区3',3,'医护工号3','医护姓名3','2021-03-23 14:12:50','2021-03-23 14:12:50','说明3'),(64,'2021-03-23 06:12:50','检测点名称4','检测点4',4,'地区4',4,'医护工号4','医护姓名4','2021-03-23 14:12:50','2021-03-23 14:12:50','说明4'),(65,'2021-03-23 06:12:50','检测点名称5','检测点5',5,'地区5',5,'医护工号5','医护姓名5','2021-03-23 14:12:50','2021-03-23 14:12:50','说明5'),(66,'2021-03-23 06:12:50','检测点名称6','检测点6',6,'地区6',6,'医护工号6','医护姓名6','2021-03-23 14:12:50','2021-03-23 14:12:50','说明6');
/*!40000 ALTER TABLE `hesuanjiance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hesuanjiancezhengming`
--

DROP TABLE IF EXISTS `hesuanjiancezhengming`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hesuanjiancezhengming` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `jiancedianmingcheng` varchar(200) DEFAULT NULL COMMENT '检测点名称',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `gengxinshijian` varchar(200) DEFAULT NULL COMMENT '更新时间',
  `jiancejieguo` varchar(200) DEFAULT NULL COMMENT '检测结果',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='核酸检测证明';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hesuanjiancezhengming`
--

LOCK TABLES `hesuanjiancezhengming` WRITE;
/*!40000 ALTER TABLE `hesuanjiancezhengming` DISABLE KEYS */;
INSERT INTO `hesuanjiancezhengming` VALUES (121,'2021-03-23 06:12:50','用户账号1','用户姓名1','身份证号1','检测点名称1','地区1','更新时间1','阴性',1),(122,'2021-03-23 06:12:50','用户账号2','用户姓名2','身份证号2','检测点名称2','地区2','更新时间2','阴性',2),(123,'2021-03-23 06:12:50','用户账号3','用户姓名3','身份证号3','检测点名称3','地区3','更新时间3','阴性',3),(124,'2021-03-23 06:12:50','用户账号4','用户姓名4','身份证号4','检测点名称4','地区4','更新时间4','阴性',4),(125,'2021-03-23 06:12:50','用户账号5','用户姓名5','身份证号5','检测点名称5','地区5','更新时间5','阴性',5),(126,'2021-03-23 06:12:50','用户账号6','用户姓名6','身份证号6','检测点名称6','地区6','更新时间6','阴性',6);
/*!40000 ALTER TABLE `hesuanjiancezhengming` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiancedingdan`
--

DROP TABLE IF EXISTS `jiancedingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiancedingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `jiancedianmingcheng` varchar(200) DEFAULT NULL COMMENT '检测点名称',
  `jiancefeiyong` varchar(200) DEFAULT NULL COMMENT '检测费用',
  `jiancedian` varchar(200) DEFAULT NULL COMMENT '检测点',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jianceyuwei` varchar(200) DEFAULT NULL COMMENT '检测余位',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='检测订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiancedingdan`
--

LOCK TABLES `jiancedingdan` WRITE;
/*!40000 ALTER TABLE `jiancedingdan` DISABLE KEYS */;
INSERT INTO `jiancedingdan` VALUES (81,'2021-03-23 06:12:50','预约编号1','用户账号1','用户姓名1','身份证号1','检测点名称1','检测费用1','检测点1','地区1','1','2021-03-23 14:12:50','医护工号1','医护姓名1','是','','未支付',1),(82,'2021-03-23 06:12:50','预约编号2','用户账号2','用户姓名2','身份证号2','检测点名称2','检测费用2','检测点2','地区2','1','2021-03-23 14:12:50','医护工号2','医护姓名2','是','','未支付',2),(83,'2021-03-23 06:12:50','预约编号3','用户账号3','用户姓名3','身份证号3','检测点名称3','检测费用3','检测点3','地区3','1','2021-03-23 14:12:50','医护工号3','医护姓名3','是','','未支付',3),(84,'2021-03-23 06:12:50','预约编号4','用户账号4','用户姓名4','身份证号4','检测点名称4','检测费用4','检测点4','地区4','1','2021-03-23 14:12:50','医护工号4','医护姓名4','是','','未支付',4),(85,'2021-03-23 06:12:50','预约编号5','用户账号5','用户姓名5','身份证号5','检测点名称5','检测费用5','检测点5','地区5','1','2021-03-23 14:12:50','医护工号5','医护姓名5','是','','未支付',5),(86,'2021-03-23 06:12:50','预约编号6','用户账号6','用户姓名6','身份证号6','检测点名称6','检测费用6','检测点6','地区6','1','2021-03-23 14:12:50','医护工号6','医护姓名6','是','','未支付',6);
/*!40000 ALTER TABLE `jiancedingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiancejindu`
--

DROP TABLE IF EXISTS `jiancejindu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiancejindu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `jiancedianmingcheng` varchar(200) DEFAULT NULL COMMENT '检测点名称',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jindu` varchar(200) DEFAULT NULL COMMENT '进度',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `gengxinshijian` datetime DEFAULT NULL COMMENT '更新时间',
  `jiancejieguo` longtext COMMENT '检测结果',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='检测进度';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiancejindu`
--

LOCK TABLES `jiancejindu` WRITE;
/*!40000 ALTER TABLE `jiancejindu` DISABLE KEYS */;
INSERT INTO `jiancejindu` VALUES (101,'2021-03-23 06:12:50','预约编号1','检测点名称1','用户账号1','用户姓名1','身份证号1','地区1','待赴约','医护工号1','医护姓名1','2021-03-23 14:12:50','检测结果1',1),(102,'2021-03-23 06:12:50','预约编号2','检测点名称2','用户账号2','用户姓名2','身份证号2','地区2','待赴约','医护工号2','医护姓名2','2021-03-23 14:12:50','检测结果2',2),(103,'2021-03-23 06:12:50','预约编号3','检测点名称3','用户账号3','用户姓名3','身份证号3','地区3','待赴约','医护工号3','医护姓名3','2021-03-23 14:12:50','检测结果3',3),(104,'2021-03-23 06:12:50','预约编号4','检测点名称4','用户账号4','用户姓名4','身份证号4','地区4','待赴约','医护工号4','医护姓名4','2021-03-23 14:12:50','检测结果4',4),(105,'2021-03-23 06:12:50','预约编号5','检测点名称5','用户账号5','用户姓名5','身份证号5','地区5','待赴约','医护工号5','医护姓名5','2021-03-23 14:12:50','检测结果5',5),(106,'2021-03-23 06:12:50','预约编号6','检测点名称6','用户账号6','用户姓名6','身份证号6','地区6','待赴约','医护工号6','医护姓名6','2021-03-23 14:12:50','检测结果6',6);
/*!40000 ALTER TABLE `jiancejindu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiezhongdingdan`
--

DROP TABLE IF EXISTS `jiezhongdingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiezhongdingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `jiezhongdianmingcheng` varchar(200) DEFAULT NULL COMMENT '接种点名称',
  `jiezhongfeiyong` varchar(200) DEFAULT NULL COMMENT '接种费用',
  `jiezhongdian` varchar(200) DEFAULT NULL COMMENT '接种点',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jiezhongyuwei` varchar(200) DEFAULT NULL COMMENT '接种余位',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1616480488819 DEFAULT CHARSET=utf8 COMMENT='接种订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiezhongdingdan`
--

LOCK TABLES `jiezhongdingdan` WRITE;
/*!40000 ALTER TABLE `jiezhongdingdan` DISABLE KEYS */;
INSERT INTO `jiezhongdingdan` VALUES (71,'2021-03-23 06:12:50','预约编号1','用户账号1','用户姓名1','身份证号1','接种点名称1','接种费用1','接种点1','地区1','1','2021-03-23 14:12:50','医护工号1','医护姓名1','是','','未支付',1),(72,'2021-03-23 06:12:50','预约编号2','用户账号2','用户姓名2','身份证号2','接种点名称2','接种费用2','接种点2','地区2','1','2021-03-23 14:12:50','医护工号2','医护姓名2','是','','未支付',2),(73,'2021-03-23 06:12:50','预约编号3','用户账号3','用户姓名3','身份证号3','接种点名称3','接种费用3','接种点3','地区3','1','2021-03-23 14:12:50','医护工号3','医护姓名3','是','','未支付',3),(74,'2021-03-23 06:12:50','预约编号4','用户账号4','用户姓名4','身份证号4','接种点名称4','接种费用4','接种点4','地区4','1','2021-03-23 14:12:50','医护工号4','医护姓名4','是','','未支付',4),(75,'2021-03-23 06:12:50','预约编号5','用户账号5','用户姓名5','身份证号5','接种点名称5','接种费用5','接种点5','地区5','1','2021-03-23 14:12:50','医护工号5','医护姓名5','是','','未支付',5),(76,'2021-03-23 06:12:50','预约编号6','用户账号6','用户姓名6','身份证号6','接种点名称6','接种费用6','接种点6','地区6','1','2021-03-23 14:12:50','医护工号6','医护姓名6','是','','未支付',6),(1616480488818,'2021-03-23 06:21:28','1616480439400','1','用户姓名1','440300199101010001','接种点名称1','1','接种点1','地区1','1',NULL,'医护工号1','医护姓名1','否',NULL,'未支付',11);
/*!40000 ALTER TABLE `jiezhongdingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiezhongjindu`
--

DROP TABLE IF EXISTS `jiezhongjindu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiezhongjindu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `jiezhongdianmingcheng` varchar(200) DEFAULT NULL COMMENT '接种点名称',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shenfenzhanghao` varchar(200) DEFAULT NULL COMMENT '身份账号',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jindu` varchar(200) DEFAULT NULL COMMENT '进度',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `gengxinshijian` datetime DEFAULT NULL COMMENT '更新时间',
  `beizhu` longtext COMMENT '备注',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='接种进度';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiezhongjindu`
--

LOCK TABLES `jiezhongjindu` WRITE;
/*!40000 ALTER TABLE `jiezhongjindu` DISABLE KEYS */;
INSERT INTO `jiezhongjindu` VALUES (91,'2021-03-23 06:12:50','预约编号1','接种点名称1','用户账号1','用户姓名1','身份账号1','地区1','待赴约','医护工号1','医护姓名1','2021-03-23 14:12:50','备注1',1),(92,'2021-03-23 06:12:50','预约编号2','接种点名称2','用户账号2','用户姓名2','身份账号2','地区2','待赴约','医护工号2','医护姓名2','2021-03-23 14:12:50','备注2',2),(93,'2021-03-23 06:12:50','预约编号3','接种点名称3','用户账号3','用户姓名3','身份账号3','地区3','待赴约','医护工号3','医护姓名3','2021-03-23 14:12:50','备注3',3),(94,'2021-03-23 06:12:50','预约编号4','接种点名称4','用户账号4','用户姓名4','身份账号4','地区4','待赴约','医护工号4','医护姓名4','2021-03-23 14:12:50','备注4',4),(95,'2021-03-23 06:12:50','预约编号5','接种点名称5','用户账号5','用户姓名5','身份账号5','地区5','待赴约','医护工号5','医护姓名5','2021-03-23 14:12:50','备注5',5),(96,'2021-03-23 06:12:50','预约编号6','接种点名称6','用户账号6','用户姓名6','身份账号6','地区6','待赴约','医护工号6','医护姓名6','2021-03-23 14:12:50','备注6',6);
/*!40000 ALTER TABLE `jiezhongjindu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `putongguanliyuan`
--

DROP TABLE IF EXISTS `putongguanliyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `putongguanliyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `guanliyuanzhanghao` varchar(200) NOT NULL COMMENT '管理员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `guanliyuanxingming` varchar(200) DEFAULT NULL COMMENT '管理员姓名',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `guanliyuanzhanghao` (`guanliyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='普通管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `putongguanliyuan`
--

LOCK TABLES `putongguanliyuan` WRITE;
/*!40000 ALTER TABLE `putongguanliyuan` DISABLE KEYS */;
INSERT INTO `putongguanliyuan` VALUES (31,'2021-03-23 06:12:50','1','1','管理员姓名1','备注1'),(32,'2021-03-23 06:12:50','普通管理员2','123456','管理员姓名2','备注2'),(33,'2021-03-23 06:12:50','普通管理员3','123456','管理员姓名3','备注3'),(34,'2021-03-23 06:12:50','普通管理员4','123456','管理员姓名4','备注4'),(35,'2021-03-23 06:12:50','普通管理员5','123456','管理员姓名5','备注5'),(36,'2021-03-23 06:12:50','普通管理员6','123456','管理员姓名6','备注6');
/*!40000 ALTER TABLE `putongguanliyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','pa2rz3nb3gwbhzytihqzp8sktu9v3omm','2021-03-23 06:17:16','2021-03-23 07:17:16'),(2,11,'1','yonghu','用户','dnk8gwawf4hkguyq6j8rck9fpc9sx6kd','2021-03-23 06:17:23','2021-03-23 07:20:56'),(3,21,'1','yihurenyuan','医护人员','ljijfhwny0npqfojzbt1ij4lj8uh79y9','2021-03-23 06:18:15','2021-03-23 07:18:16');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tongzhigonggao`
--

DROP TABLE IF EXISTS `tongzhigonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tongzhigonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonggaobiaoti` varchar(200) DEFAULT NULL COMMENT '公告标题',
  `gonggaoleixing` varchar(200) DEFAULT NULL COMMENT '公告类型',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tongzhigonggao`
--

LOCK TABLES `tongzhigonggao` WRITE;
/*!40000 ALTER TABLE `tongzhigonggao` DISABLE KEYS */;
INSERT INTO `tongzhigonggao` VALUES (41,'2021-03-23 06:12:50','公告标题1','公告类型1','公告内容1','2021-03-23','发布人1','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian1.jpg'),(42,'2021-03-23 06:12:50','公告标题2','公告类型2','公告内容2','2021-03-23','发布人2','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian2.jpg'),(43,'2021-03-23 06:12:50','公告标题3','公告类型3','公告内容3','2021-03-23','发布人3','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian3.jpg'),(44,'2021-03-23 06:12:50','公告标题4','公告类型4','公告内容4','2021-03-23','发布人4','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian4.jpg'),(45,'2021-03-23 06:12:50','公告标题5','公告类型5','公告内容5','2021-03-23','发布人5','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian5.jpg'),(46,'2021-03-23 06:12:50','公告标题6','公告类型6','公告内容6','2021-03-23','发布人6','http://localhost:8080/springboot03f1h/upload/tongzhigonggao_fengmian6.jpg');
/*!40000 ALTER TABLE `tongzhigonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-23 06:12:50');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xitonggonggao`
--

DROP TABLE IF EXISTS `xitonggonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xitonggonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `gonggaoleixing` varchar(200) DEFAULT NULL COMMENT '公告类型',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `faburen` varchar(200) DEFAULT NULL COMMENT '发布人',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='系统公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xitonggonggao`
--

LOCK TABLES `xitonggonggao` WRITE;
/*!40000 ALTER TABLE `xitonggonggao` DISABLE KEYS */;
INSERT INTO `xitonggonggao` VALUES (111,'2021-03-23 06:12:50','标题1','内容1','公告类型1','2021-03-23','发布人1','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian1.jpg'),(112,'2021-03-23 06:12:50','标题2','内容2','公告类型2','2021-03-23','发布人2','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian2.jpg'),(113,'2021-03-23 06:12:50','标题3','内容3','公告类型3','2021-03-23','发布人3','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian3.jpg'),(114,'2021-03-23 06:12:50','标题4','内容4','公告类型4','2021-03-23','发布人4','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian4.jpg'),(115,'2021-03-23 06:12:50','标题5','内容5','公告类型5','2021-03-23','发布人5','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian5.jpg'),(116,'2021-03-23 06:12:50','标题6','内容6','公告类型6','2021-03-23','发布人6','http://localhost:8080/springboot03f1h/upload/xitonggonggao_tupian6.jpg');
/*!40000 ALTER TABLE `xitonggonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yihurenyuan`
--

DROP TABLE IF EXISTS `yihurenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yihurenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yihugonghao` varchar(200) NOT NULL COMMENT '医护工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `yihuzhaopian` varchar(200) DEFAULT NULL COMMENT '医护照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yihugonghao` (`yihugonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='医护人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yihurenyuan`
--

LOCK TABLES `yihurenyuan` WRITE;
/*!40000 ALTER TABLE `yihurenyuan` DISABLE KEYS */;
INSERT INTO `yihurenyuan` VALUES (21,'2021-03-23 06:12:50','1','1','医护姓名1','男',1,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian1.jpg'),(22,'2021-03-23 06:12:50','医护人员2','123456','医护姓名2','男',2,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian2.jpg'),(23,'2021-03-23 06:12:50','医护人员3','123456','医护姓名3','男',3,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian3.jpg'),(24,'2021-03-23 06:12:50','医护人员4','123456','医护姓名4','男',4,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian4.jpg'),(25,'2021-03-23 06:12:50','医护人员5','123456','医护姓名5','男',5,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian5.jpg'),(26,'2021-03-23 06:12:50','医护人员6','123456','医护姓名6','男',6,'http://localhost:8080/springboot03f1h/upload/yihurenyuan_yihuzhaopian6.jpg');
/*!40000 ALTER TABLE `yihurenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yimiaojiezhong`
--

DROP TABLE IF EXISTS `yimiaojiezhong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yimiaojiezhong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiezhongdianmingcheng` varchar(200) DEFAULT NULL COMMENT '接种点名称',
  `jiezhongdian` varchar(200) DEFAULT NULL COMMENT '接种点',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `jiezhongfeiyong` int(11) DEFAULT NULL COMMENT '接种费用',
  `jiezhongyuwei` int(11) NOT NULL COMMENT '接种余位',
  `yihugonghao` varchar(200) DEFAULT NULL COMMENT '医护工号',
  `yihuxingming` varchar(200) DEFAULT NULL COMMENT '医护姓名',
  `shuoming` longtext COMMENT '说明',
  `kaishishijian` datetime DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='疫苗接种';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yimiaojiezhong`
--

LOCK TABLES `yimiaojiezhong` WRITE;
/*!40000 ALTER TABLE `yimiaojiezhong` DISABLE KEYS */;
INSERT INTO `yimiaojiezhong` VALUES (51,'2021-03-23 06:12:50','接种点名称1','接种点1','地区1',1,0,'医护工号1','医护姓名1','说明1','2021-03-23 14:12:50','2021-03-23 14:12:50'),(52,'2021-03-23 06:12:50','接种点名称2','接种点2','地区2',2,2,'医护工号2','医护姓名2','说明2','2021-03-23 14:12:50','2021-03-23 14:12:50'),(53,'2021-03-23 06:12:50','接种点名称3','接种点3','地区3',3,3,'医护工号3','医护姓名3','说明3','2021-03-23 14:12:50','2021-03-23 14:12:50'),(54,'2021-03-23 06:12:50','接种点名称4','接种点4','地区4',4,4,'医护工号4','医护姓名4','说明4','2021-03-23 14:12:50','2021-03-23 14:12:50'),(55,'2021-03-23 06:12:50','接种点名称5','接种点5','地区5',5,5,'医护工号5','医护姓名5','说明5','2021-03-23 14:12:50','2021-03-23 14:12:50'),(56,'2021-03-23 06:12:50','接种点名称6','接种点6','地区6',6,6,'医护工号6','医护姓名6','说明6','2021-03-23 14:12:50','2021-03-23 14:12:50');
/*!40000 ALTER TABLE `yimiaojiezhong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `yonghushouji` varchar(200) DEFAULT NULL COMMENT '用户手机',
  `jinqilvjushi` varchar(200) DEFAULT NULL COMMENT '近期旅居史',
  `jiankangzhuangkuang` varchar(200) DEFAULT NULL COMMENT '健康状况',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `muqiansuozaidi` varchar(200) DEFAULT NULL COMMENT '目前所在地',
  `shenfenzhenghao` varchar(200) DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-23 06:12:50','1','1','用户姓名1','男','年龄1','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang1.jpg','13823888881','近期旅居史1','健康状况1','地区2','目前所在地1','440300199101010001'),(12,'2021-03-23 06:12:50','用户2','123456','用户姓名2','男','年龄2','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang2.jpg','13823888882','近期旅居史2','健康状况2','地区2','目前所在地2','440300199202020002'),(13,'2021-03-23 06:12:50','用户3','123456','用户姓名3','男','年龄3','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang3.jpg','13823888883','近期旅居史3','健康状况3','地区3','目前所在地3','440300199303030003'),(14,'2021-03-23 06:12:50','用户4','123456','用户姓名4','男','年龄4','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang4.jpg','13823888884','近期旅居史4','健康状况4','地区4','目前所在地4','440300199404040004'),(15,'2021-03-23 06:12:50','用户5','123456','用户姓名5','男','年龄5','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang5.jpg','13823888885','近期旅居史5','健康状况5','地区5','目前所在地5','440300199505050005'),(16,'2021-03-23 06:12:50','用户6','123456','用户姓名6','男','年龄6','http://localhost:8080/springboot03f1h/upload/yonghu_touxiang6.jpg','13823888886','近期旅居史6','健康状况6','地区6','目前所在地6','440300199606060006');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-30 11:52:18
