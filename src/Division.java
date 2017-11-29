import javax.swing.JOptionPane;

public class Division {

	public void dividir(int numero1,int numero2){

		if ( numero1%numero2==0 ) 
           {
			JOptionPane.showMessageDialog(null,"La Division "+ numero1+"/"+numero2 + ":\n Es Exacta :)");

			//aqui la division No es exacta 
		}else{JOptionPane.showMessageDialog(null,"La Division "+ numero1+"/"+numero2 + ": \n NO es Exacta :(");}


	}
}