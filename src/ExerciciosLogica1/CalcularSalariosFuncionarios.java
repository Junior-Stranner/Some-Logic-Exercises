package ExerciciosLogica1;

import java.util.Scanner;

public class CalcularSalariosFuncionarios {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int func;
        double salario,mediaS = 0;
        
        
        
        for(int x = 0; x < 4;x++) {
        	
        	System.out.println(" Digite Salario : ");
        	salario = Double.parseDouble(in.nextLine());
        	
        	mediaS += salario /4;
        	
        	
        }
        System.out.println(" Media dos Salario e = "+mediaS);
	}

}
