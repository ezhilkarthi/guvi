package dispalyEvenInterval;
import java.util.*;
public class EvenNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<=b-1;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
	}
}
