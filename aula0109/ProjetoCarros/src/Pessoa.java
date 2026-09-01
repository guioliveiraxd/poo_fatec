import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDateTime dataNascimento;

    private List <Carro> carros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimir(){
        System.out.println("Dados completos da pessoa e seus automovel(is");
        System.out.println("----------------------------------------------");
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("endereco = " + endereco);
        System.out.println("dataNascimento = " + dataNascimento);
        System.out.println("telefone = " + telefone);
        if(carros.size() == 0) {
            System.out.println("Não possui automovel");
        }else {
            for(Carro carro:carros){
                carro.imprimir();
            }
        }
        System.out.println("----------------------------------------------");
    }
    public void adicionarCarro(Carro carro){
        //Adcionar na lista de carros do cliente
        carros.add(carro);


    }
}
