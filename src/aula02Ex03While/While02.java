package aula02Ex03While;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de x: ");
		int x = sc.nextInt();
		
		System.out.println("Entre com o valor de y: ");
		int y = sc.nextInt();
		
		while ( x != 0 && y != 0) {
			if (x > 0 && y > 0){
				System.out.println("Primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Segundo");
			}
			System.out.println("Entre com o valor de x: ");
			x = sc.nextInt();
			System.out.println("Entre com o valor de y: ");
			y = sc.nextInt();			
		}
		sc.close();
	}

}
