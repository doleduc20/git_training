package overriding;

public class Animal {
	protected String name;
	
public Animal(String name) {
	this.name= name;
}	
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name=name;
}
public void Eating() {
	System.out.println("mnhom...");
}
public void Sound() {
	System.out.println(".........");
}
public void Sleep() {
	System.out.println("zzzzzzzzzzzzzz");
}
}
