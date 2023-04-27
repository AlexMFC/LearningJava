/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopoo;

/**
 *
 * @author alexs
 */
public class Read {
    private Person person;
    private Books book;
    
    public void status(Person p, Books b){
        b.defReader(p.getName());
        System.out.println(p.getName() + " esta lendo o livro " + b.getTitle() +
                            "\nPagina Atual: " + b.getCurrPage() + " de " + b.getPageTotal()); 
    }
}
