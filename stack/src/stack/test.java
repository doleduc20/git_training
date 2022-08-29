package stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<String> stackchuoi = new Stack<String>();
	System.out.println("nhap vao chuoi: ");
	String s = sc.next();
	
	for(int i=0;i<s.length();i++) {
		stackchuoi.push(s.charAt(i)+"");
	}
	System.out.print(stackchuoi.pop());
}
}
