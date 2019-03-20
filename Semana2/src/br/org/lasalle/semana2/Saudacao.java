package br.org.lasalle.semana2;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entre com um nome:");
		
		Scanner input = new Scanner(System.in);
		String nome = input.next();
		
		System.out.println("Boa noite, " + nome + "!!!");
		
		input.close();
	}

}
