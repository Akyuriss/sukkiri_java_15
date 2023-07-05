package sukkiri_java_15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice15_4 {
	public static void main(String[] args) {
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day+100);

		Date future =c.getTime();
		
		String s = f.format(future);
		System.out.println(s);
	}
	
}
