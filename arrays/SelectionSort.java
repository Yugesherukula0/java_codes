package arrays;
public class SelectionSort {
    public int[] sorting(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int temp=0;
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }

        return arr;
    }
}