package exercicios.GPT.Ex2;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo=0;

    public ContaBancaria(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor){
        if(valor>saldo){
            System.out.println("Não há dinheiro suficiente!");
            return;
        }
        this.saldo-=valor;
        System.out.println("Saque realizado com sucesso!");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
