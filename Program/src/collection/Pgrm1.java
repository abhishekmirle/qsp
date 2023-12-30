package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pgrm1 {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("by using get(int index) method");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------");
		System.out.println("by using iterator()  ");
		Iterator i =al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("---------------");
		System.out.println("by using listiterator()");
		ListIterator l=al.listIterator();
		System.out.println("accessing in the forward direction");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("-------------------");
		System.out.println("by using list iterator()     ");
		ListIterator l1=al.listIterator();
		System.out.println("accessing in the forward direction");
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println("accessing in the revers direction");
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		System.out.println("-------------------");
		System.out.println("by using for each loop-----");
		for(Integer i1:al)
		{
			System.out.println(i1);
			
			
		}
		System.out.println("-------------------");
		
	}
}
