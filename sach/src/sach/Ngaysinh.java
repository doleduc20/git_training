package sach;

public class Ngaysinh {
	private int ngay;
	private int thang;
	private int nam;
	
	public Ngaysinh(int ngay,int thang,int nam) {
		this.ngay=ngay;
		this.thang=thang;
		this.nam=nam;
	}
	
	public int getNgay() {
		return this.ngay;
	}
	public void setNgay(int Ngay) {
		 this.ngay=Ngay;
	}
	public int getThang() {
		return this.thang;
	}
	public void setThang(int Thang) {
		this.thang = Thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int Nam) {
		this.nam = Nam;
	}
	public void inNgaySinh() {
		System.out.println((this.ngay)+"/"+(this.thang)+"/"+(this.nam));
	}
	

	

}
