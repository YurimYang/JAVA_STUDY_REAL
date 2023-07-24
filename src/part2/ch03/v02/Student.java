package part2.ch03.v02;

import java.util.Objects;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student stu = (Student) obj;
            if(this.studentNum == stu.studentNum) //학번이 같을 경우 true
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum; //hashCode()를 학번으로 동일시켜버림
    }



    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    public String toString(){
        return studentName +" " + studentNum;
    }
}
