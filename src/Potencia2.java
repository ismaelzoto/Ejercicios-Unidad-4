import javax.swing.JOptionPane;

public class Potencia2 {

	private int nn;
	private int res;

	public Potencia2(int nn){

		this.nn=nn;
	    potencia(nn);
		mostrarpotencias();
	}
	// Recursividad
	public int potencia(int n) {
		if (n == 0) {
			return res = 1;
		} else {
			return res = 2 * potencia(n - 1);
		}
	}

	public void mostrarpotencias() {
		JOptionPane.showMessageDialog(null,"2 ^ " + nn + " = " + res);
		}


	}

		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   /*
		        int resultado = 1;

		        for (int i = 0; i <= n; i++) {

		            resultado = (int) Math.pow(2,n);
		            
		            System.out.println(2+" ^ " +i+" = " + resultado);
		        }
   
		        return resultado;

   }*/
		   
		   
		   
		   
		   
		




