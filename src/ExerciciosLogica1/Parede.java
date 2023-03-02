package ExerciciosLogica1;

import java.util.Scanner;

public class Parede {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double  hp = 1.6, lp = 2.6, ha = 0.3, la = 0.35 , qtd = 0;
		
		qtd = (hp * lp) / (ha * la);
		
		System.out.println("quantidade de azulejos que será necessária para cobrir toda a parede ="
				+ "\n Resultado :"+qtd);
	}

}
