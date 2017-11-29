import java.util.Scanner;

import javax.swing.*;

public class ProgramaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int opcion=0;

		do{
			try {
				for(int j=0;j<3;j++){ 
					opcion= Integer.parseInt(JOptionPane.showInputDialog("                  SELECCIONE UNA OPCION:\n"
							+ "---------------------------------------------------------------------------------\n"     		
							+ "1.Area y Perimetro de un circulo         11.Palabra Mas Larga \n"
							+ "2.Obtener Promedio                                12.Es Letra o Numero \n"
							+ "3.Centimetros a pulgadas                      13.Triangulo         \n"
							+ "4.En Orden inverso                                   14.Calcular IMC      \n"
							+ "5.Hipotenusa                                              15.Tablas De multiplicar \n"
							+ "6.Hora actual                                             16.Potencias de 2        \n"
							+ "7.Parte decimal                                         17.Suma Entre 2 Numeros Enteros\n"
							+ "8.Numero par                                             18.Divisores De un Numero\n"
							+ "9.Año Bisiesto                                            19.salir                 \n"
							+ "10.Division Exacta\n"));

					switch (opcion){
					case 1:

						//Ejercicio #1
						Circulo circ = new Circulo();

						float ingresar = Float.parseFloat(JOptionPane.showInputDialog(null,"ingresa el radio"));

						circ.calcular(ingresar);
						//circ.perimetro(ingresar);	
						j=0;
						break;

					case 2:
						//Ejercicio #2
						Promedio notas = new Promedio();

						float w=Float.parseFloat(JOptionPane.showInputDialog("ingrese nota"));
						float x=Float.parseFloat(JOptionPane.showInputDialog("ingrese nota"));
						float y=Float.parseFloat(JOptionPane.showInputDialog("ingrese nota"));
						float z=Float.parseFloat(JOptionPane.showInputDialog("ingrese nota"));

						notas.calcularpromedio(w,y,x,z);
						j=0;
						break;

					case 3:
						//Ejercicio #3
						Convertir conv = new Convertir();
						double ingresa = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad en Centimetros"));
						conv.convierte(ingresa);
						j=0;
						break;

					case 4:
						//Ejercicio #4
						Invertir inv = new Invertir();

						int ingrese = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero de 3 digitos"));

						inv.invertir(ingrese);
						j=0;
						break;
					case 5:
						//Ejercicio #5
						EntradaLong entrada = new EntradaLong();

						double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del primer cateto"));
						double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del segundo cateto"));

						entrada.longitud(cateto1,cateto2);
						j=0;
						break;
					case 6:
						//Ejercicio #6
						Horafutura hora = new Horafutura();

						float ing = Float.parseFloat(JOptionPane.showInputDialog("La Hora Actual Es?"));

						float cantidad = Float.parseFloat(JOptionPane.showInputDialog("¿Que hora sera dentro de h horas?"));

						hora.HoraT(ing,cantidad);
						j=0;
						break;
					case 7:
						//Ejercicio #7
						Decimal numero = new Decimal();

						double real =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese un Numero Real"));

						numero.partedecimal(real);
						j=0;
						break;
					case 8:
						//Ejercicio 8
						Espar entero = new Espar();

						double nu = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un Numero entero para determinar si es Par"));

						entero.ParImpar(nu);
						j=0;
						break;
					case 9:
						//Ejercicio #9
						Añobisiesto año = new Añobisiesto();

						int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año para determinar si es Bisiesto"));

						año.Bisiesto(anio);
						j=0;
						break;
					case 10:
						//Ejercicio #10 
						Division num = new Division();

						int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 numero entero para dividir"));
						int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 numero entero para dividir"));

						num.dividir(numero1, numero2);
						j=0;
						break;
					case 11:
						//Ejercicio #11
						Palabras contar = new Palabras();

						String palabra1 = String.valueOf(JOptionPane.showInputDialog("Ingrese la primer Palabra"));
						String palabra2 = String.valueOf(JOptionPane.showInputDialog("Ingrese la segunda Palabra"));

						contar.palabra(palabra1,palabra2);
						j=0;
						break;
					case 12:
						//Ejercicio #12
						Caracter cadena = new Caracter();

						String leer = String.valueOf(JOptionPane.showInputDialog("Ingrese Un Caracter"));

						cadena.cadenade(leer);
						j=0;
						break;
					case 13:
						//Ejercicio #13
						Triangulo t =new Triangulo();

						float la = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado"));
						float lb = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado"));
						float lc = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado"));

						t.tipotriangulo(la, lb, lc);;
						j=0;
						break;
					case 14:
						//Ejercicio #14
						Persona p = new Persona();

						double peso=Double.parseDouble(JOptionPane.showInputDialog("Cual es su peso?")); 
						double est=Double.parseDouble(JOptionPane.showInputDialog("Cual es su estatura?"));
						int edad= Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad?"));

						p.Calcular(est, peso, edad);
						j=0;
						break;
					case 15:
						//Ejercicio #15
						Tablas n = new Tablas();

						int tabla=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para obtener su tabla de Multiplicar"));

						n.calculartablas(tabla);
						j=0;
						break;
					case 16:
						//Ejercicio #16
						//Potencia2 p = new Potencia2(num);

						int potencia =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para mostrar las potencias de 2"));

						for (int i = 0; i <= potencia; i++) {
							Potencia2 p2 = new Potencia2(i);
						}
						j=0;
						break;
					case 17:
						//Ejercicio #17
						Suma ent = new Suma();

						int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

						ent.sumaentera(num1,num2);
						j=0;
						break;
					case 18:
						//Ejercicio #18
						Divisores enteros = new Divisores(); 

						int numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

						enteros.divisoresentero(numeros);
						j=0;
						break;
					case 19:
						j=4;
						break;

					default: //ejecuta lo que esta dentro de el si el usuario ingresa otro numero no declarado
						String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente un Numero \n"+
								"de las Opciones", "Error!", JOptionPane.ERROR_MESSAGE);
						break; 
					}
				}
			} catch (NumberFormatException n){
				JOptionPane.showMessageDialog(null,"Error " + n.getMessage()); }
		}while(opcion!=19);
	}
}


