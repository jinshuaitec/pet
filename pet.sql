/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : pet

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-11 21:28:22
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
-- Table structure for file_upload
-- ----------------------------
DROP TABLE IF EXISTS `file_upload`;
CREATE TABLE `file_upload` (
  `id` varchar(36) NOT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `ext` varchar(10) DEFAULT NULL COMMENT '后缀',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file_upload
-- ----------------------------
INSERT INTO `file_upload` VALUES ('2b54a03c-1e6d-4733-9490-b9afd1491221', 'jins', null, '2018-08-11 21:18:29', null, 'slider.jpg', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/slider1533993495955.jpg', '.jpg');
INSERT INTO `file_upload` VALUES ('331e4208-c6e6-4395-887f-b3c83e92588b', 'jins', null, '2018-08-11 21:21:34', null, 'hospital.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/hospital1533993692047.png', '.png');
INSERT INTO `file_upload` VALUES ('3db8442b-03bd-400b-a91c-35902096aa86', 'jins', null, '2018-08-11 21:20:57', null, 'baseenter.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/baseenter1533993654269.png', '.png');
INSERT INTO `file_upload` VALUES ('46a0c070-1ba7-4292-bb61-65a3d6302aa9', 'jins', null, '2018-08-11 21:19:44', null, 'adopt.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/adopt1533993581000.png', '.png');
INSERT INTO `file_upload` VALUES ('60b7f48a-4854-401b-885a-5d10d77ccacc', 'jins', null, '2018-08-11 21:22:53', null, 'showtime.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/showtime1533993770836.png', '.png');
INSERT INTO `file_upload` VALUES ('6c504341-7f61-4fc2-904e-08c4597f4254', 'jins', null, '2018-08-11 16:39:45', null, 'DjQ2VsBX4AA2or-.jpg', null, null, 'http://pd4f8altw.bkt.clouddn.com/DjQ2VsBX4AA2or-1533976783115.jpg', '.jpg');
INSERT INTO `file_upload` VALUES ('7290e82d-4c86-4213-b912-ff6c1842a946', 'jins', null, '2018-08-11 21:26:48', null, 'showtime.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/showtime1533994005577.png', '.png');
INSERT INTO `file_upload` VALUES ('b471de5a-2e4e-4db7-9d2d-efdd60a2628b', 'jins', null, '2018-08-11 21:22:26', null, 'seek.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/seek1533993743744.png', '.png');
INSERT INTO `file_upload` VALUES ('d256f484-b2f9-402b-9f69-ea122eec8c03', 'jins', null, '2018-08-11 21:21:59', null, 'postulant.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/postulant1533993717760.png', '.png');
INSERT INTO `file_upload` VALUES ('e9b4a1fb-c861-468d-9990-2e0103a87a2e', 'jins', null, '2018-08-11 21:24:08', null, 'successadopt.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/successadopt1533993845538.png', '.png');
INSERT INTO `file_upload` VALUES ('ef04f8f8-42c5-49a8-babd-b9d7a86b5874', 'jins', null, '2018-08-11 21:20:15', null, 'base.png', null, '\0', 'http://pd4f8altw.bkt.clouddn.com/base1533993612549.png', '.png');

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
INSERT INTO `page_picture` VALUES ('123213213', '2018-08-11 21:26:01', 'jins', '2018-08-11 21:26:01', null, '\0', '1', 'slider.jpg', 'http://pd4f8altw.bkt.clouddn.com/slider1533993495955.jpg', 'SOWING_MAP', '轮播图', null);
INSERT INTO `page_picture` VALUES ('123213231', '2018-08-11 21:27:02', 'jins', '2018-08-11 21:27:02', null, '\0', '1', 'adopt.png', 'http://pd4f8altw.bkt.clouddn.com/adopt1533993581000.png', 'PAGE_MENU', '领养宠物', '1');
INSERT INTO `page_picture` VALUES ('123213232', '2018-08-11 21:27:03', 'jins', '2018-08-11 21:27:03', null, '\0', '1', 'base.png', 'http://pd4f8altw.bkt.clouddn.com/base1533993612549.png', 'PAGE_MENU', '宠物基地', '2');
INSERT INTO `page_picture` VALUES ('123213233', '2018-08-11 21:27:04', 'jins', '2018-08-11 21:27:04', null, '\0', '1', 'baseenter.png', 'http://pd4f8altw.bkt.clouddn.com/baseenter1533993654269.png', 'PAGE_MENU', '基地入驻', '3');
INSERT INTO `page_picture` VALUES ('123213234', '2018-08-11 21:27:05', 'jins', '2018-08-11 21:27:05', null, '\0', '1', 'hospital.png', 'http://pd4f8altw.bkt.clouddn.com/hospital1533993692047.png', 'PAGE_MENU', '周围医院', '4');
INSERT INTO `page_picture` VALUES ('123213235', '2018-08-11 21:27:07', 'jins', '2018-08-11 21:27:07', null, '\0', '1', 'postulant.png', 'http://pd4f8altw.bkt.clouddn.com/postulant1533993717760.png', 'PAGE_MENU', '志愿者', '5');
INSERT INTO `page_picture` VALUES ('123213236', '2018-08-11 21:27:09', 'jins', '2018-08-11 21:27:09', null, '\0', '1', 'seek.png', 'http://pd4f8altw.bkt.clouddn.com/seek1533993743744.png', 'PAGE_MENU', '紧急寻找', '6');
INSERT INTO `page_picture` VALUES ('123213237', '2018-08-11 21:27:10', 'jins', '2018-08-11 21:27:10', null, '\0', '1', 'showtime.png', 'http://pd4f8altw.bkt.clouddn.com/showtime1533994005577.png', 'PAGE_MENU', '萌宠时刻', '7');
INSERT INTO `page_picture` VALUES ('123213238', '2018-08-11 21:27:11', 'jins', '2018-08-11 21:27:11', null, '\0', '1', 'successadopt.png', 'http://pd4f8altw.bkt.clouddn.com/successadopt1533993845538.png', 'PAGE_MENU', '领养墙', '8');

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
  `auditor` varchar(36) DEFAULT NULL COMMENT '是由那个管理员审核的',
  `status` int(11) DEFAULT NULL COMMENT '信息刚发布时是没有审核的0,信息发布之后会审核通过为1,不通过为-1,',
  `audit_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '管理员审核的时间',
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `area` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of release_information
-- ----------------------------
INSERT INTO `release_information` VALUES ('1312321', '2018-08-11 14:53:10', null, null, null, '\0', '1', '12', '324234', '252432', '234', '23', '2323', '1', '2018-08-11 14:53:40', '232', '23', '23');
INSERT INTO `release_information` VALUES ('1312321w', '2018-08-11 14:53:10', null, null, null, '\0', '1', '12', '324234', '252432', '234', '23', '2323', '1', '2018-08-11 14:53:40', '232', '23', '23');
INSERT INTO `release_information` VALUES ('13123321', '2018-08-11 14:53:10', null, null, null, '\0', '1', '12', '324234', '252432', '234', '23', '2323', '1', '2018-08-11 14:53:40', '232', '23', '23');

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
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
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
INSERT INTO `user` VALUES ('718f38f8-95a8-45a5-afd0-9cdbe171f488', '2018-08-05 22:07:11', 'jins', null, null, null, null, null, '\0', null, '552368176', '552368176', '18897969090', 'string', null, null, null, '767957644@qq.com', '', '江苏省苏州市', null, null, null);
