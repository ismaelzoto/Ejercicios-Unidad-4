import javax.swing.*;
import java.util.Stack;

public class Circulo {

	Stack<Float> pila = new Stack<Float>();
	
    public void calcular(float r){
   	 
			pila.push((float) (Math.PI * r * r)); 
	   	
        // Aqui se podria usar otro metodo
			pila.push((float) (2 * Math.PI * r)); 
			
		// Vaciamos la pila
		while (!pila.empty())
			
			JOptionPane.showMessageDialog(null,"Area del circulo: \n" + pila.pop() + "\n"
				    +"Perimetro del circulo: \n" + pila.pop());	
	}
}
