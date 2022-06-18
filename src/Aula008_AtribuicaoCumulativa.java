/*	
	Operadora de telefonia cobra 50 reais por um plano de 100 min. Cada min a mais custa 2 reais.
	Faça um programa para calcular o valor da conta, baseado nos minutos usados.


	 Operadores cumulativos:
		a += b;   ==   a = a + b; 
		a -= b;   ==   a = a - b; 
		a *= b;   ==   a = a * b; 
		a /= b;   ==   a = a / b; 
		a %= b;   ==   a = a % b; 
*/


import java.util.Scanner;

public class Aula008_AtribuicaoCumulativa {

	public static void main(String[] args) {

		
		Scanner minutos = new Scanner(System.in);
		
		
		System.out.println("informe os minutos usados.");
		int min = minutos.nextInt();						//atribui a entrada do teclado a variavel
		
		double conta = 50.0;								//valor inicial da conta
	
		if(min > 100) {
			conta += (min - 100)*2.0;						//calcula o excedente da conta (Operador cumulativo +=)
		}
		
		System.out.printf("Valor da conta: %.2f", conta);	// imprime o valor da conta
		
		
		minutos.close();

	}

}
