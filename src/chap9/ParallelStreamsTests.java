package chap9;

import java.util.Arrays;

public class ParallelStreamsTests {
public static void main(String[] args) {
	Arrays.asList("taha","ouadi", "yassine", "bobi").stream().parallel().forEach(System.out::println);
}
}
 