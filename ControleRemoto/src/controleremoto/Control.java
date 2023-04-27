
package controleremoto;



/**
 *
 * @author alexs
 */
public class Control implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;

    public Control() {
        this.volume = 0;
        this.on = false;
        this.playing = false;
    }
    
    //Metodos abstratos
    
    @Override
    public String on(){
        if (this.on == true){
           return this.getOn();
        } else{
            this.setOn(true);
            return this.getOn();
        }
    }
    
    @Override
    public String off(){
        if (this.on == true){
            this.setOn(false);
            return this.getOn();  
        } 
        else{
            return this.getOn();
        }
    }
    
    @Override
    public String closeMenu(){
        
        return "Menu fechado";
    }
    
    @Override
    public String openMenu(){
        return "##############" + "\n"
                + this.getOn() + "\n" 
                + this.getPlaying() + "\n" 
                + this.getVolume() + "\n"
                + "##############";
    }
    
    @Override
    public String incVolume(){    
        if (this.volume < 100){
            this.setVolume(1);
            return this.getVolume();
        } else {
            return this.getVolume();
        }     
    }
    
    @Override
    public String decVolume(){
        if (this.volume <=  0){
            return this.getVolume();
        } else {
            this.setVolume(-1);
            return this.getVolume();
        }
    }
    
    @Override
    public String muteOn(){
        if(this.volume == 0){
            return this.getVolume();
        } else {
            this.setVolume(0);
            return this.getVolume();
        }
    }
    
    @Override
    public String muteOff(){
        if (this.volume > 0){
            return this.getVolume();
        } else{
            this.setVolume(50);
            return this.getVolume();
        }
    }
    
    @Override
    public String play(){
        if (this.on == true){
            if(this.playing == false){
                this.setPlaying(true);
                return this.getPlaying();
            } else {
                return this.getPlaying();
            }
        } else {
           return this.getOn();
        }
    }
    
    @Override
    public String pause(){
        if (this.on == true){
            if(this.playing == false){
                return this.getPlaying();
            } else {
                this.setPlaying(false);
                return this.getPlaying();
            }
        } else {
           return this.getOn();
        }
    }
    
    //Metodos especiais
    
    public String getVolume(){
     
        if(this.volume ==100){
            return "Volume maximo" + this.volume;
        }else if (this.volume >= 1 && this.volume < 100){
            return "Volume" + this.volume;
        } else{
            return "Este aparelho esta no mudo";
        }
    }
    
    private void setVolume(int v){
        this.volume += v;        
    }
    
    public String getOn(){
        if( on == true){
            return "Esta ligado";
        } else{
            return "O aparelho esta desligado";
        }
    }
    
    private void setOn(boolean testOn){
        this.on = testOn;
    }
    
    public String getPlaying(){
        if (this.on == true){
            if (playing == true){
                return "Esta em reproducao";
            } else{
                return "Esta pausado";
            }
        } else {
            return getOn();
        }
    }
    
    private void setPlaying(boolean play){
        this.playing = play;
    }
        
}
