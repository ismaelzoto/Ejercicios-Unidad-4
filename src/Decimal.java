import java.util.Stack;

import javax.swing.JOptionPane;

public class Decimal {

	Stack<Float> pila=new Stack<Float>();

	public void partedecimal(double real){

		int realEnt;
		realEnt=(int)real;

		pila.push((float) (real - realEnt)); 

		// Vaciamos la pila
			while (!pila.empty())

			JOptionPane.showMessageDialog(null,"La parte decimal de "+ real + " Es: \n" + pila.pop());	
	}

}