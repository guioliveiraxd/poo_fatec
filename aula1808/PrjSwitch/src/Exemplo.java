import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exemplo exemplo = new Exemplo();
        int opcao = 0;
        do{
            System.out.println("Meno de Opcoes");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Consultar Aluno");
            System.out.println("3. Excluir Alunos");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1 -> exemplo.execCadastrar();
                case 2 -> exemplo.exeConsultar();
                case 3 -> exemplo.exeExcluir();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida");
            }
        } while(opcao !=9);

    }
    public void execCadastrar(){
        System.out.println("Rotina de cadastrar");
    }

    public void exeConsultar(){
        System.out.println("Rotina de consultar");
    }

    public void exeExcluir(){
        System.out.println("Rotina de excluir");
    }

}
