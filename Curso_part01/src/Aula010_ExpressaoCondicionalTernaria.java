
public class Aula010_ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		/*
		 * Expressao opcional ao if-else quando se deseja decidir um valor com base em uma condição
		 * 
		 * SINTAXE : 
		 * 		
		 * 		( CONDIÇÃO )? Valor_se_Verdadeiro : Valor_Se_Falso
		 * 
		 * EXEMPLO:
		 * 		(2 > 4) ? 50 : 80    ----->> 80, PORQUE A CONDIÇAO ERA FALSA.
		 *		(10 != 3) ? "MARIA" : "ALEX"   ------>> MARIA, PORQUE A CONDIÇAO ERA VERDADEIRA 
		 *
		 */
		
		
		//USANDO IF ELSE
		double preco1 = 34.5;
		double desconto1;
		
		if (preco1 < 20) {
			desconto1 = preco1 * 0.1;
		} 
		else {
			desconto1 = preco1 * 0.05;
		}
		
		System.out.println(desconto1);
		
		
		// USANDO CONDIÇÃO TERNARIA
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
		System.out.println(desconto2);
	}

}
