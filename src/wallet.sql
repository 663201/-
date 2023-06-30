/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : wallet

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 15/02/2023 17:25:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wallet
-- ----------------------------
DROP TABLE IF EXISTS `wallet`;
CREATE TABLE `wallet`  (
  `id` int NOT NULL COMMENT '用户id',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `walletid` int  NOT NULL COMMENT'钱包id',
  `update_time` datetime NOT NULL COMMENT '更新创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wallet
-- ----------------------------
INSERT INTO `wallet` VALUES (1, '张三', 123, '2023-02-15 16:56:01');
INSERT INTO `wallet` VALUES (2, '李四', 246, '2023-02-15 15:59:43');

-- ----------------------------
-- Table structure for wallet_details
-- ----------------------------
DROP TABLE IF EXISTS `wallet_details`;
CREATE TABLE `wallet_details`  (
    `id` int NOT NULL COMMENT '钱包id',
  `balance` decimal(10, 2) NOT NULL COMMENT '钱包余额',
  `change_balance` decimal(10, 2) NOT NULL COMMENT '金额变动',
  `update_time` datetime NOT NULL COMMENT '更新创建时间',
  `type` int NOT NULL COMMENT '1为消费，0为存钱',
    `Userid` int NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE,
        foreign key (Userid) references wallet(id)
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wallet_details
-- ----------------------------
INSERT INTO `wallet_details` VALUES (123, 1314.00, 1314.00,  '2023-02-15 16:37:49', 1);
INSERT INTO `wallet_details` VALUES (123, 1000.00, 314.00,  '2023-02-15 16:41:40', 0);
INSERT INTO `wallet_details` VALUES (123, 1200.00, 200.00,  '2023-02-15 16:41:43', 1);
INSERT INTO `wallet_details` VALUES (246, 500.00, 500.00, '2023-02-15 16:55:55', 1);
INSERT INTO `wallet_details` VALUES (246, 400.00, 100.00, '2023-02-15 16:56:01', 0);
INSERT INTO `wallet_details` VALUES (246, 420.00, 20.00, '2023-02-15 16:56:01', 1);

SET FOREIGN_KEY_CHECKS = 1;
