package questao5;
public class Conta {
    private int numeroConta;
    private String dataCriacao;
    private double saldo;
    private Cliente cliente;
    private Banco banco;
    public Conta(int numeroConta, String dataCriacao, double saldoInicial, Banco banco) {
        this.numeroConta = numeroConta;
        this.dataCriacao = dataCriacao;
        this.saldo = saldoInicial;
        this.banco = banco;
        if (banco != null) {
            banco.adicionarConta(this);
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado na conta " + this.numeroConta);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + this.numeroConta);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + " na conta " + this.numeroConta);
            return false;
        }
    }
    public double verificarSaldo() { return this.saldo; }
    public boolean transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferencia de R$ " + valor + " realizada da conta " + this.numeroConta + " para a conta " + contaDestino.getNumeroConta());
            return true;
        } else {
            System.out.println("Falha na transferencia por saldo insuficiente.");
            return false;
        }
    }
    public int getNumeroConta() { return numeroConta; }
    public String getDataCriacao() { return dataCriacao; }
    public double getSaldo() { return saldo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Banco getBanco() { return banco; }
}
