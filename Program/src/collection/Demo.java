package collection;

import java.util.ArrayList;

public class Demo {

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
   //size()-->it is going to give the size of ArrayList
   System.out.println("SIZE: "+al.size());
   System.out.println("-------------");
   //get(int index)-->it is used to get particular element at the specified index
   System.out.println(al.get(5));
   System.out.println(al.get(1));
   //System.out.println(al.get(8));//IOBE
   System.out.println("-----------------");
   //contains(object o)-->it is used to check if the particular element is present or not based on that it will return the true or false
   System.out.println("dinga");
   System.out.println("dingi");
   System.out.println("---------------------");
   //remove(int index)--->it is going to remove particular element at specified index
   al.remove(5);
   System.out.println(al);
   System.out.println("------------------------");
   //isempty()-->it is going to check if the collection is empty or not based 
   //on that it will true or false
   System.out.println(al.isEmpty());
   System.out.println("-----------------------------");
   //clear()-->it is going to remove all the elements in collection
   al.clear();
   System.out.println(al.isEmpty());
   System.out.println(al);
	}

}
