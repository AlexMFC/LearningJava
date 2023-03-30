
package exerciciopoo;

/**
 *
 * @author alexs
 */
public class Books implements Post {
    private String title;
    private String author;
    private int pageTotal;
    private int currPage;
    private boolean open;
    private Person reader;
            
    //CONSTRUTOR

    public Books(String title, String author, int pageTotal, int currPage, boolean open, Person reader) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setCurrPage(currPage);
        this.setPageTotal(pageTotal);
        this.setOpen(open);
        this.setReader(reader);
    }
    
    
    
    //METODOS ABSTRATOS
    @Override
    public void open(){
        if (this.isOpen()){
            System.out.println("# O livro ja esta aberto #");
        } else{
            System.out.println("Abrindo livro");
            this.setOpen(true);
        }
    }
    
    @Override
    public void close(){
        if (this.isOpen()){
            System.out.println("# Fechando livro #");
            this.setOpen(false);
        } else {
            System.out.println("! O livro ja esta fechado !");
        }
    }
    
    @Override
    public void leafThrough(){
        if(this.isOpen()){
            for(int i = this.getCurrPage(); i< this.getPageTotal(); i++){
                System.out.print(" | ");
            }
            System.out.println("## Folheado ##");
        } else {
            System.out.println("O livro esta fechado - Impossivel Folhear");
        }
    }
    
    @Override
    public void nextPage(){
        if(this.isOpen()){
            if(this.getCurrPage()< this.getPageTotal()){
                System.out.println("Passando pagina");
                this.setCurrPage(this.getCurrPage() + 1);
            } else if (this.getCurrPage() == this.getPageTotal()) {
                System.out.println("Livro ja esta na ultima pagina");
            }
        } else {
            System.out.println("Livro fechado");
        }
    }
    
    @Override
    public void prevPage(){
        if(this.isOpen()){
            if (this.getCurrPage()> 0){
            System.out.println("Voltando pagina");
            this.setCurrPage(this.getCurrPage() - 1);
            }
        } else if (this.getCurrPage() == 0){
            System.out.println("Livro ja esta na primeira pagina");
        } else{
            System.out.println("Livro fechado");
        }
    }
    
    protected void defReader(String author){
        this.setAuthor(author);
    }
    
    public void details(){
        System.out.println("##########"+"Livro:" + this.getTitle() + "\n" +
                            "Autor: " + this.getAuthor() + "\n"+
                            "Total de paginas: " + this.getPageTotal() + "\n"+
                            "Leitor atual: " + reader.getName() +"\n##########" );
    }
    
    
    //METODOS ESPECIAIS
    private void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    private void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    private void setPageTotal(int total){
        this.pageTotal = total;
    }
    
    public int getPageTotal(){
        return this.pageTotal;
    }
    
    private void setCurrPage(int currPage){
        this.currPage = currPage;
    }
    
    public int getCurrPage(){
        return this.currPage;
    }
    
    private void setOpen(boolean open){
        this.open = open;
    }
    
    public boolean isOpen(){
        return this.open;
    }
    
    private void setReader(Person reader){
        this.reader = reader;
    }
    
    public Person getReader(){
        return this.reader;
    }
    
}
