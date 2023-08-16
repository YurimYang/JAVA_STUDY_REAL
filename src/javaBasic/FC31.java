package javaBasic;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC31 {
    public static void main(String[] args) throws IOException {
        //한글 한자를 입력해서 출력
        InputStream is = System.in;
        // 문자 입력스트림(브릿지스트림) : Reader 계열
        InputStreamReader isr = new InputStreamReader(is);
        System.out.print("한글 한자를 입력 : ");
        int data;
        while((data=isr.read())!= -1){
            System.out.print((char) data);
        }
    }
}
