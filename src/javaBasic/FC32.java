package javaBasic;

import java.io.*;

public class FC32 {
    public static void main(String[] args) throws IOException {
        /**
         * InputStream is = System.in;
         * InputStreamReader isr = new InputStreamReader(is);
         * BufferedReader br = new BufferedReader(isr);
         */

        //키보드로부터 라인단위로 문자열을 입력받기 위한 스트림을 연결 ?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열을 입력하세요.");
        String line = br.readLine(); //라인 단위로 읽기 가능(엔터앞까지)
        System.out.println(line);


    }
}
