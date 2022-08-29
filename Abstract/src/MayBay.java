
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;
	
public MayBay (HangSanXuat hangSanXuat,String loaiNhienLieu) {
	super("May bay", hangSanXuat);
	this.loaiNhienLieu=loaiNhienLieu;
	
}
public String loaiNhienLieu() {
	return this.loaiNhienLieu;
}
public void loaiNhienLieu(String loainhienlieu) {
	this.loaiNhienLieu=loainhienlieu;
}
public void catCanh() {
	System.out.println("cat canh..");
}
public void haCanh() {
	System.out.println("haCanh...");
}
public double layVanToc() {
	return 300;
}


}
