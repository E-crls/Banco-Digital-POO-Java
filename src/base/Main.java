package base;

public class Main {
    public static void main(String[] args){

        Cliente eCRLS = new Cliente();
        eCRLS.setNome("eCRLS");

        Conta cc = new ContaCorrente(eCRLS);
        cc.depositar(100);
        cc.extrato();

        Conta poupanca = new ContaPoupanca(eCRLS);
        cc.transferir(100, poupanca);


        cc.extrato();
        poupanca.extrato();
    }
}
