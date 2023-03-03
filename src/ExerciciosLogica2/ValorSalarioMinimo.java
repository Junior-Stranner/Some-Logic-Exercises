package ExerciciosLogica2;

import java.util.Scanner;

public class ValorSalarioMinimo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double salMinimo,salUsuario;
		
		System.out.print(" Digite o valor do Salario Minimo :");
		salMinimo = Double.parseDouble(in.nextLine());
		
		System.out.print("Digite Salario do Usuario :");
		salUsuario = Double.parseDouble(in.nextLine());
		
		System.out.println("Salrio do Usuario e de = "+salUsuario
				+"\n Salario Minimo e de = "+salMinimo);
		
		
	}

}
