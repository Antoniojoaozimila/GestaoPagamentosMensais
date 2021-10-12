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
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int    Id;
    private String aluno_nome;
    private String aluno_classe;
    private double preco;

    public Aluno(String aluno_nome, String aluno_classe, double preco) {
        this.aluno_nome = aluno_nome;
        this.aluno_classe = aluno_classe;
        this.preco = preco;
    }
    public Aluno(){}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

   
    /**
     * @return the aluno_nome
     */
    public String getAluno_nome() {
        return aluno_nome;
    }

    /**
     * @param aluno_nome the aluno_nome to set
     */
    public void setAluno_nome(String aluno_nome) {
        this.aluno_nome = aluno_nome;
    }

    /**
     * @return the aluno_classe
     */
    public String getAluno_classe() {
        return aluno_classe;
    }

    /**
     * @param aluno_classe the aluno_classe to set
     */
    public void setAluno_classe(String aluno_classe) {
        this.aluno_classe = aluno_classe;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Id=" + Id + ", aluno_nome=" + aluno_nome + ", aluno_classe=" + aluno_classe + ", preco=" + preco + '}';
    }
    
    
       
}
