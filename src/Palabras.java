import java.util.Stack;

import javax.swing.JOptionPane;

public class Palabras {

	Stack<Integer> pila=new Stack<Integer>();

	public void palabra(String palabra1,String palabra2){

		int conteo1 = palabra1.length();
		int conteo2 = palabra2.length();

		pila.push((int) Math.abs(conteo1 - conteo2)); 

		if(conteo1>conteo2){
			
			JOptionPane.showMessageDialog(null,"La palabra mas larga es: " + palabra1+"\n "+
					"La diferencia es de: "+ pila.pop()+" letra(s)" );	
		}else if (conteo1==conteo2){
			
			JOptionPane.showMessageDialog(null,"Las palabras tienen la misma longitud \n"+
					" La diferencia es de: "+ pila.pop()+" letra(s)" );	
		}else{
			
			JOptionPane.showMessageDialog(null,"La palabra mas larga es: " + palabra2+"\n "+
					"La diferencia es de: "+ pila.pop()+" letra(s)" );	
		}	
	}

}