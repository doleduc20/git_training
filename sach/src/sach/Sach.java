package sach;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private Tacgia tenTacGia;
	
	public Sach(String tenSach, double giaBan, int namXuatBan, Tacgia tenTacGia) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tenTacGia = tenTacGia;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public Tacgia getTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(Tacgia tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	//in ten sach:
	public void inTenSach() {
		System.out.println(this.getTenSach());
	}
	//kt sach cung nam:
	public boolean kiemTraSachCungNam(Sach sachKhac) {
		return this.namXuatBan == sachKhac.namXuatBan;
	}
	public double inGiaSauKhiGiam(double x) {
		return this.giaBan*(x/100);
	}
	//in ten tg sach 1
	public String inTenTacGia() {
		return tenTacGia.getTacGia();
	}
	
	
}
