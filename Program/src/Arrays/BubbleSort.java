package Arrays;
import java.util.Scanner;
public class BubbleSort {
	

	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter the Size of the array");
	        int n = s.nextInt ();
	    	int[] a =new int[n];
	      System.out.println("Enter "+n+" elements");
	        
	      for (int i = 0; i < a.length; i++) {
	            a[i]=s.nextInt();
	           
	        }
	        for (int i = 0; i < a.length-1; i++) {
	        	for (int j = 0; j < a.length-1; j++) {
	        		if (a[j]>a[j+1]) {
	        			
	        			int temp = a[j];
	        			a[j]=a[j+1];
	        			a[j+1]=temp;
						
					}
					
				}
				
	        	
	    			}
	        System.out.println("After Sorting");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
	    }
}
