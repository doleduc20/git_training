package qlttsv;

public class test {
	public static void main(String[] args) {
		
	
	Ngay ns1 = new Ngay(27, 10, 2000);
	Ngay ns2 = new Ngay(27, 10, 2000);
	Ngay ns3 = new Ngay(2, 1, 2002);
	
	Lop lop1 = new Lop("QTM", "CNTT");
	Lop lop2 = new Lop("KT", "Kinh Te");
	Lop lop3 = new Lop("CK", "Co Khi");
	
	Sinhvien sv1 = new Sinhvien("CD123","Do le Duc", ns1, 8.7, lop1);
	Sinhvien sv2 = new Sinhvien("CD678","Le Van Dat", ns2, 4.9, lop2);
	Sinhvien sv3 = new Sinhvien("CD984","Nguyen Van A", ns3, 9.1, lop3);
	
	System.out.println("hien ten khoa sv1: "+sv1.inTenKhoa());
	System.out.println("hien ten khoa sv2: "+sv2.inTenKhoa());
	System.out.println("hien ten khoa sv3: "+sv3.inTenKhoa());
	
	System.out.println("in ket qua sv1: "+sv1.inHsCoDauK());
	System.out.println("in ket qua sv2: "+sv2.inHsCoDauK());
	System.out.println("in ket qua sv3: "+sv3.inHsCoDauK());
	
	System.out.println("kt ngay sinh sv1 va sv2: "+sv1.inSvTrungNgaySinh(sv2));
	System.out.println("kt ngay sinh sv2 va sv3: "+sv2.inSvTrungNgaySinh(sv3));
	}	
}
