DROP DATABASE IF EXISTS `db_servlet`;
CREATE DATABASE `db_servlet` /*!40100 DEFAULT CHARACTER SET gb2312 */;
USE `db_servlet`;

CREATE TABLE `tb_user` (
  `userID` int(11) NOT NULL auto_increment,
  `userName` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  `joinTime` datetime default NULL,
   PRIMARY KEY (`userID`),
   KEY `useName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gb2312 COMMENT='用户表';
INSERT INTO `tb_user` VALUES (1,'penglei',123456,'2017-09-10 10:00:01');
INSERT INTO `tb_user` VALUES (2,'zhangshuqi',123456,'2017-09-10 10:00:02');
INSERT INTO `tb_user` VALUES (3,'weifang',123456,'2017-09-10 10:00:03');

CREATE TABLE `tb_message` (
  `messageID` int(11) NOT NULL auto_increment,
  `userID` int(11) default NULL,
  `userName` varchar(20) default NULL,
  `messageContent` text,
  `publishTime` datetime default NULL,
  PRIMARY KEY  (`messageID`),
  KEY `useID` (`userID`),
  KEY `useName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=gb2312 COMMENT='消息表';
INSERT INTO `tb_message` VALUES (1,1,'penglei','大家好','2017-09-10 10:00:03');
INSERT INTO `tb_message` VALUES (2,1,'penglei','儿子们好','2017-09-10 10:00:03');

ALTER TABLE `tb_message`
ADD CONSTRAINT `tb_message_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `tb_user` (`userID`),
ADD CONSTRAINT `tb_message_ibfk_2` FOREIGN KEY (`userName`) REFERENCES `tb_user` (`userName`);

CREATE TABLE `tb_file` (
  `userName` varchar(20) NOT NULL,
  `path` varchar(50) default NULL,
  `realname` varchar(30) default NULL,
   PRIMARY KEY (`userName`),
   KEY `useName` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='文件表';
insert into tb_file(userName,path,realname) values('penglei','/home/wasadmin','12.log');


