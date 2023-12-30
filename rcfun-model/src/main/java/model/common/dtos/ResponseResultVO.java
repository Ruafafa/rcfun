package model.common.dtos;


import model.common.enums.AppHttpStatusEnum;

import java.io.Serializable;


/**
 * 通用的结果返回类
 * @param <T>
 */
public class ResponseResultVO<T> implements Serializable {

    private String host;

    private Integer Status;

    private String errorMessage;

    private T data;

    public ResponseResultVO() {
        this.Status = 200;
    }

    public ResponseResultVO(Integer Status, T data) {
        this.Status = Status;
        this.data = data;
    }

    public ResponseResultVO(Integer Status, String msg, T data) {
        this.Status = Status;
        this.errorMessage = msg;
        this.data = data;
    }

    public ResponseResultVO(Integer Status, String msg) {
        this.Status = Status;
        this.errorMessage = msg;
    }

    public static ResponseResultVO errorResult(int Status, String msg) {
        ResponseResultVO result = new ResponseResultVO();
        return result.error(Status, msg);
    }

    public static ResponseResultVO okResult(int Status, String msg) {
        ResponseResultVO result = new ResponseResultVO();
        return result.ok(Status, null, msg);
    }

    public static ResponseResultVO okResult(Object data) {
        ResponseResultVO result = setAppHttpStatusEnum(AppHttpStatusEnum.SUCCESS, AppHttpStatusEnum.SUCCESS.getErrorMessage());
        if(data!=null) {
            result.setData(data);
        }
        return result;
    }

    public static ResponseResultVO errorResult(AppHttpStatusEnum enums){
        return setAppHttpStatusEnum(enums,enums.getErrorMessage());
    }

    public static ResponseResultVO errorResult(AppHttpStatusEnum enums, String errorMessage){
        return setAppHttpStatusEnum(enums,errorMessage);
    }

    public static ResponseResultVO setAppHttpStatusEnum(AppHttpStatusEnum enums){
        return okResult(enums.getCode(),enums.getErrorMessage());
    }

    private static ResponseResultVO setAppHttpStatusEnum(AppHttpStatusEnum enums, String errorMessage){
        return okResult(enums.getCode(), errorMessage);
    }

    public ResponseResultVO<?> error(Integer Status, String msg) {
        this.Status = Status;
        this.errorMessage = msg;
        return this;
    }

    public ResponseResultVO<?> ok(Integer Status, T data) {
        this.Status = Status;
        this.data = data;
        return this;
    }

    public ResponseResultVO<?> ok(Integer Status, T data, String msg) {
        this.Status = Status;
        this.data = data;
        this.errorMessage = msg;
        return this;
    }

    public ResponseResultVO<?> ok(T data) {
        this.data = data;
        return this;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
