package curso17_04;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor, soma = 0, media,resultado;

		
		for (int i=0; i <= 4; i++) {
			System.out.print("Informe um número: ");
			valor= ler.nextInt();
			soma=soma+valor;
			System.out.println( "o valor da soma " + soma);
		}
			
			
			media = soma/5;
			System.out.println( "o valor da media " + media);
			}
}


