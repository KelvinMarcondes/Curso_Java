import java.util.Locale;

public class Aula001_SaidaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		//muda para o formato de pontuação da localidade escolhida	
		
		int y = 32;							//atribui valor inicial int
		double x = 10.43675;
		String nome = "Maria";				//string sempre em aspas
		int idade = 31;						//atribui valor inicial	int
		double renda = 4000.00;				//atribui valor inicial double
		
		//%f = ponto flutuante ||| %d = inteiro ||| %s = texto ||| %n = quebra de linha
	
		System.out.println("Olá Mundo!");	//println - imprime e quebra linha
		System.out.println("Bom dia!!");
	
		System.out.println(y);				//mostra o valor da variavel y
		
		System.out.println(x);				//mostra o double x completo
		System.out.printf("%.4f\n", x);		//mostra o double x arredondado na 4° casa decimal
		System.out.printf("%.2f\n", x);		//mostra o double x arredondado na 2° casa decimal
		
		System.out.println("Resultado = " + x + " Metros"); 	//Concatenação de texto e variavel (x) 
		System.out.printf("Resultado = %.2f metros%n", x);		//concatenação de texto com printf arredondando 2 casas decimais de x
		System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome, idade, renda);	//concatenação de variaveis diferentes e texto
	}

}
