package ar.edu.ulam.tallerweb.PruebaFuncion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestPrueba {

        @Test
		public void PruebaConstante() {
        	Expresion c1 = new Constante(4);
		   assertEquals(4, c1.Evaluar());
	  }

        @Test
    		public void PruebaVariable() {
    		   Variable v1 = new Variable();
    		   v1.setVariable(6);
    		   assertEquals(6, v1.Evaluar());
    	  }

        @Test
		public void PruebaMultiplicacion() {
           Expresion c1 = new Constante(4);
           Variable v1 = new Variable();
           v1.setVariable(6);
           OperacionBinaria s1 = new Multiplicacion(c1,v1);
           assertEquals(24, s1.Evaluar());
	  }
        @Test
     		public void PruebaSuma() {
                Expresion c1 = new Constante(4);
                Expresion c2 = new Constante(6);
                Variable v1 = new Variable();
                v1.setVariable(6);
                OperacionBinaria m1 = new Multiplicacion(c1,v1);
                OperacionBinaria s1 = new Suma(m1,c2);
                assertEquals(30, s1.Evaluar());
     	  }
        @Test
 		public void PruebaFormula() {
            Expresion c1 = new Constante(4);
            Expresion c2 = new Constante(6);
            Variable v1 = new Variable();
            v1.setVariable(6);
 		    Expresion m1 = new Multiplicacion(c1,v1);
 		    Expresion s1 = new Suma(m1,c2);
 		    Formula f1 = new Formula(s1);
            assertEquals(30, f1.Evaluar());
 	  }


}



