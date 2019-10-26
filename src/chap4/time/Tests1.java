package chap4.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Tests1 {
	public static void main(String[] args) {

		System.out.println(Instant.now());
		// 2019-10-23T11:24:07.475Z

		System.out.println(Duration.ofDays(2)); // PT48H
		System.out.println(Duration.ofMinutes(30)); // PT30M
		System.out.println(Duration.ofMinutes(150)); // PT2H30M

		System.out.println(Locale.getDefault()); // en_MA

		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Africa/Casablanca"));
		Locale locIT = new Locale("it");
		System.out.println("Using Local.ITALY: " + zonedDateTime
				.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.ITALY)));
		System.out.println("Using new Locale 'it': "
				+ zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(locIT)));
//		Using Local.ITALY: 26 ottobre 2019 10.31.02 WET
//		Using new Locale 'it': 26 ottobre 2019 10.31.02 WET

	}
}
