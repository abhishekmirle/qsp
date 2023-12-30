package Arrays;

public class CheckPresentNo {
	public static void main(String[] args)
	{
	int [] a= {1,2,3,5,7,9,12,14};
	for(int n=1;n<=15;n++)
		
		{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
			count++;
			break;}
		}
		if(count==0)
		{
			System.out.println(n);
		}
	}
	
			 
	}

}
