package ExerciciosLogica1;

public class ABCLogicaPura {

	public static void main(String[] args) {
 
		 int a = 10 , b = 20 , c = 30;
		 
		 a = b;
		 c = a;
		 b = c;
		 a = b;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);


	}

}
