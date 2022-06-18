import java.util.Scanner;

public class Aula003_EntradaDados {

	public static void main(String[] args) {
		
			//Scanner para numero inteiro
		Scanner num1 = new Scanner(System.in); 		//inicia o scan num
		int numero1;								//cria variavel numero
		numero1 = num1.nextInt(); 					//atribui o que leu de entrada para a variavel numero
		System.out.printf("Você digitou: %d %n%n", numero1);
		//-----------------------------------------------------------------------------------
		
		
			//Scanner para String
		Scanner palavra = new Scanner(System.in);	//inicia scan palavra
		String test;								//cria variavel test
		test = palavra.next();						//atribui o que leu de entrada para a variavel test
		System.out.printf("Você digitou: %s %n%n", test);
		//-----------------------------------------------------------------------------------
		
			//Scanner para double
		Scanner num2 = new Scanner(System.in);		//inicia scan num2
		double numero2;								//cria variavel double numero2
		numero2 = num2.nextDouble();				//atribui o que leu de entrada para a variavel numero2
		System.out.printf("Você digitou: %s %n%n", numero2);
		//-----------------------------------------------------------------------------------
	
			//Scanner para caracter
		Scanner caracter = new Scanner(System.in);	//inicia scan caracter
		char caract;								//cria variavel char caract
		caract = caracter.next().charAt(0);			//atribui o que leu de entrada para a variavel caract na posiçaõ informada
		System.out.printf("Você digitou: %s %n%n", caract);
		//-----------------------------------------------------------------------------------
		
			//ler varias entradas em uma unica linha
		Scanner varios = new Scanner(System.in);
		
		String x = varios.next();
		int y = varios.nextInt();
		double z = varios.nextDouble();
		
		System.out.println("Dados Digitados na ordem: String, int e double: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//-----------------------------------------------------------------------------------
		
			// ler até a quebra de linha
		Scanner quebralinha = new Scanner(System.in);
		
		String s1,s2,s3;
		
		s1 = quebralinha.nextLine(); //nextline pega a linha toda, ate quebrar ela com o enter.
		s2 = quebralinha.nextLine(); 
		s3 = quebralinha.nextLine(); 
		System.out.println("Dados Digitados em ordem:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//-----------------------------------------------------------------------------------
		
		num1.close();		// fecha scan num (int)
		palavra.close();	// fecha scan palavra (string)
		num2.close();		// fecha scan num2 (double)
		caracter.close();	// fecha scan caracter (caracter)
		varios.close();		// fecha scan varios (varios em uma linha)
		quebralinha.close();// fecha scan quebralinha (até quebrar a linha)
	}

}
