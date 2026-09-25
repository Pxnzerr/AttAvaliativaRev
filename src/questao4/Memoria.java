package questao4;
public class Memoria {
    public int codigo;
    public String descricao;
    public String tipo;
    public double capacidade;
    public Memoria() {}
    public Memoria(int codigo, String descricao, String tipo, double capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    public void Alocar() { System.out.println("Memoria alocada."); }
    public void Desalocar() { System.out.println("Memoria desalocada."); }
}
