package com.poo.controller;

import java.util.Scanner;

import com.poo.dao.ProdutoDAO;
import com.poo.model.Produto;

public class ProdutoController {

	public void create(Produto produto)
	{
		try {
			
			ProdutoDAO dao = new ProdutoDAO();
			
			dao.create(produto);

		} finally {
			// TODO: handle finally clause
			System.out.println("Fim inserção!");
		}
		

	}
	

}
