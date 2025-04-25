import java.time.LocalDate;

class Pedido {

    private Dep departamento;
    private LocalDate data,dataconclusao;
    private Status status;
    private Usuario usuarioRequisitante;
    private Item items;

    public Pedido(LocalDate data,Item item, Usuario usuarioRequisitante){

        this.data = data;
        this.status = Status.aberto;
        this.items = item;
        this.usuarioRequisitante = usuarioRequisitante;

    }

    public Dep getDep(){

        return this.departamento;

    }

    public Status geStatus(){

        return this.status;

    }

    public LocalDate getData(){

        return this.data;

    }

    public LocalDate getDataEnd(){

        return this.dataconclusao;

    }

    public Item getItems(){

        return this.items;
        
    }

    public String toString(){

        return this.data.toString();


    }
    public Usuario getUsuarioRequisitante(){
        return this.usuarioRequisitante;
    }



}
