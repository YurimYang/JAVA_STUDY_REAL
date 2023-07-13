package part2.ch01.v17;

public class Employee {

    private static int serialNum = 1000;

    private int empId;
    private String empName;
    private String department;

    public Employee(){
        serialNum++;
        empId = serialNum;
    }

    //set은 위험정보이므로 안함
    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
