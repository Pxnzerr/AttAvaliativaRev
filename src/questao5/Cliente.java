package questao5;
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;
    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public void associarConta(Conta conta) {
        this.conta = conta;
        conta.setCliente(this);
    }
    public void imprimirValoresConta() {
        if (this.conta != null) {
            System.out.println("--- Dados da Conta do Cliente ---");
            System.out.println("Cliente: " + this.nome + " | CPF: " + this.cpf);
            System.out.println("Conta: " + this.conta.getNumeroConta() + " | Criada em: " + this.conta.getDataCriacao());
            System.out.println("Saldo Atual: R$ " + this.conta.verificarSaldo());
            System.out.println("---------------------------------");
        } else {
            System.out.println("O cliente " + this.nome + " ainda nao possui uma conta associada.");
        }
    }
    public void transferirPara(Cliente clienteDestino, double valor) {
        if (this.conta != null && clienteDestino.getConta() != null) {
            System.out.println("Iniciando transferencia de " + this.nome + " para " + clienteDestino.getNome() + "...");
            this.conta.transferir(clienteDestino.getConta(), valor);
        } else {
            System.out.println("Ambos os clientes precisam possuir contas ativas para transferir.");
        }
    }
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public Conta getConta() { return conta; }
}
