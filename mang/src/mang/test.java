package mang;

import java.util.Arrays;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
	int []mang1= {1,2,3,4,5};
//	copy bang dau "="
	int []mang1_a=mang1;
	mang1_a[0]=9;
	System.out.println(Arrays.toString(mang1));
	System.out.println(Arrays.toString(mang1_a));
//	copy bang clone
	int []mang1_b=mang1.clone();
	mang1_b[0]=50;
	System.out.println(Arrays.toString(mang1_b));
//	copy bang system.arraycopy
	int[]mang1_c=new int[mang1.length];
	System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
	mang1_c[0]=70;
	System.out.println(Arrays.toString(mang1_c));
	
}
}
