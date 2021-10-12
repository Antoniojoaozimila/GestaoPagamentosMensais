/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConnectionFactory;
import java.util.List;
import java_beans.Classe_Aluno;
import javax.persistence.EntityManager;

/**
 *
 * @author Antonio Joao Zimila
 */
public class Classe_DAO {
    
        //    @Override
    @SuppressWarnings("null")
    public  String create(Classe_Aluno classe) {
        
        EntityManager entityManager= ConnectionFactory.getConnection();
        
        try{
           entityManager.getTransaction().begin();
               entityManager.persist(classe);
           
           entityManager.getTransaction().commit();
           return classe.getClasse_nome()+" adicionado";
        }catch(Exception ex){
            entityManager.getTransaction().rollback();
           throw new RuntimeException("Erro ao Salvar/Actualizar Estudante",ex);
        }finally{
            entityManager.close();
        }
    }
    
      public  String update(Classe_Aluno classe) {
        
        EntityManager entityManager= ConnectionFactory.getConnection();
        
        try{
           entityManager.getTransaction().begin();
           
         //  if(estudante.getId()==null){
           //    entityManager.persist(estudante);
          // }else
               entityManager.merge(classe);
           
           entityManager.getTransaction().commit();
           return classe.getClasse_nome()+" actualizado com sucesso";
        }catch(Exception ex){
            entityManager.getTransaction().rollback();
           throw new RuntimeException("Erro ao Salvar/Actualizar Estudante",ex);
        }finally{
            entityManager.close();
        }
    }

   // @Override
    public Classe_Aluno search(int id) {
       
        EntityManager entityManager= ConnectionFactory.getConnection();
        Classe_Aluno estudante=null;
        
       try{
           estudante=entityManager.find(Classe_Aluno.class, id);
       }catch(Exception ex){
           throw new RuntimeException(ex);
       }finally{
           entityManager.close();
       }
       
       return estudante;
    }

    //@Override
    public List<Classe_Aluno> list(){
        EntityManager entityManager= ConnectionFactory.getConnection();
        List<Classe_Aluno> estudantes=null;
        
        try{
            estudantes=entityManager.createQuery("from Aluno").getResultList();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }finally{
            entityManager.close();
        }
        return estudantes;
    }

   // @Override
    public Classe_Aluno delete(int id) {
        EntityManager entityManager= ConnectionFactory.getConnection();
           Classe_Aluno estudante=null;
        
        try{
            estudante=entityManager.find(Classe_Aluno.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(estudante);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            entityManager.getTransaction().rollback();
            throw new RuntimeException(ex);
        }finally{
            entityManager.close();
        }
        return estudante;
    }
    
    
}
