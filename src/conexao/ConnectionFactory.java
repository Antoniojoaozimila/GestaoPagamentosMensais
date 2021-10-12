/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antonio Joao Zimila
 */
public class ConnectionFactory {
     private static EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("alunos");
    
    public static EntityManager getConnection(){
        return fabrica.createEntityManager();
    }
    
}

    

