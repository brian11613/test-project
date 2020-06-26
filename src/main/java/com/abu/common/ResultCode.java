package com.abu.common;

import com.miya.commons.lang2.IResultCode;

/**
 * 返回码定义
 *
 * @author spring-cloud-template-nacos-archetype
 * @date 2019/11/17 8:22 PM
 */
public enum ResultCode implements IResultCode {

    /**
     * 远程调用失败
     */
    REMOTE_FAILED("9001", "远程调用失败")
    //
    ;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 错误码
     */
    public final String code;
    /**
     * 错误信息
     */
    public final String msg;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
