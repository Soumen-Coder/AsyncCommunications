package com.soumen.async.exception;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        System.out.println("Method Name :- "+method.getName() + "  ||  "+ Arrays.toString(params) + "  ||  "+
        "Error Message :- "+ex.getMessage());
    }
}
