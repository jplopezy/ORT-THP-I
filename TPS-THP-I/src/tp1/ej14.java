package tp1;
import java.util.Scanner;
public class ej14 {
	static Scanner entrada = new Scanner(System.in);
	static String OPERACIONES[] = {"SUMA => s", "RESTA => r", "PRODUCTO => p", "DIVISI�N => d"};
	
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	
	public static int pedirNumero() {
		System.out.print("Por favor ingrese un n�mero: ");
		int num = entrada.nextInt();
		System.out.println("N�mero ingresado.");
		return num;
	}
	
	public static void main(String[] args) {
		/*14. Construir un programa que simule el funcionamiento de una calculadora que puede
		realizar las cuatro operaciones aritm�ticas b�sicas (suma, resta, producto y divisi�n) con
		valores num�ricos enteros.
		En un principio, el usuario debe especificar la operaci�n que desea realizar (s para la suma,
		r para la resta, p para el producto y d para la divisi�n) y luego, deber� ingresar dos n�meros
		enteros para as� realizar la operaci�n. Informar el resultado por pantalla.
		Nota: Se recomienda el empleo de una sentencia switch.args */
		
		System.out.println("�Qu� operaci�n desea realizar?");
		for (int i = 0; i < OPERACIONES.length; i++) {
			System.out.println(OPERACIONES[i]);
		}
		
		String operacion = entrada.next();
		if (operacion.contains("s") || operacion.contains("r") || operacion.contains("p") || operacion.contains("d")) {
			int num1, num2, resultado = 0;	
			num1 = pedirNumero();
			num2 = pedirNumero();
			
			switch (operacion) {
			case "s":
				resultado = (num1 + num2);
				break;
			case "r":
				resultado = (num1 - num2);
				break;
			case "p":
				resultado = (num1 * num2);
				break;
			case "d":
				resultado = (num1 / num2);
				break;
			}
			System.out.println("El resultado es: " +resultado);
			cerrarPrograma(0);
		} else {
			System.out.println("Error. Ha ingresado una operaci�n incorrecta.");
			cerrarPrograma(1);
		}
	}
}