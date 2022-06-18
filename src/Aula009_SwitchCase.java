import java.util.Scanner;

public class Aula009_SwitchCase {

	public static void main(String[] args) {
		/*
		 * Quando se tem varias opçoes de fluxos a serem tratadas com base no valor de uma variavel,
		 * ao invés de várias estruturas if-else encadeadas, alguns preferem ultilizar a estrutura 
		 * Switch-Case.
		 * 
		 * 
		 * PROBLEMA EXEMPLO:
		 * 
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando dia da semana (sendo:
		 * 1= domingo, 2= segunda, e assim por diante).
		 * 
		 * Escrever na tela o dia da semana correspondente ao numero digitado.
		 */
		
		Scanner d = new Scanner (System.in);
		
		System.out.println("Digite o dia");
		
		int x = d.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		d.close();
	}
}	
		
		
		
		
		
		
		/* 
		 * UTILIZANDO O IF ELSE
		
		Scanner d = new Scanner (System.in);
		
		System.out.println("Digite o dia");
		
		int x = d.nextInt();
		String dia;
		
		if(x == 1) {
			dia = "Domingo";
		}else if(x == 2) {
			dia = "Segunda";
		}else if(x == 3) {
			dia = "Terça";
		}else if(x == 4) {
			dia = "Quarta";
		}else if(x == 5) {
			dia = "Quinta";
		}else if(x == 6) {
			dia = "Sexta";
		}else if(x == 7) {
			dia = "Sabado";
		}else {
			dia = "Valor invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		
		d.close();
		
	}
	
	 */
