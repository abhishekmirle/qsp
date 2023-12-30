package Arrays;

public class A1 {
	public static void main(String[] args)

	{
		char ch[]=new char [4];
		ch[0]='a';
		ch[1]='a';
		ch[2]='y';
		ch[3]='a';
		{
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='a')
		{
		count++;
		}
		}
		System.out.println(count);
		}
	}
	}



