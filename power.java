/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int sum=1;
		for(int i=0;i<p;i++){
			 sum=sum*n;
		}
		System.out.println(sum);
	}
}