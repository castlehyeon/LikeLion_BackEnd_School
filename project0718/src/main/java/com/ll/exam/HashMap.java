package com.ll.exam;

import java.util.ArrayList;
import java.util.List;

public class HashMap <T, I extends Number> {//이건 그냥 인텔리j가 추천해줘서,
    private ArrayList <T> strings;//초기화는 생성자에서!
    private  ArrayList <I> integers;
    private int size;
    public HashMap(){
        strings = new ArrayList<>();
        integers= new ArrayList<>();
        size = 0;
    }

    public void put(T s, I i) {
        if ( size == 0 ){
            strings.add(size, s);
            integers.add(size, i);
            ++size;
        }

        if(compareKey(s)){
            strings.add(size, s);
            integers.add(size, i);
            ++size;//_2nd_get()
        }

        integers.set(getKey(s), i);

    }

    private boolean compareKey(T s) {
        if (getKey(s) == -1 ){ // getKey가 -1을 반환한다면 없는것
            return true;
        }
        return false;
    }

    public I get(T s) {
        int keyIndex = getKey(s);
        return integers.get(keyIndex);
    }

    private int getKey(T s) {
        for(int i = 0; i < size; i++){
            if(strings.get(i) == s){
                return i;
            }

        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void remove(T s) {
        int index = getKey(s);
        strings.remove(index);
        integers.remove(index);
        --size;
    }

    public void keySet() {
        T key;
        I value;
        //ArrayList list = new ArrayList<>();
        for (int j = 0; j <size; j++){
            key = strings.get(j);
            value = integers.get(j);
//            list = list.add(key, value); 이건 문법은 아니지만, 이런식으로 넣어보고 싶은데...
            System.out.printf((String) key);
            System.out.printf(String.valueOf(value));
            System.out.println();
        }

    }
}
