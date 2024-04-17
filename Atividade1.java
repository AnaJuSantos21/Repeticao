package curso17_04;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe seu nome: ");
		    nome = ler.next();
		    System.out.println("O seu nome é: " +nome);

	}
		ler.close();
  }
}
