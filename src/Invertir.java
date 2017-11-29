import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Invertir {

	public void invertir(int n){

		List<Integer> lista = new LinkedList<Integer>();

		int a,b;
		int c = 0;

		while(n>0){

			a = (int) (n/10);
			b=n%10;
			n=a;
			lista.add((c*10)+b);	
		}

		// Obtenemos el resultado de la lista
		for(int i=0;i<lista.size();i++){	

			JOptionPane.showMessageDialog(null,"Numeros En Orden Invertido \n"+lista.get(i));
		}
	}
}
