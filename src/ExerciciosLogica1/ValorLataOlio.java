package ExerciciosLogica1;

import java.util.Scanner;

public class ValorLataOlio {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 
		
		double volume  = 3.5, raio = 2, altura = 10;
		
		volume = 3.14159 * raio * raio * altura;
			
		System.out.println("O volume da lata de óleo é de " + volume + " m³");
	}

}
