package ZoneDateTimeMapWithZones;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;
import java.util.*;

public class ZoneDateTimeWithZones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> zoneMap = new TreeMap<>();
		
		int year = Year.now().getValue();
	   LocalDate jan1 =	LocalDate.of(year, 1, 1);
	   LocalDate jul1 =	LocalDate.of(year, 7, 1);
	   
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("zzz",Locale.ENGLISH);
	   
	   for(String zoneIdStr : ZoneId.getAvailableZoneIds())
	   {
		   ZoneId zoneId = ZoneId.of(zoneIdStr);
		   //To check if a particular Zone has different date time w.r.t to Day Light Savings . Do they have Daylight saving
		   ZoneRules rules = zoneId.getRules();
		  
		// Create ZonedDateTimes
		   ZonedDateTime dateTimeJan =   ZonedDateTime.of(jan1, LocalTime.MIDNIGHT,zoneId);
		   ZonedDateTime dateTimeJul =   ZonedDateTime.of(jul1, LocalTime.MIDNIGHT,zoneId);
		   
		   //Extract timezone abbreviations and offsets
		   String shortNameJan = formatter.format(dateTimeJan);
		   String offsetJan = formatOffset(dateTimeJan.getOffset());
		   
		   String shortNameJul = formatter.format(dateTimeJul);
		   String offsetJul = formatOffset(dateTimeJul.getOffset());
		   
		   //check if either is in DST
		  boolean isJanDST =  rules.isDaylightSavings(dateTimeJan.toInstant());
		  boolean isJulyDST =  rules.isDaylightSavings(dateTimeJul.toInstant());
		  
		  String value;
		  
		   if (shortNameJan.equals(shortNameJul) && offsetJan.equals(offsetJul) && (isJanDST == isJulyDST)) {
               value = shortNameJan + " " + offsetJan;
           } else {
               value = shortNameJan + " " + offsetJan + " " + shortNameJul + " " + offsetJul;
           }
		   
		   zoneMap.put(zoneIdStr, value);
	   }
	   zoneMap.forEach((k,v)-> System.out.println(k+" => "+v));
	   
	   
	}
	private static String formatOffset(ZoneOffset offset) {
        int totalSeconds = offset.getTotalSeconds();
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds / 60) % 60);
        return String.format("GMT%+03d:%02d", hours, minutes);
    }
}
