import javax.swing.JOptionPane;

public class Suma {

	public int sumaentera(int n1,int n2){

		int suma=0;

		for ( int x=n1+1; x<n2; x++ )
		{
			suma+= x;	
		}
		JOptionPane.showMessageDialog(null,"La suma que hay entre los numeros "+ n1 +" Y "+  n2 +" es igual a: \n" + suma);
		
		return suma;
	}
}
