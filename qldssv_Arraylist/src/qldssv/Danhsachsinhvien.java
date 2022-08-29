package qldssv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Danhsachsinhvien {
	private ArrayList<Sinhvien> danhSach;

public Danhsachsinhvien() {
	this.danhSach = new ArrayList<Sinhvien>();
}

public Danhsachsinhvien(ArrayList<Sinhvien> danhSach) {
	this.danhSach = danhSach;
}	
//them sv
	public void themSinhVien(Sinhvien sv) {
		this.danhSach.add(sv);
	}
//in ds sinh vien
	public void inDanhSachSinhVien() {
		for (Sinhvien sinhvien : danhSach) {
			System.out.println(sinhvien);
		}
	}
//	kiem tra dssv co rong hay k
	public boolean kiemTraRong() {
		return this.danhSach.isEmpty();
	}
//	lay ra so luong sv
	public int soLuongSinhVien() {
		return this.danhSach.size();	
	}
//	lam rong ds
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}
//	Kiểm tra sinh viên có tồn tại trong danh sách hay không,dựa trên mã sinh viên
	public boolean kiemTraTontaiTrongds(Sinhvien o) {
		return this.danhSach.contains(o);
	}
//	xoa 1 sv
	public boolean xoaSinhVien(Sinhvien sv) {
		 return this.danhSach.remove(sv);
		 }
//tim tat ca sinh vien dua tren ten:
		 public void timKiemTenSv(String ten) {
			 for (Sinhvien sinhvien : danhSach) {
				if(sinhvien.getHoVaTen().indexOf(ten)>=0) {
					System.out.println(sinhvien);
				}
			}
		 }
//ds sv diem tu cao den thap
		 public void xapSepTheoDiem() {
			 Collections.sort(this.danhSach, new Comparator<Sinhvien>() {

				@Override
				public int compare(Sinhvien o1, Sinhvien o2) {
					if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()) {
						return -1;
					}else if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh()) {
						return 1;
					}else {
						return 0;
					}
				}
				 
			});
		 }
}
