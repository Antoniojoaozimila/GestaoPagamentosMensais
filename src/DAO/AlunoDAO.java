/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import java_beans.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Antonio Joao Zimila
 */
public class AlunoDAO {
    
    //    @Override
    @SuppressWarnings("null")
    public  String create(Aluno estudante) {
        
        EntityManager entityManager= ConnectionFactory.getConnection();
        
        try{
           entityManager.getTransaction().begin();
               entityManager.persist(estudante);
           
           entityManager.getTransaction().commit();
           return estudante.getAluno_nome()+" adicionado";
        }catch(Exception ex){
            entityManager.getTransaction().rollback();
           throw new RuntimeException("Erro ao Salvar/Actualizar Estudante",ex);
        }finally{
            entityManager.close();
        }
    }
    
      public  String update(Aluno estudante) {
        
        EntityManager entityManager= ConnectionFactory.getConnection();
        
        try{
           entityManager.getTransaction().begin();
           
         //  if(estudante.getId()==null){
           //    entityManager.persist(estudante);
          // }else
               entityManager.merge(estudante);
           
           entityManager.getTransaction().commit();
           return estudante.getAluno_nome()+" actualizado com sucesso";
        }catch(Exception ex){
            entityManager.getTransaction().rollback();
           throw new RuntimeException("Erro ao Salvar/Actualizar Estudante",ex);
        }finally{
            entityManager.close();
        }
    }

   // @Override
    public Aluno search(int id) {
       
        EntityManager entityManager= ConnectionFactory.getConnection();
        Aluno estudante=null;
        
       try{
           estudante=entityManager.find(Aluno.class, id);
       }catch(Exception ex){
           throw new RuntimeException(ex);
       }finally{
           entityManager.close();
       }
       
       return estudante;
    }

    //@Override
    public List<Aluno> list(){
        
        EntityManager entityManager= ConnectionFactory.getConnection();
       // List<Aluno> estudantes=null;
        Query  estudantes=entityManager.createQuery("select aluno from Aluno aluno");
         ArrayList<Aluno> aluno;

        try{
         aluno=( ArrayList<Aluno>) estudantes.getResultList();
         
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }finally{
//            entityManager.getTransaction().commit();
            entityManager.close();
        }
        return aluno;
    }

   // @Override
    public Aluno delete(int id) {
        EntityManager entityManager= ConnectionFactory.getConnection();
           Aluno estudante=null;
        
        try{
            estudante=entityManager.find(Aluno.class, id);
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
