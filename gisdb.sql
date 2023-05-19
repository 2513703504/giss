/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : gisdb

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 09/05/2022 14:43:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bin
-- ----------------------------
DROP TABLE IF EXISTS `bin`;
CREATE TABLE `bin`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `bin_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `st_id` int(8) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `st_id`(`st_id`) USING BTREE,
  CONSTRAINT `bin_ibfk_1` FOREIGN KEY (`st_id`) REFERENCES `street` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 162 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bin
-- ----------------------------
INSERT INTO `bin` VALUES (1, '1', 1);
INSERT INTO `bin` VALUES (2, '2', 1);
INSERT INTO `bin` VALUES (3, '3', 1);
INSERT INTO `bin` VALUES (4, '4', 1);
INSERT INTO `bin` VALUES (5, '5', 1);
INSERT INTO `bin` VALUES (6, '6', 1);
INSERT INTO `bin` VALUES (7, '7', 1);
INSERT INTO `bin` VALUES (8, '8', 1);
INSERT INTO `bin` VALUES (9, '9', 1);
INSERT INTO `bin` VALUES (10, '10', 1);
INSERT INTO `bin` VALUES (11, '11', 2);
INSERT INTO `bin` VALUES (12, '12', 2);
INSERT INTO `bin` VALUES (13, '13', 2);
INSERT INTO `bin` VALUES (14, '14', 2);
INSERT INTO `bin` VALUES (15, '15', 2);
INSERT INTO `bin` VALUES (16, '16', 2);
INSERT INTO `bin` VALUES (17, '17', 2);
INSERT INTO `bin` VALUES (18, '18', 2);
INSERT INTO `bin` VALUES (19, '19', 2);
INSERT INTO `bin` VALUES (20, '20', 2);
INSERT INTO `bin` VALUES (21, '21', 3);
INSERT INTO `bin` VALUES (22, '22', 3);
INSERT INTO `bin` VALUES (23, '23', 3);
INSERT INTO `bin` VALUES (24, '24', 3);
INSERT INTO `bin` VALUES (25, '25', 3);
INSERT INTO `bin` VALUES (26, '26', 3);
INSERT INTO `bin` VALUES (27, '27', 3);
INSERT INTO `bin` VALUES (28, '28', 3);
INSERT INTO `bin` VALUES (29, '29', 3);
INSERT INTO `bin` VALUES (30, '30', 3);
INSERT INTO `bin` VALUES (31, '31', 4);
INSERT INTO `bin` VALUES (32, '32', 4);
INSERT INTO `bin` VALUES (33, '33', 4);
INSERT INTO `bin` VALUES (34, '34', 4);
INSERT INTO `bin` VALUES (35, '35', 4);
INSERT INTO `bin` VALUES (36, '36', 4);
INSERT INTO `bin` VALUES (37, '37', 4);
INSERT INTO `bin` VALUES (38, '38', 4);
INSERT INTO `bin` VALUES (39, '39', 4);
INSERT INTO `bin` VALUES (40, '40', 4);
INSERT INTO `bin` VALUES (41, '41', 4);
INSERT INTO `bin` VALUES (42, '42', 4);
INSERT INTO `bin` VALUES (43, '43', 4);
INSERT INTO `bin` VALUES (44, '44', 4);
INSERT INTO `bin` VALUES (45, '45', 4);
INSERT INTO `bin` VALUES (46, '6', 5);
INSERT INTO `bin` VALUES (47, '47', 5);
INSERT INTO `bin` VALUES (48, '48', 5);
INSERT INTO `bin` VALUES (49, '49', 5);
INSERT INTO `bin` VALUES (50, '50', 5);
INSERT INTO `bin` VALUES (51, '51', 5);
INSERT INTO `bin` VALUES (52, '52', 5);
INSERT INTO `bin` VALUES (53, '53', 5);
INSERT INTO `bin` VALUES (54, '54', 5);
INSERT INTO `bin` VALUES (55, '55', 5);
INSERT INTO `bin` VALUES (56, '56', 5);
INSERT INTO `bin` VALUES (57, '57', 6);
INSERT INTO `bin` VALUES (58, '58', 6);
INSERT INTO `bin` VALUES (59, '59', 6);
INSERT INTO `bin` VALUES (60, '60', 6);
INSERT INTO `bin` VALUES (61, '61', 6);
INSERT INTO `bin` VALUES (62, '62', 6);
INSERT INTO `bin` VALUES (63, '63', 6);
INSERT INTO `bin` VALUES (64, '64', 6);
INSERT INTO `bin` VALUES (65, '65', 7);
INSERT INTO `bin` VALUES (66, '66', 7);
INSERT INTO `bin` VALUES (67, '67', 7);
INSERT INTO `bin` VALUES (68, '68', 7);
INSERT INTO `bin` VALUES (69, '69', 7);
INSERT INTO `bin` VALUES (70, '70', 7);
INSERT INTO `bin` VALUES (71, '71', 7);
INSERT INTO `bin` VALUES (72, '72', 7);
INSERT INTO `bin` VALUES (73, '73', 7);
INSERT INTO `bin` VALUES (74, '74', 7);
INSERT INTO `bin` VALUES (75, '75', 7);
INSERT INTO `bin` VALUES (76, '76', 7);
INSERT INTO `bin` VALUES (77, '77', 8);
INSERT INTO `bin` VALUES (78, '78', 8);
INSERT INTO `bin` VALUES (79, '79', 8);
INSERT INTO `bin` VALUES (80, '80', 8);
INSERT INTO `bin` VALUES (81, '81', 8);
INSERT INTO `bin` VALUES (82, '82', 8);
INSERT INTO `bin` VALUES (83, '83', 8);
INSERT INTO `bin` VALUES (84, '84', 8);
INSERT INTO `bin` VALUES (85, '85', 8);
INSERT INTO `bin` VALUES (86, '86', 8);
INSERT INTO `bin` VALUES (87, '87', 8);
INSERT INTO `bin` VALUES (89, '88', 9);
INSERT INTO `bin` VALUES (90, '90', 9);
INSERT INTO `bin` VALUES (91, '64', 9);
INSERT INTO `bin` VALUES (92, '1', 9);
INSERT INTO `bin` VALUES (93, '2', 9);
INSERT INTO `bin` VALUES (94, '3', 9);
INSERT INTO `bin` VALUES (95, '4', 9);
INSERT INTO `bin` VALUES (96, '6', 9);
INSERT INTO `bin` VALUES (97, '5', 9);
INSERT INTO `bin` VALUES (98, '1', 9);
INSERT INTO `bin` VALUES (99, '1', 9);
INSERT INTO `bin` VALUES (100, '1', 9);
INSERT INTO `bin` VALUES (101, '1', 9);
INSERT INTO `bin` VALUES (102, '1', 10);
INSERT INTO `bin` VALUES (103, '1', 10);
INSERT INTO `bin` VALUES (104, '1', 10);
INSERT INTO `bin` VALUES (105, '1', 10);
INSERT INTO `bin` VALUES (106, '1', 10);
INSERT INTO `bin` VALUES (107, '1', 10);
INSERT INTO `bin` VALUES (108, '1', 10);
INSERT INTO `bin` VALUES (109, '1', 10);
INSERT INTO `bin` VALUES (110, '1', 10);
INSERT INTO `bin` VALUES (111, '1', 10);
INSERT INTO `bin` VALUES (112, '1', 11);
INSERT INTO `bin` VALUES (113, '1', 1);
INSERT INTO `bin` VALUES (114, '1', 11);
INSERT INTO `bin` VALUES (115, '1', 11);
INSERT INTO `bin` VALUES (116, '1', 11);
INSERT INTO `bin` VALUES (117, '1', 11);
INSERT INTO `bin` VALUES (118, '1', 11);
INSERT INTO `bin` VALUES (119, '1', 11);
INSERT INTO `bin` VALUES (120, '1', 11);
INSERT INTO `bin` VALUES (121, '1', 11);
INSERT INTO `bin` VALUES (122, '1', 11);
INSERT INTO `bin` VALUES (123, '1', 11);
INSERT INTO `bin` VALUES (124, '1', 11);
INSERT INTO `bin` VALUES (125, '1', 11);
INSERT INTO `bin` VALUES (126, '1', 12);
INSERT INTO `bin` VALUES (127, '1', 12);
INSERT INTO `bin` VALUES (128, '1', 12);
INSERT INTO `bin` VALUES (129, '1', 12);
INSERT INTO `bin` VALUES (130, '2', 12);
INSERT INTO `bin` VALUES (131, '1', 12);
INSERT INTO `bin` VALUES (132, '1', 12);
INSERT INTO `bin` VALUES (133, '1', 12);
INSERT INTO `bin` VALUES (134, '1', 12);
INSERT INTO `bin` VALUES (135, '1', 12);
INSERT INTO `bin` VALUES (136, '1', 12);
INSERT INTO `bin` VALUES (137, '1', 12);
INSERT INTO `bin` VALUES (138, '1', 12);
INSERT INTO `bin` VALUES (139, '1', 12);
INSERT INTO `bin` VALUES (140, '1', 12);
INSERT INTO `bin` VALUES (141, '1', 12);
INSERT INTO `bin` VALUES (142, '1', 13);
INSERT INTO `bin` VALUES (143, '1', 13);
INSERT INTO `bin` VALUES (144, '1', 13);
INSERT INTO `bin` VALUES (145, '1', 13);
INSERT INTO `bin` VALUES (146, '1', 13);
INSERT INTO `bin` VALUES (147, '1', 13);
INSERT INTO `bin` VALUES (148, '1', 13);
INSERT INTO `bin` VALUES (149, '1', 14);
INSERT INTO `bin` VALUES (150, '1', 14);
INSERT INTO `bin` VALUES (151, '1', 14);
INSERT INTO `bin` VALUES (152, '1', 14);
INSERT INTO `bin` VALUES (153, '1', 14);
INSERT INTO `bin` VALUES (154, '1', 14);
INSERT INTO `bin` VALUES (155, '1', 14);
INSERT INTO `bin` VALUES (156, '1', 14);
INSERT INTO `bin` VALUES (157, '157', 5);
INSERT INTO `bin` VALUES (158, '158', 15);
INSERT INTO `bin` VALUES (159, '1', 15);
INSERT INTO `bin` VALUES (160, '160', 15);
INSERT INTO `bin` VALUES (161, '161', 15);
INSERT INTO `bin` VALUES (162, '162', 15);

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (1, '重庆市快克环保有限公司', '巴南区石子坪6号', '106.510605', '29.390736');
INSERT INTO `company` VALUES (2, '重庆市环卫控股(集团)有限公司', '江北区建新西路2号特一号中治大厦', '106.646704', '29.641501');
INSERT INTO `company` VALUES (3, '重庆市环卫集团', '渝北区云杉北路与黄山大道中段十字路口北侧', '106.524805', '29.624079');
INSERT INTO `company` VALUES (4, '重庆江深环卫有限公司', '南岸区南城隧道与花园路交叉口东北200米', '106.561381', '29.531667');
INSERT INTO `company` VALUES (5, '重庆尚林环卫有限公司', '冶金路与石坪桥横街交叉口东100米', '106.509794', '29.514775');
INSERT INTO `company` VALUES (6, '重庆新思路环卫股份有限公司', '沙坪坝区小龙坎新街68号', '106.470492', '29.564774');
INSERT INTO `company` VALUES (7, '重庆琅生环卫服务有限公司', '南岸区长生路57附11号', '106.676456', '29.510326');
INSERT INTO `company` VALUES (8, '重庆陶荣缘环卫工程有限公司', '渝北区龙寿路1039号附3号', '106.630343', '29.678861');
INSERT INTO `company` VALUES (9, '重庆宝鸿环卫', '南岸区宏声路46号西北方向30米', '106.579547', '29.541215');
INSERT INTO `company` VALUES (10, '重庆德飞环卫服务有限公司', '沙坪坝区石小路72号', '106.474337', '29.551711');
INSERT INTO `company` VALUES (11, '重庆市环卫集团', '黄山大道64号高科总部广场服务贸易产业园K栋', '106.499626', '29.623111');
INSERT INTO `company` VALUES (12, '重庆汇发远大环卫有限公司', '南岸区丹龙路78号', '106.560898', '29.518784');
INSERT INTO `company` VALUES (13, '重庆景瑞环卫服务有限公司', '渝北区金开大道1230号大雅金开国际·企宸4栋15层6/7号', '106.569975', '29.679478');
INSERT INTO `company` VALUES (17, '重庆工商大学', '南岸区132', '132', '123');

-- ----------------------------
-- Table structure for domestic_waste_incinerator
-- ----------------------------
DROP TABLE IF EXISTS `domestic_waste_incinerator`;
CREATE TABLE `domestic_waste_incinerator`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `dwi_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dwi_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dwi_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of domestic_waste_incinerator
-- ----------------------------
INSERT INTO `domestic_waste_incinerator` VALUES (1, '同兴垃圾焚烧发电厂', '重庆市北碚区', 100, '106.4', '29.75');
INSERT INTO `domestic_waste_incinerator` VALUES (2, '丰盛垃圾焚烧发电厂', '重庆市巴南区丰盛镇', 100, '106.894', '29.544983');
INSERT INTO `domestic_waste_incinerator` VALUES (3, '洛碛垃圾焚烧发电厂', '重庆市渝北区洛碛镇', 100, '106.903629', '29.695765');
INSERT INTO `domestic_waste_incinerator` VALUES (4, '江津垃圾焚烧发电厂', '重庆市江津区西湖镇百果园', 100, '106.3298', '29.4000');

-- ----------------------------
-- Table structure for garbage_data
-- ----------------------------
DROP TABLE IF EXISTS `garbage_data`;
CREATE TABLE `garbage_data`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `gd_time` int(20) NULL DEFAULT NULL,
  `gd_mount` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of garbage_data
-- ----------------------------
INSERT INTO `garbage_data` VALUES (1, 2007, 200);
INSERT INTO `garbage_data` VALUES (2, 2008, 225);
INSERT INTO `garbage_data` VALUES (3, 2009, 224);
INSERT INTO `garbage_data` VALUES (4, 2010, 256);
INSERT INTO `garbage_data` VALUES (5, 2011, 281);
INSERT INTO `garbage_data` VALUES (6, 2012, 335);
INSERT INTO `garbage_data` VALUES (7, 2013, 349);
INSERT INTO `garbage_data` VALUES (8, 2014, 399);
INSERT INTO `garbage_data` VALUES (9, 2015, 435);
INSERT INTO `garbage_data` VALUES (10, 2016, 469);
INSERT INTO `garbage_data` VALUES (11, 2017, 493);
INSERT INTO `garbage_data` VALUES (12, 2018, 540);
INSERT INTO `garbage_data` VALUES (13, 2019, 563);
INSERT INTO `garbage_data` VALUES (14, 2020, 580);
INSERT INTO `garbage_data` VALUES (15, 2021, 614);

-- ----------------------------
-- Table structure for landfills
-- ----------------------------
DROP TABLE IF EXISTS `landfills`;
CREATE TABLE `landfills`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `landfills_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `landfills_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `landfills_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of landfills
-- ----------------------------
INSERT INTO `landfills` VALUES (1, '长生桥垃圾填埋场', '重庆市南岸区茶园新区', 1037, '106.7', '29.5');
INSERT INTO `landfills` VALUES (2, '黑石子垃圾填埋场', '重庆市南岸区茶园新区', 1037, '106.6270', '29.6351');

-- ----------------------------
-- Table structure for pl_worker
-- ----------------------------
DROP TABLE IF EXISTS `pl_worker`;
CREATE TABLE `pl_worker`  (
  `pl_id` int(8) NULL DEFAULT NULL,
  `worker_id` int(8) NULL DEFAULT NULL,
  INDEX `pl_id`(`pl_id`) USING BTREE,
  INDEX `worker_id`(`worker_id`) USING BTREE,
  CONSTRAINT `pl_worker_ibfk_1` FOREIGN KEY (`pl_id`) REFERENCES `public_lavatory` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `pl_worker_ibfk_2` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pl_worker
-- ----------------------------
INSERT INTO `pl_worker` VALUES (1, 1);
INSERT INTO `pl_worker` VALUES (1, 2);
INSERT INTO `pl_worker` VALUES (1, 3);
INSERT INTO `pl_worker` VALUES (2, 1);
INSERT INTO `pl_worker` VALUES (2, 2);
INSERT INTO `pl_worker` VALUES (2, 3);
INSERT INTO `pl_worker` VALUES (3, 1);
INSERT INTO `pl_worker` VALUES (3, 2);
INSERT INTO `pl_worker` VALUES (3, 3);
INSERT INTO `pl_worker` VALUES (4, 6);
INSERT INTO `pl_worker` VALUES (4, 1);
INSERT INTO `pl_worker` VALUES (4, 3);
INSERT INTO `pl_worker` VALUES (4, 5);
INSERT INTO `pl_worker` VALUES (5, 4);
INSERT INTO `pl_worker` VALUES (5, 6);
INSERT INTO `pl_worker` VALUES (5, 5);
INSERT INTO `pl_worker` VALUES (5, 1);
INSERT INTO `pl_worker` VALUES (5, 3);
INSERT INTO `pl_worker` VALUES (6, 7);
INSERT INTO `pl_worker` VALUES (6, 8);
INSERT INTO `pl_worker` VALUES (6, 9);
INSERT INTO `pl_worker` VALUES (6, 3);
INSERT INTO `pl_worker` VALUES (6, 2);
INSERT INTO `pl_worker` VALUES (7, 1);
INSERT INTO `pl_worker` VALUES (7, 9);
INSERT INTO `pl_worker` VALUES (7, 8);
INSERT INTO `pl_worker` VALUES (7, 6);
INSERT INTO `pl_worker` VALUES (7, 5);
INSERT INTO `pl_worker` VALUES (8, 3);
INSERT INTO `pl_worker` VALUES (8, 11);
INSERT INTO `pl_worker` VALUES (8, 10);
INSERT INTO `pl_worker` VALUES (8, 12);
INSERT INTO `pl_worker` VALUES (8, 9);
INSERT INTO `pl_worker` VALUES (9, 10);
INSERT INTO `pl_worker` VALUES (9, 11);
INSERT INTO `pl_worker` VALUES (9, 15);
INSERT INTO `pl_worker` VALUES (9, 12);
INSERT INTO `pl_worker` VALUES (11, 13);
INSERT INTO `pl_worker` VALUES (11, 10);
INSERT INTO `pl_worker` VALUES (10, 11);
INSERT INTO `pl_worker` VALUES (10, 10);
INSERT INTO `pl_worker` VALUES (10, 12);
INSERT INTO `pl_worker` VALUES (11, 12);
INSERT INTO `pl_worker` VALUES (12, 15);
INSERT INTO `pl_worker` VALUES (12, 16);
INSERT INTO `pl_worker` VALUES (12, 17);
INSERT INTO `pl_worker` VALUES (12, 18);
INSERT INTO `pl_worker` VALUES (14, 16);
INSERT INTO `pl_worker` VALUES (14, 13);
INSERT INTO `pl_worker` VALUES (14, 14);
INSERT INTO `pl_worker` VALUES (15, 17);
INSERT INTO `pl_worker` VALUES (13, 14);
INSERT INTO `pl_worker` VALUES (13, 13);
INSERT INTO `pl_worker` VALUES (13, 11);
INSERT INTO `pl_worker` VALUES (13, 15);
INSERT INTO `pl_worker` VALUES (15, 18);
INSERT INTO `pl_worker` VALUES (15, 10);
INSERT INTO `pl_worker` VALUES (16, 9);
INSERT INTO `pl_worker` VALUES (16, 19);
INSERT INTO `pl_worker` VALUES (16, 18);
INSERT INTO `pl_worker` VALUES (17, 20);
INSERT INTO `pl_worker` VALUES (17, 21);
INSERT INTO `pl_worker` VALUES (18, 22);
INSERT INTO `pl_worker` VALUES (18, 21);
INSERT INTO `pl_worker` VALUES (19, 20);
INSERT INTO `pl_worker` VALUES (19, 19);
INSERT INTO `pl_worker` VALUES (20, 21);
INSERT INTO `pl_worker` VALUES (20, 22);
INSERT INTO `pl_worker` VALUES (20, 25);
INSERT INTO `pl_worker` VALUES (21, 24);
INSERT INTO `pl_worker` VALUES (21, 23);
INSERT INTO `pl_worker` VALUES (21, 10);
INSERT INTO `pl_worker` VALUES (22, 19);
INSERT INTO `pl_worker` VALUES (22, 20);
INSERT INTO `pl_worker` VALUES (22, 22);
INSERT INTO `pl_worker` VALUES (23, 21);
INSERT INTO `pl_worker` VALUES (23, 25);
INSERT INTO `pl_worker` VALUES (23, 26);
INSERT INTO `pl_worker` VALUES (24, 25);
INSERT INTO `pl_worker` VALUES (4, 5);
INSERT INTO `pl_worker` VALUES (24, 22);
INSERT INTO `pl_worker` VALUES (25, 27);
INSERT INTO `pl_worker` VALUES (25, 26);
INSERT INTO `pl_worker` VALUES (25, 28);
INSERT INTO `pl_worker` VALUES (26, 29);
INSERT INTO `pl_worker` VALUES (26, 24);
INSERT INTO `pl_worker` VALUES (26, 28);
INSERT INTO `pl_worker` VALUES (27, 29);
INSERT INTO `pl_worker` VALUES (27, 30);
INSERT INTO `pl_worker` VALUES (28, 31);
INSERT INTO `pl_worker` VALUES (28, 30);
INSERT INTO `pl_worker` VALUES (28, 32);
INSERT INTO `pl_worker` VALUES (29, 27);
INSERT INTO `pl_worker` VALUES (29, 26);
INSERT INTO `pl_worker` VALUES (30, 29);
INSERT INTO `pl_worker` VALUES (30, 30);
INSERT INTO `pl_worker` VALUES (30, 25);
INSERT INTO `pl_worker` VALUES (30, 29);

-- ----------------------------
-- Table structure for public_lavatory
-- ----------------------------
DROP TABLE IF EXISTS `public_lavatory`;
CREATE TABLE `public_lavatory`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `pl_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pl_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pl_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 158 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of public_lavatory
-- ----------------------------
INSERT INTO `public_lavatory` VALUES (1, '公厕', '南岸区兰花路与回龙路交叉口东100米', 100, '106.578161', '29.507769');
INSERT INTO `public_lavatory` VALUES (2, '公厕', '南岸区学府大道36号附近', 100, '106.579864', '29.508786');
INSERT INTO `public_lavatory` VALUES (3, '公厕', '南岸区回龙路75正北方向20米', 100, '106.578322', '29.51371');
INSERT INTO `public_lavatory` VALUES (4, '公厕', '南岸区学府大道22号附1号正西方向190米', 100, '106.579659', '29.513366');
INSERT INTO `public_lavatory` VALUES (5, '公厕', '南岸区学府大道与广黔路交叉口东50米', 100, '106.581196', '29.517571');
INSERT INTO `public_lavatory` VALUES (6, '公厕', '南岸区兰花路66号', 100, '106.563875', '29.509346');
INSERT INTO `public_lavatory` VALUES (7, '公厕', '南岸区江南立交桥与烟雨路交叉口西南100米', 100, '106.582783', '29.522013');
INSERT INTO `public_lavatory` VALUES (8, '公厕', '南岸区海棠溪立交桥与烟雨路交叉口', 100, '106.592006', '29.546569');
INSERT INTO `public_lavatory` VALUES (9, '公厕', '江北区汇川门路寰宇天下西南侧', 100, '106.584755', '29.578804');
INSERT INTO `public_lavatory` VALUES (10, '公厕', '璧山区沿河西路南段太阳堡广场', 100, '106.237427', '29.548501');
INSERT INTO `public_lavatory` VALUES (11, '公厕', '璧山区民安街青杠中学北侧', 100, '106.242335', '29.473445');
INSERT INTO `public_lavatory` VALUES (12, '公厕', '璧山区文星路216号', 100, '106.235227', '29.593767');
INSERT INTO `public_lavatory` VALUES (13, '公厕', '璧山区工业路双星阳光南侧约70米', 100, '106.240915', '29.580526');
INSERT INTO `public_lavatory` VALUES (14, '公厕', '璧山区奥康大道摩登时代广场东南侧约260米', 100, '106.240454', '29.567671');
INSERT INTO `public_lavatory` VALUES (15, '公厕', '璧山区沿河西路南段俊豪中央大街', 100, '106.234741', '29.587426');
INSERT INTO `public_lavatory` VALUES (16, '公厕', '璧山区永嘉大道璧山同济医院西侧', 100, '106.232742', '29.57283');
INSERT INTO `public_lavatory` VALUES (17, '公厕', '璧山区战斗路璧山老城医院南侧约70米', 100, '106.233154', '29.595849');
INSERT INTO `public_lavatory` VALUES (18, '公厕', '璧山区南关一路璧山区人民医院(老院区)南侧约200米', 100, '106.229325', '29.592138');
INSERT INTO `public_lavatory` VALUES (19, '公厕', '璧山区北二环路102号景山路大旺桥西南侧', 100, '106.238466', '29.60796');
INSERT INTO `public_lavatory` VALUES (20, '公厕', '璧山区鸡冠石路北城馨园西北侧约180米', 100, '106.235676', '29.613872');
INSERT INTO `public_lavatory` VALUES (21, '公厕', '璧山区福八路与万达路交叉路口南侧', 100, '106.233356', '29.734529');
INSERT INTO `public_lavatory` VALUES (22, '公厕', '璧山区沿河东路北段大成广场东侧约210米', 100, '106.23678', '29.598086');
INSERT INTO `public_lavatory` VALUES (23, '公厕', '璧山区牛角湾路璧河国际东南侧约280米', 100, '106.241021', '29.576869');
INSERT INTO `public_lavatory` VALUES (24, '公厕', '巴南区通江大道金科中央华府东南侧约170米', 100, '106.635312', '29.471189');
INSERT INTO `public_lavatory` VALUES (25, '公厕', '巴南区箭河路典雅依山郡东北侧约130米', 100, '106.508404', '29.381006');
INSERT INTO `public_lavatory` VALUES (26, '公厕', '巴南区李家沱融汇半岛格林美地南', 100, '106.518467', '29.467414');
INSERT INTO `public_lavatory` VALUES (27, '公厕', '巴南区云锦四路云篆山水中心广场东南侧约190米', 100, '106.510556', '29.37525');
INSERT INTO `public_lavatory` VALUES (28, '公厕', '巴南区界新街渝南田家炳中学东侧约100米', 100, '106.615246', '29.391302');
INSERT INTO `public_lavatory` VALUES (29, '公厕', '巴南区渝南大道东本依山郡西侧约120米', 100, '106.568157', '29.474114');
INSERT INTO `public_lavatory` VALUES (30, '公厕', '巴南区民主新街重庆市巴南区花溪中学校西南侧约60米', 100, '106.550595', '29.44688');
INSERT INTO `public_lavatory` VALUES (31, '公厕', '巴南区渝南大道124号', 100, '106.565773', '29.464716');
INSERT INTO `public_lavatory` VALUES (32, '公厕', '巴南区马王坪正街玉宇盛世江南北侧约40米', 100, '106.536327', '29.472753');
INSERT INTO `public_lavatory` VALUES (33, '公厕', '巴南区渝南分流道巴南中学校南侧约50米', 100, '106.556785', '29.464278');
INSERT INTO `public_lavatory` VALUES (34, '公厕', '渝中区千厮门隧道万吉广场北侧约80米', 100, '106.588731', '29.565665');
INSERT INTO `public_lavatory` VALUES (35, '公厕', '渝中区人和街58号附1号', 100, '106.564175', '29.569536');
INSERT INTO `public_lavatory` VALUES (36, '公厕', '渝中区两路口新村重庆希尔顿酒店西南侧约30米', 100, '106.555202', '29.560872');
INSERT INTO `public_lavatory` VALUES (37, '公厕', '渝中区八一路渝都酒店(解放碑店)西侧', 100, '106.583655', '29.562516');
INSERT INTO `public_lavatory` VALUES (38, '公厕', '渝中区大坪正街白云宾馆(大坪正街店)南侧约50米', 100, '106.521506', '29.546114');
INSERT INTO `public_lavatory` VALUES (39, '公厕', '渝中区沧白路87号', 100, '106.584061', '29.566865');
INSERT INTO `public_lavatory` VALUES (40, '公厕', '渝中区棉花街御景江山东南侧约80米', 100, '106.58911', '29.567916');
INSERT INTO `public_lavatory` VALUES (41, '公厕', '渝中区十八梯132号', 100, '106.57952', '29.558232');
INSERT INTO `public_lavatory` VALUES (42, '公厕', '渝中区新丰巷白象宾馆西南侧约60米', 100, '106.590541', '29.561251');
INSERT INTO `public_lavatory` VALUES (43, '公厕', '渝中区学田湾正街2号(人民广场商圈区域)', 100, '106.558846', '29.567485');
INSERT INTO `public_lavatory` VALUES (44, '公厕', '渝北区新南路上跨桥龙湖花园巴蜀学校(小学部)东南侧约40米', 100, '106.516473', '29.606676');
INSERT INTO `public_lavatory` VALUES (45, '公厕', '渝北区玉兰路重庆北站南广场汽车站南侧约180米', 100, '106.551682', '29.60954');
INSERT INTO `public_lavatory` VALUES (46, '公厕', '渝北区双湖支路水木天地广场南侧约30米', 100, '106.62371', '29.699823');
INSERT INTO `public_lavatory` VALUES (47, '公厕', '渝北区兴科大道凯圣佳园西北侧约60米', 100, '106.609052', '29.692808');
INSERT INTO `public_lavatory` VALUES (48, '公厕', '渝北区景观大道公园置尚东北侧', 100, '106.556749', '29.601286');
INSERT INTO `public_lavatory` VALUES (49, '公厕', '渝北区佳园路银海北极星', 100, '106.532577', '29.60697');
INSERT INTO `public_lavatory` VALUES (50, '公厕', '渝北区飞湖路春城四季东南侧约40米', 100, '106.626158', '29.709063');
INSERT INTO `public_lavatory` VALUES (51, '公厕', '渝北区黄竹路康庄美地东侧约240米', 100, '106.49026', '29.640351');
INSERT INTO `public_lavatory` VALUES (52, '公厕', '渝北区宝圣西路富悦新城西北侧约40米', 100, '106.602483', '29.688095');
INSERT INTO `public_lavatory` VALUES (53, '公厕', '渝北区空港大道东银壳牌加油站(空港大道分站)', 100, '106.649031', '29.756285');
INSERT INTO `public_lavatory` VALUES (54, '公厕', '渝北区新溉大道191-、193号', 100, '106.537107', '29.605298');
INSERT INTO `public_lavatory` VALUES (55, '公厕', '渝北区湖光街汽博大厦东侧约160米', 100, '106.580578', '29.647541');
INSERT INTO `public_lavatory` VALUES (57, '公厕', '江北区观音桥西环路嘉陵公园', 100, '106.537488', '29.578283');
INSERT INTO `public_lavatory` VALUES (58, '公厕', '江北区五简路聚贤岩广场西侧约50米', 100, '106.573096', '29.576119');
INSERT INTO `public_lavatory` VALUES (59, '公厕', '江北区渝鲁大道渝能明日城市东南侧约170米', 100, '106.571352', '29.585901');
INSERT INTO `public_lavatory` VALUES (60, '公厕', '江北区洋河中路富比帝东北侧', 100, '106.537946', '29.588662');
INSERT INTO `public_lavatory` VALUES (61, '公厕', '江北区大剧院附近', 100, '106.587174', '29.575482');
INSERT INTO `public_lavatory` VALUES (62, '公厕', '江北区鲤鱼池路世纪中环北侧约140米', 100, '106.552777', '29.581617');
INSERT INTO `public_lavatory` VALUES (63, '公厕', '江北区石门社21号', 100, '106.489972', '29.577712');
INSERT INTO `public_lavatory` VALUES (64, '公厕', '江北区电测村路燃气大厦北侧约160米', 100, '106.533833', '29.582918');
INSERT INTO `public_lavatory` VALUES (65, '公厕', '江北区红石路东方明珠', 100, '106.489993', '29.571305');
INSERT INTO `public_lavatory` VALUES (66, '公厕', '江北区建新东路富强社区东侧', 100, '106.553885', '29.578394');
INSERT INTO `public_lavatory` VALUES (67, '公厕', '江北区兴塔路银鑫楼东侧约70米', 100, '106.542509', '29.583466');
INSERT INTO `public_lavatory` VALUES (68, '公厕', '江北区五桂立交江北区人民政府北侧', 100, '106.580916', '29.613777');
INSERT INTO `public_lavatory` VALUES (69, '公厕', '江北区北滨二路', 100, '106.581039', '29.592382');
INSERT INTO `public_lavatory` VALUES (70, '公厕', '大渡口区跳蹬街跳磴小学东北侧约100米', 100, '106.438194', '29.410451');
INSERT INTO `public_lavatory` VALUES (71, '公厕', '大渡口区翠柏路重庆市旅游学校西南侧约30米', 100, '106.481956', '29.480089');
INSERT INTO `public_lavatory` VALUES (72, '公厕', '大渡口区跃进村吉友知鱼苑(大堰店)西北', 100, '106.490199', '29.496175');
INSERT INTO `public_lavatory` VALUES (73, '公厕', '大渡口区钢花路瑞星综合楼北侧', 100, '106.491893', '29.476709');
INSERT INTO `public_lavatory` VALUES (74, '公厕', '大渡口区建桥大道与银桥路交叉路口往南约150米', 100, '106.489071', '29.453389');
INSERT INTO `public_lavatory` VALUES (75, '公厕', '大渡口区文兴街育才小学(跃进路)东南侧约50米', 100, '106.494918', '29.491514');
INSERT INTO `public_lavatory` VALUES (76, '公厕', '大渡口区翠华街翠华园小区西南侧约30米', 100, '106.48186', '29.484538');
INSERT INTO `public_lavatory` VALUES (77, '公厕', '大渡口区双城路与山川路交叉口东50米', 100, '106.472029', '29.500275');
INSERT INTO `public_lavatory` VALUES (78, '公厕', '大渡口区松青路3888号', 100, '106.485515', '29.469456');
INSERT INTO `public_lavatory` VALUES (79, '公厕', '沙坪坝区大学城中路重庆师范大学(大学城校区)东南侧约80米', 100, '106.314924', '29.613831');
INSERT INTO `public_lavatory` VALUES (80, '公厕', '沙坪坝区覃家岗天星桥汽车检测站', 100, '106.459887', '29.549969');
INSERT INTO `public_lavatory` VALUES (81, '公厕', '沙坪坝区新桥正街陆军军医大学第二附属医院(新桥医院)北侧约40米', 100, '106.443726', '29.53057');
INSERT INTO `public_lavatory` VALUES (82, '公厕', '沙坪坝区歌乐山正街歌乐山小学北侧约150米', 100, '106.42525', '29.576434');
INSERT INTO `public_lavatory` VALUES (83, '公厕', '沙坪坝区凤天大道124号', 100, '106.460538', '29.536775');
INSERT INTO `public_lavatory` VALUES (84, '公厕', '沙坪坝区大学城西路重庆师范大学(大学城校区)', 100, '106.301401', '29.614056');
INSERT INTO `public_lavatory` VALUES (85, '公厕', '沙坪坝区廊桥水乡临时市场内', 100, '106.293022', '29.588138');
INSERT INTO `public_lavatory` VALUES (86, '公厕', '沙坪坝区经纬大道德意家具城', 100, '106.475481', '29.543662');
INSERT INTO `public_lavatory` VALUES (87, '公厕', '沙坪坝区沙坪坝北街重庆大学(B区)东侧约30米', 100, '106.470106', '29.573867');
INSERT INTO `public_lavatory` VALUES (88, '公厕', '沙坪坝区沙滨路财信沙滨城市北侧', 100, '106.487436', '29.563268');
INSERT INTO `public_lavatory` VALUES (89, '公厕', '北碚区静宁路文化广场西北侧约40米', 100, '106.44506', '29.834187');
INSERT INTO `public_lavatory` VALUES (90, '公厕', '北碚区天生路西南大学', 100, '106.427894', '29.821282');
INSERT INTO `public_lavatory` VALUES (91, '公厕', '北碚区海宇祥光瑞光', 100, '106.406735', '29.807298');
INSERT INTO `public_lavatory` VALUES (92, '公厕', '北碚区蔡顺路两江名居', 100, '106.504766', '29.752178');
INSERT INTO `public_lavatory` VALUES (93, '公厕', '北碚区嘉运一路嘉皇小区南侧约140米', 100, '106.480769', '29.734405');
INSERT INTO `public_lavatory` VALUES (94, '公厕', '北碚区龙凤大道海宇状元府第东北侧约50米', 100, '106.415169', '29.80605');
INSERT INTO `public_lavatory` VALUES (95, '公厕', '北碚区金华路缙逸香山南侧约70米', 100, '106.416213', '29.825761');
INSERT INTO `public_lavatory` VALUES (139, '公厕', '南岸区123', 123, '123', '123');
INSERT INTO `public_lavatory` VALUES (140, '公厕', '南岸区123', 123, '123', '123');

-- ----------------------------
-- Table structure for rubbish_transfer_station
-- ----------------------------
DROP TABLE IF EXISTS `rubbish_transfer_station`;
CREATE TABLE `rubbish_transfer_station`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `rts_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `rts_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `rts_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rubbish_transfer_station
-- ----------------------------
INSERT INTO `rubbish_transfer_station` VALUES (1, '巴南界石转运站', '巴南区界石镇桂花村', 1000, '106.618436', '29.390542');
INSERT INTO `rubbish_transfer_station` VALUES (2, '九龙坡走马转运站', '九龙坡区走马镇灯塔村水头湾', 128, '106.298357', '29.474295');
INSERT INTO `rubbish_transfer_station` VALUES (3, '渝北夏家坝转运站', '渝北区夏家坝', 1000, '106.615744', '29.770842');
INSERT INTO `rubbish_transfer_station` VALUES (4, '滨江公园垃圾转运站', '渝中区长江滨江路与厚慈街交叉路口', 1000, '106.5777', '29.5546');
INSERT INTO `rubbish_transfer_station` VALUES (5, '朝天门广场转运站', '渝中区朝天门广场', 1000, '106.5946', '29.5722');
INSERT INTO `rubbish_transfer_station` VALUES (6, '江南水岸公租房旁垃圾转运站', '南岸区江南水岸七组团望安路', 1230, '106.687299', '29.513972');
INSERT INTO `rubbish_transfer_station` VALUES (7, '南岸果蔬垃圾转运站茶园站', '南岸区玉马路', 3100, '106.664486', '29.486781');
INSERT INTO `rubbish_transfer_station` VALUES (8, '江溪路垃圾转运站', '南岸区江溪路1号', 123, '106.683696', '29.52973');
INSERT INTO `rubbish_transfer_station` VALUES (9, '站西路垃圾中转站', '沙坪坝区沙坪坝站西路融汇温泉上筑东北侧约60米', 123, '106.454184', '29.563095');
INSERT INTO `rubbish_transfer_station` VALUES (10, '\r\n二郎垃圾中转站', '九龙坡区二郎科城路一号', 1234, '106.455347', '29.517104');
INSERT INTO `rubbish_transfer_station` VALUES (11, '白市驿垃圾中转站', '九龙坡区精通路与翔驿路交叉路口往东南约220米', 1234, '106.369133', '29.480748');
INSERT INTO `rubbish_transfer_station` VALUES (12, '渝北区垃圾中转站', '渝北区隆昌街绿梦广场南侧约170米', 1234, '106.630647', '29.703103');
INSERT INTO `rubbish_transfer_station` VALUES (13, '尖山垃圾转运站', '渝北区汇金路与加工区六路交叉路口往东约210米', 1234, '106.588702', '29.635261');

-- ----------------------------
-- Table structure for sanitation_car
-- ----------------------------
DROP TABLE IF EXISTS `sanitation_car`;
CREATE TABLE `sanitation_car`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `sc_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sct_id` int(5) NOT NULL,
  `dwi_id` int(8) NULL DEFAULT NULL,
  `rts_id` int(8) NULL DEFAULT NULL,
  `wtp_id` int(8) NULL DEFAULT NULL,
  `st_id` int(8) NULL DEFAULT NULL,
  `lf_id` int(8) NULL DEFAULT NULL,
  `stp_id` int(8) NULL DEFAULT NULL,
  `company_id` int(8) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sct_id`(`sct_id`) USING BTREE,
  INDEX `dwi_id`(`dwi_id`) USING BTREE,
  INDEX `rts_id`(`rts_id`) USING BTREE,
  INDEX `wtp_id`(`wtp_id`) USING BTREE,
  INDEX `st_id`(`st_id`) USING BTREE,
  INDEX `lf_id`(`lf_id`) USING BTREE,
  INDEX `stp_id`(`stp_id`) USING BTREE,
  INDEX `company_id`(`company_id`) USING BTREE,
  CONSTRAINT `sanitation_car_ibfk_10` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_2` FOREIGN KEY (`sct_id`) REFERENCES `sanitation_car_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_3` FOREIGN KEY (`dwi_id`) REFERENCES `domestic_waste_incinerator` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_4` FOREIGN KEY (`rts_id`) REFERENCES `rubbish_transfer_station` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_5` FOREIGN KEY (`wtp_id`) REFERENCES `waste_treatment_plant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_6` FOREIGN KEY (`st_id`) REFERENCES `street` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_8` FOREIGN KEY (`lf_id`) REFERENCES `landfills` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `sanitation_car_ibfk_9` FOREIGN KEY (`stp_id`) REFERENCES `sewage_treatment_plant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 159 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sanitation_car
-- ----------------------------
INSERT INTO `sanitation_car` VALUES (1, '渝B·1WS6X', 1, NULL, NULL, NULL, 2, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (2, '渝A·X19GR', 2, NULL, NULL, 1, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (3, '渝A·QVKV4', 3, NULL, NULL, NULL, 5, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (4, '渝G·EEVS1', 4, NULL, NULL, NULL, 3, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (5, '渝B·J1ZNZ', 5, 1, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (6, '渝H·IC85X', 6, NULL, NULL, NULL, 4, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (7, '渝F·JF01H', 5, 2, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (8, '渝C·SD10V', 2, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (9, '渝C·D77IG', 6, NULL, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (10, '渝H·PXRNA', 3, NULL, NULL, NULL, 7, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (11, '渝C·9WKT0', 1, NULL, NULL, NULL, 3, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (12, '渝A·FBDF6', 6, NULL, NULL, NULL, 9, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (13, '渝A·LC89J', 4, NULL, NULL, NULL, 14, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (14, '渝G·8EE4U', 2, NULL, NULL, 2, NULL, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (15, '渝C·ZR3UI', 1, NULL, NULL, NULL, 36, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (16, '渝G·FCJ4F', 5, 3, 4, NULL, NULL, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (17, '渝H·7TL3Y', 4, NULL, NULL, NULL, 7, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (18, '渝G·MU7JV', 3, NULL, NULL, NULL, 7, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (21, '渝B·MU788', 5, 4, NULL, NULL, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (22, '渝G·YUPVS', 3, NULL, NULL, NULL, 7, NULL, 1, 5);
INSERT INTO `sanitation_car` VALUES (23, '渝F·BPPBL', 3, NULL, NULL, NULL, 4, NULL, 1, 5);
INSERT INTO `sanitation_car` VALUES (24, '渝G·9UWOY', 3, NULL, NULL, NULL, 9, NULL, 1, 6);
INSERT INTO `sanitation_car` VALUES (25, '渝G·9UWOY', 3, NULL, NULL, NULL, 9, NULL, 1, 6);
INSERT INTO `sanitation_car` VALUES (26, '渝C·9SKWU', 3, NULL, NULL, NULL, 6, NULL, 1, 6);
INSERT INTO `sanitation_car` VALUES (27, '渝F·YXG01', 3, NULL, NULL, NULL, 1, NULL, 2, 6);
INSERT INTO `sanitation_car` VALUES (28, '渝G·AE5X0', 3, NULL, NULL, NULL, 2, NULL, 2, 6);
INSERT INTO `sanitation_car` VALUES (29, '渝H·W907T', 3, NULL, NULL, NULL, 3, NULL, 2, 7);
INSERT INTO `sanitation_car` VALUES (30, '渝H·4XOKJ', 3, NULL, NULL, NULL, 4, NULL, 2, 8);
INSERT INTO `sanitation_car` VALUES (31, '渝G·81HCE', 3, NULL, NULL, NULL, 5, NULL, 3, 7);
INSERT INTO `sanitation_car` VALUES (32, '渝C·A9IB9', 3, NULL, NULL, NULL, 6, NULL, 3, 8);
INSERT INTO `sanitation_car` VALUES (33, '渝A·5O7ZZ', 3, NULL, NULL, NULL, 7, NULL, 3, 8);
INSERT INTO `sanitation_car` VALUES (34, '渝A·GKWNY', 3, NULL, NULL, NULL, 8, NULL, 3, 7);
INSERT INTO `sanitation_car` VALUES (35, '渝B·YU79H', 3, NULL, NULL, NULL, 9, NULL, 4, 9);
INSERT INTO `sanitation_car` VALUES (36, '渝B·IAW9X', 3, NULL, NULL, NULL, 10, NULL, 4, 9);
INSERT INTO `sanitation_car` VALUES (37, '渝B·DPXCC', 3, NULL, NULL, NULL, 11, NULL, 4, 9);
INSERT INTO `sanitation_car` VALUES (38, '渝A·1IRAN', 3, NULL, NULL, NULL, 12, NULL, 4, 9);
INSERT INTO `sanitation_car` VALUES (39, '渝B·ZHANN', 5, 1, NULL, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (40, '渝H·TDNS8', 5, 1, NULL, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (41, '渝G·VTVQX', 5, 1, NULL, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (42, '渝C·KNW0I', 5, 1, NULL, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (43, '渝H·4TNMK', 5, 2, NULL, NULL, NULL, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (44, '渝F·KUO8G', 5, 2, NULL, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (45, '渝B·QP0XZ', 5, 2, NULL, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (46, '渝B·XXB6T', 5, 2, NULL, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (47, '渝B·H5O1D', 5, 3, NULL, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (48, '渝A·TX4U3', 5, 3, NULL, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (49, '渝B·YZY4H', 5, 3, NULL, NULL, NULL, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (50, '渝A·K9I55', 5, 4, NULL, NULL, NULL, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (51, '渝C·7PHK1', 5, 4, NULL, NULL, NULL, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (52, '渝A·1IRAN', 5, 4, NULL, NULL, NULL, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (53, '渝B·PYTL3', 5, NULL, NULL, NULL, NULL, 1, NULL, 12);
INSERT INTO `sanitation_car` VALUES (54, '渝B·O453X', 5, NULL, NULL, NULL, NULL, 1, NULL, 13);
INSERT INTO `sanitation_car` VALUES (55, '渝F·RT8AK', 5, NULL, NULL, NULL, NULL, 1, NULL, 3);
INSERT INTO `sanitation_car` VALUES (56, '渝C·XQI78', 5, NULL, NULL, NULL, NULL, 1, NULL, 13);
INSERT INTO `sanitation_car` VALUES (57, '渝C·WIFI8', 5, NULL, NULL, NULL, NULL, 2, NULL, 13);
INSERT INTO `sanitation_car` VALUES (58, '渝F·IAVYL', 5, NULL, NULL, NULL, NULL, 2, NULL, 1);
INSERT INTO `sanitation_car` VALUES (59, '渝G·SV09L', 5, NULL, NULL, NULL, NULL, 2, NULL, 2);
INSERT INTO `sanitation_car` VALUES (60, '渝B·Y9WPS', 5, NULL, NULL, NULL, NULL, 2, NULL, 3);
INSERT INTO `sanitation_car` VALUES (61, '渝F·NAOWE', 2, NULL, NULL, 1, NULL, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (62, '渝B·JCEGB', 2, NULL, NULL, 1, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (63, '渝A·3R6AW', 2, NULL, NULL, 1, NULL, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (64, '渝F·SHTU5', 2, NULL, NULL, 1, NULL, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (65, '渝A·MDSOT', 2, NULL, NULL, 2, NULL, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (66, '渝A·UUIFS', 2, NULL, NULL, 2, NULL, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (67, '渝F·KW8QN', 2, NULL, NULL, 2, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (68, '渝A·50MHY', 2, NULL, NULL, 2, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (69, '渝C·GKBCZ', 5, NULL, 1, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (70, '渝F·SPPDO', 5, NULL, 1, NULL, NULL, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (71, '渝A·0RU5Y', 5, NULL, 1, NULL, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (72, '渝H·W9Q3S', 5, NULL, 1, NULL, NULL, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (73, '渝F·ZQ8BK', 5, NULL, 1, NULL, NULL, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (74, '渝C·ZOPKT', 5, NULL, 2, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (75, '渝H·BXM31', 5, NULL, 2, NULL, NULL, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (76, '渝F·3R1S4', 5, NULL, 2, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (77, '渝B·9OQFW', 5, NULL, 2, NULL, NULL, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (78, '渝C·LX33K', 5, NULL, 3, NULL, NULL, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (79, '渝B·UVY59', 5, NULL, 3, NULL, NULL, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (80, '渝G·OCNKI', 5, NULL, 3, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (81, '渝A·O6ESL', 5, NULL, 3, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (82, '渝G·H17Z9', 5, NULL, 3, NULL, NULL, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (83, '渝G·OFQVK', 5, NULL, 4, NULL, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (84, '渝A·BHJ1G', 5, NULL, 4, NULL, NULL, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (85, '渝C·HS1EH', 5, NULL, 4, NULL, NULL, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (86, '渝F·ZDUUH', 5, NULL, 5, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (87, '渝H·VWA9Y', 5, NULL, 5, NULL, NULL, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (88, '渝C·ZZ6SM', 5, NULL, 5, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (89, '渝F·K1O9G', 5, NULL, 5, NULL, NULL, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (90, '渝C·0O6HK', 5, NULL, 6, NULL, NULL, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (91, '渝F·XIXM8', 5, NULL, 6, NULL, NULL, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (92, '渝H·NIHIA', 5, NULL, 6, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (93, '渝H·LNMFI', 5, NULL, 6, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (94, '渝A·KC141', 5, NULL, 7, NULL, NULL, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (95, '渝A·JK4ME', 5, NULL, 7, NULL, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (96, '渝B·U0WQW', 5, NULL, 7, NULL, NULL, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (97, '渝B·143E8', 5, NULL, 8, NULL, NULL, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (98, '渝F·WSFWL', 5, NULL, 8, NULL, NULL, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (99, '渝H·78Q7K', 5, NULL, 8, NULL, NULL, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (100, '渝B·VMRBG', 5, NULL, 9, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (101, '渝A·5YXVH', 5, NULL, 9, NULL, NULL, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (102, '渝F·6VYHN', 5, NULL, 10, NULL, NULL, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (103, '渝C·TSRRO', 5, NULL, 10, NULL, NULL, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (104, '渝B·5CHIM', 5, NULL, 10, NULL, NULL, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (105, '渝B·ZDCOZ', 5, NULL, 11, NULL, NULL, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (106, '渝C·6OJE0', 5, NULL, 12, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (107, '渝C·UBD59', 5, NULL, 12, NULL, NULL, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (108, '渝H·BGPX8', 5, NULL, 12, NULL, NULL, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (109, '渝C·H54MT', 5, NULL, 13, NULL, NULL, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (110, '渝C·1WBNG', 5, NULL, 13, NULL, NULL, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (111, '渝F·8EHW6', 5, NULL, 13, NULL, NULL, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (112, '渝F·YCUMX', 1, NULL, NULL, NULL, 1, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (113, '渝B·1X6QU', 3, NULL, NULL, NULL, 1, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (114, '渝G·QWR8P', 4, NULL, NULL, NULL, 1, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (115, '渝G·PU4JM', 6, NULL, NULL, NULL, 1, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (116, '渝C·68ZCE', 1, NULL, NULL, NULL, 2, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (117, '渝F·MJDCY', 3, NULL, NULL, NULL, 2, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (118, '渝C·BWJMG', 4, NULL, NULL, NULL, 2, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (119, '渝F·5X9YS', 6, NULL, NULL, NULL, 2, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (120, '渝H·G9XJZ', 1, NULL, NULL, NULL, 3, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (121, '渝A·XHUSW', 3, NULL, NULL, NULL, 3, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (122, '渝F·IYRZL', 4, NULL, NULL, NULL, 3, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (123, '渝A·GGTUU', 6, NULL, NULL, NULL, 4, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (124, '渝G·C1VEF', 1, NULL, NULL, NULL, 4, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (125, '渝H·QTQQK', 3, NULL, NULL, NULL, 4, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (126, '渝C·DOB43', 4, NULL, NULL, NULL, 5, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (127, '渝A·ETHCF', 6, NULL, NULL, NULL, 5, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (128, '渝F·XOA7A', 1, NULL, NULL, NULL, 5, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (129, '渝G·1Q8DZ', 3, NULL, NULL, NULL, 6, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (130, '渝C·9677Z', 4, NULL, NULL, NULL, 6, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (131, '渝H·04EWY', 6, NULL, NULL, NULL, 6, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (132, '渝A·9HRBL', 1, NULL, NULL, NULL, 7, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (133, '渝G·7OVPW', 3, NULL, NULL, NULL, 7, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (134, '渝G·SJBD9', 4, NULL, NULL, NULL, 7, NULL, NULL, 7);
INSERT INTO `sanitation_car` VALUES (135, '渝C·ZWTDQ', 6, NULL, NULL, NULL, 7, NULL, NULL, 9);
INSERT INTO `sanitation_car` VALUES (136, '渝H·XZR1S', 1, NULL, NULL, NULL, 8, NULL, NULL, 11);
INSERT INTO `sanitation_car` VALUES (137, '渝G·6GS68', 3, NULL, NULL, NULL, 8, NULL, NULL, 13);
INSERT INTO `sanitation_car` VALUES (138, '渝A·AD30T', 4, NULL, NULL, NULL, 8, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (139, '渝F·7RJKR', 6, NULL, NULL, NULL, 8, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (140, '渝H·631NQ', 1, NULL, NULL, NULL, 9, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (141, '渝H·NUEHI', 3, NULL, NULL, NULL, 9, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (142, '渝F·QRSG4', 4, NULL, NULL, NULL, 9, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (143, '渝A·MWONL', 6, NULL, NULL, NULL, 9, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (144, '渝B·J6O5M', 1, NULL, NULL, NULL, 10, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (145, '渝C·71NID', 3, NULL, NULL, NULL, 10, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (146, '渝C·76T9Z', 4, NULL, NULL, NULL, 10, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (147, '渝B·9EJ1A', 6, NULL, NULL, NULL, 10, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (148, '渝H·3D8TP', 1, NULL, NULL, NULL, 11, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (149, '渝B·5RRBU', 3, NULL, NULL, NULL, 11, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (150, '渝C·VWTIR', 4, NULL, NULL, NULL, 11, NULL, NULL, 2);
INSERT INTO `sanitation_car` VALUES (151, '渝A·8X1XJ', 6, NULL, NULL, NULL, 11, NULL, NULL, 4);
INSERT INTO `sanitation_car` VALUES (152, '渝B·Q8L1Z', 1, NULL, NULL, NULL, 12, NULL, NULL, 6);
INSERT INTO `sanitation_car` VALUES (153, '渝C·PZI77', 3, NULL, NULL, NULL, 12, NULL, NULL, 8);
INSERT INTO `sanitation_car` VALUES (154, '渝F·7H06N', 4, NULL, NULL, NULL, 12, NULL, NULL, 10);
INSERT INTO `sanitation_car` VALUES (155, '渝C·LZ3TZ', 6, NULL, NULL, NULL, 12, NULL, NULL, 12);
INSERT INTO `sanitation_car` VALUES (156, '渝F·IAUX6', 1, NULL, NULL, NULL, 13, NULL, NULL, 1);
INSERT INTO `sanitation_car` VALUES (157, '渝B·9ZXWX', 3, NULL, NULL, NULL, 13, NULL, NULL, 3);
INSERT INTO `sanitation_car` VALUES (158, '渝B·5WTWW', 4, NULL, NULL, NULL, 13, NULL, NULL, 5);
INSERT INTO `sanitation_car` VALUES (159, '渝G·KLKG5', 6, NULL, NULL, NULL, 13, NULL, NULL, 7);

-- ----------------------------
-- Table structure for sanitation_car_type
-- ----------------------------
DROP TABLE IF EXISTS `sanitation_car_type`;
CREATE TABLE `sanitation_car_type`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `sct_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sanitation_car_type
-- ----------------------------
INSERT INTO `sanitation_car_type` VALUES (1, '洒水车');
INSERT INTO `sanitation_car_type` VALUES (2, '吸粪车');
INSERT INTO `sanitation_car_type` VALUES (3, '吸污车');
INSERT INTO `sanitation_car_type` VALUES (4, '清洗车');
INSERT INTO `sanitation_car_type` VALUES (5, '垃圾运输车');
INSERT INTO `sanitation_car_type` VALUES (6, '清扫道路车');

-- ----------------------------
-- Table structure for sanitation_vehicles_park
-- ----------------------------
DROP TABLE IF EXISTS `sanitation_vehicles_park`;
CREATE TABLE `sanitation_vehicles_park`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `svp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `svp_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `svp_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sanitation_vehicles_park
-- ----------------------------
INSERT INTO `sanitation_vehicles_park` VALUES (1, '中梁山环卫所停车场', '重庆市九龙坡区华龙大道与华九路交接处西南方', 100, '106.44511', '29.465044');
INSERT INTO `sanitation_vehicles_park` VALUES (2, '花街子环卫停车场', '重庆市渝中区花街子1号', 100, '106.582132', '29.555756');
INSERT INTO `sanitation_vehicles_park` VALUES (3, '菜园坝环卫所停车场', '重庆市渝中区菜袁路26-8号附近', 100, '106.554448', '29.55422');
INSERT INTO `sanitation_vehicles_park` VALUES (4, '重庆市南岸区环卫停车场', '重庆市南岸区内环快速路东100米', 100, '106.610674', '29.573879');
INSERT INTO `sanitation_vehicles_park` VALUES (5, '渝北区回兴市政环境卫生管理所停车场', '重庆市渝北区一碗水前街与凯歌二支路交叉口西北50米', 100, '106.62179', '29.67644');
INSERT INTO `sanitation_vehicles_park` VALUES (6, '大渡口区环卫停车场', '重庆市大渡口区百花路附近正西方向140米', 100, '106.496712', '29.46985');
INSERT INTO `sanitation_vehicles_park` VALUES (7, '南岸区环卫处丹回路停车场', '重庆市南岸区双龙路1号附近正北方向130米', 100, '106.557402', '29.516484');
INSERT INTO `sanitation_vehicles_park` VALUES (8, '沙坪坝区环卫处停车场', '沙坪坝区凤天大道芳草地西南侧', 100, '106.464569', '29.541798');
INSERT INTO `sanitation_vehicles_park` VALUES (9, '巴蜀小学露天停车场', '巴蜀小学', 100, '106.5651', '29.5648');
INSERT INTO `sanitation_vehicles_park` VALUES (10, '滨江公园露天停车场', '滨江公园', 100, '106.5766', '29.5554');
INSERT INTO `sanitation_vehicles_park` VALUES (11, '朝天门广场露天停车场', '朝天门广场', 100, '106.5947', '29.5722');
INSERT INTO `sanitation_vehicles_park` VALUES (12, '大礼堂停车场', '桂园', 100, '106.5619', '29.5677');
INSERT INTO `sanitation_vehicles_park` VALUES (13, '东方商场露天停车场', '两路口东方商场', 100, '106.5591', '29.5652');
INSERT INTO `sanitation_vehicles_park` VALUES (14, '儿童医院露天停车场', '两路口儿童医院', 100, '106.5618', '29.5625');
INSERT INTO `sanitation_vehicles_park` VALUES (15, '佛图关公园停车场', '佛图关公园', 100, '106.5426', '29.5552');
INSERT INTO `sanitation_vehicles_park` VALUES (16, '洪崖洞停车场', '洪崖洞', 100, '106.5841', '29.5673');
INSERT INTO `sanitation_vehicles_park` VALUES (17, '化龙桥露天停车场', '化龙桥', 100, '106.524', '29.555');
INSERT INTO `sanitation_vehicles_park` VALUES (18, '嘉滨路露天停车场', '嘉滨路', 100, '106.5674', '29.5699');
INSERT INTO `sanitation_vehicles_park` VALUES (19, '较场口露天停车场', '解放碑较场口', 100, '106.5775', '29.5596');
INSERT INTO `sanitation_vehicles_park` VALUES (20, '解放碑露天停车场', '解放碑', 100, '106.584', '29.561');
INSERT INTO `sanitation_vehicles_park` VALUES (21, '解放西路露天停车场', '解放西路', 100, '106.584', '29.557');
INSERT INTO `sanitation_vehicles_park` VALUES (22, '李子坝露天停车场', '李子坝', 100, '106.5456', '29.5584');
INSERT INTO `sanitation_vehicles_park` VALUES (23, '两江丽景露天停车场', '两江丽景酒店旁', 100, '106.5716', '29.5669');
INSERT INTO `sanitation_vehicles_park` VALUES (24, '七星岗露天停车场', '七星岗', 100, '106.5701', '29.5608');
INSERT INTO `sanitation_vehicles_park` VALUES (25, '123', '南岸区12312', 12321, NULL, '123');
INSERT INTO `sanitation_vehicles_park` VALUES (26, '123', '南岸区12312', 12321, NULL, '123');
INSERT INTO `sanitation_vehicles_park` VALUES (27, '123', '南岸区12312', 12321, NULL, '123');

-- ----------------------------
-- Table structure for sewage_data
-- ----------------------------
DROP TABLE IF EXISTS `sewage_data`;
CREATE TABLE `sewage_data`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `sd_time` int(20) NULL DEFAULT NULL,
  `sd_mount` int(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sewage_data
-- ----------------------------
INSERT INTO `sewage_data` VALUES (1, 2007, 52379);
INSERT INTO `sewage_data` VALUES (2, 2008, 57562);
INSERT INTO `sewage_data` VALUES (3, 2009, 61830);
INSERT INTO `sewage_data` VALUES (4, 2010, 64622);
INSERT INTO `sewage_data` VALUES (5, 2011, 69142);
INSERT INTO `sewage_data` VALUES (6, 2012, 76782);
INSERT INTO `sewage_data` VALUES (7, 2013, 82991);
INSERT INTO `sewage_data` VALUES (8, 2014, 93517);
INSERT INTO `sewage_data` VALUES (9, 2015, 100265);
INSERT INTO `sewage_data` VALUES (10, 2016, 108728);
INSERT INTO `sewage_data` VALUES (11, 2017, 116761);
INSERT INTO `sewage_data` VALUES (12, 2018, 120821);
INSERT INTO `sewage_data` VALUES (13, 2019, 129865);
INSERT INTO `sewage_data` VALUES (14, 2020, 138762);
INSERT INTO `sewage_data` VALUES (15, 2021, 147642);

-- ----------------------------
-- Table structure for sewage_treatment_plant
-- ----------------------------
DROP TABLE IF EXISTS `sewage_treatment_plant`;
CREATE TABLE `sewage_treatment_plant`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `stp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stp_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stp_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sewage_treatment_plant
-- ----------------------------
INSERT INTO `sewage_treatment_plant` VALUES (1, '石龙污水处理厂', '重庆市巴南区', 100, '106.892632', '29.297702');
INSERT INTO `sewage_treatment_plant` VALUES (2, '歇马污水处理厂', '重庆市北碚区', 100, '106.392165', '29.760875');
INSERT INTO `sewage_treatment_plant` VALUES (3, '东泉污水处理厂', '重庆市巴南区', 100, '106.861169', '29.466458');
INSERT INTO `sewage_treatment_plant` VALUES (4, '北碚污水处理厂', '重庆市北碚区', 100, '106.451678', '29.826235');

-- ----------------------------
-- Table structure for street
-- ----------------------------
DROP TABLE IF EXISTS `street`;
CREATE TABLE `street`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `st_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `st_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of street
-- ----------------------------
INSERT INTO `street` VALUES (1, '天生街道', '重庆市北碚区');
INSERT INTO `street` VALUES (2, '朝阳街道', '重庆市北碚区');
INSERT INTO `street` VALUES (3, '北温泉街道', '重庆市北碚区');
INSERT INTO `street` VALUES (4, '龙凤桥街道', '重庆市北碚区');
INSERT INTO `street` VALUES (5, '新山村街道', '重庆市大渡口区');
INSERT INTO `street` VALUES (6, '跃进村街道', '重庆市大渡口区');
INSERT INTO `street` VALUES (7, '大石坝街道', '重庆市江北区');
INSERT INTO `street` VALUES (8, '观音桥街道', '重庆市江北区');
INSERT INTO `street` VALUES (9, '华新街街道', '重庆市江北区');
INSERT INTO `street` VALUES (10, '江北城街道', '重庆市江北区');
INSERT INTO `street` VALUES (11, '二郎街道', '重庆市九龙坡区');
INSERT INTO `street` VALUES (12, '渝州路街道', '重庆市九龙坡区');
INSERT INTO `street` VALUES (13, '杨家坪街道', '重庆市九龙坡区');
INSERT INTO `street` VALUES (14, '天文街道', '重庆市南岸区');
INSERT INTO `street` VALUES (15, '铜元局街道', '重庆市南岸区');
INSERT INTO `street` VALUES (16, '海棠溪街道', '重庆市南岸区');
INSERT INTO `street` VALUES (17, '双凤桥街道', '重庆市渝北区');
INSERT INTO `street` VALUES (18, '仙桃街道', '重庆市渝北区');
INSERT INTO `street` VALUES (19, '回兴街道', '重庆市渝北区');
INSERT INTO `street` VALUES (20, '龙山街道', '重庆市渝北区');
INSERT INTO `street` VALUES (21, '人和街道', '重庆市两江新区');
INSERT INTO `street` VALUES (22, '翠云街道', '重庆市两江新区');
INSERT INTO `street` VALUES (23, '天宫殿街道', '重庆市两江新区');
INSERT INTO `street` VALUES (24, '龙舟湾街道', '重庆市巴南区');
INSERT INTO `street` VALUES (25, '鱼洞街道', '重庆市巴南区');
INSERT INTO `street` VALUES (26, '花溪街道', '重庆市巴南区');
INSERT INTO `street` VALUES (27, '覃家岗街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (28, '渝碚路街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (29, '小龙坎街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (30, '联芳街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (31, '沙坪坝街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (32, '磁器口街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (33, '童家桥街道', '重庆市沙坪坝区');
INSERT INTO `street` VALUES (34, '化龙桥街道', '重庆市渝中区');
INSERT INTO `street` VALUES (35, '上清寺街道', '重庆市渝中区');
INSERT INTO `street` VALUES (36, '石油路街道', '重庆市渝中区');
INSERT INTO `street` VALUES (37, '大坪街道', '重庆市渝中区');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authority` int(5) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '汤浩', '123456', 1);
INSERT INTO `user` VALUES (2, '张三', '123456', 2);
INSERT INTO `user` VALUES (3, '李四', '123456', 2);
INSERT INTO `user` VALUES (4, '王五', '123456', 2);

-- ----------------------------
-- Table structure for vehicle_cleaning_station
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_cleaning_station`;
CREATE TABLE `vehicle_cleaning_station`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `vcs_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vcs_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `vcs_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of vehicle_cleaning_station
-- ----------------------------
INSERT INTO `vehicle_cleaning_station` VALUES (1, '李子坝环卫洗车', '李子坝正街64号', 100, '106.541656', '29.557741');
INSERT INTO `vehicle_cleaning_station` VALUES (2, '渝卫快速洗车', '重庆市渝中区桥西村83号附3号', 100, '106.5508 ', '29.566996');

-- ----------------------------
-- Table structure for waste_treatment_plant
-- ----------------------------
DROP TABLE IF EXISTS `waste_treatment_plant`;
CREATE TABLE `waste_treatment_plant`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `wtp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `wtp_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `wtp_area` double NULL DEFAULT NULL,
  `lng` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lat` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of waste_treatment_plant
-- ----------------------------
INSERT INTO `waste_treatment_plant` VALUES (1, '大溪沟粪便处理场', '重庆市渝中区嘉陵江滨江路182号附近', 100, '106.565022', '29.572421');
INSERT INTO `waste_treatment_plant` VALUES (2, '黄沙溪粪便处理场', '重庆市渝中区黄沙溪滨江路499号', 100, '106.536814', '29.543639');

-- ----------------------------
-- Table structure for worker
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker`  (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `w_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `w_id_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `w_age` int(8) NULL DEFAULT NULL,
  `w_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `company_id` int(8) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `company_id`(`company_id`) USING BTREE,
  CONSTRAINT `worker_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of worker
-- ----------------------------
INSERT INTO `worker` VALUES (1, '张三', '20180000', 30, '重庆市南岸区', 1);
INSERT INTO `worker` VALUES (2, '郑丽', '20180001', 30, '重庆市江北区', 3);
INSERT INTO `worker` VALUES (3, '吴庭', '20180002', 30, '重庆市渝中区', 12);
INSERT INTO `worker` VALUES (4, '吴晨', '20180003', 30, '重庆市江北区', 10);
INSERT INTO `worker` VALUES (5, '汤智轩', '20180004', 30, '重庆市江北区', 8);
INSERT INTO `worker` VALUES (6, '李兰', '20180005', 30, '重庆市忠县', 2);
INSERT INTO `worker` VALUES (7, '程 林凯', '20180006', 30, '重庆市江北区', 6);
INSERT INTO `worker` VALUES (8, '钱浩', '20180007', 30, '重庆市渝中区', 8);
INSERT INTO `worker` VALUES (9, '吴深思', '20180008', 30, '重庆市江津区', 12);
INSERT INTO `worker` VALUES (10, '吴盛', '20180009', 30, '重庆市沙坪坝区', 9);
INSERT INTO `worker` VALUES (11, '郑盛', '20180010', 30, '重庆市大足县', 5);
INSERT INTO `worker` VALUES (12, '张丽', '20180011', 30, '重庆市渝中区', 7);
INSERT INTO `worker` VALUES (13, '汤文浩', '20180012', 30, '重庆市忠县', 12);
INSERT INTO `worker` VALUES (14, '孙磬音', '20180013', 30, '重庆市大足县', 4);
INSERT INTO `worker` VALUES (15, '李鹏涛', '20180014', 30, '重庆市垫江县', 10);
INSERT INTO `worker` VALUES (16, '刘威', '20180015', 30, '重庆市渝中区', 11);
INSERT INTO `worker` VALUES (17, '周昊磊', '20180016', 30, '重庆市垫江县', 11);
INSERT INTO `worker` VALUES (18, '吴盛', '20180017', 30, '重庆市忠县', 12);
INSERT INTO `worker` VALUES (19, '刘深思', '20180018', 30, '重庆市万州区', 1);
INSERT INTO `worker` VALUES (20, '张昊磊', '20180019', 30, '重庆市涪陵县', 13);
INSERT INTO `worker` VALUES (21, '赵磬音', '20180020', 30, '重庆市长寿区', 2);
INSERT INTO `worker` VALUES (22, '汤婷', '20180021', 30, '重庆市江津区', 4);
INSERT INTO `worker` VALUES (23, '赵智轩', '20180022', 30, '重庆市垫江县', 6);
INSERT INTO `worker` VALUES (24, '周深思', '20180023', 30, '重庆市渝中区', 13);
INSERT INTO `worker` VALUES (25, '石福', '20180024', 30, '重庆市大足县', 2);
INSERT INTO `worker` VALUES (26, '周福', '20180025', 30, '重庆市南岸区', 6);
INSERT INTO `worker` VALUES (27, '周智轩', '20180026', 30, '重庆市渝中区', 8);
INSERT INTO `worker` VALUES (28, '赵 林凯', '20180027', 30, '重庆市万州区', 4);
INSERT INTO `worker` VALUES (29, '石福', '20180028', 30, '重庆市江北区', 7);
INSERT INTO `worker` VALUES (30, '周昊磊', '20180029', 30, '重庆市大足县', 6);
INSERT INTO `worker` VALUES (31, '孙廷浩', '20180030', 30, '重庆市垫江县', 11);
INSERT INTO `worker` VALUES (32, '孙晨', '20180031', 30, '重庆市万州区', 5);
INSERT INTO `worker` VALUES (33, '刘婷', '20180032', 30, '重庆市渝北区', 12);
INSERT INTO `worker` VALUES (34, '汤福', '20180033', 30, '重庆市江北区', 3);
INSERT INTO `worker` VALUES (35, '李昌茂', '20180034', 30, '重庆市涪陵县', 9);
INSERT INTO `worker` VALUES (36, '吴兰', '20180035', 30, '重庆市长寿区', 1);
INSERT INTO `worker` VALUES (37, '吴盛', '20180036', 30, '重庆市万州区', 12);
INSERT INTO `worker` VALUES (38, '周朔', '20180037', 30, '重庆市北碚区', 4);
INSERT INTO `worker` VALUES (39, '刘顺', '20180038', 30, '重庆市渝北区', 7);
INSERT INTO `worker` VALUES (40, '吴文浩', '20180039', 30, '重庆市涪陵县', 2);

-- ----------------------------
-- Table structure for worker_rts
-- ----------------------------
DROP TABLE IF EXISTS `worker_rts`;
CREATE TABLE `worker_rts`  (
  `worker_id` int(8) NULL DEFAULT NULL,
  `rts_id` int(8) NULL DEFAULT NULL,
  INDEX `rts_id`(`rts_id`) USING BTREE,
  INDEX `worker_id`(`worker_id`) USING BTREE,
  CONSTRAINT `worker_rts_ibfk_1` FOREIGN KEY (`rts_id`) REFERENCES `rubbish_transfer_station` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `worker_rts_ibfk_2` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of worker_rts
-- ----------------------------
INSERT INTO `worker_rts` VALUES (2, 1);
INSERT INTO `worker_rts` VALUES (1, 2);
INSERT INTO `worker_rts` VALUES (1, 3);
INSERT INTO `worker_rts` VALUES (1, 4);
INSERT INTO `worker_rts` VALUES (1, 1);
INSERT INTO `worker_rts` VALUES (4, 1);
INSERT INTO `worker_rts` VALUES (6, 1);
INSERT INTO `worker_rts` VALUES (8, 2);
INSERT INTO `worker_rts` VALUES (10, 2);
INSERT INTO `worker_rts` VALUES (12, 2);
INSERT INTO `worker_rts` VALUES (14, 3);
INSERT INTO `worker_rts` VALUES (16, 3);
INSERT INTO `worker_rts` VALUES (18, 3);
INSERT INTO `worker_rts` VALUES (20, 4);
INSERT INTO `worker_rts` VALUES (22, 4);
INSERT INTO `worker_rts` VALUES (24, 4);
INSERT INTO `worker_rts` VALUES (26, 5);
INSERT INTO `worker_rts` VALUES (3, 5);
INSERT INTO `worker_rts` VALUES (5, 5);
INSERT INTO `worker_rts` VALUES (7, 6);
INSERT INTO `worker_rts` VALUES (9, 6);
INSERT INTO `worker_rts` VALUES (11, 6);
INSERT INTO `worker_rts` VALUES (13, 7);
INSERT INTO `worker_rts` VALUES (1, 7);
INSERT INTO `worker_rts` VALUES (3, 7);
INSERT INTO `worker_rts` VALUES (5, 8);
INSERT INTO `worker_rts` VALUES (7, 8);
INSERT INTO `worker_rts` VALUES (9, 8);
INSERT INTO `worker_rts` VALUES (2, 9);
INSERT INTO `worker_rts` VALUES (4, 9);
INSERT INTO `worker_rts` VALUES (6, 9);
INSERT INTO `worker_rts` VALUES (8, 10);
INSERT INTO `worker_rts` VALUES (10, 10);
INSERT INTO `worker_rts` VALUES (12, 10);
INSERT INTO `worker_rts` VALUES (14, 11);
INSERT INTO `worker_rts` VALUES (16, 11);
INSERT INTO `worker_rts` VALUES (15, 11);
INSERT INTO `worker_rts` VALUES (13, 12);
INSERT INTO `worker_rts` VALUES (17, 12);
INSERT INTO `worker_rts` VALUES (3, 12);
INSERT INTO `worker_rts` VALUES (5, 13);
INSERT INTO `worker_rts` VALUES (7, 13);
INSERT INTO `worker_rts` VALUES (9, 13);

SET FOREIGN_KEY_CHECKS = 1;
