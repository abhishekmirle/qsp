package String;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next ();
		char[] ch=s.toCharArray();
		int length=0;
		for(char c:ch)
		{
			length++;
			
		}
		System.out.println(length);
		

	}

}
