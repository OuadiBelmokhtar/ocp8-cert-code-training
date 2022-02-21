public class Onion {
	private String data = "skin";

	private class Layer extends Onion {
		String data = "thegoodpart";

		/*
		public String getData() {
			return data;
		}
		*/
	}

	public String getData() {
		System.out.println("onion data");
		return new Layer().getData();
	}

	public static void main(String[] args) {
		Onion o = new Onion();
		System.out.println(o.getData());
	}
}


