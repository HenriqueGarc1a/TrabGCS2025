public class Item {

    private String nome,def;
    private double valor;

    public Item(String nome,double valor, String def){

        this.def = def;
        this.nome = nome;
        this.valor = valor;

    }

    public String getNome(){

        return this.nome;

    }

    public String getDef(){

        return this.def;

    }

    public double getVal(){

        return this.valor;

    }
    
}
