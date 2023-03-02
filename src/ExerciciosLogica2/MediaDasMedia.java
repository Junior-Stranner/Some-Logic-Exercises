package ExerciciosLogica2;

import java.util.Scanner;

public class MediaDasMedia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double media1, media2 ,res, n1 = 8,n2 = 9,n3 = 7,
		n4 = 4, n5 =5 ,n6 =6;

		media1 = n1 + n2 + n3/3;
		media2 = n4 + n5 +n6/3;
		res = media1 + media2;
		
		
		
		
		System.out.println("Media de todos os numeros e ="+res);
	}

}
