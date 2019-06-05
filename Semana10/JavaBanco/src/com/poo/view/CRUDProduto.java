package com.poo.view;

import java.util.Scanner;

import com.poo.dao.ProdutoDAO;
import com.poo.model.Produto;

public class CRUDProduto {

	private void create()
	{
		try {
			
			Produto prod = new Produto();
			ProdutoDAO dao = new ProdutoDAO();
			
			System.out.println("Entre com a descrição do produto:");
			Scanner sc = new Scanner(System.in);
			prod.setNome(sc.nextLine());
			
			System.out.println("Entre com o preço do produto:");
			prod.setPreco(sc.nextDouble());;
			
			System.out.println("Entre com o qtdestoque do produto:");
			prod.setQtdEstoque(sc.nextInt());
			
			dao.create(prod);

		} finally {
			// TODO: handle finally clause
			System.out.println("Fim inserção!");
		}
		

	}
	
	private void read()
	{
		ProdutoDAO dao = new ProdutoDAO();
		
		for (Produto p : dao.read()) {
			
			System.out.println("***********************************");
			System.out.println("Codigo: "+ p.getCodigo());
			System.out.println("Nome: "+ p.getNome());
			System.out.println("Preço: "+ p.getPreco());
			System.out.println("QtdEstoque: "+ p.getQtdEstoque());
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CRUDProduto crud = new CRUDProduto();		
		
		crud.create();
		crud.read();
		
		
	}

}
