# ComputerApplicationHomeWorkServer

简历系统服务端，提供数据给APP，项目地址如下

https://github.com/gyh724111/ComputerApplicationHomeWorkAndroid


依赖本地数据库，涉及6张表

```
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(11) DEFAULT NULL,
  `type` int(11) DEFAULT '0' COMMENT '0-用户 1-boss',
  `job` char(20) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `mtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `sex` int(11) DEFAULT NULL COMMENT '0-未知 1-男 2-女',
  `birth` date DEFAULT NULL,
  `tel` varchar(13) DEFAULT NULL,
  `desc` char(11) DEFAULT NULL,
  `mail` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

```
CREATE TABLE `desc` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `desc_detail` text,
  `mtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```

```
CREATE TABLE `exp` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `org_name` char(20) DEFAULT NULL,
  `seq` int(11) DEFAULT '0',
  `is_deleted` tinyint(1) DEFAULT '0',
  `type` int(11) DEFAULT '0' COMMENT '0-工作经验 1-项目经验 2-实习经验 3=教育经验',
  `exp` text,
  `title` char(10) DEFAULT NULL,
  `duration` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
```

```
CREATE TABLE `honor` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `mtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `honor` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

```
CREATE TABLE `hobby` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `hobby` char(10) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `mtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

```
CREATE TABLE `cert` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `cert_name` char(20) DEFAULT NULL,
  `mtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```
