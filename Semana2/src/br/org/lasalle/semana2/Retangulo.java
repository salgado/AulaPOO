package br.org.lasalle.semana2;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lin, col;
		int flin, fcol;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com numero de colunas:");
		fcol = input.nextInt();
		
		System.out.println("Entre com numero de linhas:");
		flin = input.nextInt();
		
		for(lin =1; lin<=flin; lin++)
		{
			for(col=1; col<=fcol;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
