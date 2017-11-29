import javax.swing.JOptionPane;

public class Triangulo {

	public void tipotriangulo(float l1,float l2,float l3){

		if (l1==l2 && l2==l3){

			JOptionPane.showMessageDialog(null,"<<< Es un Triangulo Equilatero >>>");
		}else if(l1==l2 || l1==l3 || l2==l3){

			JOptionPane.showMessageDialog(null,"<<< Es un Triangulo Isosceles >>>");
		}else if(l1!=l2 || l1!=l3 || l3!=l2){

			JOptionPane.showMessageDialog(null,"<<< Es un Trinagulo Escaleno >>>");
		}else{

			JOptionPane.showMessageDialog(null,"El Triangulo es Invalido :( ");}
	}
}


