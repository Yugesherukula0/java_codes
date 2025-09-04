package javalabs;
import arrays.SelectionSort;
public class Lab03092025a {
    public static void main(String[] args) {
        int[] arr={35,34,2,56,41,1,6,8};
        SelectionSort obj=new SelectionSort();
        obj.sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
