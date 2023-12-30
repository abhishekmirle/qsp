package collection;

import java.util.ArrayList;
import java.util.Scanner;
//creat nongeneric collection add 10integer element into the collection
//find the sum all the element present in the collection
//
public class Sum {

	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter 10 integer value");
		  for(int i=0;i<10;i++) {
		  int a=sc.nextInt();
		  al.add(a);
		  
	}
		  int sum=0;
		  for (Object o : al) {
			  Integer a=(Integer) o;
			  sum=sum+a;
		  }
			System.out.println(sum);
		}

}
