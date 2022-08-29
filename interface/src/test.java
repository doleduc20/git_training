import java.util.Scanner;

public class test {
public static void main(String[] args) {
	MayTinhCasioFX500 fx500 = new MayTinhCasioFX500();
	MayTinhVinaCal500 vn500 = new MayTinhVinaCal500();
	System.out.println("cong fx "+fx500.cong(5, 6.6));
	System.out.println("cong vn "+vn500.cong(7, 1.2));
	double arr[] = new double[]{1,5,6,5,4,8,9};
	double[] arr2 = new double[] {6,4,5,8,7,1,3};
	SapXepChen sxc = new SapXepChen();
	sxc.SapXepTang(arr);
	System.out.println("--------");
	sxc.SapXepGiam(arr);
	PhanMemMayTinh pmmt = new PhanMemMayTinh();
	pmmt.SapXepTang(arr2);
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap 1 chuoi: ");
	String s = sc.next();
	System.out.println(s);
}
}
