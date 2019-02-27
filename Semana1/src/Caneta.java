
public class Caneta {
	//definição dos atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampado;
	
	//criação dos metodos
	void rabiscar()
	{
		if(tampado)
		{
			System.out.println("Erro! Não posso escrever pois estou tampado.");
		}
		else
		{
			System.out.println("Ok, estou rabiscando....");
		}
		
	}
	
	void tampar(){
		tampado = true;
	}
	
	void destampar(){
		tampado = false;
	}
	
	void status()
	{
		System.out.println("Eu sou uma caneta modelo=" + modelo);
		System.out.println("Cor:" + cor);
		System.out.println("Ponta: " + ponta);
		System.out.println("Carga: " + carga);
		System.out.println("Tampado: " + tampado);
	}

}
