package methods;
import java.util.Scanner;

public class conditionalstmts {
    static{
        System.out.println("WELCOME TO THE LOCAL JOB PORTAL");
    }
    public static void main(String[] args) {
        JobDetails job=new JobDetails(101, "Software engineer", "benguluru", 1.2f, 329245.00, "expert in sdlc lifecycle ");;

        Scanner sc = new Scanner(System.in);
        System.out.println("1.To post the job ");
        System.out.println("2.view posted jobs");
        System.out.println("3.Exit");
        System.out.println("enter the desire option :");
        int option = sc.nextInt();
        if (option==1){
            System.out.printf("enter job id : ");
            int jobid=sc.nextInt();
            System.out.printf("ENter job title :");
            String title = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the location :");
            String loc = sc.nextLine();
            System.out.println("Enter the experience required (in years) :");
            float exp= sc.nextFloat();
            System.out.println("Enter salary per annum:");
            double sal = sc.nextDouble();
            System.out.printf("Enter job descrption in single line : ");
            String description = sc.nextLine();
            sc.nextLine();
            job = new JobDetails(jobid, title, loc, exp, sal,description);
            job.display();
            System.out.println("Job posted succefully");
        }
        else if (option==2){
            if(job !=null){
                job.display();
            }
            else{
                System.out.println("No Jobs Posted Yet!!");
            }
        }
        else if (option ==3){
            System.out.println("Thanks for visiting");
        }
        else{
            System.out.println("invalid option choosen");
        }

        sc.close();
    }
    
}
class JobDetails{
    int jobid;
    String jobTitle;
    String location;
    float experience;
    double salary;
    String jobdescription;

    public JobDetails( int jobid,String jobTitle,String location,float experience,double salary,String jobdescription ){
        this.jobid=jobid;
        this.jobTitle=jobTitle;
        this.location=location;
        this.experience=experience;
        this.salary=salary;
        this.jobdescription=jobdescription;
    }
    void display(){
        System.out.println("******* JOB DETAILS ******");
        System.out.println("JOb Id :"+jobid);
        System.out.println("Job Title :"+jobTitle);
        System.out.println("Location of the job :"+location);
        System.out.println("Required Experience for the job (in years):"+experience);
        System.out.println("Salary per annum :"+salary);
        System.out.println("JOb Description :"+jobdescription);
    }
}
