package String;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int[] a=frequency(s1);
		int[] b=frequency(s2);
		boolean result = isAnagram(a,b);
		if (result) {
		System.out.println("Given strings are anagram");
		} else {
		System.out.println("Given strings are not anagram");
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
		public static boolean isAnagram(int[] a, int[] b) {
		for(int i=0;i<a.length;i++) {
		if (a[i]!=b[i]) {
		return false;
		}
		}
		return true;
		}

	}


