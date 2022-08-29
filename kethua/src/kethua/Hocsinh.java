package kethua;

public class Hocsinh extends Connguoi {
	private String tenLop;
	private String tenTruong;
	
	public Hocsinh(String name,int yearold,String tenLop, String tenTruong) {
		super("Hocsinh", yearold);
		this.tenLop=tenLop;
		this.tenTruong=tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public String inTenLop() {
		return this.tenLop;
	}

	
}
