import java.util.ArrayList;

public class Usuario {
    private static int idgenerator = 0;
    private int id;
    private String nome;
    private boolean adm;
    private Dep func;
    private ArrayList<Pedido> listaPedidosAprovados;
    private String iniciais;

    public Usuario(String nome, boolean adm, Dep func, String iniciais){
       
        this.id = idgenerator;
        this.nome = nome;   
        this.adm = adm;
        this.func = func;
        listaPedidosAprovados = new ArrayList<>();
        this.iniciais = iniciais;
        idgenerator++;
    }

    public String getNome(){
        return nome;
    }

    public Dep getFunc(){
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

    public void setFunc(Dep temp){
        this.func = temp;
    }

    public ArrayList<Pedido> getListaPedidosAprovados() {
        return listaPedidosAprovados;
    }

    public void adicionarPedido(Pedido pedido){
        listaPedidosAprovados.add(pedido);
    }
    public void deletarPedido(int index, Usuario r){
        if (listaPedidosAprovados.get(index).getUsuarioRequisitante()==r) {
           listaPedidosAprovados.remove(index); 
        }
    }

    public String toString() {
        return "Usuario {" +
                "ID: " + id +
                ", Nome: '" + nome + '\'' +
                ", Iniciais: '" + iniciais + '\'' +
                ", Admin: " + adm +
                ", Departamento: " + func +
                ", Pedidos aprovados: " + listaPedidosAprovados.size() +
                '}';
    }
}
