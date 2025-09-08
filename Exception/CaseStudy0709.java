package Exception;

public class CaseStudy0709 {
    public static void main(String[] args) {
        String[] students=new String[3];
        students[0]="ramesh";
        students[1]="suresh";
        students[2]="nani";
        int i=0;;
        try{
            for(i=0;i<4;i++){
                System.out.println(students[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Student not found-invalid index");

        } finally{
            System.out.println("total no.of students: "+i);
        }
    }
}
