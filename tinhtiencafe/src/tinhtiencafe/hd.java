package tinhtiencafe;

public class hd {
	public static void main(String[] args) {
		tinhTienCafe tc = new tinhTienCafe("caphevn", 10000, 2);
		tinhTienCafe tc2 = new tinhTienCafe("caphevn", 10000, 2);
		System.out.println("tien ca phe = "+tc.tinhTongTien());
		System.out.println("kiem tra khoi luong= "+tc.kiemTraKhoiLuong(2));
		System.out.println("ten: "+tc.GetTenLoai());
		System.out.println("tenstring: "+tc.ToString());
		System.out.println("so sanh tc&tc2: "+tc.equals(tc2));
}
}
