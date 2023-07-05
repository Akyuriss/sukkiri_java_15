package sukkiri_java_15;
import java.util.Calendar;
import java.util.Date;

public class int_Date {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2023, 10,6,13,34,50);
		System.out.println(c);
		c.set(Calendar.MONTH,9);
		System.out.println(c);
		
		Date d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		System.out.println(now);
		
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です。");
		
	}
}
