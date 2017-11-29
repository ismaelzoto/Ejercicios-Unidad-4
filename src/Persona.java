import javax.swing.JOptionPane;

public class Persona {
	
	public void Calcular(double estatura,double peso,int edad){
		
		double imc= peso/(estatura*estatura);
		
		if (imc<18.5) {
			
			JOptionPane.showMessageDialog(null,"-- USTED TIENE BAJO PESO --");
        } else if ( imc>=18.5 && imc<=24.9) {
        	JOptionPane.showMessageDialog(null,"-- USTED ESTA DENTRO DEL PESO NORMAL --");
        } else if (imc>=25 && imc<=29.9) {
        	JOptionPane.showMessageDialog(null,"-- USTED TIENE SOBREPESO --");
        } else {
        	JOptionPane.showMessageDialog(null,"-- USTED TIENE OBESIDAD --");
        }
    }
}