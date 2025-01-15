package thay;
public class Pessoa {

    public static void main(String args[]) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Paulo");
        pessoaFisica.setCpf("1");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("E1");
        pessoaJuridica.setCnpj("2");

        pessoaFisica.imprimirDadosPessoa();
        pessoaJuridica.imprimirDadosEmpresa();
    }
}
