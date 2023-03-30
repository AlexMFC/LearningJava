/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author alexs
 */
public class Fight  {
   private Lutador challenger;
   private Lutador challenged;
   private int rounds;
   private boolean approved;

    public void scheduleFight(Lutador challenger, Lutador challenged){
        //so pode ser marcada entre lutadores da mesma categoria
        //desafiado e desafiantes sao lutadores diferentes
        if (!challenger.getCategory().equals(challenged.getCategory())){
            System.out.println("Lutadores sao de categorias diferentes");
            this.setApproved(false);
            this.setChallenged(null);
            this.setChallenger(null);
        }
        
        if(challenger.getName() == challenged.getName()){
            System.out.println("Lutador nao pode lutar com ele mesmo");
        } else {
            this.setApproved(true);
            this.setChallenged(challenged);
            this.setChallenger(challenger);
            System.out.println("## Luta marcada ##");
        }
        
    }
            
    
        
        
        //so pode acontecer se estiver aprovada
        //so pode ter como resultado vencer ou empate
    
    
    public void fight(){
        if (this.isApproved()){
            challenger.introduce();
            challenged.introduce();
            int winner = (int) Math.round(Math.random()*2-0+0);
            System.out.println(winner);
            switch(winner){
                case 0:
                    System.out.println("Luta empatada");
                    challenged.drawfight();
                    challenger.drawfight();
                    System.out.println("Desafiante " + challenger.getName() + " agora tem "+
                                        challenger.getDraws() + " empates\n\n" +
                                        "Desafiado " + challenged.getName() + " agora tem " +
                                        challenged.getDraws() + " empates");
                    break;
                
                case 1:
                    System.out.println("Desafiado ganhou");
                    challenged.winFight();
                    challenger.loseFight();
                    System.out.println("Desafiante " + challenger.getName() + " agora tem "+
                                        challenger.getLosses() + " derrotas\n\n" +
                                        "Desafiado " + challenged.getName() + " agora tem " +
                                        challenged.getVictories() + " vitorias");
                    break;
                
                case 2:
                    System.out.println("Desafiante ganhou");
                    challenger.winFight();
                    challenged.loseFight();
                    System.out.println("Desafiante " + challenger.getName() + " agora tem "+
                                        challenger.getVictories()+ " vitorias\n\n" +
                                        "Desafiado " + challenged.getName() + " agora tem " +
                                        challenged.getLosses() + " derrotas");
            }
        } else {
            System.out.println("Esta luta nao pode acontecer");
        }
    }
   
   
   
   
   
   
   
   public void setChallenger(Lutador challenger) {
        this.challenger = challenger;
    }

    public void setChallenged(Lutador challenged) {
        this.challenged = challenged;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Lutador getChallenger() {
        return challenger;
    }

    public Lutador getChallenged() {
        return challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isApproved() {
        return approved;
    }
   
   
}
