package com.training.micro.feign;

import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class MyErrorDecoder implements ErrorDecoder {

    @Override
    public MyClientRestException decode(final String methodKeyParam,
                                        final Response responseParam) {
        try {
            int statusLoc = responseParam.status();
            System.out.println("Error Status : " + statusLoc);
            InputStream asInputStreamLoc = responseParam.body()
                                                        .asInputStream();
            ObjectMapper mapperLoc = new ObjectMapper();
            ErrorObj readValueLoc = mapperLoc.readValue(asInputStreamLoc,
                                                        ErrorObj.class);
            MyClientRestException exceptionLoc = new MyClientRestException(readValueLoc);

            return exceptionLoc;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
            return new MyClientRestException();
        }
    }

}
