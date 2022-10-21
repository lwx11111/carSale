package com.xxx.entity.vo;

public class MessageModel {

    private String ResultMsg;
    private int ResultCode=0;

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getResultMsg() {
        return ResultMsg;
    }

    public void setResultMsg(String resultMag) {
        ResultMsg = resultMag;
    }
}
