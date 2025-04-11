import java.util.ArrayList;

    public class Departamento {
        private String nome;
        private String tipo;
        private ArrayList<Pedido> listaPedidos;
    

    Departamento(String nome, String tipo, ArrayList<Pedido> listaPedidos){

        this.nome = nome;
        this.tipo = tipo;
        this.listaPedidos = listaPedidos;
        
    }


    public String getNome(){
        return nome;
    }
    
    public String getTipo(){
        return tipo;
    }

    public ArrayList<Pedido> getListaPedidos(){
        return listaPedidos;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;

    }

    public void setTipo(String novoTipo){
        this.tipo = novoTipo;
    }

    public void setListaPedidos(ArrayList<Pedido> novoPedidos){
        this.listaPedidos = novoPedidos;
    }
    
    public void adicionarPedido(Pedido pedido){
        listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> buscarPedidoPorUsuario(Usuario usuario){

        for(int i = 0; i < listaPedidos.size(); i++){
            if (listaPedidos.get(i).getUser() == usuario){
                return usuario.getListaPedidosAprovados();
            }
        }

        return null;
    }
    

}
