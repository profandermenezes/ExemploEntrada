package classes;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		/*
		 *  Instanciando o "leitor". Neste exemplo a leitura
		 *  será feita no console (System.in)
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		
		// Realizando a leitura da próxima String disponível na linha
		String nome = scanner.next();
		
		/*
		 *  Artifício para garantir que todo o restante da
		 *  linha seja processada
		 */
		scanner.nextLine();
		
		//System.out.println("O nome digitado foi " + nome);
		
		System.out.println("Digite a idade:");
		
		/*
		 *  Realizando a leitura do próximo inteiro disponível na linha.
		 *  Teremos uma função "next" para todos os tipos primitivos.
		 */
		int idade = scanner.nextInt();
		
		scanner.nextLine();
		
		//System.out.println("A idade é " + idade);
		
		System.out.println("Digite o email:");
		String email = scanner.nextLine();
		
	}

}
