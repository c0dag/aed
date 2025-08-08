public class Aluno extends Pessoa {
    private int idAluno;

    public Aluno() {
        this("", 0, 0L, 0);
    }

    public Aluno(String nome, int idade, long cpf, int idAluno) {
        super(nome, idade, cpf);
        setIdAluno(idAluno);
    }

    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String toString() {
        return (super.toString() + String.format(", ID Aluno: %d", getIdAluno()));
    }
}