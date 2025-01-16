package thay;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public void imprimirCpf() {
        System.out.println("CPF da pessoa: " + this.cpf);
    }


    public String nome() {
        return null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
