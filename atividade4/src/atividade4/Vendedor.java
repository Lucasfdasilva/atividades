package atividade4;

public class Vendedor extends Funcionario {
	 private int vendas;
     private Gerente gerenteRespon;

 
 
 public Vendedor(String nome, int idade, char sexo, int rg, int v, Gerente g){
     this.vendas = v;
     this.gerenteRespon = g;
     this.setSalario(v*100); 
      this.setNome(nome);
     this.setIdade(idade);
     this.setSexo(sexo);
     this.setRg(rg);

     }
            
     
 public void venderProduto(){
     this.vendas ++;
 }   
     
     
 public int getVendas() {
     return vendas;
 }

 public void setVendas(int vendas) {
     this.vendas = vendas;
 }

 public Gerente getGerenteRespon() {
     return gerenteRespon;
 }

 public void setGerenteRespon(Gerente gerenteRespon) {
     this.gerenteRespon = gerenteRespon;
 }
 public void detalhes(){
     System.out.println("----------------------------------------");
     System.out.println("Vendedor: " + this.getNome());
     System.out.println("Idade: " + this.getIdade());
     System.out.println("Sexo: " + this.getSexo());
     System.out.println("Gerente responsável: " + this.gerenteRespon.getNome());
     System.out.println("Suas vendas: " + this.getVendas());
     System.out.println("Seu salário: "  + this.getSalario());
     System.out.println("----------------------------------------");
 }    
}
