import javax.swing.JOptionPane;

public class Caracter {

	public void cadenade(String cadena){

		if (cadena.charAt(0)>=48&&cadena.charAt(0)<=57)
		{
			JOptionPane.showMessageDialog(null,"Es un Numero");
		}else if(cadena.charAt(0)>=65&&cadena.charAt(0)<=90){
			
			JOptionPane.showMessageDialog(null,"Es una letra: MAYUSCULA");
		}else if(cadena.charAt(0)>=97&&cadena.charAt(0)<=122){
			
			JOptionPane.showMessageDialog(null,"Es una letra: minuscula");
		}else{
			
			JOptionPane.showMessageDialog(null,"No es una Letra, Ni tampoco un Numero :(");}
	}
}