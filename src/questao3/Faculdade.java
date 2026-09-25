package questao3;
import java.util.ArrayList;
import java.util.List;
public class Faculdade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private List<Curso> cursos;
    public Faculdade(String nome, String cnpj, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cursos = new ArrayList<>();
    }
    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        System.out.println("O curso " + curso.getNome() + " foi adicionado a faculdade " + this.nome);
    }
    public void emitirRelatorio() {
        System.out.println("Relatorio da Faculdade: " + this.nome + " | Total de cursos: " + this.cursos.size());
    }
    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public List<Curso> getCursos() { return cursos; }
}
