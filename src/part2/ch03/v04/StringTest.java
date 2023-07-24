package part2.ch03.v04;


import java.lang.reflect.*;

public class StringTest {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

        Constructor<String>[] cons = c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for(Method mth : m){
            System.out.println(mth);
        }
    }
}
