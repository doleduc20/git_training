package sach;

public class test {
	public static void main(String[] args) {
		
		Ngaysinh ns1 = new Ngaysinh(27, 10, 2000);
		Ngaysinh ns2 = new Ngaysinh(21, 11, 2002);
		
		Tacgia tg1 = new Tacgia("duc", ns1);
		Tacgia tg2 = new Tacgia("dat", ns2);
		
		Sach s1 = new Sach("cooking", 1000, 2000, tg1);
		Sach s2 = new Sach("code", 20000, 2002, tg2);
		
		s1.inTenSach();
		s2.inTenSach();
		
		System.out.println("kiem tra: "+s1.kiemTraSachCungNam(s2));
		System.out.println(s1.getGiaBan()+"~"+s1.inGiaSauKhiGiam(50));
		System.out.print("ngay sinh tg1: ");
		tg1.inNgaySinhTg();
		System.out.println("in ten tg s1 "+s1.inTenTacGia());
		
	}
}
