/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Time Store
 */
public class BookManager {

    static EntityManagerFactory factory;
    static EntityManager entityManager;

    public static void main(String[] args) {
        begin();

        //create();
        //update();
        //find();
        query();
        
        end();
    }

    public static void update() {
        Book existBook = new Book();
        existBook.setBookId(1);
        existBook.setTitle("Effective Java (2nd edition)");
        existBook.setAuthor("Joshua Bloch");
        existBook.setPrice(Float.valueOf(19));
    
        entityManager.merge(existBook);
    }
    
    public static void find() {
        Integer primaryKey = 2;
        Book book = entityManager.find(Book.class, primaryKey);
        
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
    }
    
    private static void query() {
        String jpql = "Select b From Book b Where b price < 30";
        Query query1 = entityManager.createQuery(jpql);

        @SuppressWarnings("unchecked")
        List<Book> listBooks = query1.getResultList();
        
        for (Book aBook : listBooks) {
            System.out.println(aBook.getTitle() + ", " + aBook.getAuthor() + ", " + aBook.getPrice());
        }
    }
    
    private static void remove() {
        Integer primaryKey = 3;
        Book reference = entityManager.getReference(Book.class, primaryKey);
        entityManager.remove(reference);
    }
    
    public static void create() {
        Book newBook = new Book();
        newBook.setTitle("Thinking in Java");
        newBook.setAuthor("Bruce Eckel");
        newBook.setPrice(Float.valueOf(45));
        entityManager.persist(newBook);
    }

    public static void begin() {
        factory = Persistence.createEntityManagerFactory("jpaPU");
        entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
    }

    public static void end() {
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
