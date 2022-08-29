package catchuoithanhmang;

import java.util.Arrays;

public class test {
public static void main(String[] args) {
	String s1 = "hello,my name is duc.im are coder";
	String[] arr1 = s1.split("\\,|\\.");
	System.out.println(Arrays.toString(arr1));
	String s2 ="do le minh duc";
	String arr2[]=s2.split(" ");
	System.out.println(arr2[arr2.length-1]);
}
}
