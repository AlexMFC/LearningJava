
package criandoclasseseobjetos;



public class CriandoClassesEObjetos {


    
    public static void main(String[] args) {
       Caneta caneta1 = new Caneta(); //instanciado
       caneta1.modelo = "Bic Cristal";
       caneta1.cor = "Azul";
       //caneta1.ponta = 0.7f;
       caneta1.carga = 80; //pode ser modificado pois esta dentro de uma classe que esta utilizando a classe caneta
       //caneta1.tampada = true;
       caneta1.destampar();
       caneta1.status();
       
       caneta1.setModelo("Modelo desconhecido");
        System.out.println(caneta1.getModelo());
        
       
        System.out.println(caneta1.getPonta());
        caneta1.setPonta(0.9f);
        System.out.println(caneta1.getPonta());
    }  
 
      
        
    
}

    
