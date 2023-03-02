package ExerciciosLogica2;

import java.util.Scanner;

public class IdadePessoa {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int idade ,ano = 0 ,mes ,dias = 0,somaA ,somaM;
		
		System.out.println(" Digite idade da pessoa :");
		idade = Integer.parseInt(in.nextLine());
		
		System.out.println(" digite 1 ano em meses :");
		mes = Integer.parseInt(in.nextLine());
		
		System.out.println("digite 1 ano em dias ");
		dias = Integer.parseInt(in.nextLine());
		
		 ano = idade;
		 mes = ano * mes;
		 dias = ano * dias ;
		System.out.println("                         ");
		System.out.println(+ ano+"anos, "+mes+ " meses ,"+dias+"dias");
		
		
		
		
		
		
		
		
	}

}
