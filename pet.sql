/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : pet

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-05 12:57:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for adopt_pet
-- ----------------------------
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

-- ----------------------------
-- Records of adopt_pet
-- ----------------------------

-- ----------------------------
-- Table structure for page_picture
-- ----------------------------
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of page_picture
-- ----------------------------

-- ----------------------------
-- Table structure for release_information
-- ----------------------------
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of release_information
-- ----------------------------

-- ----------------------------
-- Table structure for upload_image
-- ----------------------------
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

-- ----------------------------
-- Records of upload_image
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
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

-- ----------------------------
-- Records of user
-- ----------------------------
