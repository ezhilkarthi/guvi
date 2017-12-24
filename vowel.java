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
	switch(c) {
	case 'a':System.out.println("vowel");break;
	case 'e':System.out.println("vowel");break;
	case 'i':System.out.println("vowel");break;
	case 'o':System.out.println("vowel");break;
	case 'u':System.out.println("vowel");break;
	default:System.out.println("its not a vowel");
	}
	}

}
