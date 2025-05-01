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

        LocalDate hoje = LocalDate.now();
        
        funcionarios.get(0).adicionarPedido(new Pedido(hoje.minusDays(30), new Item("Caderno", 15.0, "Caderno capa dura 200 folhas", 5), funcionarios.get(0)));
        funcionarios.get(1).adicionarPedido(new Pedido(hoje.minusDays(28), new Item("Caneta", 2.5, "Caneta azul", 20), funcionarios.get(1)));
        funcionarios.get(2).adicionarPedido(new Pedido(hoje.minusDays(26), new Item("Monitor", 750.0, "Monitor 24 polegadas", 2), funcionarios.get(2)));
        funcionarios.get(3).adicionarPedido(new Pedido(hoje.minusDays(25), new Item("Teclado", 120.0, "Teclado mecânico", 3), funcionarios.get(3)));
        funcionarios.get(4).adicionarPedido(new Pedido(hoje.minusDays(24), new Item("Mouse", 85.0, "Mouse sem fio", 4), funcionarios.get(4)));
        funcionarios.get(5).adicionarPedido(new Pedido(hoje.minusDays(23), new Item("Cadeira", 500.0, "Cadeira ergonômica", 1), funcionarios.get(5)));
        funcionarios.get(6).adicionarPedido(new Pedido(hoje.minusDays(22), new Item("Notebook", 3500.0, "Notebook Dell i7", 1), funcionarios.get(6)));
        funcionarios.get(7).adicionarPedido(new Pedido(hoje.minusDays(21), new Item("Papel A4", 25.0, "Resma papel A4", 10), funcionarios.get(7)));
        funcionarios.get(8).adicionarPedido(new Pedido(hoje.minusDays(20), new Item("Impressora", 1200.0, "Impressora HP Laser", 1), funcionarios.get(8)));
        funcionarios.get(9).adicionarPedido(new Pedido(hoje.minusDays(19), new Item("Cartucho", 180.0, "Cartucho HP 662", 3), funcionarios.get(9)));
        funcionarios.get(10).adicionarPedido(new Pedido(hoje.minusDays(18), new Item("Garrafa Térmica", 60.0, "Garrafa 1L", 2), funcionarios.get(10)));
        funcionarios.get(11).adicionarPedido(new Pedido(hoje.minusDays(17), new Item("Luminária", 90.0, "Luminária de mesa", 2), funcionarios.get(11)));
        funcionarios.get(12).adicionarPedido(new Pedido(hoje.minusDays(16), new Item("Mesa", 800.0, "Mesa de escritório", 1), funcionarios.get(12)));
        funcionarios.get(13).adicionarPedido(new Pedido(hoje.minusDays(15), new Item("Estante", 1200.0, "Estante de aço", 1), funcionarios.get(13)));
        funcionarios.get(14).adicionarPedido(new Pedido(hoje.minusDays(14), new Item("Pen Drive", 50.0, "Pen Drive 32GB", 10), funcionarios.get(14)));
        funcionarios.get(0).adicionarPedido(new Pedido(hoje.minusDays(13), new Item("HD Externo", 450.0, "HD Externo 1TB", 2), funcionarios.get(0)));
        funcionarios.get(1).adicionarPedido(new Pedido(hoje.minusDays(12), new Item("Mousepad", 30.0, "Mousepad ergonômico", 5), funcionarios.get(1)));
        funcionarios.get(2).adicionarPedido(new Pedido(hoje.minusDays(11), new Item("Projetor", 2500.0, "Projetor Epson", 1), funcionarios.get(2)));
        funcionarios.get(3).adicionarPedido(new Pedido(hoje.minusDays(10), new Item("Cabo HDMI", 45.0, "Cabo HDMI 2m", 5), funcionarios.get(3)));
        funcionarios.get(4).adicionarPedido(new Pedido(hoje.minusDays(9), new Item("Roteador", 320.0, "Roteador WiFi 5", 2), funcionarios.get(4)));
        funcionarios.get(5).adicionarPedido(new Pedido(hoje.minusDays(8), new Item("Fone de ouvido", 200.0, "Fone Bluetooth", 3), funcionarios.get(5)));
        funcionarios.get(6).adicionarPedido(new Pedido(hoje.minusDays(7), new Item("Scanner", 980.0, "Scanner Epson", 1), funcionarios.get(6)));
        funcionarios.get(7).adicionarPedido(new Pedido(hoje.minusDays(6), new Item("Calculadora", 35.0, "Calculadora científica", 8), funcionarios.get(7)));
        funcionarios.get(8).adicionarPedido(new Pedido(hoje.minusDays(5), new Item("Clip", 8.0, "Caixa de clips", 15), funcionarios.get(8)));
        funcionarios.get(9).adicionarPedido(new Pedido(hoje.minusDays(4), new Item("Apagador", 12.0, "Apagador branco", 5), funcionarios.get(9)));
        funcionarios.get(10).adicionarPedido(new Pedido(hoje.minusDays(3), new Item("Quadro Branco", 650.0, "Quadro branco grande", 1), funcionarios.get(10)));
        funcionarios.get(11).adicionarPedido(new Pedido(hoje.minusDays(2), new Item("Câmera Web", 350.0, "Webcam Full HD", 2), funcionarios.get(11)));
        funcionarios.get(12).adicionarPedido(new Pedido(hoje.minusDays(1), new Item("Armário", 1100.0, "Armário de aço", 1), funcionarios.get(12)));
        funcionarios.get(13).adicionarPedido(new Pedido(hoje, new Item("Chave de Fenda", 25.0, "Chave fenda média", 6), funcionarios.get(13)));
        funcionarios.get(14).adicionarPedido(new Pedido(hoje, new Item("Extensão elétrica", 40.0, "Extensão 5m", 4), funcionarios.get(14)));
    
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

    private void mostraPedidoEntreDatas(LocalDate date1, LocalDate date2){

        for(int i = 0;i<funcionarios.size();i++){
            
            for(int j = 0;j<funcionarios.get(i).getListaPedidosAprovados().size();j++){

                Pedido pedido = funcionarios.get(i).getListaPedidosAprovados().get(j);
                LocalDate dataPedido = pedido.getData();
                if ((dataPedido.isEqual(date1) || dataPedido.isAfter(date1)) &&
                    (dataPedido.isEqual(date2) || dataPedido.isBefore(date2))) {
                    System.out.println(pedido);
                }

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
                
                System.out.println("Digite a matricula do funcionario:");
                while (true) { 
                    try {
                        abacaxi=in.nextLine();
                        if(abacaxi.length() == 0)
                            continue;
                        k=Integer.parseInt(abacaxi);
                        atual = funcionarios.get(k);
                        break;
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
                System.out.println("Digite a data inicial (formato: yyyy-MM-dd): ");
                String dataInicioStr = in.next();
                System.out.println("Digite a data final (formato: yyyy-MM-dd): ");
                String dataFimStr = in.next();
            
                try {
                    LocalDate dataInicio = LocalDate.parse(dataInicioStr);
                    LocalDate dataFim = LocalDate.parse(dataFimStr);
                    mostraPedidoEntreDatas(dataInicio, dataFim);
                } catch (Exception e) {
                    System.out.println("Formato de data inválido! Use o formato yyyy-MM-dd.");
                }
            
                System.out.println("Pressione Enter para continuar:");
                in.nextLine(); 
                in.nextLine(); 
             break;

            case 6:
                System.out.println("Informe o usuário desejado: ");
                String user;
                do{
                user = in.nextLine();
                }while (user.length() == 0);

                ArrayList<Pedido> userPedidos = getPedidoPorUsuario(user);
               
                if(userPedidos != null){
                 
                    for(int i = 0; i < userPedidos.size(); i++){
                        System.out.println(userPedidos.get(i).toString());
                    }  
                    
                }else{
                    System.out.println("O Usuário não tem pedidos");
                }

                System.out.println("Digite algo para voltar ao menu!");
                in.next();
                  
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