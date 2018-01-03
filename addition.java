
import java.util.*;
import java.lang.*;
import java.io.*;
public class guvi1 {
	
	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
	       int sum=0;	
	       int d=0;
		   Scanner s=new Scanner(System.in);
		   System.out.println("enter the array size");
		   int a=s.nextInt();
		   System.out.println("enter the size no to add");
		   int b=s.nextInt();
		   System.out.println("enter the element");
		   int[] c=new int[a];
		   for(int i=0;i<a;i++) {
			    c[i]=s.nextInt();
			   
		   }
		  
		   for(int j=0;j<b;j++) {
			   sum=sum+c[j];
		   }
		   System.out.println(sum);
	}
}
