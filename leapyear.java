/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		   Scanner s=new Scanner(System.in);
    int a =s.nextInt();
    if(a%4==0){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }
	}
}