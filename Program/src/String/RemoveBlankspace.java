package String;

import java.util.Scanner;

public class RemoveBlankspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
		if (c[i]==' ') {
		c[i]=ch;
		}
		}
		s=new String(c);
		System.out.println(s);

	}

}
