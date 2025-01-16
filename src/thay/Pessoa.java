package thay;

public abstract class Pessoa {

    private String nome;

    public void imprimirNomePessoa() {
        System.out.println("Nome da pessoa: " + this.nome);
    }

    public void imprimirNomeEmpresa() {
        System.out.println("Nome da empresa: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
