/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.17 : Database - ssh
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssh` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ssh`;

/*Table structure for table `adopt_pet` */

DROP TABLE IF EXISTS `adopt_pet`;

CREATE TABLE `adopt_pet` (
  `id` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(36) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `release_id` varchar(36) NOT NULL COMMENT '发布人id',
  `adopter_id` varchar(36) NOT NULL COMMENT '领养人id',
  `content` text COMMENT '领养人说话的内容',
  `contact_way` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `read_amount` int(20) DEFAULT NULL COMMENT '阅读量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adopt_pet` */

/*Table structure for table `cute_comment` */

DROP TABLE IF EXISTS `cute_comment`;

CREATE TABLE `cute_comment` (
  `id` varchar(39) NOT NULL COMMENT '内容id',
  `user_id` varchar(39) DEFAULT NULL COMMENT '用户id',
  `content` text COMMENT '内容',
  `time` datetime DEFAULT NULL COMMENT '时间',
  `fabulos` int(39) DEFAULT NULL COMMENT '点赞',
  `theme_id` varchar(39) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cute_comment` */

insert  into `cute_comment`(`id`,`user_id`,`content`,`time`,`fabulos`,`theme_id`) values ('1','1',NULL,NULL,12,'1'),('2','2',NULL,NULL,12,'1');

/*Table structure for table `cute_theme` */

DROP TABLE IF EXISTS `cute_theme`;

CREATE TABLE `cute_theme` (
  `id` varchar(36) NOT NULL COMMENT '话题id',
  `user_id` varchar(36) DEFAULT NULL COMMENT '用户id',
  `content` text COMMENT '内容',
  `create_date` datetime DEFAULT NULL COMMENT '发布时间',
  `comment_id` varchar(36) DEFAULT NULL COMMENT '评论id',
  `fabulous` int(19) DEFAULT NULL COMMENT '点赞',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cute_theme` */

insert  into `cute_theme`(`id`,`user_id`,`content`,`create_date`,`comment_id`,`fabulous`) values ('06edd8c8-29bc-43d9-93e0-304a02f575c0','06edd8c8-29bc-43d9-93e0-304a02f575c0',NULL,'2018-07-01 02:06:39',NULL,NULL),('23fa6fbd-5c54-41ab-a71e-8e24bffa7445',NULL,NULL,'2018-08-09 16:25:00',NULL,NULL),('385ce4c2-9ec6-4c4a-8224-9c37ab894f01','06edd8c8-29bc-43d9-93e0-304a02f575c0',NULL,'2018-08-09 17:44:40',NULL,NULL),('5f4634d4-f7b9-43f4-b97e-45c4b55a1440',NULL,NULL,'2018-08-09 17:21:53',NULL,NULL),('846487fb-b3c6-4ba8-aaf7-9b373cc5d264',NULL,NULL,'2018-08-09 18:04:36',NULL,NULL),('982b581c-0fdc-42f3-bb00-1300bbd3edb2',NULL,NULL,'2018-08-09 17:45:05',NULL,NULL),('a2673a57-1c38-4dfe-a7a7-50c02c66df9e',NULL,NULL,'2018-07-01 02:06:37',NULL,NULL),('af081f35-608e-4287-a5a2-143003e082ea','06edd8c8-29bc-43d9-93e0-304a02f575c0','06edd8c8-29bc-43d9-93e0-304a02f575c0','2018-08-09 16:27:27',NULL,NULL),('bd2a2972-73d6-4a7d-bcea-0227ced1c32b',NULL,NULL,'2018-08-09 17:45:44',NULL,NULL),('db83ca3c-9cf4-42bb-ac8a-11d28cdfa1c7',NULL,NULL,'2018-07-01 02:06:31',NULL,NULL),('dbc75a22-4c42-464f-a5fe-32f08332a06e',NULL,NULL,'2018-08-09 17:52:20',NULL,NULL),('df96022b-b5a4-4e72-9101-46cd6e05c2c0',NULL,NULL,'2018-08-09 17:53:51',NULL,NULL),('f0259b2d-62ba-4ba6-a914-8282948ad3f6',NULL,NULL,'2018-07-01 02:06:25',NULL,NULL),('fd33afca-bb71-4e92-a36b-50c9ff4f746a',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cute_theme_fabulos` */

DROP TABLE IF EXISTS `cute_theme_fabulos`;

CREATE TABLE `cute_theme_fabulos` (
  `user_id` varchar(29) DEFAULT NULL COMMENT '用户id',
  `theme_id` varchar(29) DEFAULT NULL COMMENT '话题id',
  `time` datetime DEFAULT NULL COMMENT '时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cute_theme_fabulos` */

insert  into `cute_theme_fabulos`(`user_id`,`theme_id`,`time`) values ('5','5','2018-08-10 19:20:22'),('5','6','2018-08-10 19:20:22'),('5','7','2018-08-10 19:20:22');

/*Table structure for table `page_picture` */

DROP TABLE IF EXISTS `page_picture`;

CREATE TABLE `page_picture` (
  `id` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(36) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '图片名称',
  `url` varchar(255) NOT NULL,
  `code` varchar(20) DEFAULT NULL COMMENT '编码,给一类图片设置一个编码,方便我们去查找',
  `description` varchar(255) DEFAULT NULL COMMENT '描述图片的位置等等',
  `sequence` int(11) DEFAULT NULL COMMENT '首页的图片排序字典',
  `cute_id` varchar(50) DEFAULT NULL COMMENT 'theme话题的id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `page_picture` */

insert  into `page_picture`(`id`,`create_date`,`create_by`,`update_date`,`update_by`,`is_deleted`,`version`,`name`,`url`,`code`,`description`,`sequence`,`cute_id`) values ('06edd8c8-29bc-43d9-93e0-304a02f575c0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'localhost:8080',NULL,NULL,NULL,'06edd8c8-29bc-43d9-93e0-304a02f575c0');

/*Table structure for table `release_information` */

DROP TABLE IF EXISTS `release_information`;

CREATE TABLE `release_information` (
  `id` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(255) DEFAULT NULL,
  `update_by` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_deleted` bit(1) DEFAULT NULL,
  `version` int(4) DEFAULT NULL,
  `total_point` int(11) DEFAULT NULL COMMENT '点赞个数',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '文本,输入的具体内容',
  `heat` int(11) DEFAULT NULL COMMENT '热度,后面可以根据heat排序',
  `read_amount` int(20) DEFAULT NULL,
  `auditor` varchar(36) DEFAULT NULL COMMENT '是由那个管理员审核的',
  `status` int(11) DEFAULT NULL COMMENT '信息刚发布时是没有审核的0,信息发布之后会审核通过为1,不通过为-1,',
  `audit_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '管理员审核的时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `release_information` */

/*Table structure for table `upload_image` */

DROP TABLE IF EXISTS `upload_image`;

CREATE TABLE `upload_image` (
  `id` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(36) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  `version` int(11) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `info_id` varchar(36) NOT NULL COMMENT '发布信息的id,这里保存上传照片的名字和url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `upload_image` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(36) DEFAULT NULL,
  `open_id` varchar(50) DEFAULT NULL,
  `id_card_front_image` varchar(255) DEFAULT NULL COMMENT '身份证图片正面URL',
  `role_id` varchar(36) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `version` int(4) DEFAULT NULL COMMENT '这是user表,里面包含基本的信息',
  `qq` varchar(15) DEFAULT NULL,
  `we_chat` varchar(15) DEFAULT NULL,
  `phone_number` varchar(11) DEFAULT NULL,
  `id_card` varchar(18) NOT NULL COMMENT '身份证号',
  `id_card_back_image` varchar(255) DEFAULT NULL COMMENT '身份证图片反面URL',
  `user_name` varchar(100) DEFAULT NULL,
  `user_image` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `email` varchar(15) DEFAULT NULL COMMENT '邮箱',
  `sex` bit(1) DEFAULT NULL COMMENT '性别  0 是男,1是女',
  `address` varchar(255) DEFAULT NULL,
  `province` varchar(15) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `area` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
