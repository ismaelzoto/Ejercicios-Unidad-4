import javax.swing.JOptionPane;

public class Divisores {

	public int divisoresentero(int n){
		
		for (int i = 1 ; i <= n ; i++){
			if (n % i == 0)

				JOptionPane.showMessageDialog(null,"Numeros Divisores: \n"+" >> " + i +" << ");
		}
		return n;
	}

}
