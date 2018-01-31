package sumSquare;
import java.util.*;
public class SumSquare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c,b=0,sum=0;
		while(a!=0) {
			b=a%10;
			c=b*b;
			sum=sum+c;
			a=a/10;	}
		System.out.println(sum);}}
