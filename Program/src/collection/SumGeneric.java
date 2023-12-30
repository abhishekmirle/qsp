package collection;

import java.util.ArrayList;
import java.util.Scanner;
//generic collection 10 integer element into collection
public class SumGeneric {

	public static void main(String[] args) {
		 ArrayList<Integer> al=new ArrayList<>();
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter 10 integer value");
		  for(int i=0;i<10;i++) {
		  int a=sc.nextInt();
		  al.add(a);
		  
	}
		  int sum=0;
		  
		for (Integer i : al) {
			  
			  sum=sum+i;
		  }
			System.out.println(sum);
	}

}
