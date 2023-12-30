package collection;
//wjp to access the element of ArrayList(collection in all possible way)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessTheElementOfArrayList {

	public static void main(String[] args) {
      ArrayList<Integer> al=new ArrayList();
       al.add(10);
       al.add(30);
       al.add(70);
       al.add(40);
       System.out.println("by using get index method");
       for(int i=0;i<al.size();i++) {
    	   System.out.println(al.get(i));
       }
       System.out.println("---------------------");
       System.out.println("by using iterator");
       Iterator i= al.iterator();
       while (i.hasNext()) {
		System.out.println(i.next());
		
	}
       System.out.println("---------------------");
       System.out.println("by using List iterator");
       ListIterator l =al.listIterator();
       System.out.println("Accessing in the foeward Direction");
       while (l.hasNext()) {
         System.out.println(l.next());		
	}
       
       System.out.println("Accessing in the reversing Direction");
       while (l.hasPrevious()) {
		System.out.println(l.previous());
	}
       
       System.out.println("---------------------");
       System.out.println("by using for each loop");

for (Object il : al) {
	System.out.println(il);
}
	}

}
