package test1;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("crit rate? ");
		int a = sc.nextInt();
		System.out.println("crit damage?");
		int b = sc.nextInt();
		System.out.println("Crit value = "+((a*2)+b));
	}

}
