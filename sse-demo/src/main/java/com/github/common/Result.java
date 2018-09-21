package com.github.common;

public class Result {

    private int code;
    private String msg;
    private Object data;

    public Result(){}

    public Result(Object data){
        this.code = 0;
        this.data = data;
        this.msg = "OK";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
