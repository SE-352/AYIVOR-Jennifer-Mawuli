/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("universitePU");
        EntityManager em=emf.createEntityManager();
        
//        EntityTransaction tx=em.getTransaction();
//        tx.begin();
//        Etudiant etudiant1=new Etudiant("AYIVOR", "Jennifer", "mawuli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
//        Etudiant etudiant2=new Etudiant("AYI", "Jenni", "mawuli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
//        Etudiant etudiant3=new Etudiant("fofo", "rene", "rene.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
//        Etudiant etudiant4=new Etudiant("momo", "mimi", "mawuli.ayivor@ipnetinstitute.com", "Lomé-TOGO", "70432968");
//        em.persist(etudiant1);
//        em.persist(etudiant2);
//        em.persist(etudiant3);
//        em.persist(etudiant4);
//        tx.commit();
        
    }
}
