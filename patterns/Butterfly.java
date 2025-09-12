public class Butterfly {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int k=i;k<6;k++){
                System.out.print(" "+" ");
            }
            for(int k=i;k<6;k++){
                System.out.print(" "+" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+" ");
            }
            for(int l=i;l<=5;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        } 
    }
}
