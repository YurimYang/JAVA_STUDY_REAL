package part2.ch01.v14;

public class Student {
    String studentName;
    int money;

   public Student(String studentName, int money){
       this.studentName = studentName;
       this.money = money;
   }
    //Bus 객체와 협업
   public void takeBus(Bus bus) {
       bus.take(1000);
       this.money -= 1000;
   }
    //Subway 객체와 협업
   public void takeSubway(Subway subway){
       subway.take(1200);
       this.money -=1200;
   }

   public void showStuInfo(){
       System.out.println(studentName + "님의 남은 돈은" + money +"원입니다.");
   }


}
