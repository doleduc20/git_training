
public class thoiKhoaBieu {
	private Day thu;
	private String cacMonHoc;
	
	public thoiKhoaBieu(Day thu,String cacMonHoc){
		this.thu=thu;
		this.cacMonHoc=cacMonHoc;
	}
	public Day getDay() {
		return this.getDay();
	}
	public void setDay(Day day) {
		this.thu=day;
	}
	public String getCacMonHoc() {
		return this.cacMonHoc;
	}
	public void setCacMonHoc(String cacmonhoc) {
		this.cacMonHoc=cacmonhoc;
	}
	@Override
	public String toString() {
		return "thoiKhoaBieu [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}
}
