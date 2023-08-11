package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FC29 {
    public static void main(String[] args) {
        //키보드로부터 데이터를 입력
        //키보드(외부장치) : System.in <-> 모니터장치(콘솔) : System.out
        Scanner sc = new Scanner(System.in);
        //Scanner은 키보드 장치와 연결이 되어야하므로, System.in을 생성자에 대입입
        List<String> books = new ArrayList<>();

        while(true){
            System.out.println("종료");
            String isEnd = sc.nextLine();
            if(isEnd.equals("종료")){
                break;
            }
            System.out.print("책제목: ");
            String title = sc.nextLine();
            books.add(title);

            System.out.print("책가격: ");
            String price = sc.nextLine();
            books.add(price);
        }

        for(String bo : books){
            System.out.println(bo);
        }
    }
}
