/*
MySQL Data Transfer
Source Host: 114.115.184.18
Source Database: bbs_message
Target Host: 114.115.184.18
Target Database: bbs_message
Date: 2018/6/5 12:09:11
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for msg
-- ----------------------------
CREATE TABLE `msg` (
  `msgid` int(11) NOT NULL,
  `username` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `msgcontent` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `state` int(11) NOT NULL,
  `sendto` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `msg_create_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for msg_userinfo
-- ----------------------------
CREATE TABLE `msg_userinfo` (
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `msg` VALUES ('-922360749', '123', '123', '123', '1', '234', '2018-06-04 15:18:46');
INSERT INTO `msg` VALUES ('884151824', '123', 'hello', '你好，我的朋友，我是牛靖翔', '1', '201598093', '2018-06-04 18:55:59');
INSERT INTO `msg` VALUES ('2085429025', '123', 'hello ', '你好呀', '0', '201598093', '2018-06-04 18:57:19');
INSERT INTO `msg` VALUES ('-1413810819', '123', '你好，管理员', '你好，报上你的名来', '1', 'admin', '2018-06-04 18:58:05');
INSERT INTO `msg` VALUES ('-108997645', '123', '123', '123', '0', '201598093', '2018-06-04 18:58:53');
INSERT INTO `msg` VALUES ('1884377872', '123', 'Hello', 'Hello\r\n', '0', '234', '2018-06-04 10:59:30');
INSERT INTO `msg` VALUES ('-51907191', 'njx', '11', 'nihao', '0', '201598093', '2018-06-04 19:01:16');
INSERT INTO `msg` VALUES ('-510255388', 'admin', 'adadad', 'hehehehehhehe', '1', '0', '2018-06-04 19:04:36');
INSERT INTO `msg` VALUES ('-559669052', '789', '123', '123', '0', 'lion', '2018-06-04 19:10:35');
INSERT INTO `msg` VALUES ('-2105736865', 'bwt', '你太牛比了', 'ssw真是牛逼', '1', 'sunshiwei', '2018-06-04 19:13:38');
INSERT INTO `msg` VALUES ('1523119359', 'QJWSB', '傻B秦嘉伟', '秦嘉伟傻B', '1', 'SBQJW', '2018-06-04 19:14:41');
INSERT INTO `msg` VALUES ('109367396', 'sunshiwei', 'asdfgmb', 'nizhenshitainiubile ', '1', 'bwt', '2018-06-04 19:20:09');
INSERT INTO `msg` VALUES ('1238654838', '233', 'kqh', 'kqh123', '233', '0', '2018-06-04 19:23:03');
INSERT INTO `msg` VALUES ('1238654838', '233', 'kqh', 'kqh123', '233', '0', '2018-06-04 19:23:03');
INSERT INTO `msg` VALUES ('881951207', 'bwt', 'ssw', 'ssw', '1', 'sunshiwei', '2018-06-04 19:23:20');
INSERT INTO `msg` VALUES ('-875533633', 'SBQJW', '屌屌刘屌屌不屌', '屌屌屌屌成了屌', '0', '刘屌', '2018-06-04 19:24:15');
INSERT INTO `msg` VALUES ('-219975085', 'wr', 'ff', 'sd', '0', 'cyl', '2018-06-04 19:26:25');
INSERT INTO `msg` VALUES ('1760889661', 'zhao', '123', 'hei', '0', '刘元虎', '2018-06-04 19:31:23');
INSERT INTO `msg` VALUES ('1688157471', '刘屌', 'dddld', '123', '0', '刘元虎', '2018-06-04 19:32:35');
INSERT INTO `msg` VALUES ('389514853', '1', 'ssss', 'sssssssss', '0', '0', '2018-06-04 19:35:13');
INSERT INTO `msg` VALUES ('-157611226', '1', 'hello', '我爱你', '0', 'oyc', '2018-06-04 19:37:17');
INSERT INTO `msg` VALUES ('113381588', '1', 'sda', 'vfdsfasdfdasfd', '0', 'njx', '2018-06-04 19:34:37');
INSERT INTO `msg` VALUES ('837159499', 'ゼロツー', '大好きだ', 'ダーリン僕は君と出会えてよかった', '0', 'ヒロ', '2018-06-04 19:34:04');
INSERT INTO `msg` VALUES ('1455059703', '234', 'qqqqqqqqqqqqq', 'xxxxxxxxxxxxxxx', '1', '0', '2018-06-04 19:38:39');
INSERT INTO `msg` VALUES ('-1808918387', '233', '111', '111', '1', '0', '2018-06-04 19:39:13');
INSERT INTO `msg` VALUES ('-1781990144', '233', '11', '11', '1', '0', '2018-06-04 19:39:28');
INSERT INTO `msg` VALUES ('1431438953', '1', '555555', '55555555', '233', '0', '2018-06-04 19:39:47');
INSERT INTO `msg` VALUES ('-1398280018', 'zsm', 'LD', '123456', '1', 'ttt', '2018-06-04 19:38:43');
INSERT INTO `msg` VALUES ('-1019197329', 'zxf123', '宋', '你也美', '1', 'zxf456', '2018-06-04 19:38:27');
INSERT INTO `msg` VALUES ('-1419910458', '233', '555', '555', '0', '0', '2018-06-04 19:39:57');
INSERT INTO `msg` VALUES ('-1496233432', '233', '啸宇NB', '啸宇NB666', '999', '0', '2018-06-04 19:40:36');
INSERT INTO `msg` VALUES ('-1496233432', '233', '啸宇NB', '啸宇NB666', '999', '0', '2018-06-04 19:40:36');
INSERT INTO `msg` VALUES ('1063296448', 'ゼロツー', '000', '001', '1', '広', '2018-06-04 19:41:40');
INSERT INTO `msg` VALUES ('870848127', '1111111', 'lijiaxin', 'lijiaxin', '1', 'aaa', '2018-06-04 19:42:06');
INSERT INTO `msg` VALUES ('-556323878', '1111111', '23123', '23123', '1', 'aaa', '2018-06-04 19:43:10');
INSERT INTO `msg` VALUES ('711133397', 'zxf123', 'aaa', 'aa', '0', 'zxf456', '2018-06-04 19:43:24');
INSERT INTO `msg` VALUES ('657103296', 'aaa', 'sfsdsdf', 'aafsdfs', '1', '1111111', '2018-06-04 19:45:19');
INSERT INTO `msg` VALUES ('-1466861791', '1', 'ff', 'ff', '0', 'yyc', '2018-06-04 19:48:12');
INSERT INTO `msg` VALUES ('1191221088', '000', '11111', '11111', '0', 'abc', '2018-06-04 19:46:00');
INSERT INTO `msg` VALUES ('-2137036672', '', '123', '123', '0', '098', '2018-06-04 20:46:56');
INSERT INTO `msg` VALUES ('328068589', 'a1234', 'dsadas', 'sadasdsadas', '1', 'a123', '2018-06-04 19:47:24');
INSERT INTO `msg` VALUES ('-577991947', 'a123', 'dsadas', 'dasdasdas', '0', 'a1234', '2018-06-04 19:47:44');
INSERT INTO `msg` VALUES ('1938822666', '1', 'dsasd', 'asdasda', '0', '098', '2018-06-04 19:49:01');
INSERT INTO `msg` VALUES ('1154038281', 'cjy', 'gggggg', 'gggggggggg', '1', 'oyc', '2018-06-04 19:52:09');
INSERT INTO `msg` VALUES ('261807128', 'aaa', 'asdsfa', 'sadasdas', '1', '1111111', '2018-06-04 19:56:01');
INSERT INTO `msg` VALUES ('897140671', '777', '777', '777', '1', 'song', '2018-06-04 20:05:38');
INSERT INTO `msg` VALUES ('72153443', 'liuyunfeng', 'aCFSC', 'AVDZC', '0', '11223', '2018-06-04 20:06:54');
INSERT INTO `msg` VALUES ('1987319399', 'zsm', '12', '1212', '0', 'lion', '2018-06-04 20:06:22');
INSERT INTO `msg` VALUES ('-1726974699', 'wjh123', '23', '233', '0', '11223', '2018-06-04 20:09:19');
INSERT INTO `msg` VALUES ('1761212825', 'liuyunfeng', 'gfhb', 'ghcjhkl', '0', '1233', '2018-06-04 20:08:35');
INSERT INTO `msg` VALUES ('-592462540', '777', 'dashabi', 'sadasdasd', '1', 'wjh123', '2018-06-04 20:12:27');
INSERT INTO `msg` VALUES ('1873646650', 'wjh123', 'fgdgdg', 'dfgdfg', '0', '1111111', '2018-06-04 20:10:12');
INSERT INTO `msg` VALUES ('761126528', '233', '12222', '12222', '1', '999', '2018-06-04 20:11:26');
INSERT INTO `msg` VALUES ('1547551539', '000', 'asd', 'asdasd', '0', '11223', '2018-06-04 20:09:33');
INSERT INTO `msg` VALUES ('-126908169', 'zj', '12', '123', '0', '1111111', '2018-06-04 21:14:25');
INSERT INTO `msg` VALUES ('-2013240622', 'zj', 'sw', 'wswde', '0', 'admin', '2018-06-04 21:15:06');
INSERT INTO `msg` VALUES ('-2040100894', '123', '123', 'ggg', '0', '', '2018-06-04 20:19:13');
INSERT INTO `msg` VALUES ('-1162532722', 'zj', '123', '123', '0', '098', '2018-06-04 21:22:13');
INSERT INTO `msg` VALUES ('1005621367', 'xueyu', 'why', 'tell me.', '1', 'xueyu', '2018-06-04 20:22:25');
INSERT INTO `msg` VALUES ('1615733446', 'wjh123', 'sahsabi', 'dasdasd', '0', 'zhj123', '2018-06-04 20:29:43');
INSERT INTO `msg` VALUES ('-1503824996', 'wjh123', 'dsadsa', 'dasdasdas', '1', '777', '2018-06-04 20:30:08');
INSERT INTO `msg` VALUES ('2075933425', '123', '323', '211', '0', '12123', '2018-06-04 20:24:39');
INSERT INTO `msg` VALUES ('-626589367', 'pujunyi', 'test', '你好', '0', '马瑞新111', '2018-06-04 20:32:54');
INSERT INTO `msg` VALUES ('-1360316957', 'pujunyi', 'adm', 'aaaaa', '0', 'admin', '2018-06-04 20:35:08');
INSERT INTO `msg` VALUES ('1864586641', '1', '123', '12345654321', '0', 'yyc', '2018-06-04 20:31:02');
INSERT INTO `msg` VALUES ('366859070', '234', '456', '789', '0', '', '2018-06-04 20:38:47');
INSERT INTO `msg` VALUES ('110011397', '2', '3', '123123123', '1', '3', '2018-06-04 21:31:37');
INSERT INTO `msg` VALUES ('-2053133046', '3', '123', '123123123123', '1', '2', '2018-06-04 21:32:02');
INSERT INTO `msg` VALUES ('-1534286217', 'xueyu', 'today', 'is a good day!', '1', 'xueyu', '2018-06-04 21:48:51');
INSERT INTO `msg` VALUES ('2129435929', '1', '111', '111', '0', '0', '2018-06-05 10:29:19');
INSERT INTO `msg` VALUES ('958005979', '000', '111', '111', '1', '0', '2018-06-05 10:29:35');
INSERT INTO `msg` VALUES ('124144320', '1', '000', '0000', '0', '0', '2018-06-05 10:29:46');
INSERT INTO `msg` VALUES ('1680538450', 'cjy', 'aaaa', 'aaaaaa', '0', '0', '2018-06-05 10:30:15');
INSERT INTO `msg` VALUES ('1018476032', '000', 'ff', 'fff', '555', '0', '2018-06-05 10:41:47');
INSERT INTO `msg` VALUES ('-393088919', '555', '000', '000', '0', '0', '2018-06-05 10:42:10');
INSERT INTO `msg` VALUES ('1401617605', '555', '2222222222', '222222222222', '0', '0', '2018-06-05 10:42:46');
INSERT INTO `msg` VALUES ('-1236974969', '000', 'hello', 'hello', '1', 'cjy', '2018-06-05 11:13:43');
INSERT INTO `msg` VALUES ('45097125', 'cjy', '111', '111', '1', '000', '2018-06-05 11:16:35');
INSERT INTO `msg_userinfo` VALUES ('', '', '');
INSERT INTO `msg_userinfo` VALUES ('000', '000', '000');
INSERT INTO `msg_userinfo` VALUES ('098', '098', '098');
INSERT INTO `msg_userinfo` VALUES ('1', '1', '1');
INSERT INTO `msg_userinfo` VALUES ('1111111', '123', '111');
INSERT INTO `msg_userinfo` VALUES ('11223', '111', '111');
INSERT INTO `msg_userinfo` VALUES ('112233', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('12', '12', '12');
INSERT INTO `msg_userinfo` VALUES ('12123', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('123', '234', '123');
INSERT INTO `msg_userinfo` VALUES ('123123312', '321', '321');
INSERT INTO `msg_userinfo` VALUES ('1233', '1233', 'as@qq');
INSERT INTO `msg_userinfo` VALUES ('123321123', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('123456654', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('2', '2', '2');
INSERT INTO `msg_userinfo` VALUES ('201598076', '123456', '0000');
INSERT INTO `msg_userinfo` VALUES ('201598093', '123456', '111111');
INSERT INTO `msg_userinfo` VALUES ('233', '233', '233');
INSERT INTO `msg_userinfo` VALUES ('234', '234', '234');
INSERT INTO `msg_userinfo` VALUES ('3', '3', '3');
INSERT INTO `msg_userinfo` VALUES ('345', '345', '345');
INSERT INTO `msg_userinfo` VALUES ('4', '4', '4');
INSERT INTO `msg_userinfo` VALUES ('454', '444', '444');
INSERT INTO `msg_userinfo` VALUES ('5', '5', '5');
INSERT INTO `msg_userinfo` VALUES ('555', '555', '123');
INSERT INTO `msg_userinfo` VALUES ('741258', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('753', '951', '456');
INSERT INTO `msg_userinfo` VALUES ('777', '777', '777');
INSERT INTO `msg_userinfo` VALUES ('789', '789', '789');
INSERT INTO `msg_userinfo` VALUES ('89089', '89089', '89089');
INSERT INTO `msg_userinfo` VALUES ('890891', '890891', '890891');
INSERT INTO `msg_userinfo` VALUES ('90-', '0--', '90-');
INSERT INTO `msg_userinfo` VALUES ('963852', '456', '456');
INSERT INTO `msg_userinfo` VALUES ('987', '987', '987');
INSERT INTO `msg_userinfo` VALUES ('999', '999', '999');
INSERT INTO `msg_userinfo` VALUES ('a1', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('a123', '111', '111');
INSERT INTO `msg_userinfo` VALUES ('a1234', '111', '111');
INSERT INTO `msg_userinfo` VALUES ('a2', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('aaa', 'aaa', 'aaa');
INSERT INTO `msg_userinfo` VALUES ('abc', 'abc', 'abc@abc.com');
INSERT INTO `msg_userinfo` VALUES ('admin', 'admin', '3370677@qq.com');
INSERT INTO `msg_userinfo` VALUES ('alan', 'a;an', 'alan');
INSERT INTO `msg_userinfo` VALUES ('asd', 'asd', 'asd');
INSERT INTO `msg_userinfo` VALUES ('bwt', 'bwt', 'bwt@nb.com');
INSERT INTO `msg_userinfo` VALUES ('cjy', 'cjy', 'adasda');
INSERT INTO `msg_userinfo` VALUES ('complex', 'xueyu', 'xueyu');
INSERT INTO `msg_userinfo` VALUES ('cyl', '123', '123@163.comm');
INSERT INTO `msg_userinfo` VALUES ('dave', '123', 'qq');
INSERT INTO `msg_userinfo` VALUES ('gyw', 'gyw', 'gyw');
INSERT INTO `msg_userinfo` VALUES ('hhh', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('hhhh', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('lion', '1245', 'lion@162.com');
INSERT INTO `msg_userinfo` VALUES ('lirunnan', 'liruinan', 'lirunnan');
INSERT INTO `msg_userinfo` VALUES ('liu', 'xiao', '123');
INSERT INTO `msg_userinfo` VALUES ('liuyunfeng', '123', '321');
INSERT INTO `msg_userinfo` VALUES ('LLLLLLL', '123', '321');
INSERT INTO `msg_userinfo` VALUES ('lw', 'lw', 'lw');
INSERT INTO `msg_userinfo` VALUES ('mmm', 'mmm', '111');
INSERT INTO `msg_userinfo` VALUES ('njx', 'njx', '123');
INSERT INTO `msg_userinfo` VALUES ('oyc', 'oyc', 'oyc');
INSERT INTO `msg_userinfo` VALUES ('oycsb', 'oycsb', 'oycsb@qq.com');
INSERT INTO `msg_userinfo` VALUES ('pujunyi', '123456', '');
INSERT INTO `msg_userinfo` VALUES ('song', '123', '321');
INSERT INTO `msg_userinfo` VALUES ('sunshiwei', 'ssw', 'ssw@nb.com');
INSERT INTO `msg_userinfo` VALUES ('ttt', '123', '');
INSERT INTO `msg_userinfo` VALUES ('wang', '123', '123@163.com');
INSERT INTO `msg_userinfo` VALUES ('wjh123', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('wr', '123', '123@ddd');
INSERT INTO `msg_userinfo` VALUES ('wxl1', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('xueyu', 'xueyu', 'xueyu');
INSERT INTO `msg_userinfo` VALUES ('yfl666', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('yyc', 'yyc', 'yyc');
INSERT INTO `msg_userinfo` VALUES ('yyc123', 'oyc456', '444');
INSERT INTO `msg_userinfo` VALUES ('zhao', '124', 'zhao@qq.com');
INSERT INTO `msg_userinfo` VALUES ('zhj123', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('zj', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('zsm', 'sb', 'sb');
INSERT INTO `msg_userinfo` VALUES ('zxf123', '123', '123');
INSERT INTO `msg_userinfo` VALUES ('zxf456', '456', '456');
INSERT INTO `msg_userinfo` VALUES ('ゼロツー', '002', 'zero');
INSERT INTO `msg_userinfo` VALUES ('広', '016', 'hiro');
INSERT INTO `msg_userinfo` VALUES ('膜拜', '各位大佬', '哈哈哈');
INSERT INTO `msg_userinfo` VALUES ('马瑞新111', '123', '123');
