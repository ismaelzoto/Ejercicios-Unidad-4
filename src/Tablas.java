import javax.swing.JOptionPane;

public class Tablas {

	public int calculartablas(int n){
		
		for(int i = 1; i<=10; i++){

			JOptionPane.showMessageDialog(null, "Tabla del" + n + "\n" + n + " * " + i + " = " + n * i);
		}
		return n;

	}
}
