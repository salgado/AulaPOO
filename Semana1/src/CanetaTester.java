
public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testar caneta
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.carga=100;
		c1.ponta = 0.5f;
		c1.tampado = true;
		
		c1.status();
		c1.rabiscar();
		
		c1.destampar();
		c1.rabiscar();
				

	}

}
