import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

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

    private void addPedido(Item item){

        LocalDate hoje = LocalDate.now();
        atual.adicionarPedido(new Pedido(hoje, item));

    }

    private void mostraPedido(){

        for(int i = 0;i<funcionarios.size();i++){
            
            for(int j = 0;j<funcionarios.get(i).getListaPedidosAprovados().size();j++){

                System.out.println(funcionarios.get(i).getListaPedidosAprovados().get(j));

            }
        }



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
                    System.out.println(1);
                    String nome = in.nextLine();
                    System.out.println(2);
                    double valor = in.nextDouble();
                    System.out.println(3);
                    double quant = in.nextDouble();
                    System.out.println(4);
                    String def = in.nextLine();

                    addPedido(new Item(nome, valor, def, quant));
             
              break;
            case 2:

                clear();
                mostraFunc();
                try {
                    atual = funcionarios.get(in.nextInt());
                } catch (Exception e) {

                }
                
                break;
                
            case 3:
            System.out.println("Informe o pedido a ser removido:");
            int count = 1;
            for(int i = 0; i<(atual.getListaPedidosAprovados()).size(); i++){
                System.out.println("\n"+count+"- "+((atual.getListaPedidosAprovados()).get(i)).getItems());
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
             break;
            case 7:
             break;
            case 8:
             break;
            case 9:
             break;
            case 10:
             break;
            default:
             System.out.println("Opção Invalida, por favor informe um numero valido");
             System.out.println();
         }
         
         clear();

        }

        in.close();
    }



}