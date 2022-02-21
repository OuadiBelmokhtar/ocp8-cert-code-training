package chap09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tests2 {
	public static void main(String[] args) {
		try (Stream<String> dvdStream = Files.lines(Paths.get("dvds.txt"))) {
			ArrayList<DVDInfo> dvdList = dvdStream
					.map(line -> new DVDInfo(line.split("/")[0], line.split("/")[1], line.split("/")[2]))
					.collect(Collectors.toCollection(ArrayList::new));
			dvdList.forEach(System.out::println);
			
			IntStream is = IntStream.of(1, 2, 3).collect(supplier, accumulator, combiner);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
