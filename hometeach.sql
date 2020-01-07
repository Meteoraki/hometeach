/*
Navicat MySQL Data Transfer

Source Server         : Meteora
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : hometeach

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-01-07 21:06:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for tb_feedback
-- ----------------------------
DROP TABLE IF EXISTS `tb_feedback`;
CREATE TABLE `tb_feedback` (
  `feedback_id` int(255) NOT NULL,
  `order_id` int(255) NOT NULL,
  `feedback_score` int(8) NOT NULL,
  `feedback_who` int(8) NOT NULL,
  `feedback_words` varchar(255) NOT NULL,
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_feedback
-- ----------------------------

-- ----------------------------
-- Table structure for tb_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem`;
CREATE TABLE `tb_orderitem` (
  `order_id` int(11) NOT NULL,
  `student_id` varchar(255) NOT NULL,
  `order_grade` varchar(255) NOT NULL,
  `order_subject` varchar(255) NOT NULL,
  `order_pay` int(8) NOT NULL,
  `order_place` varchar(255) NOT NULL,
  `order_state` varchar(255) NOT NULL,
  `order_time` double(16,0) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `order_id` (`order_id`,`student_id`),
  KEY `student_id` (`student_id`,`order_id`),
  KEY `student_id_2` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orderitem
-- ----------------------------
INSERT INTO `tb_orderitem` VALUES ('1', '1001', '初三', '英语', '90', '思明区', '0', '1');

-- ----------------------------
-- Table structure for tb_orderlist
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderlist`;
CREATE TABLE `tb_orderlist` (
  `order_id` int(11) NOT NULL,
  `student_id` varchar(255) NOT NULL,
  `teacher_id` varchar(255) DEFAULT NULL,
  `order_state` int(8) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `1` FOREIGN KEY (`order_id`) REFERENCES `tb_orderitem` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_orderlist
-- ----------------------------

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `student_id` int(8) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `student_password` varchar(255) NOT NULL,
  `student_phone` varchar(255) NOT NULL,
  `student_email` varchar(255) NOT NULL,
  `student_score` double(16,0) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1001', '赵六', '123', '2222222', '123@163.com', '154');
INSERT INTO `tb_student` VALUES ('1002', '王一博', '123', '3333333', '321@163.com', '121');
INSERT INTO `tb_student` VALUES ('1003', '罗志祥', '123', '4444444', '111@163.com', '133');
INSERT INTO `tb_student` VALUES ('1004', '吴亦凡', '123', '5555555', '222@163.com', '166');
INSERT INTO `tb_student` VALUES ('1006', '李若草', '123', '6666666', '333@163.com', '122');

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_name` varchar(255) NOT NULL,
  `teacher_password` varchar(255) NOT NULL,
  `teacher_phone` varchar(255) DEFAULT NULL,
  `teacher_email` varchar(255) DEFAULT NULL,
  `teacher_score` double(16,0) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES ('2001', '张三', '123123', null, null, '333');
INSERT INTO `tb_teacher` VALUES ('2002', '李四', '123', null, null, '222');
