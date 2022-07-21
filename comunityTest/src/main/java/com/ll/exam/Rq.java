package com.ll.exam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

//기존 코드의 문제점:
//값을 안쓰면 오류 등.
//여기서 req, resp는 무슨역할을 하는거지?
public class Rq {
    private HttpServletRequest req;
    private HttpServletResponse resp;
    //private String[] arr;
    public Rq(HttpServletRequest req, HttpServletResponse resp){
        this.req = req;
        this.resp = resp;
        //arr = new String[2];
        try {
            req.setCharacterEncoding("UTF-8");
            //Rq클래스의 한글화 인코딩
            //req가 먼저 들어올것이니...
        } catch (UnsupportedEncodingException e) {
            //만약 지원하지 않는 인코딩형식이라면??
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
    }

    public int getIntParam(String paramName, int defaultValue) {
//        for (int j = 0; j < arr.length; j++ ) {
//                arr[j] = String.valueOf(req.split(",", 2));
//        }
//                arr[0] = ;
//                arr[1] = limit;
//
//                return 단수, limit;
//
//                return defaultvalue;
        String value = req.getParameter(paramName);

        if (value == null) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public void appendBody(String str) {
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
