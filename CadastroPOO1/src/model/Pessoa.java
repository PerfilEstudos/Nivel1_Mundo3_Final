/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
/**
 *
 * @author Note Pessoal
 */
public class Pessoa {
    //Atributos
    private int Id;
    private String Nome;
    
    //Construtor    
    public Pessoa(int Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
    }
    
    //Métodos 
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
       
    //Métodos Exibir
    
    
    
}
