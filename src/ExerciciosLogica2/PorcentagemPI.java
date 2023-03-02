package ExerciciosLogica2;

import java.util.Scanner;

public class PorcentagemPI {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        double ipi,valor1 = 10.0,quant1= 20,
        		valor2 = 12.20,quant2 = 34, formula;
        
        System.out.println(" Digite  a porcentagem do valor PI");
        ipi = Double.parseDouble(in.nextLine());
        
        formula =(valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
        
        System.out.println("Valor total a pagar e = "+formula);
	}
}