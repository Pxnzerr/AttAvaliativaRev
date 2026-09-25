package questao3;
import java.util.ArrayList;
import java.util.List;
public class Curso {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String modalidade;
    private List<Aluno> alunos;
    public Curso(String codigo, String nome, int cargaHoraria, String modalidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.alunos = new ArrayList<>();
    }
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("O aluno " + aluno.getNome() + " foi matriculado no curso de " + this.nome);
    }
    public void exibirInformacoes() {
        System.out.println("Curso: " + this.nome + " | Carga Horaria: " + this.cargaHoraria + "h | Modalidade: " + this.modalidade + " | Total de Alunos: " + this.alunos.size());
    }
    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getCargaHoraria() { return cargaHoraria; }
    public String getModalidade() { return modalidade; }
    public List<Aluno> getAlunos() { return alunos; }
}
