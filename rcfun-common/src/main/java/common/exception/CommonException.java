package common.exception;

import model.common.enums.AppHttpStatusEnum;

public class CommonException {

    private AppHttpStatusEnum appHttpCodeEnum;

    public CommonException(AppHttpStatusEnum appHttpCodeEnum){
        this.appHttpCodeEnum = appHttpCodeEnum;
    }

    public AppHttpStatusEnum getAppHttpCodeEnum() {
        return appHttpCodeEnum;
    }

}
