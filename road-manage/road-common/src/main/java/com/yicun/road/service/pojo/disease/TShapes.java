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
public class TShapes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 目标类别
     */
    private String label;

    /**
     * 目标轮廓数据设置
     */
    private String points;

    private String groupId;

    private String shapeType;

    private String flags;

    /**
     * 病害_坑槽主数据关联id
     */
    private Integer defectsId;

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
