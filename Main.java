package br.com.escola;

public class Main {
    
    public static void main (String[] args){
        Pessoa p = new Pessoa("Nielson", "027.xxx.xxx.xx", 0001);
        System.out.println(p.getNome());
        p.setNome("Ana Beatriz");
        System.out.println(p.getNome());
    } 
}
