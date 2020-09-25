package kyouStudy_1;

import java.util.Calendar;



public class planner {
	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		System.out.println(time.getTime());
		
		time.add(Calendar.SECOND, 120);
		System.out.println(time.getTime());
	}
}
