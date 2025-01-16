package thay;

public class Programa {

    public static void main(String args[]) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Paulo");
        pessoaFisica.setCpf("1");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("E1");
        pessoaJuridica.setCnpj("2");

        pessoaFisica.imprimirNomePessoa();
        pessoaFisica.imprimirCpf();
        pessoaJuridica.imprimirNomeEmpresa();
        pessoaJuridica.imprimirCnpj();
    }
}
