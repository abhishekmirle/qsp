package collection;

import java.util.ArrayList;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList al= new ArrayList();
		   //add(object a)-->it is going to add element into the Arraylist
		   al.add(10);
		   al.add(77.24);
		   al.add("dinga");
		   al.add(10);
		   al.add('h');
		   al.add(false);
		   al.add("sheela");
		   System.out.println(al);
		   System.out.println("----------");
		   //add(int index,object o)-->it is used toadd element at specified index
		   al.add(3,'R');
		   al.add(1,"abhi");
		   System.out.println(al);
		   System.out.println("-------------------");
		   //set(int index,object o)-->it is used to madify the data present at specified index
		   al.set(5, 99);
		   al.set(0, 'A');
		   System.out.println(al);

	}

}
