package String;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="this is abhi";
System.out.println(s.indexOf("is",5));
System.out.println("----------------");
StringBuffer sb=new StringBuffer("abhishek");
System.out.println(sb);
System.out.println(sb.delete(1,3));
System.out.println(sb);
System.out.println(sb.deleteCharAt(1));
System.out.println(sb.reverse());
System.out.println("----------------");
StringBuffer sb1=new StringBuffer("abhi");
String str=" salary ";
int a=60000;
sb1.append(str);
sb1.append(a);
System.out.println(sb1);
System.out.println("----------------");
StringBuffer sb2=new StringBuffer("hi ratan hi");
sb2.replace(0,2,"oy");
System.out.println("after replaceing the string:-"+sb2);
System.out.println("----------------");
sb2.insert(0,"hi ");
System.out.println(sb2);
	}

}
