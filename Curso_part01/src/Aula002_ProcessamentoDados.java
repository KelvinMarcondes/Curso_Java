
public class Aula002_ProcessamentoDados {

	public static void main(String[] args) {
		
		double b = 6.0;
		double B = 8.0;
		double h = 5.0;
		double area = (b + B)/2.0 * h;
		System.out.printf("Calculo trapezio: %.2f %n%n", area);
		
		//-------------------------------------------------------------------------------------------
		System.out.printf("divisao de inteiros utilizando o casting%n");
		int num1 = 5;
		int num2 = 2;
		double resultado;

		resultado = num1 / num2;
		System.out.printf("Resultado da divisao sem casting: %.2f %n", resultado);  //nao conseguiu converter em float o resultado
		resultado = (double)num1 / num2;
		System.out.printf("Resultado da divisao com casting: %.2f %n%n", resultado);  //faz o casting (conversao explicita dos valores)
		
		//--------------------------------------------------------------------------------------------
		System.out.println("atribuir novo tipo utilizando casting");
		double aa = 5.1324;
		int bb = (int) aa; //passou o valor de aa para bb, desconsiderando todas casas decimais
		
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
