package TP1;
import java.util.Scanner;

public class ej4 {
	static Scanner entrada = new Scanner(System.in);
	
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
		/*
		4. Realiz� un programa que pida al usuario ingresar dos n�meros enteros num1 y num2.
		Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: �La
		suma entre � + num1 + � y � + num2 + � da como resultado � + num1 + num2
		*/
		try {
			int num1, num2;	
			num1 = pedirNumero();
			num2 = pedirNumero();
			System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1+num2));
			
			cerrarPrograma(0);
		} catch(Exception e) {
			System.out.println("Error, ingrese valores num�ricos.");
			cerrarPrograma(1);
		}
	}

}
