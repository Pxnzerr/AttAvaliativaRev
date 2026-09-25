package questao3;
public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private String email;
    private Curso curso;
    public Aluno(String matricula, String nome, String cpf, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public void vincularCurso(Curso curso) {
        this.curso = curso;
        System.out.println("O aluno " + this.nome + " vinculou-se ao curso " + curso.getNome());
    }
    public void trancarMatricula() {
        System.out.println("O aluno " + this.nome + " solicitou o trancamento da matricula.");
    }
    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public Curso getCurso() { return curso; }
}

