package IfandElsy;

import java.util.Scanner;

public class MeuPrimeiroCodigoIfeElse {

	public static void main(String[] args) {

		
		
		Scanner escrever = new Scanner(System.in);
		
		System.out.println("Formulário para solicitação do Passaporte");
		System.out.println("digite seu nome completo");
		String nome = escrever.next();
		
		System.out.println("digite seu cpf");
		String cpf = escrever.nextLine();
		escrever.nextLine();
		
		System.out.println("digite seu endereço");
		String endereço =escrever.nextLine();
		
		System.out.println("digite sua cidade");
		String cidade = escrever.nextLine();
		
		System.out.println("Digite sua idade ?");
		int idade = escrever.nextInt();
		
		if (idade  >=23) {
			System.out.println("voce pode tirar seu Passaporte");
			
		} else {
			System.out.println("voce não pode tirar o Passaporte sem um reponsavél");

		}
		
		
		

	}

}
