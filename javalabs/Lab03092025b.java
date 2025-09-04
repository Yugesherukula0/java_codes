package javalabs;

public class Lab03092025b {
    public void transpose(int[][] arr){
        int[][] arr1=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int[] a:arr1){
            for(int b:a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }

    }
}
