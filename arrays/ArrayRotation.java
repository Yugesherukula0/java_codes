package arrays;

public class ArrayRotation {
    public void rotateArray(int[] arr,int r){
        int start=0;
        int end=arr.length-1;
        reverse(arr,start,end);
        reverse(arr,start,r-1);
        reverse(arr,r,end);

    }
    public void reverse(int[] arr,int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        

    }
}
