package com.training.micro.rest.error;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.micro.rest.ErrorObj;

@RestControllerAdvice
public class RestErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestErrorHandler.class);


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(final MethodArgumentNotValidException exceptionParam) {
        ErrorObj errorObjLoc = new ErrorObj().setMessage("validasyon error.")
                                             .setErrorCause(253);
        List<ObjectError> allErrorsLoc = exceptionParam.getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            errorObjLoc.addErrorObj(new ErrorObj().setMessage(objectErrorLoc.toString())
                                                  .setErrorCause(300));
        }
        return errorObjLoc;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handleException(final Exception exceptionParam) {
        RestErrorHandler.logger.error("[RestErrorHandler][handleException]-> *Error* : " + exceptionParam.getMessage(),
                                      exceptionParam);
        ErrorObj errorObjLoc = new ErrorObj();
        errorObjLoc.setMessage("Error oluştu : " + exceptionParam.getMessage());
        errorObjLoc.setErrorCause(9999);
        return errorObjLoc;
    }

}
