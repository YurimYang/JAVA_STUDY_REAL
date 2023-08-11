package javaBasic;

import java.util.ArrayList;

public class FC28 {
    public static void main(String[] args) {
        //ArrayList를 이용해서 책 3권을 저장하고 출력하세요.
        ArrayList<String> books = new ArrayList<>(3);
        books.add("책1");
        books.add("책2");
        books.add("책3");
        for(String book : books){
            System.out.println(book);
        }
    }
}
