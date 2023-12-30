package String;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next ();
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			 if(ch[i]>='a'&& ch[i]<='z')
			{
				ch[i]-=32;
			}
			
		} 
		s1=new String(ch);
		System.out.println(s1);
	}

}
