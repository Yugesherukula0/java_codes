package Oops;

public class Manager extends Employee {
    private String department;
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    void displayinfo() {
        System.out.println(getDepartment());
    }
}
