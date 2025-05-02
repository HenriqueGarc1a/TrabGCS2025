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
        this.departamento = usuarioRequisitante.getFunc();

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

    public String toString() {
        return "Pedido {" +
                "\n  Data de criação: " + data +
                "\n  Data de conclusão: " + (dataconclusao != null ? dataconclusao : "Ainda não concluído") +
                "\n  Status: " + status +
                "\n  Departamento: " + (departamento != null ? departamento : "Não especificado") +
                "\n  Usuario requisitante: " + (usuarioRequisitante != null ? usuarioRequisitante : "Nenhum") +
                "\n  Item: " + (items != null ? items : "Nenhum") +
                "\n}";
    }

    public Usuario getUsuarioRequisitante(){
        return this.usuarioRequisitante;
    }

    public void reprova(){

        this.status = Status.reprovado;

    }

    public void aprova(){

        this.status = Status.aprovado;

    }



}
