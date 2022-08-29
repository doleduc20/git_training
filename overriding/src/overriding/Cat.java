package overriding;

public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}
@Override	
public void Eating() {
	System.out.println("Eat fish");
}	
@Override
public void Sleep() {
	System.out.println("zuuuuzuzuzuzu");
}
@Override
public void Sound() {
	System.out.println("mewewewewenmewew");
}
}
