
public class Diamond {

//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<5;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=4;k>=i;k--) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n*2-1;i++) {
			int stars = i <= n ? i : 2 * n - i;     // count of stars
            int spaces = n - stars;                 // count of spaces

            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= stars; k++) {
                System.out.print("* ");
            }

            System.out.println();
		}
		
		
	}
}