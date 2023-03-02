package ExerciciosLogica1;

import java.util.Scanner;

public class SexoEAlturaMF {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int sexo = 0,qtdMulheres = 0, qtdHomens = 0;
		float altura = 0,maior = 0 ,menor = 10, mediaH = 0, somaH =0;
	     
		
		for(int x = 0; x < 11;x++) {
			
			System.out.println(" Digite \n 1 - Homen \n 2 - Mulher");
			sexo = Integer.parseInt(in.nextLine());
			
			System.out.println("digite a altura ");
			altura = Float.parseFloat(in.nextLine());
		 
			
			if(sexo == 1) {
				qtdHomens++;
				somaH = altura;
			}else if(sexo == 2) {
				qtdMulheres++;
			}
			
			if(altura > maior) {
				maior = altura;
			}else if(altura < menor) {
				menor = altura;
			}
		}
			
			mediaH = somaH / qtdHomens;
			
			System.out.println(" A maior altura do grupo e = " +maior+ " e a menor e = "+menor);
			System.out.println("Media de Altura dos Homens = "+mediaH);
			System.out.println(" Quantidade de Mulheres = "+qtdMulheres);
			
			
	}

}
