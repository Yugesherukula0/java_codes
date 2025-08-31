package loppingStmts;

public class forloopmethods {
    public boolean isevenNum(int num){
        boolean status=true;
        if(num%2!=0){
            status=false;
        }
        return status;
    }
    public boolean isoddNum(int num){
        boolean status = false;
        if(num%2!=0){
            status=true;
        }
        return status;
    }
    public void multiplytable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    public boolean isprimeNum(int num){
        boolean status=true;
        if(num==1){
            status=false;
            return status;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                status=false;
                break;
            }
        }
        return status;
    }
    public boolean isPerfecgtNum(int num){
        boolean status=false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            status=true;
        }
        return status;
    }
    public int factorialNum(int num){
        int fact=1;
        while(num>0){
            fact*=num;
            num--;
        }
        return fact;
    }
    public int reverNum(int num){
        int rem=0;
        int reverse=0;
        while(num>0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        return reverse;
    }
    public boolean ispalindromeNUm(int num){
        boolean status=false;
        int rem=0;
        int rev=0;
        int temp=num;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            status=true;
        }
        return status;
    }
    public int countDigiinNums(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
            
        }
        return count;
    }
    public int sumOfDigits(int num){
        int sum=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public int productOfNum(int num){
        int pro=1;
        int rem=0;
        while(num>0){
            rem=num%10;
            pro=pro*rem;
            num/=10;
        }
        return pro;
    }
    static void numberToBinary(int num) {
		int arr[]=new int[10];
		int rem=0;
		int i=0;
		while(num>0) {
			rem=num%2;
			arr[i]=rem;
			i++;
			num=num/2;
		}

		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
    //converting binary to decimal value
    static void binaryToDecimal(int binaryNum) {
		int number=0;
		String binary=Integer.toString(binaryNum);
		int length=binary.length();
		for(int i=0;i<=length-1;i++) {
			int rem=binaryNum%10;
			if(rem!=0 && rem!=1) {
				System.out.println("Invalid binary number!!!");
				return;
			}
			number+=(int)(Math.pow(2, i)*rem);
			binaryNum/=10;
			
		}
		System.out.println(number);
	}
    int isMagicNumber(int num) {
    	int reducednum=sumOfDigits(num);
    	if(reducednum==1) {
    		System.out.println("The number is magic number ");
    	}
    	else {
    		return isMagicNumber(reducednum);
    	}
    	return reducednum;
    }
    public boolean harshadNumber(int num){
        boolean status=false;
        int sum=sumOfDigits(num);
        if(num%sum==0){
            status=true;
        }
        return status;
    }
    public int findNonRepeatNumR(int num){
        //int nonRepeatNUm;
        int temp=num;
        int bkp=num;
        int rem1;
        while(num>0){
            rem1=num%10;
            int digit=rem1;
            int count=0;
            while(temp>0){
                int rem=temp%10;
                if(digit==rem){
                    count++;
                }
                temp/=10; 
            }
            if(count==1){
                //nonRepeatNUm=digit;
                return digit;
            }
            else {
                temp=bkp;
            }
            
            num=num/10;
        }

        return -1;
    }
    public int strongNumber(int num){
        // finding factorial of a number 
        int sum=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=rem;i>0;i--){
                fact=fact*i;
            } 
            num=num/10; 
            sum=sum+fact;     
        }
        return sum; 
    }
    public boolean isSpyNumber(int num){
        boolean status=false;
        int sum=sumOfDigits(num);
        int product=productOfNum(num);
        if (product==sum){
            status=true;
        }
        return status;
    }
    public boolean isNeonNumber(int num){
        boolean status=false;
        int square=num*num;
        int sum=sumOfDigits(square);
        if(num==sum){
            status=true;
        }
        return status;
    }
    public void findEvenIndexPriNums(){
        int count=0;
        for(int i =1;i<=100;i++){
            if(isprimeNum(i)){
                count++;
                if (count%2!=0){
                System.out.print(i+" ");
                }
                
            }
            
        }
    }
    public boolean findNumbersDivby7(int num){
        boolean status=false;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        if(sum<=10){
            if(sum%7==0){
                status=true;
            }
        }
        else{
            return findNumbersDivby7(sum);

        }
        return status;
    }
    public boolean isPaliindromePrime(int num){
        boolean status=false;
        boolean checkprime=isprimeNum(num);
        boolean chk_palindrom=ispalindromeNUm(num);
        if(checkprime==true && chk_palindrom==true){
           status=true;
        }
        return status;
    }
    // right angle triangle with *
    public void rightAngleTraingle(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // right angle triangle with numbers using for loop
    public void rightAngletraWithNum(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // right angle triangle with numbers using for while
    static void rightAngTraWithNum(int num){ 
	    int i=1;
	    while(i<=num){
	        int j=1;
	        while(j<=i){
	            System.out.print(i+" ");
	            j++;
	        }
	        System.out.println();
	        i++;
	    }
    }

    /*public void hcfOfNumbers(int num1,int num2){
        if(num1>num2){
            if(num1%num2==0){
                System.out.println("HCf :"+num1);
            }
        }
        else{
            if(num2%num1==0){
                System.out.println("hcf :"+num2);
            }

        }
    }*/
}
