package qlmt;

public class Maytinh {
 private Hangsanxuat hangSanXuat;
 private Ngay ngaySanXuat;
 private double giaBan,thoiGianBaoHanh;

 public Maytinh(Hangsanxuat hangSanXuat, Ngay ngaySanXuat,double giaBan, double thoiGianBaoHanh) {
	 this.hangSanXuat=hangSanXuat;
	 this.ngaySanXuat=ngaySanXuat;
	 this.giaBan = giaBan;
	 this.thoiGianBaoHanh=thoiGianBaoHanh;
 }
 public Hangsanxuat getHangSanXuat() {
	 return this.hangSanXuat;
 }
 public void setHangSanXuat(Hangsanxuat hangsanxuat) {
	 this.hangSanXuat=hangsanxuat;
 }
 public Ngay getNgaySanXuat() {
	 return this.ngaySanXuat;
 }
 public void setNgaySanXuat(Ngay ngaysanxuat) {
	 this.ngaySanXuat=ngaysanxuat;
 }
 public double getGiaBan() {
	 return this.giaBan;
 }
 public void setGiaBan(double giaban) {
	 this.giaBan=giaban;
 }
 public double getThoiGianBaoHanh() {
	 return this.thoiGianBaoHanh;
 }
 public void setThoiGianBaoHanh(double thoigianbaohanh) {
	 this.thoiGianBaoHanh=thoigianbaohanh;
 }
 //kt gia ban
 public String soSanhGiaBan(Maytinh mtkhac) {
	 return this.giaBan<mtkhac.giaBan?"dung":"sai";
 }
 //ten quoc gia san xuat mt:
 public String inquocgiasxmt() {
	 return this.hangSanXuat.inquocgiasxmt();
 }
}


