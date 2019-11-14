package calculadora;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=1;
		double num1, num2, resul;
		
		do {
			
			System.out.println("Bienvenido a la calculadora.\n"
					+ "Pulsa 1 para sumar.\n"
					+ "Pulsa 2 para restar.\n"
					+ "Pulsa 3 para multiplicar.\n"
					+ "Pulsa 4 para divivir.\n"
					+ "Pulsa 0 para salir.\n");
			
			op=Leer.datoInt();
			
		}while (op!=0);
		
	}

}
