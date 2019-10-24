package chap4.time;

import java.time.Duration;
import java.time.Instant;

public class Tests1 {
public static void main(String[] args) {
	
	System.out.println(Instant.now());
	// 2019-10-23T11:24:07.475Z
	
	System.out.println(Duration.ofDays(2)); // PT48H
	System.out.println(Duration.ofMinutes(30)); // PT30M
	System.out.println(Duration.ofMinutes(150)); // PT2H30M
}
}
