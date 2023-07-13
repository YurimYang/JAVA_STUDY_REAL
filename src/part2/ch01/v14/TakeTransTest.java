package part2.ch01.v14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student stu1 = new Student("James", 5000);
        Student stu2 = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway(2);

        stu1.takeBus(bus100);
        stu1.showStuInfo();

        stu2.takeSubway(subway2);
        stu2.showStuInfo();

        bus100.showBusInfo();
        subway2.showSubwayInfo();
    }
}
