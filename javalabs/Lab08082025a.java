package javalabs;

import loppingStmts.forloopmethods;

public class Lab08082025a {
    public static void main(String[] args) {
         forloopmethods obj=new forloopmethods();
        for(int i=1;i<=200;i++){
            if(obj.findNumbersDivby7(i)){
                System.out.print(i+" ");
            }
        }
    }
    
}
