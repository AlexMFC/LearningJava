
package criandoclasseseobjetos;



public class CriandoClassesEObjetos {


    
    public static void main(String[] args) {
       Caneta caneta1 = new Caneta(); //instanciado
       caneta1.cor = "azul";
       caneta1.ponta = 0.5f;
       caneta1.carga = 90;
       caneta1.modelo = "BIC";
       
       caneta1.tampar();
       caneta1.status();
       caneta1.rabiscar();
       
       //caneta1.destampar();
       //caneta1.status();
       //caneta1.rabiscar();
       
       
       Caneta caneta2 = new Caneta();
       caneta2.modelo = "Outros";
       caneta2.carga = 100;
       caneta2.cor = "vermelho";
       caneta2.ponta = 0.8f;
       caneta2.tampada = false;
       
       caneta2.status();
       caneta2.rabiscar();
    }
    
}
