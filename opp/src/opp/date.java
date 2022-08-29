package opp;



public class date {
	public static void main(String[] args) {
		
		
		mydate md = new mydate(27, 10, 2000);
		
		System.out.println("day= "+md.getDay());
		md.setDay(15);
		System.out.println("dayset= "+md.getDay());
		
		System.out.println("month= "+md.getMonth());
		md.setMonth(12);
		System.out.println("monthset= "+md.getMonth());
		
		System.out.println("year= "+md.getYear());
		md.setYear(1999);
		System.out.println("yearset= "+md.getYear());
		
	}
}
