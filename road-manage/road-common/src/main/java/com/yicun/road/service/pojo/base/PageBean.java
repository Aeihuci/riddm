package com.yicun.road.service.pojo.base;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @ClassName: PageBean
 * @Description:
 * @Author: gary
 * @Version 1.0
 **/
@Data
public class PageBean {

    /**
     * 当前页码
     */
    @TableField(exist = false)
    private long currPage;

    /**
     * 每页显示条数
     */
    @TableField(exist = false)
    private long pageSize;
}
