public class Item {

    private String nome,def;
    private double valor,quant,total;

    public Item(String nome,double valor, String def,double quant){

        this.def = def;
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
        this.total = valor*quant;

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

    public double getQuant(){

        return this.quant;

    }

    public double getTotal(){

        return this.total;

    }


    
}
