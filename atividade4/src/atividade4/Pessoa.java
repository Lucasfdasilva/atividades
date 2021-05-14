package atividade4;

public class Pessoa {
	 private String nome;
     private int idade;
     private char sexo;
     private int rg;
     
 public void fazerAniv(){
     this.idade ++;
 }  

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public int getIdade() {
     return idade;
 }

 public void setIdade(int idade) {
     this.idade = idade;
 }

 public char getSexo() {
     return sexo;
 }

 public void setSexo(char sexo) {
     this.sexo = sexo;
 }

 public int getRg() {
     return rg;
 }

 public void setRg(int rg) {
     this.rg = rg;
 }

}
