package phim;

public class test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(27, 10, 2020);
	Ngay ngay2 = new Ngay(22, 11, 2021);
	Ngay ngay3 = new Ngay(02, 12, 2023);
	
	Hangsanxuat hang1= new Hangsanxuat("net", "VN");
	Hangsanxuat hang2= new Hangsanxuat("Legue", "Eng");
	Hangsanxuat hang3= new Hangsanxuat("dark", "State");
	
	Bophim phim1 = new Bophim("transformers", 2003, hang1, 65000, ngay1);
	Bophim phim2 = new Bophim("thor", 2005, hang2, 90000, ngay2);
	Bophim phim3 = new Bophim("booom", 2012, hang3, 70000, ngay3);
	
	System.out.println("kt phim 1 co re hon phim 2 ko? "+phim1.inSoSanhGiaVe(phim2));
	
	System.out.println("ten hang sx phim 1: "+phim1.inTenHangSx());
	
	phim1.innc();
	System.out.println("Gia ve sau km phim 1: "+phim1.inGiaVeSauKm(10));
}
}
