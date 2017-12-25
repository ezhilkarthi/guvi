import java.util.*;
import java.lang.*;
import java.io.*;
public class guvi1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a =new Scanner (System.in);
		System.out.println("enter any three no");
		int b=a.nextInt();
		int c=a.nextInt();
		int d=a.nextInt();
		if((b>=c)&&(b>=d)) {
			System.out.println(b);
		}
		if((c>=b)&&(c>=d)) {
			System.out.println(c);
		}
		if((d>=b)&&(d>=c)) {
			System.out.println(d);
		}
		
		}

}
