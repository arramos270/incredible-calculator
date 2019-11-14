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
			
			switch(op) {
			
			case 1:
				
				System.out.println("Vas a sumar.\n"
						+ "Pon el primer número:");
				
				num1=Leer.datoDouble();
				
				System.out.println("Pon el segundo número:");
				
				num2=Leer.datoDouble();
				
				resul=num1+num2;
				
				System.out.println("La suma de " + num1 + " + " + num2 + " es " + resul);
				
				break;
				
			case 2:
				
				System.out.println("Vas a restar.\n"
						+ "Pon el primer número:");
				
				num1=Leer.datoDouble();
				
				System.out.println("Pon el segundo número:");
				
				num2=Leer.datoDouble();
				
				resul=num1-num2;
				
				System.out.println("La resta de " + num1 + " - " + num2 + " es " + resul);
				
				break;
				
			}
			
		}while (op!=0);
		
	}

}
