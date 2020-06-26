package com.abu.web.handler;

import com.miya.commons.http.handler.GlobalExceptionHandler;
import com.miya.commons.lang2.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Rest全局异常处理器
 *
 * @author spring-cloud-template-nacos-archetype
 * @date 2019/11/17 8:52 PM
 */
@ControllerAdvice
public class MiyaGlobalExceptionHandler extends GlobalExceptionHandler {

    @Override
    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<Result<String>> handlerAllException(HttpServletRequest request, Throwable t) {
        return super.handlerAllException(request, t);
    }
}
