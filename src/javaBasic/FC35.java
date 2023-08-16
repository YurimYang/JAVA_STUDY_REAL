package javaBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

//Line단위로 읽어와서 Book이란 VO에 넣어주고 ArrayList에 담아줘야한다.
public class FC35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("member2.txt"));
        ArrayList<String> Book = new ArrayList<>();
        String[] data = new String[0];
        for(int i = 0; i<3; i++){
            data = br.readLine().split(",");
            for(int j = 0; j<4; j++){
                Book.add(data[j]);
                System.out.println(data[j]);
            }
        }

        
    }
}
