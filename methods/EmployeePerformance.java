package methods;

public class EmployeePerformance {
    int employeeid;
    int projectsCompleted;
    int overTimeHours;
    double basicSalary;
    double bonusAmount;
    EmployeePerformance(int employeeid){
        this.employeeid=employeeid;
        this.projectsCompleted=0;
        this.overTimeHours=0;
    }
    void projectWorkinDeatils(int projectsCompleted,int overTimeHours,double basicSalary){
        this.projectsCompleted+=projectsCompleted;
        this.overTimeHours+=overTimeHours;
        this.basicSalary=basicSalary;
    }
    void bonusCalculation(){
        double incrementPercentage= ((projectsCompleted>3) && (overTimeHours>=10))?10.00:((projectsCompleted>3) || (overTimeHours>=10))?5.00:0.00;
        this.bonusAmount=basicSalary*incrementPercentage/100;
        this.projectsCompleted++;
    }
    public static void main(String[] args) {
        EmployeePerformance emp1 = new EmployeePerformance(12334);
        emp1.projectWorkinDeatils(12,10,15000);
        emp1.bonusCalculation();
        emp1.display();
        EmployeePerformance emp2 = new EmployeePerformance(939869);
        emp2.projectWorkinDeatils(2,10,25000);
        emp2.bonusCalculation();
        emp2.display();
        EmployeePerformance emp3 = new EmployeePerformance(9949745);
        emp3.projectWorkinDeatils(2,9,30000);
        emp3.bonusCalculation();
        emp3.display();


    }
    void display(){
        System.out.println("Employee id :"+employeeid);
        System.out.println("projects Completed by employee :"+projectsCompleted);
        System.out.println("over time hours employee worked : "+overTimeHours);
        System.out.println("basic salary of the emp is :"+basicSalary);
        System.out.println("incremented salary of the employee :"+bonusAmount);
        System.out.println("Total salary of the emp including bonus :"+(basicSalary+bonusAmount));
        System.out.println("****************************************************");
    }
}
