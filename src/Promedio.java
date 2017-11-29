import java.util.Stack;

import javax.swing.JOptionPane;

public class Promedio {
	
	Stack<Float> pila=new Stack<Float>();
	
    public void calcularpromedio(float a,float b,float c,float d){
   	 
			pila.push((float) (a+b+c+d) / 4); 

		// Vaciamos la pila
		while (!pila.empty())
			
			JOptionPane.showMessageDialog(null,"Promedio: \n" + pila.pop());	
	}

}
