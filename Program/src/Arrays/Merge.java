package Arrays;
import java.util.Scanner;
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= toRead();
		int [] b= toRead();
		Print(a);
		Print(b);
		int[] res =new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			res[i+a.length]=b[i];
		}
		System.out.println("elements of merzed arrays are");
		System.out.println(res);
		
	}

	private static void Print(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	private static int[] toRead() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		return a;
	}

}
