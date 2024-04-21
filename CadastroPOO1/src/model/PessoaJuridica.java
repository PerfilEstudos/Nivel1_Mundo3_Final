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
public class PessoaJuridica extends Pessoa {
    //Atributos
    private String CNPJ;
    
    //Métodos
    public PessoaJuridica(int Id, String Nome) {
        super(Id, Nome);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    //Métodos(Revisar se precisa retirar)
    public void inserirCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }    
}
