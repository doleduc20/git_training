package sach;

public class Tacgia {
	private String tacGia;
	private Ngaysinh ngaySinh;
	
	public Tacgia(String tacGia,Ngaysinh ngaySinh) {
		this.tacGia=tacGia;
		this.ngaySinh=ngaySinh;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public Ngaysinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngaysinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Ngaysinh inNgaySinh() {
		return this.getNgaySinh();
	}
	//in ns:
	public void inNgaySinhTg() {
		System.out.println(ngaySinh.getNgay()+"/"+ngaySinh.getThang()+"/"+ngaySinh.getNam());
			
		
	}
	
}
