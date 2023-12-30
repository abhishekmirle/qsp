package String;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		int[] a=frequency(s1);
		boolean result = isPanagram(a);
		if (result) {
		System.out.println("Given string is Panagram");
		} else {
		System.out.println("Given string is not Panagram");
		}
		}
		public static int[] frequency(String s) {
		int[] a=new int[26];
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		if (ch[i]>='A' && ch[i]<='Z') {
		a[ch[i]-65]++;
		}
		else if (ch[i]>='a' && ch[i]<='z') {
		a[ch[i]-97]++;
		}
		}
		return a;
		}
		public static boolean isPanagram(int[] a) {
		for(int i=0;i<a.length;i++) {
		if (a[i]==0) {
		return false;
		}
		}
		return true;

	}

}
