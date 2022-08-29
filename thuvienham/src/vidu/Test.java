package vidu;

import java.util.Arrays;

public class Test {
	
	public static int[] reverse(int[]x) {
		int []rs=new int[x.length];
		int index=0;
		for(int i=x.length-1;i>=0;i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
	}
public static void main(String[] args) {
	
	int []arr1 = new int[] {1,5,9,3,2,6,8,7};
	int []arr2 = new int[10];
	// xap xep tang dan
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
//	xap xep giam dan
	Arrays.sort(arr1);
	arr1=Test.reverse(arr1);
	System.out.println("sx giam"+Arrays.toString(arr1));
	//ham tim kiem
	System.out.println(Arrays.binarySearch(arr1, 5));
	//ham dien gia tri
	Arrays.fill(arr2, 4);
	System.out.println(Arrays.toString(arr2));
}
}
