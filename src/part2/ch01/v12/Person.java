package part2.ch01.v12;

public class Person {
    String name;
    int age;

    //아무런 값이 안들어왔을 때 초기화를 위한코드
    public Person(){
//        int num = 10;        //위와 같은 코드는 넣을 수 없음 !
//        String name = "test"; //인스턴스의 생성이 완전하지 않은 상태이므로

        this("이름없음", 0);
        //아래에 Person이란 생성자가 있으므로
        //이를 호출해서 객체를 생성함!
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;
    }

    public  void showPerson(){
        System.out.println(name + "," + age);
    }
    public static void main(String[] args) {
        Person person = new Person("양유림", 17);
        person.showPerson();

        System.out.println(person);
        //part2.ch01.v12.Person@799f7e29
        System.out.println(person.getPerson());
        //part2.ch01.v12.Person@799f7e29 => class 이름 + JVM이 assign 해준 address

        //위 예시를 통해 this는 결국 같은 주소값을 반환해줌을 알 수 있다.
    }
}
