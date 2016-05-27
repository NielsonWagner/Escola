
package br.com.escola;

//Criação da Classe Pessoa
public class Pessoa {
    //Criação dos Atributos da Classe
    private String nome;
    private String CPF;
    private int matricula;
    
    //criação do Contrutor da Classe
    public Pessoa (String nome, String CPF, int matricula){
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
    }
    public String getNome(){
        
    return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}

