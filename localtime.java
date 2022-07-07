package TimeApi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class localtime {
   
	public class LocalDateExample1 {    
	  public static void main(String[] args) {    
	    LocalDate date = LocalDate.now();    
	    LocalDate yesterday = date.minusDays(1);    
	    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+date);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);  
	    
	    LocalTime time=LocalTime.now();
	    System.out.println(time);
	    
	    LocalDateTime a=LocalDateTime.now();
	    System.out.println(a);
	    
	    LocalDate b=LocalDate.of(1999, 8, 27);
	    System.out.println(b);
	    
	    Period gap=Period.between(b,date);
	    System.out.println("differe,ance btw "+gap);
	    
	    
	    
	    
	   DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd-MMM-yyy");
	    System.out.println(b.format(dft));
	    
	    ZonedDateTime zdt=ZonedDateTime.now();
	    System.out.println(zdt);
	    
	    ZonedDateTime centralestern=LocalDateTime.now().atZone(ZoneId.of("CET"));
	    System.out.println(centralestern);
	    
	   // for(String zone:ZoneId.getAvailableZoneIds()) {
	    	//System.out.println(zone);
	    	
	   // }
	    
	   LocalTime time1=LocalTime.now();
	   System.out.println(time1);
	   Duration fiveHours=Duration.ofHours(5);
	    LocalTime time2=time1.plus(fiveHours);
	    System.out.println(time2);
	     
	    Duration x =Duration.between(time2,time1);
	    System.out.println(x);
	    
	    
	    YearMonth ym = YearMonth.now();  
	    System.out.println(ym);  
	    
	    
	    ZoneId zone=ZoneId.systemDefault();
	    System.out.println(zone);
	    
	    DayOfWeek dweek=LocalDate.parse("1999-08-27").getDayOfWeek();
	    System.out.println(dweek);
	    
	    
	    ZoneOffset z=ZoneOffset.ofHours(-5);
	    System.out.println(z);
	    
	    LocalTime add=time.plusMinutes(20);
	    System.out.println(add);
	    
	    
	    Year y1=Year.of(1999);
	    Year y2=Year.of(2022);
	    int diff=y2.getValue()-y1.getValue();
	    int count=0;
	    int count1=0;
	    for(int i=y1.getValue();i<y2.getValue();i++) {
	    	if(i%4==0) {
	    		 count=count+1;
	    	}
	    	count1=diff*365+count;
	    	System.out.println("total days btw 2 years :"+count1);
		    YearMonth y = YearMonth.of(1999,8); 
		    System.out.println(y.atEndOfMonth().getDayOfWeek().name());
		    
		    ZonedDateTime zz=ZonedDateTime.now();
		    ZoneId univ=ZoneId.of("UTC");
		    ZonedDateTime univers=zz.withZoneSameInstant(univ);
		    System.out.println(univers);
		    

	    	
	    		
	    	}
	    	
	    }
	    
	    
	    
	  }  
	  }  
	    
	   
	    
	  
	  
	

