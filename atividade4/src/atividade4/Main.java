package atividade4;

public class Main {

	public static void main(String[] args) {
		 Gerente g1 = new Gerente("Lucas",19,'M',9328);
	        Vendedor p1 = new Vendedor("Robinho",17,'M',9832,7,g1); 
	        g1.setVendedorResp(p1);
	        g1.defVendas();
	        g1.defSalario();
	        g1.detalhes();
	        p1.detalhes();

	}

}
