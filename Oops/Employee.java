package Oops;

public class Employee {
    private String ename;
    private int empid;
    private double salary;
    public void setEname(String ename){
        this.ename=ename;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEname() {
        return ename;
    }
    public double getSalary() {
        return salary;
    }
    public int getEmpid() {
        return empid;
    }
    void displayinfo(){
        System.out.println(getEmpid());
        System.out.println(getEname());
        System.out.println(getSalary());
    }

}
