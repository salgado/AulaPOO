package br.org.lasalle.semana2;

import java.util.Scanner;

public class Converte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = input.nextInt();
		
		String meuHex = Integer.toHexString(num);
		
		System.out.println("Convertido para Hexadecimal:" + meuHex);
		
		String meuBin = Integer.toBinaryString(num);
		System.out.println("Convertido para Binario:" + meuBin);
		
	}

}
