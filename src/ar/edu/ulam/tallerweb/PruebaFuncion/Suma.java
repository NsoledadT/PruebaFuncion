package ar.edu.ulam.tallerweb.PruebaFuncion;



public class Suma extends OperacionBinaria {
	private final Expresion a;
	private final Expresion b;

	public Suma(Expresion a,Expresion b) {
		this.a = a;
		this.b = b;
     }


	@Override
	public int Evaluar() {
	   return this.a.Evaluar() + this.b.Evaluar();
	}

}
