import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

    private ArrayList<Usuario> funcionarios = new ArrayList<>();
    private Usuario atual;

    private void initFunc(){

        funcionarios.add(new Usuario("Pedro Antonio",true,Dep.Diretoria, "PA"));
        funcionarios.add(new Usuario("Joao Cruz", false,Dep.Contabilidade, "JC"));
        funcionarios.add(new Usuario("Janaina Souza", false, Dep.RH, "JS"));
        funcionarios.add(new Usuario("Mike Taison", false, Dep.Engenharia, "MT"));
        funcionarios.add(new Usuario("Samanta Silva", false, Dep.Financeiro, "SS"));
        funcionarios.add(new Usuario("Gilson Moreira", false, Dep.Manutenção, "GM"));
        funcionarios.add(new Usuario("Filipe Roman", false, Dep.Contabilidade, "FR"));
        funcionarios.add(new Usuario("Henrique Garcia", true, Dep.Diretoria, "HG"));
        funcionarios.add(new Usuario("Irving Mallet", false, Dep.RH, "IM"));
        funcionarios.add(new Usuario("Gabriella Schmidt", true, Dep.Engenharia, "GS"));
        funcionarios.add(new Usuario("Michael Mora", true, Dep.Diretoria, "MM"));
        funcionarios.add(new Usuario("Matheus Granja", false, Dep.Financeiro,"MG"));
        funcionarios.add(new Usuario("Antonio Castilhos", false, Dep.Engenharia, "AC"));
        funcionarios.add(new Usuario("Marco Aurelio", true, Dep.Financeiro, "MA"));
        funcionarios.add(new Usuario("Neymar Junior", false, Dep.RH, "NJ"));

    }

    private void mostraFunc(){

        for(int i =0;i<funcionarios.size();i++){

            System.out.println(i+ ":"+funcionarios.get(i).getNome());

        }


    }

    private void clear(){

        int x = 0 ;
        while (x <100) {

            System.out.println();
            x++;
        }

    }

    private void addPedido(Item item, Usuario usuarioRequisitante){

        LocalDate hoje = LocalDate.now();
        atual.adicionarPedido(new Pedido(hoje, item, usuarioRequisitante));

    }

    private void mostraPedido(){

        for(int i = 0;i<funcionarios.size();i++){
            
            for(int j = 0;j<funcionarios.get(i).getListaPedidosAprovados().size();j++){

                System.out.println(funcionarios.get(i).getListaPedidosAprovados().get(j));

            }
        }
    }

    private ArrayList<Pedido> getPedidoPorUsuario(String userName){
        for(Usuario u : funcionarios){
            if(u.getNome().equalsIgnoreCase(userName)){
                return u.getListaPedidosAprovados();
            }
        }
        return null;
    }

    public void menuR(){

        initFunc();

        int temp = 0;
        Scanner in = new Scanner(System.in);
        atual = funcionarios.get(0);

        while(temp != 10){
         System.out.print("----Menu---- ");
         System.out.println("Bom dia "+atual.getNome());
         System.out.println("Informe a tarefa que deseja realizar");
         System.out.println("1-Registrar um novo pedido");
         System.out.println("2-Alterar o Usuario do sistema");
         System.out.println("3-Remover um pedido existente(Somente Usuario Solicitante)");
         
         if(atual.getAdm()){
         System.out.println("4-Aprovar ou Rejeitar pedidos(Somente Admin)");
         System.out.println("5-Listar pedidos entre duas datas(Somente Admin)");
         System.out.println("6-Buscar pedidos por Usuario solicitante(Somente Admin)");
         System.out.println("7-Buscar pedido por descrição de item(Somente Admin)");
         System.out.println("8-Visualizar detalhes de um pedido(Somente Admin)");
         System.out.println("9-Ver estatisticas (Somente Admin)");

         }

         System.out.println("10-Fechar app");

         if(in.hasNextInt()){
            temp = in.nextInt();
         } else{
            in.next();
            temp = -1;
         }

         switch(temp){
            case 1:
                    clear();
                    String nome;
                    double valor,quant;
                    valor = 0;
                    quant = 0;

                    System.out.println("Informe o nome do Item:");
                    do{
                     
                     nome = in.nextLine();

                    }while (nome.length() == 0);

                    System.out.println("Informe o valor do Item");
                    
                    while(true){
                    try {
                        String entrada =in.nextLine();
                        valor = Double.parseDouble(entrada);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Valor invalido, insira um numero correto");
                    }
                    }

                    System.out.println("Informe a quantidade do item:");
                    
                    while(true){
                    try {
                        String entrada =in.nextLine();
                        quant = Double.parseDouble(entrada);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Quantidade invalida, insira um numero correto");
                    }
                    }

                    System.out.println("Digite a definicao do Item");
                    String def = in.nextLine();
                    
                    addPedido(new Item(nome, valor, def, quant),atual);

                    System.out.println("Pedido realizado com sucesso!");
                    System.out.println("Digite algo para voltar ao menu!");
                    in.next();

              break;

            case 2:

                clear();
                mostraFunc();
                String abacaxi="";
                int k=0;
                int asijo=0;
                while (asijo<1) { 
                    try {
                        abacaxi=in.nextLine();
                        k=Integer.parseInt(abacaxi);
                        atual = funcionarios.get(k);
                        asijo++;
                    } catch (NumberFormatException e) {
                        System.out.println("Usuario Invalido");
                    }                    
                }
                break;
                
            case 3:

            clear();
            
            if(atual.getListaPedidosAprovados().size() ==0){
                
                System.out.println("Voce nao tem pedidos ativos");
                System.out.println("digite algo para voltar ao menu");

                in.next();
                
                break;

            }

            System.out.println("Informe o pedido a ser removido:");
            int count = 1;
            for(int i = 0; i<(atual.getListaPedidosAprovados()).size(); i++){
                System.out.println("\n"+count+"- "+((atual.getListaPedidosAprovados()).get(i)).toString());
            }
            int deletado = in.nextInt()-1;
            if((atual.getListaPedidosAprovados()).get(deletado)!= null){
                atual.getListaPedidosAprovados().remove(deletado);
            System.out.println("Pedido removido com sucesso");
            }else{
                System.out.println("Numero de pedido Invalido");
            }
             break;
            case 4:
             break;
            case 5:
                clear();
                mostraPedido();
                in.next();
             break;
            case 6:
                System.out.println("Informe o usuário desejado: ");
                String user = in.next();
                ArrayList<Pedido> userPedidos = getPedidoPorUsuario(user);
                if(userPedidos != null){
                    for(int i = 0; i < userPedidos.size(); i++){
                        System.out.println(userPedidos.get(i).toString());
                    }  
                }else{
                    System.out.println("O Usuário não tem pedidos");
                }
                  
             break;
            case 7:
             break;
            case 8:
             break;
            case 9:
             break;
            case 10:
                return;
             
            default:
             System.out.println("Opção Invalida, por favor informe um numero valido");
             System.out.println();
         }
         
         clear();

        }

        in.close();
    }



}