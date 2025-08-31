/* 1.Write a Java program to display the N-th Prime Number 
(Ex if N=5 then Program should display 11 because 11 is the prime number and 
its in fifth Position in prime numbers sequence ).*/

package loppingStmts;
public class NthPrimeNum {
    public void nthPrimeNumber(int num){
        int count =0;
        forloopmethods obj=new forloopmethods();
        for(int i=1;i<=100;i++){
            if(obj.isprimeNum(i)){//called method from same package of another class called "forloopmethods"
                //System.out.print(i+" ");
                count+=1;
            }
            if(count==num){
                System.out.println(num+"th prime is :"+i);
                break;
            }

        }
    }
    
}
