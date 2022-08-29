package phim;

public class Hangsanxuat {
	private String tenHangSanXuat;
	private String quocGia;
	public Hangsanxuat(String tenHangSanXuat, String quocGia) {
		
		this.tenHangSanXuat = tenHangSanXuat;
		this.setQuocGia(quocGia);
	}
	public String getQuocGia() {
		return this.quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public String gettenHangSanXuat() {
		return this.tenHangSanXuat;
	}
	public void settenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat=tenHangSanXuat;
	}
	
	

}
