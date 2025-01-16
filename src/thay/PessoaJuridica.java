package thay;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public void imprimirCnpj() {
        System.out.println("CNPJ da empresa: " + this.cnpj);
    }


    public String nome() {
        return null;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
