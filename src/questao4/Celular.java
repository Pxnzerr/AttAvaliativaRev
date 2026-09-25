package questao4;
import java.util.ArrayList;
import java.util.List;
public class Celular {
    public int codigo;
    public String modelo;
    public String marca;
    public List<Jogo> jogos;
    public Tela tela;
    public Processador processador;
    public Memoria memoria;
    public Celular() { this.jogos = new ArrayList<>(); }
    public Celular(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
        this.jogos = new ArrayList<>();
    }
    public void Ligar() { System.out.println("Celular " + this.modelo + " ligado."); }
    public void Desligar() { System.out.println("Celular " + this.modelo + " desligado."); }
    public void Chamar() { System.out.println("Realizando chamada a partir do celular " + this.modelo + "."); }
}
