package Coding;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateCalculator {

	public static void main(String[] args) {
		//For Current Date
		System.out.println("Current date");
		LocalDate date= LocalDate.now();
		System.out.println(date);
		System.out.println();
		//For Current Time
		System.out.println("Current Time");
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println();
		//For Current Date and Time
		System.out.println("Date and Time");
		LocalDateTime datewithtime=LocalDateTime.now();
		System.out.println(datewithtime);

		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Before format "+datetime);
		DateTimeFormatter formateddate=DateTimeFormatter.ofPattern("dd-MM-y HH:mm:ss");
		String currentdatetime=datetime.format(formateddate);
		System.out.println("After format "+currentdatetime);

		
		DateTimeFormatter withmonthname=DateTimeFormatter.ofPattern("dd-MMM-y");
		String mounthname=datetime.format(withmonthname);
		System.out.println("After format "+mounthname);

		
		DateTimeFormatter withday=DateTimeFormatter.ofPattern("E, dd-MM-y");
		String dayname=datetime.format(withday);
		System.out.println("After format "+dayname);
		

	}

}
