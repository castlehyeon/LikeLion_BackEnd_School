package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }
    @Test
    void ArrayList_size() {
        ArrayList al = new ArrayList();
        int rs = al.size();
        assertEquals(0, rs);
    }
}
