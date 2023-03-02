package ExerciciosLogica1;

public class QuantidadeCavalos {

	public static void main(String[] args) {

		double massa = 6, altura = 2.20,tempo = 20,cavalos;
		
		cavalos = (massa * altura / tempo) / 745.6999;
		
		System.out.println("A quantidade de cavalos necessários é = " + cavalos);
	}

}
