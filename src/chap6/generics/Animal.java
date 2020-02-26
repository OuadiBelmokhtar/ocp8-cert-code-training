package chap6.generics;

public class Animal {
	String nom;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal && this.nom.equals(((Animal) obj).nom))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nom.length();
	}
}
