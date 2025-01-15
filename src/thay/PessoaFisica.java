package thay;
public class PessoaFisica {

    private String nome;

    private String cpf;


    public void imprimirDadosPessoa() {
        System.out.println("Nome da pessoa: " + this.nome);
        System.out.println("CPF da pessoa: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
