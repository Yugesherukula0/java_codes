package arrays;

public class FindLargeString {
    public static int largestString(String[] arr){
        int maxString=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>arr[maxString].length()){
                maxString=i;
            }
        }
        return maxString;
    }
}
