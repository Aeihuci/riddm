package com.yicun.road.service.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PageUtil
 * @Description:
 * @Author: gary
 * @Version 1.0
 **/
@Component
public class PageUtil<T> {

    public Page<T> defaultPage(long currPage, long pageSize) {
        if(Long.valueOf(currPage) <= 0) {
            currPage = 1L;
        }
        if(Long.valueOf(pageSize) <= 0) {
            pageSize = 10L;
        }
        return new Page<T>(currPage,pageSize);
    }

}
