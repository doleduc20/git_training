package qlttsv;

public class Sinhvien {
	private String maSinhVien, hoVaTen;
	private Ngay ngaySinh;
	private double diemTrungBinh;
	private Lop lop;
	
	public Sinhvien(String maSinhVien, String hoVaTen, Ngay ngaySinh, double diemTrungBinh, Lop lop ) {
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
	public Ngay getNgaySinh() {
		return this.ngaySinh;
	}
	public void setNgaySinh(Ngay ngaysinh) {
		this.ngaySinh=ngaysinh;
	}
	public double getDiemTrungBinh() {
		return this.diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemtrungbinh) {
		this.diemTrungBinh=diemtrungbinh;
	}
	public Lop getLop() {
		return this.lop;
	}
	public void setLop(Lop lop) {
		this.lop=lop;
	}
	//in ten khoa sv:
	public String inTenKhoa() {
		return this.lop.getTenKhoa();
	}
	//hs co dau k?
	public String inHsCoDauK() {
		return this.diemTrungBinh>=5.0? "dau":"rot";
	}
	//kt sv trung ngay sinh:
	public boolean inSvTrungNgaySinh(Sinhvien svkhac) {
		return this.ngaySinh.equals(svkhac.ngaySinh);
	}
	
}

