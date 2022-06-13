package com.yicun.road.service.pojo.disease;

import java.time.LocalDateTime;
import java.io.Serializable;
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
public class TPoints implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 目标轮廓数据
     */
    private String pointsData;

    /**
     * 下标
     */
    private Integer index;

    /**
     * 目标信息关联id
     */
    private Integer shapesId;

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
