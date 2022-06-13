/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.10.141
 Source Server Type    : MySQL
 Source Server Version : 50170
 Source Host           : localhost:3306
 Source Schema         : riddm_test

 Target Server Type    : MySQL
 Target Server Version : 50170
 File Encoding         : 65001

 Date: 13/06/2022 14:53:50
*/

SET NAMES utf8;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_defects_pits
-- ----------------------------
DROP TABLE IF EXISTS `t_defects_pits`;
CREATE TABLE `t_defects_pits`
(
    `id`           int(1) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `version`      varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '版本',
    `flags`        varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `shapes`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标信息设置',
    `image_path`   varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
    `image_data`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片数据',
    `image_height` bigint(1) NULL DEFAULT NULL COMMENT '图片高度',
    `image_width`  bigint(1) NULL DEFAULT NULL COMMENT '图片宽度',
    `create_by`    varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
    `create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间',
    `update_by`    varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
    `update_time`  datetime NULL DEFAULT NULL COMMENT '修改时间',
    `deleted`      int(1) NULL DEFAULT NULL COMMENT '删除状态（0：未删除  1：已删除）',
    `remark`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注（预留字段）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_points
-- ----------------------------
DROP TABLE IF EXISTS `t_points`;
CREATE TABLE `t_points`
(
    `id`          int(1) NOT NULL COMMENT '主键id',
    `points_data` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标轮廓数据',
    `index`       int(1) NULL DEFAULT NULL COMMENT '下标',
    `shapes_id`   int(1) NOT NULL COMMENT '目标信息关联id',
    `create_by`   varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
    `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
    `update_by`   varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
    `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
    `deleted`     int(1) NULL DEFAULT NULL COMMENT '删除状态（0：未删除  1：已删除）',
    `remark`      varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注（预留字段）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_shapes
-- ----------------------------
DROP TABLE IF EXISTS `t_shapes`;
CREATE TABLE `t_shapes`
(
    `id`          int(1) NOT NULL COMMENT '主键id',
    `label`       varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标类别',
    `points`      varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标轮廓数据设置',
    `group_id`    varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `shape_type`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `flags`       varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `defects_id`  int(1) NOT NULL COMMENT '病害_坑槽主数据关联id',
    `create_by`   varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
    `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
    `update_by`   varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
    `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
    `deleted`     int(1) NULL DEFAULT NULL COMMENT '删除状态（0：未删除  1：已删除）',
    `remark`      varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注（预留字段）',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET
FOREIGN_KEY_CHECKS = 1;
