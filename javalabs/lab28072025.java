package javalabs;

public class lab28072025 {
    int evencount=0;
    int oddCount=0;
    public void evenOddRange(int start,int end){
        for(int i=start;i<=end;i++){
            if(i%2==0)
            evenNumber(i);
            else
            oddNumber(i);

        }
    }
    int evenNumber(int even){
        evencount+=1;
        return evencount;
    }
    int oddNumber(int odd){
        oddCount+=1;
        return oddCount;
    }
    public void display(){
        System.out.println("The Even numbers count :"+evencount);
        System.out.println("The Odd numbers count :"+oddCount);
    }
    
}
