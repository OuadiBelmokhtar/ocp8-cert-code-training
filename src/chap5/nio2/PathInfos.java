package chap5.nio2;

import java.io.IOException;
import java.nio.file.Paths;

public class PathInfos {
	public static void main(String[] args) throws IOException {

		System.out.println(Paths.get(".").toRealPath());
		// /Users/ouadi/Google_Drive/WorkSpace/Work/Dev_Career/Certifications/Java/OCPJP8/Training_code/ocp8-cert-code
		
		System.out.println(Paths.get(".").toAbsolutePath().normalize());
		// /Users/ouadi/Google_Drive/WorkSpace/Work/Dev_Career/Certifications/Java/OCPJP8/Training_code/ocp8-cert-code

	}
}
