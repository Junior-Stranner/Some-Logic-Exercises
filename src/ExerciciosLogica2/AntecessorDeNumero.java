package ExerciciosLogica2;

import java.util.Scanner;

public class AntecessorDeNumero {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int nAtecessor = 0;
		
		System.out.println("Digite um numero ");
		int numero = Integer.parseInt(in.nextLine());
		
		nAtecessor =numero;
		nAtecessor = nAtecessor-1;
		

		System.out.println(" O numero antecessor de ="+numero+""
				+ " e |"+nAtecessor+"|");
	}

}
