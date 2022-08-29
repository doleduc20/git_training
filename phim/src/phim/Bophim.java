package phim;

public class Bophim {
	private String tenPhim;
	private int namSanXuat;
	private Hangsanxuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieu;
	
	public Bophim(String tenPhim, int namSanXuat, Hangsanxuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public Hangsanxuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(Hangsanxuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	//so sanh gia ve
	public boolean inSoSanhGiaVe(Bophim phimKhac) {
		return this.giaVe<phimKhac.giaVe;
	}
	//ten hang sx
	public String inTenHangSx() {
		return hangSanXuat.gettenHangSanXuat(); 
	}
	//ngay chieu
	public void innc() {
		System.out.println(ngayChieu.getNgay()+"/"+ngayChieu.getThang());
	}
	//gia ve sau khuyen mai
	public double inGiaVeSauKm(double x) {
		return this.giaVe*(1-x/100);
	}
	
}
