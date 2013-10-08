package ar.edu.ulam.tallerweb.PruebaFuncion;


public class Formula {
	private final Expresion b;

	public Formula (Expresion b) {
		this.b = b;
	}

	public int Evaluar() {
		return this.b.Evaluar();
	}

}
