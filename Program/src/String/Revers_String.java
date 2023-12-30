package String;

public class Revers_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		char[] ch=s1.toCharArray();
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		{
			System.out.println("----------------");
		}
		{
			String s2="ABCD";
			String revr=" ";
			for(int i=s2.length()-1;i>=0;i--)
			{
				revr=revr+s2.charAt(i);
			}
			System.out.println(revr);
		}
	
	}

}
