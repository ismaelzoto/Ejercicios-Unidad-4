import java.util.Stack;

import javax.swing.JOptionPane;

public class EntradaLong {

	Stack<Float> pila=new Stack<Float>();

	public void longitud(double catetoA ,double catetoB){

		pila.push((float) (Math.sqrt(Math.pow(catetoA , 2) + Math.pow(catetoB,2)))); 

		// Vaciamos la pila
		while (!pila.empty())

			JOptionPane.showMessageDialog(null,"Hipotenusa: \n"  + pila.pop());	
	}
}
