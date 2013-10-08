package ar.edu.ulam.tallerweb.PruebaFuncion;

public class Variable extends Operando {
	private int variable;

	public void setVariable(int variable) {
		this.variable = variable;
	}

	@Override
	public int Evaluar() {
		return this.variable;
	}

}
