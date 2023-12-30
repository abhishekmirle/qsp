package String;

public class SwappWithoutTemp {
	public static void main(String[] args) {
		String s1="java";
		String s2="programming";
		System.out.println("Before swapping");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
	}

}
