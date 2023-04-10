/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projfinalcursoemvideo;

/**
 *
 * @author alexs
 */
public class ProjFinalCursoEmVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1");
        video[1] = new Video("Aula 2");
        video[2] = new Video("Aula 3");
        
        System.out.println("####################");
        System.out.println(video[0].toString());
        System.out.println("####################");
        
        System.out.println("####################");
        Student student[] = new Student[2];
        student[0] = new Student ("Ana", 22, "F", 12345);
        student[1] = new Student("Joao", 25, "M", 54321);
        System.out.println("####################");
        
        System.out.println("####################");
        System.out.println(student[0].toString());
        student[1].watchOneMore();
        System.out.println(student[1].toString());
        System.out.println("####################");
        
        View teste = new View(student[0], video[1]);
        System.out.println("####################");
        teste.review();
        teste.review(99.8f);
        teste.review(5);
        System.out.println("####################");
        
        System.out.println(student[0].toString() + "\n" +video[1].toString());
        System.out.println("####################");
        System.out.println(teste.toString());
        
    }
    
}
