package String;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
       int count =0;
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)==' ')
    	   {
    		   count++;
    		   
    	   }
    	  

       }
       System.out.println(count);
       
	}

}
