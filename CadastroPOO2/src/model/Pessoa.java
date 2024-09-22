
package model;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private int id;
    private String nome;
    
    // construtor
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Método exibir
    public void exibir(){
        // Verificar toString()
        //return (this.id + "\t" + this.nome);
        System.out.print("id: "+this.id + "\n" + "Nome: " + this.nome + "\n");
    }
}