package part2.ch01.v17;


public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("양유림");

        Employee emp2 = new Employee();
        emp2.setEmpName("배성현");

        System.out.println(Employee.getSerialNum());
        //static 변수는 아예 참조변수를 그대로 가져와서 쓸 수도 있음!
        System.out.println(emp1.getEmpId());
        System.out.println(emp2.getEmpId());

        //2개의 인스턴스(emp1 과 emp2는 serialNum(static)을 공유하기 때문에
        //어느 한 곳에서 증가를 시키면 동일하게 증가된 값이 출력됨!
    }


}
