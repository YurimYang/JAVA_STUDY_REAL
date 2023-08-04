package javaBasic;

import model.Animal;
import model.Cat;
import model.Dog;
import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.ArrayList;

public class FC17 {
    public static void main(String[] args) {
        //1. 다형성 배열
        //Dog와 Cat을 저장할 배열을 생성을 하세요.
        //내방법
        ArrayList<Object> array = new ArrayList<>();
        array.add(new Dog());
        array.add(new Cat());

        System.out.println(array.get(0));
        System.out.println(array.get(1));

        //선생님 방법
        Animal[] anis = new Animal[2];
        anis[0] = new Dog();
        anis[1] = new Cat();

        for(int i=0; i<anis.length;i++){
            anis[i].eat();
            if(anis[i] instanceof Cat){
                //anis[i]의 타입이 Cat인지 == true,false
                ((Cat) anis[i]).night();
            }
        }

    }
}
