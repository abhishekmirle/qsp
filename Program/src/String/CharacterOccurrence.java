package String;

public class CharacterOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbccdddde";
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
		int count=1;
		if (b[i]==false) {
		for(int j=i+1;j<ch.length;j++) {
		if (ch[i]==ch[j]) {
		b[j]=true;
		count++;
		}
		}
		System.out.println(ch[i]+"-------?>"+count);
		}
		}

	}

}
