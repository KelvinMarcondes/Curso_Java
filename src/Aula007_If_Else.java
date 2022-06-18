import java.util.Scanner;

public class Aula007_If_Else {

	public static void main(String[] args) {
		
		Scanner hr = new Scanner(System.in);	
		int hora;
		
		System.out.println("Que horas são?");
		hora = hr.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom diaa!!!");
		}
		
		else {
			if(hora <18 ) {
				System.out.println("Boa tarde!!");
			}
			
			else {
				System.out.println("Boa Noite!!");
				}
			}
		
		hr.close();
	}

}
