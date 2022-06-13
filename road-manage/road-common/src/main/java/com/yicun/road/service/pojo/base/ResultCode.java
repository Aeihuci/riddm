package com.yicun.road.service.pojo.base;

/**
 * @ClassName: ResultCode
 * @Description: 响应编码枚举
 * @Author: gary
 * @Version 1.0
 **/
public enum ResultCode {

    // 成功
    SUCCESS("0000"),

    // 失败
    FAIL("9999");

    public String CODE;

    ResultCode(String code) {
        this.CODE = code;
    }
}
