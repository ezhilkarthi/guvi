package guvi2;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
         int z=0,a=n;
         while(n!=0) {
        	 int p=n%10;
        	 z=(z*10)+p;
        	 n/=10;
         }
         System.out.println(z);
         if(z==a) {
        	 System.out.println("palindrome");
         }
         else {
        	 System.out.println("not a palindrome");
         }
	}
}

