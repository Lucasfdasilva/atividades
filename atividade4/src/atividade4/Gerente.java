package atividade4;

public class Gerente extends Funcionario {
	private Vendedor vendedorResp;
    private int vendas;


public Gerente(String nome, int idade, char sexo, int rg){
    this.setNome(nome);
    this.setIdade(idade);
    this.setSexo(sexo);
    this.setRg(rg);
}



//Métodos
    
public void defVendas(){
    this.vendas = vendedorResp.getVendas();
}
public void defSalario(){
    this.setSalario(this.getVendas()*200); 
}
    

public Vendedor getVendedorResp() {
    return vendedorResp;
}

public void setVendedorResp(Vendedor vendedorResp) {
    this.vendedorResp = vendedorResp;
}

public int getVendas() {
    return vendas;
} 

public void detalhes(){
    System.out.println("----------------------------------------");
    System.out.println("Gerente: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
    System.out.println("Responsável pelo vendedor: " + this.vendedorResp.getNome());
    System.out.println("Suas vendas: " + this.getVendas());
    System.out.println("Seu salário: "  + this.getSalario());
    System.out.println("----------------------------------------");
}
}
