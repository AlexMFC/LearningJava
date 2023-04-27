
package ultraemojicombat;

/**
 *
 * @author alexs
 */
public class Lutador implements Fighter {
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int losses;
    private int draws;

    public Lutador(String name, String nationality, int age, double height, double weight,
            int victories, int losses, int draws) {
        this.setName(name);
        this.setNationality(nationality);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCategory();
        this.setVictories(victories);
        this.setLosses(losses);
        this.setDraws(draws);
    }

    //Metodos
    
   
    
    @Override
    public void introduce(){
        System.out.println("""
                           #####
                           Lutador: """ + this.getName() + "\n" +
                            "Origem: " + this.getNationality() +
                            "\nIdade: " + this.getAge() + "\n" +
                            "Altura: " + this.getHeight() + "\n" +
                            "Pesando: " + this.getWeight() + "\n" +
                            "Ganhou: " + this.getVictories() + "\n" +
                            "Perdeu: " + this.getLosses() + "\n" +
                            "Empatou: " + this.getDraws() + "\n #####");
    }
    
    @Override
    public void status(){
        System.out.println("""
                           ##### 
                           O lutador-  """ + this.getName() +
                            " eh um " + this.getCategory() + 
                            "\nSeu cartel eh de: \n" + this.getVictories() + " Vitorias \n"
                            + this.getLosses() + " derrotas\n" + "e " + this.getDraws() + " empates\n" + "#####");
    }
    
    @Override
    public void winFight(){
        setVictories(this.getVictories() + 1);
    }
    
    @Override
    public void loseFight(){
        setLosses(this.getLosses() + 1);
    }
    
    @Override
    public void drawfight(){
        setDraws(this.getDraws() + 1);
    }
    
    
    
    
    private void setName(String name) {
        this.name = name;
    }

    private void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setHeight(double height) {
        this.height = height;
        this.setCategory();
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setCategory() {
        if (getWeight() < 52.2){
            this.category = "Categoria invalida";
        } else if (getWeight() <= 70.3 ){
            this.category = "Peso Leve";
        } else if (getWeight() <= 83.9 ){
            this.category = "Peso medio";
        } else if (getWeight() <= 120.2){
            this.category = "Peso pesado";
        } else {
            this.category = "Categoria invalida";
        }
    }

    private void setVictories(int victories) {
        this.victories = victories;
    }

    private void setLosses(int losses) {
        this.losses = losses;
    }

    private void setDraws(int draws) {
        this.draws = draws;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public int getVictories() {
        return victories;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }
    
}
