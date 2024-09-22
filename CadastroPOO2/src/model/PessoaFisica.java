
package model;

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable {
    
    private String cpf;
    private int idade;
    
    //Constutor
    public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void exibir(){
        System.out.print("\n"+"id: "+getId()+"\nNome: "+getNome()+ "\nCPF: "+this.cpf + "\n" + "Idade: " + this.idade + "\n");
    }
}