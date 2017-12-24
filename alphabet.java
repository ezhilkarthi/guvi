import java.util.*;
import java.lang.*;
import java.io.*;
public class guvi1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a =new Scanner (System.in);
		System.out.println("enter the char");
		char c = a.next().charAt(0);
		if((c>='a')&&(c<='z')||(c>='A')&&(c<='Z')) {
			System.out.println("alphabet");
		}
		else {
			System.out.println("its not a alphabet");
		}
	}

}