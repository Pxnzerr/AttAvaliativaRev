package questao4;
public class Tela {
    public int codigo;
    public String descricao;
    public String tipo;
    public double tamanho;
    public Tela() {}
    public Tela(int codigo, String descricao, String tipo, double tamanho) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }
    public void Ligar() { System.out.println("Tela ligada."); }
    public void Desligar() { System.out.println("Tela desligada."); }
}
