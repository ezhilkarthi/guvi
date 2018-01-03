package ezhil;
import java.util.*;
import java.lang.*;
import java.io.*;
public class guvi1 {
	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
		int count=0;
		Scanner s =new Scanner (System.in);
		int a=s.nextInt();
		while(a!=0) {
			a=a/10;
			count=count+1;
		}
		System.out.println(count);
	}
}
