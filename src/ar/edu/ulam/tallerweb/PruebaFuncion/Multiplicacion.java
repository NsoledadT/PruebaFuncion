package ar.edu.ulam.tallerweb.PruebaFuncion;



public class Multiplicacion extends OperacionBinaria {
	private final Expresion a;
	private final Variable b;
	 public Multiplicacion(Expresion a, Variable b) {
		 this.a = a;
		 this.b = b;
	 }

   @Override
    public int Evaluar() {
    	return a.Evaluar()*b.Evaluar();
     }

}
