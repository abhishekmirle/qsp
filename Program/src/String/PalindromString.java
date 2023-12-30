package String;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next ();
		String rev="";
		for(int i =s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(rev))
		
		System.out.println("is a panlindrome");
		
		else
	
		System.out.println("not a palindrom");
	
	}

}
