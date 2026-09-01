import java.util.List;
import java.util.Scanner;

public class Estacionamento{
    private List<Pessoa> Clientes;

    public static void main(String[] args) {
        Estacionamento gerenciar = new Estacionamento();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Estacionamento do Ze");
            System.out.println("Gerenciar clientes e veiculos");
            System.out.println("1) Cadastro de Pessoa");
            System.out.println("2) Cadastro de Carros");
            System.out.println("3) Listar Clientes e seus carros");
            System.out.println("4) Total de veiculos por cliente");
            System.out.println("5) Total de veiculos geral");
            System.out.println("6) Total de clientes no momento");
            System.out.println("9) SAIR");
            System.out.println("Escolha sua opcao");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadPessoa();
                case 2 -> gerenciar.execCadCarro();
                case 3 -> gerenciar.execListarClientes();
                case 4 -> gerenciar.execTotalVeiculosClientes();
                case 5 -> gerenciar.execTotalVeiculosGeral();
                case 6 -> gerenciar.execTotalClientes();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");

            }
        }while(opcao !=9);

    }

    private void execTotalClientes() {
    }

    private void execTotalVeiculosGeral() {
    }

    private void execTotalVeiculosClientes() {
    }

    private void execListarClientes() {
    }

    private void execCadCarro() {
    }

    private void execCadPessoa() {
    }
}
