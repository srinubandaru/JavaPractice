package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateManipulation {

	public static void main(String[] args) {
 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 System.out.println(date1);

	}

}
