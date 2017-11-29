import java.util.Stack;

import javax.swing.JOptionPane;

public class Convertir {
	
	Stack<Double> pila=new Stack<Double>();
	
    public void convierte(double n){
   	       // 1 cm equivale a 0.393701 pulgadas 
    	    //1 Pulgada equivale a 2.54 cm
    	
			pila.push((double) (n * 0.393701)); 

		// Vaciamos la pila
		while (!pila.empty())
			
			JOptionPane.showMessageDialog(null, n +" Cm. Equivale a: \n" 
			                                         + pila.pop()+" Pulgadas ");	
	}
}
