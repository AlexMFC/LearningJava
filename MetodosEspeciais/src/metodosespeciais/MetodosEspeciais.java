
package metodosespeciais;


public class MetodosEspeciais {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setMarca("BIC");
        c1.setModelo("Crystal");
        c1.setPonta(0.7f);
        c1.setCor("Verde");
        c1.setTampada(true);
        c1.setCarga(87);
        
        c1.status();
        c1.escrever();
        c1.setTampada(false);
        c1.escrever();
        
        Caneta c2 = new Caneta();
        c2.status();
        
        Caneta c3 = new Caneta();
        c3.status();
    }
    
}
