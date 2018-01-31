import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//		String cunvertCurrentDate="2000/01/01";
		Date date = new Date();
		String s = null;
		s = df.format(date);
		System.out.println(s);
	}

}
