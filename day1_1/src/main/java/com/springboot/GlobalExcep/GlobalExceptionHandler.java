package com.springboot.GlobalExcep;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errmessage(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code",500);
        map.put("msg","网络异常");
        return map;
    }
}
