import java.util.Scanner;
public class while1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
}
