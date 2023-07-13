package part2.ch01.v09;

import part2.ch01.v06.StudentTest;

public class Student {
    int studentId;
    String studentName;

    Subject korea = new Subject();
    Subject math = new Subject();


    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showStuScore(){
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은" + total + "점입니다.");
    }
}
