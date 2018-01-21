package samename;

import java.util.Scanner;

public class Samename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	int num,count=0 ;
	System.out.println("enter the num");
	num =s.nextInt();
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	  }
}
