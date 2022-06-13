package com.yicun.road.service.pojo.base;

import java.io.Serializable;

/**
 * @ClassName: RspPageInfo
 * @Description: 分页返回报文
 * @Author: gary
 * @Date: 2022/6/13 11:19
 * @Version 1.0
 **/
public class RspPageInfo<T> implements Serializable {

    public String code; //返回状态码

    private String msg; //返回描述信息

    private long count; //返回总条数

    private T data; //返回内容体


    public RspPageInfo<T> setCode(ResultCode retCode) {
        this.code = retCode.CODE;
        return this;
    }

    public String getCode() {
        return code;
    }

    public RspPageInfo<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RspPageInfo<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RspPageInfo<T> setData(T data) {
        this.data = data;
        return this;
    }

    public RspPageInfo<T> setCount(long count) {
        this.count = count;
        return this;
    }

    public long getCount() {
        return count;
    }
}
