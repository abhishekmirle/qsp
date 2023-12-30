package String;

public class Repeated1 {
	public static void main(String[] args) {
		String s="aaabbccdddde";
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
		int count=0;
		if (b[i]==false) {
		for(int j=i+1;j<ch.length;j++) {
		if (ch[i]==ch[j]) {
		b[j]=true;
		count++;
		}
		}
		if (count>0) {
		System.out.println(ch[i]+" is a repeated character");
		}
		}
		}
	}

}
