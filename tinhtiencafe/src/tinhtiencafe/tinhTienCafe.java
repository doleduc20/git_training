package tinhtiencafe;

import java.util.Objects;

public class tinhTienCafe {
	
	private	String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public tinhTienCafe (String ten, double gia1kg, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia1kg;
		this.khoiLuong = kl;
	}
	public double tinhTongTien() {
		return this.giaTien1Kg*this.khoiLuong;
	}
	public boolean kiemTraKhoiLuong(double kl){
		return this.khoiLuong>=kl;
	}
	public String GetTenLoai() {
		return this.tenLoaiCaPhe;
	}
	public String ToString() {
		return this.tenLoaiCaPhe;
	}
	@Override
	public int hashCode() {
		return Objects.hash(giaTien1Kg, khoiLuong, tenLoaiCaPhe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tinhTienCafe other = (tinhTienCafe) obj;
		return Double.doubleToLongBits(giaTien1Kg) == Double.doubleToLongBits(other.giaTien1Kg)
				&& Double.doubleToLongBits(khoiLuong) == Double.doubleToLongBits(other.khoiLuong)
				&& Objects.equals(tenLoaiCaPhe, other.tenLoaiCaPhe);
	}
	

}