package part2.ch05.v13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) throws IOException {
        int i,j;
        //i = System.in.read();
        InputStreamReader irs = new InputStreamReader(System.in);
        //System.out.println(i); //반환을 아스키코드로 함
        //System.out.println((char)i); //한 바이트씩 읽음 => 보조스트림으로 감싸야함!
        while((j = irs.read()) != '\n'){
            System.out.print((char) j);
        }


    }
}
