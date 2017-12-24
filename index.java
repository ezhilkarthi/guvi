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
		Scanner a =new Scanner (System.in);
	int c=a.nextInt();
	
	 if(c<0) {
		 System.out.println("negative");
	 }
	 if(c>0) {
		 System.out.println("positive");
	 }
	 if(c==0) {
		 System.out.println("zero");
	 }
	}
}
