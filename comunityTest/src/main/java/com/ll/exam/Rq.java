package com.ll.exam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;

//기존 코드의 문제점:
//값을 안쓰면 오류 등.
//여기서 resp는 무슨역할을 하는거지?
public class Rq {
    private HttpServletRequest req;
    private HttpServletResponse resp;
    private
    String[] arr;
    public Rq(HttpServletRequest req, HttpServletResponse resp){
        this.req = req;
        this.resp = resp;
        arr = new String[2];
    }

    public int getIntParam(String param, int defaultvalue) {
        for (int j = 0; j < arr.length; j++ ) {
                arr[j] = String.valueOf(req.split(",", 2));
        }
                arr[0] = ;
                arr[1] = limit;

                return 단수, limit;

                return defaultvalue;
}

    public void appendBody(String formatted) {
    }
