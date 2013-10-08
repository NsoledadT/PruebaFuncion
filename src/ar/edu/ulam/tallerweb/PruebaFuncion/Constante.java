package ar.edu.ulam.tallerweb.PruebaFuncion;

public class Constante extends Operando {
	private final int numero;

	public Constante(int numero) {
		this.numero = numero;
     }

	@Override
	public int Evaluar() {
		return this.numero;
	}

}
