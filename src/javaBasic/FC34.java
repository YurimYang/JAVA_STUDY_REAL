package javaBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FC34 {
    public static void main(String[] args) throws IOException {
        //파일 핸들링 하기
        //파일에 있는 데이터를 읽기(이미지-카피, 문자) - xml, json
        //파일에서 문자 데이터를 읽어 오기 위한 스트림의 연결
        //단, 파일이 있을지 없을지 모르기 때문에 예외처리(간접처리)
        /**
        홍길동(엔터까지 4)
        JAVA(5)
        이 파일을 읽기 위해서는 총 9번을 읽어야함
        => 불필요하기 때문에 Buffer을 넣어주는 것이 좋다.

        FileReader fr = new FileReader("member.txt");
        int data;
        int cnt = 0;
        while((data=fr.read())!=-1){
            System.out.print((char)data);
            cnt++;
        }
         **/

        BufferedReader br = new BufferedReader(new FileReader("member.txt"));
        String data;
        int cnt = 0;
        while((data= br.readLine()) != null){
            System.out.println(data);
            cnt++;
        }
        System.out.println(cnt);

    }
}
