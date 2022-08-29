
public class XeOtO extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOtO(String loaiNhienLieu,HangSanXuat hangSanXuat) {
		super("xe oto", hangSanXuat);
		this.loaiNhienLieu=loaiNhienLieu;
	}
	public String getloaiNhienLieu() {
		return this.loaiNhienLieu;
	}
	public void setloaiNhienLieu(String loainhienlieu) {
		this.loaiNhienLieu=loainhienlieu;
	}
	public double layVanToc() {
		return 100;
	}
}
