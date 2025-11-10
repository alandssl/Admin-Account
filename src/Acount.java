package banco.src;

public class Acount {

    private int conta;
    private String nome;
    private double saldo;

    // CONTRUTORES
    public Acount(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public Acount(int conta, String nome, double depositoInicial) {
        this.conta = conta;
        this.nome = nome;
        Deposito(depositoInicial);
    }

    // GETTERS E SETTERS
    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositoInicial() {
        return saldo;
    }

    // METODO PARA DEPOSITAR
    public void Deposito(double depositar) {
        saldo += depositar;
    }

    // METODO PARA SACAR QUE TEM UM CUSTO DE 5 REAIS DE TAXA
    public void Saque(double saque) {
        saldo -= saque + 5;
    }

    public String toString() {
        return "Account: " + conta
                + ", Dono: " + nome
                + ", Valor na conta: R$"
                + saldo;
    }
}
