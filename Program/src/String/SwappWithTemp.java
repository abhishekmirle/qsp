package String;

public class SwappWithTemp {
	public static void main(String[] args) {
		String s1="java";
		String s2="programming";
		System.out.println("Before swapping");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		String temp =s1;
		s1 =s2;
		s2 =temp;
		System.out.println("After swapping");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
	}

}
