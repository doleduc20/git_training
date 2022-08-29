package qlmt;

public class test {
public static void main(String[] args) {
	Ngay n1 = new Ngay(22, 11, 2000);
	Ngay n2 = new Ngay(5, 2, 2003);
	Ngay n3 = new Ngay(12, 8, 2001);
	
	Quocgia q1 = new Quocgia("VN", "VietNam");
	Quocgia q2 = new Quocgia("US", "State");
	Quocgia q3 = new Quocgia("UK", "Eng");
	
	Hangsanxuat hsx1 = new Hangsanxuat("Dell", q1);
	Hangsanxuat hsx2 = new Hangsanxuat("ASUS", q2);
	Hangsanxuat hsx3 = new Hangsanxuat("MSI", q3);
	
	Maytinh mt1 = new Maytinh(hsx1, n1,1200000, 12);
	Maytinh mt2 = new Maytinh(hsx2, n2,2150000, 24);
	Maytinh mt3 = new Maytinh(hsx3, n3,3400230, 36);
	
	System.out.println("so sanh gia mt1 co re hon so voi mt2? "+mt1.soSanhGiaBan(mt2));
	System.out.println("so sanh gia mt2 co re hon so voi mt3? "+mt2.soSanhGiaBan(mt3));
	System.out.println("so sanh gia mt3 co re hon so voi mt1? "+mt3.soSanhGiaBan(mt1));
		
	System.out.println("quoc gia sx mt1: "+mt1.inquocgiasxmt());
}
}
