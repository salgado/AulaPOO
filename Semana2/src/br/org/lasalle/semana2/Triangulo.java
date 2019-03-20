package br.org.lasalle.semana2;

import java.util.Scanner;

public class Triangulo {
	
	static float calcAreaTriangulo(float base, float altura)
	{
		return (base*altura)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Base:");
		float base = input.nextFloat();
		
		System.out.println("Altura:");
		float altura = input.nextFloat();
		
		//calcular a area
		//float area = (base*altura) /2;
		float area = calcAreaTriangulo(base, altura);
		
		System.out.println("Area = " + area);
	}

}
