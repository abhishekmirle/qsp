package Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,10,50,20,40,10};
		boolean[] b=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int count=0;
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1) {
					System.out.println(a[i]);
				}
				
			}
		}

	}

}

