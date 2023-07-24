package part2.ch03.v02;

import groovy.json.JsonOutput;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student stu1 = new Student(100, "양유림");
        Student stu2 = new Student(100, "양유림");

        //물리적으로는 불일치
        System.out.println(stu1 == stu2);
        System.out.println(stu1.equals(stu2)); //equals 재정의 후 같아짐


        //재정의 후 => stuNum으로 hashCode 통일
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());


        //실제 hashCode확인하는 방법
        System.out.println(System.identityHashCode(stu1));
        System.out.println(System.identityHashCode(stu2));

        //Student copyStudent = (Student)stu1.clone();
        //System.out.println(copyStudent); //그대로 복제함
    }

}
