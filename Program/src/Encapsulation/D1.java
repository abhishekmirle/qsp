package Encapsulation;

public class D1 {
private int id;
private String name;
private char gender;
private double sal;
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public char getGender()
{
	return gender;
}
public double getDouble()
{
	return sal;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setGender(char gender) {
	this.gender = gender;
}
public D1(int id, String name, char gender, double sal) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.sal = sal;
}

}
