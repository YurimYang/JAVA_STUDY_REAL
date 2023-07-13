package part2.ch01.v06;

//service code
public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;


//    기본 생성자 w/ 이름, 학번, 학년을 매개변수로 받아서 ! 객체를 초기화 !
//    즉, 넘어온 정보들을 가지고 내가 초기화를 해서 저장하겠다 !
//    public Student(int studentNumber, String studentName, int grade){
//        this.studentNumber = studentNumber; //내 멤버변수에다가 넘어온 값(매개변수)를 넣고 싶다.
// 그러므로 this를 사용함! , 가독성을 위해 이름을 같게 하되, this를 사용하여 분리를 해줌
//        this.studentName = studentName;
//        this.grade = grade;
//    }

    //새롭게 만든 생성자
    public String showStudentInfo() {
        return studentName + "학생의학번은" + studentNumber + " 이고, " + grade + "학년 입니다. ";
    }


}
