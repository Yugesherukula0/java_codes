package Oops;

public class Company {
     public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpid(101);
        e.setEname("ravi");
        e.setSalary(700000);
        Manager mgr=new Manager();
        mgr.setDepartment("Developer");
        e.displayinfo();
        mgr.displayinfo();
     }
}
