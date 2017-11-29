import javax.swing.JOptionPane;

public class Añobisiesto {
	
	public void Bisiesto(int año){
		
           if( año % 4 == 0 )
        	{
        	   JOptionPane.showMessageDialog(null,"El año Es Bisiesto :)");
        	   
           }else{
        	   JOptionPane.showMessageDialog(null,"El año NO es bisiesto :(");
           }
	}
}
