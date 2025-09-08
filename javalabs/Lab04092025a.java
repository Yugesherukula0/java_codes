package javalabs;
import arrays.SelectionSort;
public class Lab04092025a {
    public static void main(String[] args) {
        int[] arr={21,2,3,54,6};
        SelectionSort obj= null;
        try{
            int[] sorrtedarry=obj.sorting(arr);
            for(int a:sorrtedarry){
                System.out.println(a);
            }
            
        }catch(Exception e){
            System.out.println("cannot call methods by null value as obj is null");
        }
        finally{
            System.out.println("finally");
        }
    }
}
