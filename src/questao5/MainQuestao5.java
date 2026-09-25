package questao5;
public class MainQuestao5 {
    public static void main(String[] args) {
        Banco bancoBrasil = new Banco(1, "Banco do Brasil", "00.000.000/0001-91");
        Cliente cliente1 = new Cliente(101, "Lucas Schmidt", "111.222.333-44", "Rua das Flores, 120");
        Conta conta1 = new Conta(501, "10/01/2024", 1500.0, bancoBrasil);
        cliente1.associarConta(conta1);
        Cliente cliente2 = new Cliente(102, "Ana Beatriz", "555.666.777-88", "Av. Paulista, 900");
        Conta conta2 = new Conta(502, "15/02/2024", 800.0, bancoBrasil);
        cliente2.associarConta(conta2);
        System.out.println("=== Saldos Iniciais ===");
        cliente1.imprimirValoresConta();
        cliente2.imprimirValoresConta();
        System.out.println("=== Operacoes de Deposito e Saque ===");
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        System.out.println("Saldo da conta 1 apos operacoes: R$ " + conta1.verificarSaldo());
        System.out.println("=== Operacao de Transferencia entre Clientes ===");
        cliente1.transferirPara(cliente2, 400.0);
        System.out.println("=== Saldos Finais Apos Transferencia ===");
        cliente1.imprimirValoresConta();
        cliente2.imprimirValoresConta();
        bancoBrasil.listarContas();
    }
}
