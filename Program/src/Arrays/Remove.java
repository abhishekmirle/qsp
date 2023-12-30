package Arrays;
import java.util.Scanner;
public class Remove {

	public static void main(String[] args) {

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
	        int []res= new int[a.length-1];
	        
	        for(int i=0;i<a.length-1;i++)
	        {
	            if(i<index)
	                res[i]=a[i];
	            else
	             res[i]=a[i+1];
	            
	        }
	        
	        System.out.println("remove the index"+index);
	        for(int i=0;i<res.length;i++)
	        {
	        
	         System.out.println(res[i]+" ");
	        }
	        	}

}
