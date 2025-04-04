public class Usuario {
    private static int idgenerator = 0;
    private int id;
    private String nome;
    private boolean adm;
    private TipoFunc func;

    public Usuario(String nome, boolean adm, TipoFunc func){
       
        this.id = idgenerator;
        this.nome = nome;   
        this.adm = adm;
        this.func = func;
        idgenerator++;
    }
    public String getNome(){
        return nome;
    }
    public TipoFunc getFunc(){
        return func;
    }
    public boolean getAdm(){
        return adm;
    }
    public int getId(){
        return id;
    }
    public void setNome(String temp){
        this.nome = temp;
    }
    public void setId(int temp){
        this.id = temp;
    }
    public void setAdm(boolean temp){
        this.adm = temp;
    }
    public void setFunc(TipoFunc temp){
        this.func = temp;
    }
}
