package javaBasic;

import api.MyIntArray;

public class FC24 {
    public static void main(String[] args) {
        MyIntArray arr= new MyIntArray();
        arr.add(0);
        arr.add(1);
        arr.add(2);

        for(int i =0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
