package collection;

import java.util.ArrayList;
import java.util.Iterator;
//blue print of Laptop having brand,price,color
//method to display all the details
public class Laptop {
	String brand;
	double price;
	String color;
	Laptop(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public void display() {
		System.out.println("---------Details of Laptop------------");
		System.out.println("Laptop brand "+brand);
		System.out.println("Laptop price "+price);                                                                                       
		System.out.println("Laptop color "+color);
		
	}

//use LaptopDriver class
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Laptop("dell",50000,"Black"));
		al.add(new Laptop("Lenovo",52000,"Gray"));
		al.add(new Laptop("Apple",40000,"gold"));
		al.add(new Laptop("Hp",58000,"red"));
		al.add(new Laptop("Chrome",55000,"Black"));
		System.out.println(al);
		Iterator i=al.iterator();
		while (i.hasNext()) {
			Laptop l=(Laptop)i.next();
			l.display();
		}
	}

	}


