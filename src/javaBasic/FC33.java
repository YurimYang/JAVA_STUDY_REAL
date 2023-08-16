package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FC33 {
    //키보드로부터 문자열을 계속 입력받다가 exit을 입력하면 종료하시오.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.print("문자열을 입력하세요 : ");
        while((line = br.readLine()) != null){
            if(line.equals("exit")) break;
            System.out.println(line);
            System.out.print("문자열을 입력하세요 : ");
        }
    }
}
