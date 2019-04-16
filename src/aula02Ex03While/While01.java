/**
 * 
 */
package aula02Ex03While;

import java.util.Scanner;

/**
 * @author A0049659
 *
 */
public class While01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password: xxxx");
		int n = sc.nextInt();
		
		while (n != 2002){
			System.out.println("Senha inválida!");
			System.out.println("Enter Password: xxxx");
			n = sc.nextInt();
		}
		System.out.println("Acesso permitido.");
		sc.close();
	}
	
}
