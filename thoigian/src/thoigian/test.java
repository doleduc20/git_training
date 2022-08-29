package thoigian;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class test {
public static void main(String[] args) {
	long t1 = System.currentTimeMillis();
	for(int i=0;i<=10;i++) {
		System.out.println("test");
	}
	long t2 = System.currentTimeMillis();
	System.out.println("time trc khi chay: "+t1);
	System.out.println("time sau khi chay: "+(t2-t1)/1000+"s");
	System.out.println("time sau khi chay: "+(t2-t1));
//	chuyen doi gio
	System.out.println("1000 day = "+TimeUnit.DAYS.toMinutes(1000)+" phut");
	System.out.println("7 ngay = "+TimeUnit.DAYS.toHours(7));
	//date
	Date d = new Date();
	System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
	//calenda
	Calendar c1 = Calendar.getInstance();
	System.out.println(c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
	c1.add(Calendar.DATE,20);
	System.out.println(c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
}
}
