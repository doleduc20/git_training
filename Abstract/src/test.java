
public class test {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Vinfast", "Viet Nam");
		HangSanXuat h2 = new HangSanXuat("Boing", "State");
		HangSanXuat h3 = new HangSanXuat("mini", "Japan");
		
		MayBay p1 = new MayBay(h2, "nhienlieumaybay");
		PhuongTienDiChuyen p2 = new XeOtO("Xang", h1);
		PhuongTienDiChuyen p3 = new XeDap(h3);
		
		
		
		System.out.println("lay ten hang sx p1: "+p1.layTenHangSx());
		System.out.println("lay ten hang sx p2: "+p2.layTenHangSx());
		System.out.println("lay ten hang sx p3: "+p3.layTenHangSx());
		
		System.out.println("lay van toc p1: "+p1.layVanToc());
		System.out.println("lay van toc p1: "+p2.layVanToc());
		System.out.println("lay van toc p1: "+p3.layVanToc());
		
		p1.batDau();
		p1.catCanh();
		p1.haCanh();
		
	}
}
