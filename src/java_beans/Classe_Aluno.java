/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_beans;

/**
 *
 * @author Antonio Joao Zimila
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Classe_Aluno implements Serializable  {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int Id;
    private String classe_nome;
    private double preco;

    public Classe_Aluno(String classe_nome, double preco) {
        this.classe_nome = classe_nome;
        this.preco = preco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getClasse_nome() {
        return classe_nome;
    }

    public void setClasse_nome(String classe_nome) {
        this.classe_nome = classe_nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Classe_Aluno{" + "Id=" + Id + ", classe_nome=" + classe_nome + ", preco=" + preco + '}';
    }
    
    
    
    
    
    
}
