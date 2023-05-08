package dsa;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		int N,c,A=0,s;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		N=obj.nextInt();
		s=N;
		while(N>0) {
			c=N%10;
			c=(int) Math.pow(c, 3);
			A=A+c;
			N=N/10;
		}
		if(A==s) {
			System.out.println(s+" is an armstrong number");
		}
		else {
			System.out.println(s+" is not armstrong number");
		}
		obj.close();
	}

}
