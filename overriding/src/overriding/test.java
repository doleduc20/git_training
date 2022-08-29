package overriding;

public class test {
public static void main(String[] args) {
	
	Dog d1 = new Dog();
	Cat c1 = new Cat();
	
	c1.Eating();
	c1.Sleep();
	c1.Sound();
	System.out.println("=============");
	d1.Eating();
	d1.Sleep();
	d1.Sound();
}
}
