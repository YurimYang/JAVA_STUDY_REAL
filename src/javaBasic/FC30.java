package javaBasic;

import java.io.IOException;
import java.io.InputStream;

public class FC30 {
    public static void main(String[] args) throws IOException {
        //throws : JVM에서 ERROR MSG 던지기(간접처리)
        //TRY-CATCH : 직접처리
        InputStream is = System.in;
        System.out.println("영문 여러자를 입력하세요.");
        //영문 한글자 처리
//        int data = is.read();
//        System.out.println((char)data);

        //영문 여러자 처리 (계속 반복해서 읽어드림)
        while(true){
            int data1 = is.read();
            //더이상 데이터를 읽을 수 없을때 -1을 return함
            if(data1 == -1) break;
            System.out.print((char)data1);
        }
    }
}
