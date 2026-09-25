package questao5;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private int codigo;
    private String nome;
    private String cnpj;
    private List<Conta> contas;
    public Banco(int codigo, String nome, String cnpj) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = new ArrayList<>();
    }
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
        System.out.println("Conta " + conta.getNumeroConta() + " vinculada ao banco " + this.nome);
    }
    public void listarContas() {
        System.out.println("Contas vinculadas ao banco " + this.nome + ":");
        for (Conta c : this.contas) {
            System.out.println("- Conta: " + c.getNumeroConta() + " | Saldo: R$ " + c.getSaldo());
        }
    }
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
    public List<Conta> getContas() { return contas; }
}
