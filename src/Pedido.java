import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

class Pedido {

    private Dep departamento;
    private LocalDate data,dataconclusao;
    private Status status;
    Item items;

    public Pedido(LocalDate data,Item item){

        this.data = data;
        this.status = Status.aberto;
        this.items = item;

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



}
