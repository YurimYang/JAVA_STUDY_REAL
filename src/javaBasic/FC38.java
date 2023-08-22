package javaBasic;

import java.io.*;

public class FC38 {
    public static void main(String[] args) {
        try {
            //파일이나 디렉토리 생성
            File f = new File("pic.png");
            System.out.println(f.length());
            FileInputStream fis = new FileInputStream("pic.png");
            BufferedInputStream bis = new BufferedInputStream(fis);
            //버퍼를 꽂고 쓸 수도, 안꽂고 쓸 수도 있다.
            FileOutputStream fos = new FileOutputStream("newpic.png");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            int cnt = 0;
            while ((data = fis.read()) != -1) {
                //System.out.println(data);
                //cnt++;
                //fos.write(data); //원본이 똑같이 복붙이 되어있음
                bos.write(data);
                bos.flush();
            }
            bos.close();
            bis.close();
            System.out.println("cnt:" + cnt); //34138
            System.out.println("복사완료");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
