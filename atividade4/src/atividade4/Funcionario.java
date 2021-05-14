package atividade4;

public class Funcionario extends Pessoa {
	 private String empresa;
     private int idContrato;
     private float salario;
     
     public void Aumento(){
         
     }

 public String getEmpresa() {
     return empresa;
 }

 public void setEmpresa(String empresa) {
     this.empresa = empresa;
 }

 public int getIdContrato() {
     return idContrato;
 }

 public void setIdContrato(int idContrato) {
     this.idContrato = idContrato;
 }

 public float getSalario() {
     return salario;
 }

 public void setSalario(float salario) {
     this.salario = salario;
 }
}
