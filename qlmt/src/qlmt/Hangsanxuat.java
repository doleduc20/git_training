package qlmt;

public class Hangsanxuat {
	private String tenHangSanXuat;
	private Quocgia quocGia;
		
public Hangsanxuat(String tenHangSanXuat, Quocgia quocGia) {
	this.tenHangSanXuat = tenHangSanXuat;
	this.quocGia=quocGia;
}
public String getTenHangSanXuat() {
	return this.tenHangSanXuat;
}
public void setTenHangSanXuat(String tenhangsanxuat) {
	this.tenHangSanXuat=tenhangsanxuat;
}
public Quocgia getQuocGia() {
	return this.quocGia;
}
public void setQuocGia(Quocgia quocgia) {
	this.quocGia=quocgia;
}
public String inquocgiasxmt() {
	return this.quocGia.getTenQuocGia();
}
}
