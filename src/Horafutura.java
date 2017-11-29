import java.util.Stack;

import javax.swing.JOptionPane;

public class Horafutura {
	
	Stack<Float> pila=new Stack<Float>();
	
    public void HoraT(float ingresa,float cantidad){
   	 
			pila.push((float) (ingresa + cantidad) % 24); 

		// Vaciamos la pila
		while (!pila.empty())
			
			JOptionPane.showMessageDialog(null,"En "+cantidad+ " horas,"+" El reloj Marcara las:\n " + pila.pop()+" Horas");	
	}
}
