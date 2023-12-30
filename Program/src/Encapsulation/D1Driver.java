package Encapsulation;

public class D1Driver {
	public static void main(String [] args) {
		D1 e =new D1(76,"dinga",'M',800);
		System.out.println("ID: "+e.getId());
		System.out.println("NAME: "+e.getName());
		System.out.println("GENDER: "+e.getGender());
		System.out.println("SAL: "+e.getSal());
		System.out.println("----------");
		e.setId(90);
		e.setName("abhi");
		e.setGender('M');
		e.setSal(50000);
		System.out.println("ID: "+e.getId());
		System.out.println("NAME: "+e.getName());
		System.out.println("GENDER: "+e.getGender());
		System.out.println("SAL: "+e.getSal());
		
		
		
	}

	}


