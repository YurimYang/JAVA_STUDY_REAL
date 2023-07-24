package part2.ch03.v04;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class c1 = Class.forName("ch03.v04.Person");

        Person person = (Person) c1.newInstance();
        person.setName("lee");

        System.out.println(person);

        Class c2 = person.getClass(); //이미 인스턴스가 있는 상태여야함
        Person p = (Person) c2.newInstance();
        System.out.println(p);

//        Class[] parameterTypes =(String.class);
//        Constructor cons = c2.getConstructors(parameterTypes);
//        Object initargs = "Kim";
//        Person kimPerson = (Person) cons.newInstance(initargs);
//        System.out.println(kimPerson);

    }
}
