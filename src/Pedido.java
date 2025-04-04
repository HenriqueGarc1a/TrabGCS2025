import java.util.ArrayList;

public class Pedido {

    private Usuario user;
    private TipoFunc departamento;
    private String data,dataconclusao;
    private Status status;
    private ArrayList<Item> items;

    public Pedido(Usuario user,String data,ArrayList<Item> items){

        this.user = user;
        this.departamento = this.user.getFunc();
        this.data = data;
        this.status = Status.aberto;
        this.items = items;

    }

    public Usuario getUser(){

        return this.user;

    }

    public TipoFunc getDep(){

        return this.departamento;

    }

    public Status geStatus(){

        return this.status;

    }

    public String getData(){

        return this.data;

    }

    public String getDataEnd(){

        return this.dataconclusao;

    }

    public ArrayList<Item> getItems(){

        return this.items;
        
    }



}
