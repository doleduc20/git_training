package compareto;

import java.util.Arrays;

public class test {
public static void main(String[] args) {
	Sinhvien sv1 = new Sinhvien("sv01", "do le duc", 14, 7, "Qtm");
	Sinhvien sv2 = new Sinhvien("sv02", "nguyen d    ", 20, 8, "Qtm");
	Sinhvien sv3 = new Sinhvien("sv03", "le van dat", 6, 5, "Qtm");

	Sinhvien[]asv = new Sinhvien[] {sv1,sv2,sv3};
	Arrays.sort(asv);
	System.out.println(Arrays.toString(asv));
	
}
}
