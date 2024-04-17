package curso17_04;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.print("Informe um número: ");
		valor= ler.nextInt();
		
		for (int i=0; i <= valor; i++) {
			
			if (i%2!=0) {
				System.out.println("Os números impares são: " +i);
			}
		ler.close();
		}

	}

}
