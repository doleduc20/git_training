package qlttsv;

public class Lop {
	private String tenLop,tenKhoa;
	
	public Lop(String tenLop, String tenKhoa) {
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}
	public String getTenLop() {
		return this.tenLop;
	}
	public void setTenLop(String TenLop) {
		this.tenLop=TenLop;
	}
	public String getTenKhoa() {
		return this.tenKhoa;
	}
	public void setTenKhoa(String TenKhoa) {
		this.tenKhoa=TenKhoa;
	}
	
}
