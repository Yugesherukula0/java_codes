/*1.Write a Java program using a for loop to perform the following tasks for a given number:
 -> Count how many Even digits are present in the number.
 -> Find the sum of all Odd digits in the number.
  (Ex: 1234 even digits count is 2 and Odd digits Sum is 4)*/


package loppingStmts;

public class FIndevenandOddnumsCnt {
    int evenCount;
    int oddSum;
    public void numberDigits(int num){
        for(int i=num;i>0;i=i/10){
            int temp=i%10;
            if(temp%2==0){
                evenCount+=1;
            }
            else{
                oddSum+=temp;
            }
        }
    }
    public void display(){
        System.out.println("count of even digits in the given number :"+evenCount);
        System.out.println("SUm of odd digits in the given number :"+oddSum);

    }
}
