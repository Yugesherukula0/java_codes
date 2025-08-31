/*2.Write a Java program using for loops to:
 -> Find the second perfect number in the range 1 to 100.
 -> Calculate the factorial of this perfect number.
 -> Display both the perfect number and its factorial.(Take type long for this Field)*/


package loppingStmts;

public class PerfNUm2nd {
    int count=0;
    public void range(int start,int end){
        for(int i=start;i<=end;i++){
            //boolean status=isperfectNumber(i);
            if(isperfectNumber(i)){
                //System.out.println(i);
                count++;
                if(count==2){
                    System.out.println("The 2nd perfect number between "+start+" and "+end+" :"+i);
                    System.out.println("the factorial of secound perfect number :"+factorialNum(i));
                    break;
                }
            }
        }
    }
    public boolean isperfectNumber(int num){
        int sum=0;
        boolean status =false;
        for(int j=1;j<=num/2;j++){
            if(num%j==0){
                sum+=j;
            }
        }
        if(sum==num){
            status=true;

        }
        return status;
    }
    public long factorialNum(int num){
        long fact=1;
        for(int k=num;k>0;k--){
            fact=fact*k;
        }
        return fact;
    }
}      
