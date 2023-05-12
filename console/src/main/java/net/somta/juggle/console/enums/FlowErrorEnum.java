package net.somta.juggle.console.enums;

import net.somta.core.base.IBaseError;
import net.somta.juggle.console.contants.ApplicationContants;

public enum FlowErrorEnum implements IBaseError {
    FLOW_NOT_EXIST(1000,  "流程不存在"),;

    private int errorCode;
    private String errorMsg;

    FlowErrorEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public long getErrorCode() {
        return ApplicationContants.FLOW_CODE + errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }
}