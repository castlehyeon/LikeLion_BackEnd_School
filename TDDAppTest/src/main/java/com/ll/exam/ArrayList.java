package com.ll.exam;

public class ArrayList {
    private int size;//실제 배열 크기, index = size - 1;
    private int[] arr;

    public ArrayList() {
        arr = new int[2];
        size=0;
    }

    public int size() {
        return size;
    }

    public void add(int i) {
        arr[0] = 100;
    }

    public int get(int i) {
        return 100;
    }
}
