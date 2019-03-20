package br.org.lasalle.semana2;

import java.util.Scanner;

public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com nome 1");
		String nome1 = input.next();
		
		System.out.println("Entre com nome 2");
		String nome2 = input.next();
		
		if(nome1.equals(nome2))
		{
			System.out.println("São iguais!");
		}
		else
		{
			System.out.println("São diferentes!");
		}	
		
	}

}
