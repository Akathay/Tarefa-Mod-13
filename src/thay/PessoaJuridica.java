package thay;
public class PessoaJuridica {

    private String nome;
    
    private String cnpj;


    public void imprimirDadosEmpresa() {
        System.out.println("Nome da empresa: " + this.nome);
        System.out.println("CNPJ da empresa: " + this.cnpj);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
