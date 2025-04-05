import java.util.Scanner;
public class Menu{
    public void menuR(){
        int temp = 0;
        Scanner in = new Scanner(System.in);
        while(temp != 10){
         System.out.println("----Menu----");
         System.out.println("Informe a tarefa que deseja realizar");
         System.out.println("1-Registrar um novo pedido");
         System.out.println("2-Alterar o Usuario do sistema");
         System.out.println("3-Remover um pedido existente(Somente Usuario Solicitante)");
         System.out.println("4-Aprovar ou Rejeitar pedidos(Somente Admin)");
         System.out.println("5-Listar pedidos entre duas datas(Somente Admin)");
         System.out.println("6-Buscar pedidos por Usuario solicitante(Somente Admin)");
         System.out.println("7-Buscar pedido por descrição de item(Somente Admin)");
         System.out.println("8-Visualizar detalhes de um pedido(Somente Admin)");
         System.out.println("9-Ver estatisticas (Somente Admin)");
         System.out.println("10-Fechar app");

         if(in.hasNextInt()){
            temp = in.nextInt();
         } else{
            in.next();
            temp = -1;
         }

         switch(temp){
            case 1:
              break;
            case 2:
             break;
            case 3:
             break;
            case 4:
             break;
            case 5:
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
         in.close();
        }
    }
}