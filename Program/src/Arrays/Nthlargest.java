package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Nthlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {10,20,15,5,30,25,35};
       Arrays.sort(a);
       Scanner s=new Scanner(System.in);
       System.out.println("'enter the n value from 1 to "+a.length);
       int n=s.nextInt();
       System.out.println(a[n-1]);
	}

}
