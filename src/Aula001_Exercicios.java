import java.util.Locale;

public class Aula001_Exercicios {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F'; //apenas aspas simples
		double price1 = 2100.00;
		double price2 =	650.50;
		double measure = 53.903824; 
		
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
	}

}
