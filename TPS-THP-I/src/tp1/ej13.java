package tp1;
import java.util.Scanner;

public class ej13 {
	static Scanner entrada = new Scanner(System.in);
	static final int VALOR_HORA_BASE = 16;
	static final int VALOR_HORA_EXTRA = 20;
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
		
	public static void main(String[] args) {
		/* 13. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
		manera:
		� Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar
		el 16)
		� Si trabaja m�s de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
		por cada hora extra. (crear una constante para almacenar el 20)
		Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, y mostrar por
		pantalla el salario correspondiente. */

		try {
			System.out.println("Ingrese la cantidad de horas trabajadas.");
			int horas = entrada.nextInt();
			int sueldo = 0;
			int horasExtras;
			
			if (horas < 0) {
				System.out.println("Error, ingrese una cantidad de horas a partir de 0.");
				cerrarPrograma(1);
			} else {
				if (horas <= 40) {
					sueldo = horas * VALOR_HORA_BASE;
				} else {
					horasExtras = horas - 40;
					sueldo = (40 * VALOR_HORA_BASE) + (horasExtras * VALOR_HORA_EXTRA);
				}
			}

			System.out.println("El obrero cobrar� "+ sueldo +" pesos esta semana.");
			cerrarPrograma(0);
		} catch(Exception e) {
			System.out.println("Error, ingrese un valor num�rico.");
			cerrarPrograma(1);
		}
	}

}
