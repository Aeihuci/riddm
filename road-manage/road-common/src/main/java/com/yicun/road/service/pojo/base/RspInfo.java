package com.yicun.road.service.pojo.base;

import java.io.Serializable;

/**
 * @ClassName: RspInfo
 * @Description: 通用返回报文信息
 * @Author: gary
 * @Version 1.0
 **/
public class RspInfo<T> implements Serializable {

    private static final long serialVersionUID = -5039076314597651701L;

    /**
     * 返回编码
     */
    private String respCode;

    /**
     * 返回描述
     */
    private String respDesc;

    /**
     * 返回内容
     */
    private T respData;

    public RspInfo() {
    }

    public RspInfo(String respCode, T respData) {
        this(respCode, null, respData);
    }

    public RspInfo(String respCode, String respDesc, T respData) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
    }

    public T getRespData() {
        return this.respData;
    }

    public RspInfo<T> setRespData(T respData) {
        this.respData = respData;
        return this;
    }

    public String getRespCode() {
        return this.respCode;
    }

    public RspInfo<T> setRespCode(String respCode) {
        this.respCode = respCode;
        return this;
    }

    public String getRespDesc() {
        return this.respDesc;
    }

    public RspInfo<T> setRespDesc(String respDesc) {
        this.respDesc = respDesc;
        return this;
    }
}
