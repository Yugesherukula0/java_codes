package javalabs;
import java.util.Scanner;

import arrays.ArrayRotation;
public class Lab10092025 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter times of rotation");
        int r= sc.nextInt();
        ArrayRotation obj= new ArrayRotation();
        obj.rotateArray(arr,r);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
