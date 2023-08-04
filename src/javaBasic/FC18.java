package javaBasic;

import model.Animal;
import model.Cat;
import model.Dog;

public class FC18 {
    public static void main(String[] args) {
        //Dog, Cat -> Object[] : Object->Downcasing 필수
        Object[] objs = new Object[2];
        objs[0] = new Dog(); //Upcasting, eat()
        objs[1] = new Cat(); //Upcasting , eat(), night()

        for(int i =0; i<objs.length;i++){
            if(objs[i] instanceof Dog) {
                ((Dog)objs[i]).eat();
            } else if(objs[i] instanceof Cat) {
                ((Cat)objs[i]).eat();
                ((Cat)objs[i]).night();
            }
        }
    }
}
