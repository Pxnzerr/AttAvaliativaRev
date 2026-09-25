package questao3;
public class MainQuestao3 {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Universidade Central", "12.345.678/0001-90", "Av. Brasil, 1500", "(11) 3322-4455");
        Curso curso1 = new Curso("CC01", "Ciencia da Computacao", 3200, "Presencial");
        Curso curso2 = new Curso("SI02", "Sistemas de Informacao", 3000, "Presencial");
        Curso curso3 = new Curso("ADS03", "Analise e Desenv. de Sistemas", 2400, "EAD");
        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);
        faculdade.adicionarCurso(curso3);
        Aluno aluno1 = new Aluno("202401", "Lucas Schmidt", "111.222.333-44", "lucas@email.com");
        Aluno aluno2 = new Aluno("202402", "Mariana Silva", "222.333.444-55", "mariana@email.com");
        Aluno aluno3 = new Aluno("202403", "Carlos Eduardo", "333.444.555-66", "carlos@email.com");
        curso1.matricularAluno(aluno1);
        aluno1.vincularCurso(curso1);
        curso2.matricularAluno(aluno2);
        aluno2.vincularCurso(curso2);
        curso3.matricularAluno(aluno3);
        aluno3.vincularCurso(curso3);
        faculdade.emitirRelatorio();
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();
    }
}
