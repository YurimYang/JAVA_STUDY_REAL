package part2.ch01.v06;

//Client code
public class StudentTest {

    public static void main(String[] args){

        Student student1 = new Student();
        //기본 생성자는 default로 제공되기 때문에 바로 작성할 수 있음!!

        //만약 작성한 기본생성자대로라면,
        //Student student1 = new Student(12345, "Lee", 3);
        //이렇게 매개변수에 맞춰서 작성했어야함 !!

        student1.studentName = "양유림";
        student1.studentNumber = 12345;
        student1.grade = 1;
        System.out.println(student1.showStudentInfo());
    }
}
