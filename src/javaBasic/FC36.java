package javaBasic;

import model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FC36 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("member2.txt"));
            String line;
            List<Book> list = new ArrayList<>();
            while((line = br.readLine()) != null){
                System.out.println(line);
                String[] str = line.split(",");
                Book b = new Book(str[0], str[1], str[2], Integer.parseInt(str[3]));
                list.add(b);
                bookPrint(list);
            }
            selectionSort(list);


        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void selectionSort(List<Book> list) {
        Book temp;
        for(int i =0; i<list.size()-1;i++){
            for(int j= i+1; j<list.size();j++){
                if(list.get(i).getTitle().compareTo(list.get(j).getTitle())>0){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

    }

    public static void bookPrint(List<Book> list){
        //Book계열의 list만 받아올 것이기 때문에 <Book>을 필수적으로 써준다.
        for(Book b : list){
            System.out.print(b.toString());
        }
    }
}
