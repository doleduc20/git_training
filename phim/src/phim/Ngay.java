package phim;

public class Ngay {
	private int Ngay,Thang,Nam;
	
	public Ngay(int Ngay,int Thang,int Nam) {
		this.Ngay=Ngay;
		this.Thang=Thang;
		this.Nam=Nam;
	}
	public int getNgay() {
		return this.Ngay;
	}
	public void setNgay(int Ngay) {
		 this.Ngay=Ngay;
	}
	public int getThang() {
		return this.Thang;
	}
	public void setThang(int Thang) {
		this.Thang=Thang;
	}
	public int getNam() {
		return this.Nam;
	}
	public void setNam(int nam) {
		this.Nam = nam;
	}
	public int inNgay() {
		return this.Ngay+this.Thang+this.Nam;
	}

}
