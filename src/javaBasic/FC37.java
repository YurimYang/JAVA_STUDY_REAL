package javaBasic;

import java.io.*;

public class FC37 {
    //키보드로부터 책 데이터를 입력받아서 파일에 저장(book.txt)
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("책의 제목을 입력하세요 : ");
            String title = br.readLine();
            System.out.print("책의 출판사를 입력하세요 : ");
            String company = br.readLine();
            System.out.print("책의 저자를 입력하세요 : ");
            String author = br.readLine();
            System.out.print("책의 가격을 입력하세요 : ");
            int price = Integer.parseInt(br.readLine());

            FileWriter fw = new FileWriter("book.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            /**
             * Buffer을 쓰면 주의해야할 점
             * file에다가 바로 write를 하는게 아니라 Buffer에다가 write를 하는구조임
             * JAVA -> bw -> fw 구조이기 때문
             */
            String data = title + "," + company + "," + author + "," + price;
            bw.write(data);
            bw.close(); //bw.flush()
            System.out.println("파일생성");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
