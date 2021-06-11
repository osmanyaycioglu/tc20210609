package com.training.micro.feign;

import java.util.ArrayList;
import java.util.List;

public class ErrorObj {

    private List<ErrorObj> errorObjs;
    private String         message;
    private int            errorCause;

    public List<ErrorObj> getErrorObjs() {
        return this.errorObjs;
    }

    public ErrorObj addErrorObj(final ErrorObj errorObjsParam) {
        if (this.errorObjs == null) {
            this.errorObjs = new ArrayList<>();
        }
        this.errorObjs.add(errorObjsParam);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ErrorObj setMessage(final String messageParam) {
        this.message = messageParam;
        return this;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public ErrorObj setErrorCause(final int errorCauseParam) {
        this.errorCause = errorCauseParam;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorObj [errorObjs="
               + this.errorObjs
               + ", message="
               + this.message
               + ", errorCause="
               + this.errorCause
               + "]";
    }


}
