package ExerciciosLogica2;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double saldo;

		System.out.println(" Informe um saldo ");
		saldo = Double.parseDouble(in.nextLine());	
		
		double conta = saldo;
		System.out.print("Minha conta : "+conta);
		
		double reajuste = saldo * 1.01;
		
		System.out.println(" Saldo da minha conta e : "+conta 
				+"com reajuste de 1% fica "+reajuste);
	}

}
