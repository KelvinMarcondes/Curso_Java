import java.util.Scanner;

public class Aula012_For {

	public static void main(String[] args) {
		/*
		 * Estrutura de controle que repete um bloco de codigo para um certo intervalo de valores.
		 * Quando usar: quando se sabe previamente a quantidade de repetiçoes, ou o intervalo de valores.
		 * 
		 * 
		 * SINTAXE:
		 * 		for(inicio; condição; incremento){
		 * 		comando 1
		 * 		comando 2
		 * 		...
		 * 		}
		 * 
		 * SITUAÇÃO PROBLEMA:
		 * fazer um programa que leia um valor inteiro N e depois N numeros inteiros. Ao final mostre a soma
		 * dos N numeros lidos.
		 */
		
		Scanner S = new Scanner(System.in);
		
		int N = S.nextInt();
		int soma = 0;
		
		for (int i=0; i < N; i++) {		// int i == o contador
			int x = S.nextInt();		//x rebece a ultima entrada
			soma += x;					// soma o valor atual com a ultima entrada
		}
		
		System.out.println(soma);
		
		S.close();
		
		
		
	

	}

}
