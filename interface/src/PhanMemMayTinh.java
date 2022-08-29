
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface {
	@Override
	public double cong(double a, double b) {
	return  a+b;
}
@Override
	public double tru(double a, double b) {
	return a-b;
}
@Override
public double nhan(double a, double b) {
return a*b;
}
@Override
public double chia(double a, double b) {
 if(b==0) {
	return 0;
}
else {
	return a/b;
}}
 
 @Override
	public void SapXepTang(double []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					double temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	@Override
	public void SapXepGiam(double[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					double temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
