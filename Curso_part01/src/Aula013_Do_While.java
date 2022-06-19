import java.util.Scanner;

public class Aula013_Do_While {

	public static void main(String[] args) {
		
		/*
		 * Bloco de comandos executa pelo menos uma vez, pois a condiçao é verificada apenas no final.
		 * 
		 * SINTAXE:
		 * 		do{
		 * 		comando 1
		 * 		comando 2
		 * 		...
		 * 		} while(condição);
		 * 
		 * SITUAÇÃO PROBLEMA:
		 * 	fazer um programa para ler a temp. em celsius e mostrar o equivalente em fahrenheit. 
		 * 	Perguntar se o usuario deseja repetir(s/n), caso digite ('s'), repetir o programa.
		 * 
		 * 	Formula de conversão: F = (9.C / 5) + 32
		 */
		
		
		Scanner S = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = S.nextDouble();			// armazena o valor digitado em C
			double F = 9.0 * C / 5.0 + 32;		// faz a conversao
			System.out.printf("A temperatura equivalente em Farenheit: %.1f%n", F);
			System.out.print("Deseja repetir? (s/n)");	
			resposta = S.next().charAt(0);	// pega o caracter na posição 0 e armazena em resposta
			
		}while(resposta == 's');	// testa a condição no final, apos executar pelo menos uma vez.
		
		
		S.close();
	}

}

