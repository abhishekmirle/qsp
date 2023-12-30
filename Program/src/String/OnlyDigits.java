package String;

import java.util.Scanner;

public class OnlyDigits {
	public static void main(String[] args) {
	String s="12a";
	char [] ch =s.toCharArray();
	int count =0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>0 && ch[i]<='9')
		{
			count++;
			
		}
	}
	if(count==s.length())
		System.out.println("String contains only digits");
	else
		System.out.println("String doesn't contains only digits");
	}

}
