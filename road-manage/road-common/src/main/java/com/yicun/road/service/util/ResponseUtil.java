package com.yicun.road.service.util;

import com.yicun.road.service.pojo.base.ResultCode;
import com.yicun.road.service.pojo.base.RspInfo;
import com.yicun.road.service.pojo.base.RspPageInfo;

/**
 * @ClassName: ResponseUtil
 * @Description:
 * @Author: gary
 * @Version 1.0
 **/
public class ResponseUtil {

    private final static String SUCC_MSG = "操作成功";

    public static <T> RspInfo<T> makeOKRsp() {
        return new RspInfo<T>().setRespCode(ResultCode.SUCCESS.CODE).setRespDesc(SUCC_MSG);
    }

    public static <T> RspInfo<T> makeOKRsp(T data) {
        return new RspInfo<T>().setRespCode(ResultCode.SUCCESS.CODE).setRespDesc(SUCC_MSG).setRespData(data);
    }

    public static <T> RspInfo<T> makeOKRsp(String code,T data) {
        return new RspInfo<T>().setRespCode(code).setRespDesc(SUCC_MSG).setRespData(data);
    }

    public static <T> RspInfo<T> makeOKRsp(String code,String desc,T data) {
        return new RspInfo<T>().setRespCode(code).setRespDesc(desc).setRespData(data);
    }

    public static <T> RspInfo<T> makeErrRsp(String msg) {
        return new RspInfo<T>().setRespCode(ResultCode.FAIL.CODE).setRespDesc(msg);
    }

    public static <T> RspInfo<T> makeErrRsp(String code, String msg) {
        return new RspInfo<T>().setRespCode(code).setRespDesc(msg);
    }

    public static <T> RspPageInfo<T> makePageRsp(String code, long count, String msg, T data) {
        return new RspPageInfo<T>().setCode(code).setCount(count).setMsg(msg).setData(data);
    }

}
