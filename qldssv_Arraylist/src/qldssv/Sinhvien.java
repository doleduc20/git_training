package qldssv;

public class Sinhvien implements Comparable<Sinhvien>{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private double diemTrungBinh;
	public Sinhvien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public Sinhvien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
		
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getnamSinh() {
		return namSinh;
	}
	public void setnamSinh(int namsinh) {
		this.namSinh = namsinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public int compareTo(Sinhvien o) {
		this.maSinhVien.compareTo(o.maSinhVien);
		return 0;
	}
	@Override
	public String toString() {
		return "Sinhvien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	

	
	
}
