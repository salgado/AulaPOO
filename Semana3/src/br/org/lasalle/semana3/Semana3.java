package br.org.lasalle.semana3;

import java.util.Scanner;

public class Semana3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(input.nextLine());
		
		System.out.println("Entre com o nome:");
		aluno.setNome(input.nextLine());
		
		System.out.println("Entre com o curso:");
		aluno.setCurso( input.nextLine() );
		
		System.out.println("Entre com a disciplina 1:");
		Disciplina disciplina = new Disciplina();
		
		disciplina.setDescricao(input.nextLine());
		disciplina.setTurno("noite");
		
		aluno.disciplinas.add(disciplina);
		
		aluno.mostrarLog();
		

	}

}
