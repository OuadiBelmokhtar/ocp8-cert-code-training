package chap02.patterns.singleton;

public class Tests {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2 ? "Meme instance" : "diff instances");
		// prints Instanciation via constructeur/ Meme instance
	}
}
