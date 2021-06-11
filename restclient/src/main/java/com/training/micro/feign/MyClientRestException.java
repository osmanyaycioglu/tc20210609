package com.training.micro.feign;


public class MyClientRestException extends Exception {

    private static final long serialVersionUID = -5255348635014711369L;

    private ErrorObj          errorObj;

    public MyClientRestException(final ErrorObj errorObjParam) {
        super();
        this.errorObj = errorObjParam;
    }

    public MyClientRestException() {
    }

    public ErrorObj getErrorObj() {
        return this.errorObj;
    }

    public void setErrorObj(final ErrorObj errorObjParam) {
        this.errorObj = errorObjParam;
    }


}
