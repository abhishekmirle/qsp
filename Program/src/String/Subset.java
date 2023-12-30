package String;

public class Subset {
	public static void main(String[] args) {
	String s="JAVA";
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
	String s1=" ";
	for(int j=0;j<ch.length-i;j++) {
	s1=s1+ch[j];
	System.out.println(s1);
	}
	}
	}
}
