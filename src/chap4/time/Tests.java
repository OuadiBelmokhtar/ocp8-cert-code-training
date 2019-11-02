package chap4.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Tests {
	public static void main(String[] args) {
//	LocalDateTime localDateTime=LocalDateTime.now();	
//	ZonedDateTime zDateTime =ZonedDateTime.of(localDateTime, ZoneId.of("GMT+2"));
//	System.out.println(zDateTime);
		
		// Afficher date/heure locale actuelle 
		ZonedDateTime dateMorocco=ZonedDateTime.now();
		System.out.println("Date time actuelle: "+dateMorocco);
		// 2019-10-22T13:19:42.389+01:00[Africa/Casablanca]
		
		// Afficher date/heure actuelle de la zone US/Pacific
		ZonedDateTime dateUSPacific = ZonedDateTime.now(ZoneId.of("US/Pacific"));
		// 2019-10-22T05:16:26.171-07:00[US/Pacific]
		
		System.out.println("US Pacific actual date time: " + dateUSPacific);

		// Chercher et afficher la zoneID du maroc
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		List<String> listZoneIds = new ArrayList<String>(zoneIds);
		Collections.sort(listZoneIds);
		for (String zoneId : listZoneIds) {
			if (zoneId.contains("Casa")) {
				System.out.println(zoneId);// Africa/Casablanca
			}
		}

		// Afficher si le Mroc est sous Daylight Saving Time
		LocalDateTime localDateTime1 = LocalDateTime.now();
		ZoneId casa = ZoneId.of("Africa/Casablanca");
		ZonedDateTime zDateTime = ZonedDateTime.of(localDateTime1, casa);
		System.out.println(casa.getRules().isDaylightSavings(zDateTime.toInstant())); // false, by Oct 22, 2019
	
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));


	

	
	}
}
