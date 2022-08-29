
public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;

	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		this.loaiPhuongTien=loaiPhuongTien;
		this.hangSanXuat=hangSanXuat;
	}
public String layTenHangSx() {
	return this.hangSanXuat.getTenHangSanXuat();
}
public void batDau() {
	System.out.println("bat dau...");
}
public void tangToc() {
	System.out.println("Tang toc...");
}
public void dungLai() {
	System.out.println("Dung lai...");
}
public abstract double layVanToc();

	
}
