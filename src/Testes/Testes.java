/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import DAO.AlunoDAO;
import java.util.List;
import java_beans.Aluno;

/**
 *
 * @author Antonio Joao Zimila
 */
public class Testes {
    
   static  AlunoDAO a =new AlunoDAO();
    static Aluno a1 = new Aluno("Nilza","11-classe",18);
    
    public static void main(String[] args){
     //  a.create(a1);
       
     //a.delete(1);
     for(Aluno todos:a.list()){
         System.out.println(todos);
         
     }
    }
    
   }
