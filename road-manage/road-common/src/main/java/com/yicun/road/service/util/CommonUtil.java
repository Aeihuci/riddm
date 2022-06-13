package com.yicun.road.service.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.*;
import lombok.extern.slf4j.Slf4j;



/**
 * @ClassName: CommonUtil
 * @Description: 系统工具类
 * @Author: gary
 * @Version 1.0
 **/
@Slf4j
public class CommonUtil {

    /**
     * 生成按日期格式的ID号
     * @return
     */
    public static String genId() {
        return DateUtil.format(DateUtil.date(), DatePattern.PURE_DATETIME_MS_PATTERN) + RandomUtil.randomNumbers(3);
    }

}
