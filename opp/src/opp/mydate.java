package opp;

import java.util.Scanner;

public class mydate {
	private int day,month,year;
	
	public mydate(int day,int month,int year) {
		if(day >=1 && day <=31) {
		this.day = day;
		}else {
			this.day=0;
		}
		if(month>=1 && month<=12){
		this.month = month;
		}else {
			this.month=0;
		}
		if(year>=1) {
		this.year = year;
		}else {
			this.year=0;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31)
		this.day = day;
	}
	
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int Month) {
		if(Month>=1 && Month <=12) 
			this.month= Month;
	}
	public int getYear() {
			return this.year;
	}
	public void setYear(int year) {
		if(year>=1)
			this.year=year;
	}
	
	
	
	
}

