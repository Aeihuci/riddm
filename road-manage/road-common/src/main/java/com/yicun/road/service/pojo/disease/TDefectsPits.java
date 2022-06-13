package com.yicun.road.service.pojo.disease;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.yicun.road.service.pojo.base.PageBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author gary
 * @since 2022-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TDefectsPits extends PageBean implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 版本
     */
    private String version;

    private String flags;

    /**
     * 目标信息设置
     */
    private String shapes;

    /**
     * 图片地址
     */
    private String imagePath;

    /**
     * 图片数据
     */
    private String imageData;

    /**
     * 图片高度
     */
    private Long imageHeight;

    /**
     * 图片宽度
     */
    private Long imageWidth;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除状态（0：未删除  1：已删除）
     */
    private Integer deleted;

    /**
     * 备注（预留字段）
     */
    private String remark;


}
