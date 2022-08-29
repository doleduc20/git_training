package overriding;

public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}
@Override
public void Eating() {
	System.out.println("mlem xuong");
}
@Override
public void Sound() {
	System.out.println("go go");
}
@Override
public void Sleep() {
	System.out.println("zizizizi");
}
	
}
