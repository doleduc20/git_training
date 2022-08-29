package test;

import java.util.Scanner;

import qldssv.Danhsachsinhvien;
import qldssv.Sinhvien;

public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Danhsachsinhvien dssv = new Danhsachsinhvien();
	int luachon=0;
	do {
		System.out.println("menu---------");
		System.out.println(
			"1. Thêm sinh viên vào danh sách.\n"+
			"2. In danh sách sinh viên ra màn hình.\n"+
			"3. Kiểm tra danh sách có rỗng hay không.\n"+
			"4. Lấy ra số lượng sinh viên trong danh sách.\n"+
			"5. Làm rỗng danh sách sinh viên.\n"+
			"6. Kiểm tra sinh viên có tồn tại trong danh sách hay không,dựa trên mã sinh viên.\n"+
			"7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"+
			"8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"+
			"9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"+
			"0. Thoát.");
		 luachon = sc.nextInt();
		 sc.nextLine();
		
		if(luachon==1) { 
			System.out.println("Nhập mã sinh viên : "); String maSinhVien = sc.nextLine();
			System.out.println("Nhập họ và tên : "); String hoVaTen = sc.nextLine();
			System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
			System.out.println("Nhập điểm trung bình: "); double diemTrungBinh = sc.nextDouble();
			Sinhvien sv = new Sinhvien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
			dssv.themSinhVien(sv);
		}else if(luachon==2) {
	
			System.out.println("in danh sách sinh viên: ");
			dssv.inDanhSachSinhVien();
			
		}else if(luachon==3) {
		
			System.out.println("kiểm tra ds có rỗng hay không? "+dssv.kiemTraRong());
		}else if(luachon==4) {
		
			System.out.println("Số lượng sinh viên trong danh sách: "+dssv.soLuongSinhVien());
		}else if(luachon==5) {
		
			dssv.lamRongDanhSach();
		}else if(luachon==6) {
		
			System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
			Sinhvien sv = new Sinhvien(maSinhVien);
			System.out.println("Kiểm  tra sinh viên có trong ds hay k? "+dssv.kiemTraTontaiTrongds(sv));
		}else if(luachon==7) {
			System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
			Sinhvien sv = new Sinhvien(maSinhVien);
			System.out.println("xóa sv "+dssv.xoaSinhVien(sv));
		}else if(luachon==8) {
			System.out.println("Nhập họ và tên : "); String hoVaTen = sc.nextLine();
			dssv.timKiemTenSv(hoVaTen);
		}else if(luachon==9) {
			dssv.xapSepTheoDiem();
			dssv.inDanhSachSinhVien();
		}
			
		
		
	} while(luachon !=0);	
}
}
