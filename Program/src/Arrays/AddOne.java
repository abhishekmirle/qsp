package Arrays;
import java.util.Scanner;
public class AddOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner s= new Scanner(System.in);
	        System.out.println("enter the size of array");
	        int n= s.nextInt();
	        int []a= new int[n];
	        System.out.println("Enter"+n+"elements");
	        for(int i=0;i<a.length;i++)
	        {
	            a[i]=s.nextInt();
	            
	        }
	        System.out.println("enter index from 0 to"+a.length);
	        int index=s.nextInt();
	        System.out.println("enter the elements");
	        int ele =s.nextInt();
	        int []res= new int[a.length+1];
	        res[index]=ele;
	        for(int i=0;i<a.length;i++)
	        {
	            if(i<index)
	                res[i]=a[i];
	            else
	             res[i+1]=a[i];
	            
	        }
	        System.out.println("After adding the"+ele+"into the index"+index);
	        for(int i=0;i<res.length;i++)
	        {
	            System.out.println(res[i]+" ");
	        }
	}

}
