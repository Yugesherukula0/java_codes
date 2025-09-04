package arrays;

public class bubblesorting {
    public static void main(String[] args) {
        int[] arr={35,34,2,56,41,1,6,8};

        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr){
        System.out.println(a);
    }
    } 
    
}
