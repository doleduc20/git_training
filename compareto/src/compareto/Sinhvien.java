package compareto;
import java.util.Arrays;
import java.util.Comparator;

public class Sinhvien implements Comparable<Sinhvien> {
	private String maSinhVien, hoVaTen;
	private int ngaySinh;
	private double diemTrungBinh;
	private String lop;
	
	public Sinhvien(String maSinhVien, String hoVaTen, int ngaySinh, double diemTrungBinh, String lop ) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}
	public String getMaSinhVien() {
		return this.maSinhVien;
	}
	public void setMaSinhVien(String masinhvien) {
		this.maSinhVien=masinhvien;
	}
	public String getHoVaTen() {
		return this.hoVaTen;
	}
	public void setHoVaTen(String hovaten) {
		this.hoVaTen=hovaten;
	}
	public int getNgaySinh() {
		return this.ngaySinh;
	}
	public void setNgaySinh(int ngaysinh) {
		this.ngaySinh=ngaysinh;
	}
	public double getDiemTrungBinh() {
		return this.diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemtrungbinh) {
		this.diemTrungBinh=diemtrungbinh;
	}
	public String getLop() {
		return this.lop;
	}
	public void setLop(String lop) {
		this.lop=lop;
	}
	//
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}
		else {
			return s;
		}
	}
	

	@Override
	public int compareTo(Sinhvien o) {
		
		String tenThis=this.hoVaTen;
		String tenO=o.hoVaTen;
		return tenThis.compareTo(tenO);
	}
}
