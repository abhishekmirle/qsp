package String;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.next ();
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
}
}
