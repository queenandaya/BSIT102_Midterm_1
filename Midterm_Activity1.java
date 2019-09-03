import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Midterm_Activity1 {
    
    public static void main(String[] args) throws Exception
    	{
    		Scanner scnr = new Scanner (System.in);
    		
    		SimpleDateFormat sdf = new SimpleDateFormat ("MM-dd-yyyy");
    		
    			System.out.println("Input Date: ");
    			String input = scnr.nextLine();
    			Date date = sdf.parse(input);
    			System.out.println(date);
    			
    		Calendar cal = new GregorianCalendar();
    			String b_day = ("09-21-2000");
    			Date birth = sdf.parse(b_day);
    	
    			int yr = cal.get(Calendar.YEAR);
    			cal.setTime(birth);
    			int byr = cal.get(Calendar.YEAR);
    		
    			int age = yr - byr;
    			System.out.print ("My age is " +age);
    			
    			
    			
    			
    			
    	}  	
    
}
