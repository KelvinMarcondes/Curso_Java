import java.util.Scanner;

public class Aula011_While {

	public static void main(String[] args) {
		/*
		 * Estrutura de controle que repete um bloco de codigos enquanto uma condição for verdadeira.
		 * Quando usar: quando nao se sabe previamente a quantidade de repetiçoes que sera realizada.
		 * 
		 * Sintaxe:
		 * 		While (condição){
		 * 			comando 1
		 * 			comando 2
		 * 			...
		 * 		}
		 * SITUAÇÃO PROBLEMA:
		 * ler entrada até ser digitado o numero 0, e depois mostrar a soma dos valores digitados.
		 * 
		 */
		
		Scanner test = new Scanner(System.in);
		
		int x = test.nextInt();
		int soma = 0; 
		
		while (x !=0) {
			soma += x;  		//soma = soma + x;
			x = test.nextInt();
		}
		
		System.out.printf("Soma dos valores: %d%n", soma);
		
		test.close();
	}

}
