package main;

public class testbox2 {
public static void main(String[] args) {
//	thay <String> vào <T> trong class test2
	test2 tb1 = new test2<String>("hello");
	System.out.println(tb1.getValue());
//	thay <T> bằng <double>
	test2 tb2 = new test2<Double>(5.6);
	System.out.println(tb2.getValue());
}
}
