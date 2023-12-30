package collection;

import java.util.ArrayList;
import java.util.Scanner;
//to add the prime number from m to n into the collection and print the element
public class PrimeNumber {

	public static void main(String[] args) {
		  ArrayList al=new ArrayList();
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter the m value");
		  int m=sc.nextInt();
		  System.out.println("enter the n value");
		  int n=sc.nextInt();
		  for(int j=m;j<=n;j++) {
			  int prime=j;
			  int count =0;
			  for(int i=2;i<prime;i++) {
				  if(prime%i==0) {
					  count++;
					  break;
					 
				  }
			  }
			  if (count==0) {
				al.add(prime);
			}
		  }
		  
	
		for (Object l : al) {
			 System.out.println(l);
		} 
			 
			
		}
	}


