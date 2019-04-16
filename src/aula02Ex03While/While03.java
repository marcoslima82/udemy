/**
 * 
 */
package aula02Ex03While;

import java.util.Scanner;

/**
 * @author A0049659
 *
 */
public class While03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int gas = 0, alc = 0, die = 0, tot = 0;
		
		System.out.println("Informe opção: ");
		System.out.println("1 - Alcool \n"
				+ "2 - Gasolina \n"
				+ "3 - Diesel \n"
				+ "4 - Total \n");
		int op = sc.nextInt();
		
		loop: while (op > 0 || op < 5){
			switch(op){
			case 1:
				alc = alc + 1;
				break;
			case 2:
				gas = gas + 1;
				break;
			case 3:
				die = die + 1;
				break;
			case 4:
				tot = alc + gas + die;
				System.out.println("Muito Obrigado");
				System.out.println("Alcool: " + alc);
				System.out.println("Gasolina: " + gas);
				System.out.println("Diesel: " + die);
				System.out.println("Total: " + tot + "\n");
				break loop;
			default:
				System.out.println("Opção inválida");
			}
			System.out.println("Informe opção: ");
			System.out.println("1 - Alcool \n"
					+ "2 - Gasolina \n"
					+ "3 - Diesel \n"
					+ "4 - Total \n");
			op = sc.nextInt();
		}
		
		sc.close();
	}

}
