/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.30 : Database - caibang_master
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`caibang_master` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `caibang_master`;

/*Table structure for table `s_company` */

DROP TABLE IF EXISTS `s_company`;

CREATE TABLE `s_company` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_company_name` varchar(50) NOT NULL,
  `s_company_address` varchar(200) DEFAULT NULL,
  `s_company_web` varchar(100) DEFAULT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL DEFAULT '1970-01-01 00:00:00',
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_company` */

/*Table structure for table `s_department` */

DROP TABLE IF EXISTS `s_department`;

CREATE TABLE `s_department` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_dept_num` varchar(16) NOT NULL,
  `s_dept_name` varchar(20) NOT NULL,
  `s_dept_member_sum` int(11) NOT NULL DEFAULT '0',
  `s_dept_slogin` varchar(200) DEFAULT NULL,
  `s_cid` int(11) DEFAULT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL DEFAULT '1970-01-01 00:00:00',
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_department` */

/*Table structure for table `s_login_log` */

DROP TABLE IF EXISTS `s_login_log`;

CREATE TABLE `s_login_log` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_user_id` int(11) NOT NULL,
  `s_user_name` varchar(20) NOT NULL,
  `s_login_type` tinyint(1) DEFAULT NULL,
  `s_login_ip` varchar(30) DEFAULT NULL,
  `s_login_address` varchar(200) DEFAULT NULL,
  `s_login_brower` varchar(60) DEFAULT NULL,
  `s_login_lon` varchar(20) DEFAULT NULL,
  `s_login_lat` varchar(20) DEFAULT NULL,
  `s_login_start_time` datetime DEFAULT NULL,
  `s_login_end_time` datetime DEFAULT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_login_log` */

/*Table structure for table `s_menu` */

DROP TABLE IF EXISTS `s_menu`;

CREATE TABLE `s_menu` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_menu_type` int(11) NOT NULL,
  `s_menu_code` varchar(60) NOT NULL,
  `s_menu_name` varchar(100) NOT NULL,
  `s_menu_url` varchar(100) DEFAULT NULL,
  `s_menu_icon` varchar(50) DEFAULT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL DEFAULT '1970-01-01 00:00:00',
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_menu` */

/*Table structure for table `s_operator_log` */

DROP TABLE IF EXISTS `s_operator_log`;

CREATE TABLE `s_operator_log` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_user_id` int(11) NOT NULL,
  `s_user_name` varchar(20) NOT NULL,
  `s_operator_type` tinyint(1) NOT NULL,
  `s_operator_url` varchar(200) DEFAULT NULL,
  `s_operator_content` blob,
  `create_at` datetime NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_operator_log` */

/*Table structure for table `s_role` */

DROP TABLE IF EXISTS `s_role`;

CREATE TABLE `s_role` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_role_code` varchar(16) NOT NULL,
  `s_role_name` varchar(16) NOT NULL,
  `s_role_parent_id` int(11) DEFAULT NULL,
  `s_cid` int(11) NOT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL DEFAULT '1970-01-01 00:00:00',
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_role` */

/*Table structure for table `s_role_menu` */

DROP TABLE IF EXISTS `s_role_menu`;

CREATE TABLE `s_role_menu` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_role_id` int(11) NOT NULL,
  `s_menu_id` int(11) NOT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL,
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_role_menu` */

/*Table structure for table `s_user` */

DROP TABLE IF EXISTS `s_user`;

CREATE TABLE `s_user` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_login_name` varchar(20) NOT NULL,
  `s_phone` varchar(11) NOT NULL,
  `s_password` varchar(100) NOT NULL,
  `s_name` varchar(200) NOT NULL,
  `s_card` varchar(19) NOT NULL,
  `s_openid` varchar(200) DEFAULT NULL,
  `s_head_img` varchar(300) DEFAULT NULL,
  `s_gender` varchar(1) DEFAULT NULL,
  `s_birthday` date DEFAULT NULL,
  `s_status` int(1) DEFAULT NULL,
  `s_cid` int(11) DEFAULT NULL,
  `s_depid` int(11) DEFAULT NULL,
  `s_user_type` int(1) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `delete_at` datetime DEFAULT '1970-01-01 00:00:00',
  `operator_id` int(11) DEFAULT NULL,
  `operator_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`s_id`,`s_login_name`,`s_phone`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `s_user` */

insert  into `s_user`(`s_id`,`s_login_name`,`s_phone`,`s_password`,`s_name`,`s_card`,`s_openid`,`s_head_img`,`s_gender`,`s_birthday`,`s_status`,`s_cid`,`s_depid`,`s_user_type`,`create_at`,`update_at`,`delete_at`,`operator_id`,`operator_name`) values (1,'admin','15594952639','000000','liqiong','610423199305143000',NULL,NULL,'1','1993-05-14',1,1,1,1,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `s_user_role` */

DROP TABLE IF EXISTS `s_user_role`;

CREATE TABLE `s_user_role` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_user_id` int(11) NOT NULL,
  `s_role_id` int(11) NOT NULL,
  `create_at` datetime NOT NULL,
  `update_at` datetime NOT NULL,
  `delete_at` datetime NOT NULL,
  `operator_id` int(11) NOT NULL,
  `operator_name` varchar(20) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
