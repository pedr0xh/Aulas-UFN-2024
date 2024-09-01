public class Alunos implements Comparable<Alunos> {

    private String nome;
    private int idade;
    private int matricula;

    public Alunos(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna uma representação em string dos detalhes do aluno.
     * 
     * @return String contendo o nome, idade e matrícula do aluno.
     */
    @Override
    public String toString() {
        return "Aluno: " + nome + "\n" +
               "Idade: " + idade + " anos\n" +
               "Matrícula: " + matricula + "\n";
    }

    /**
     * Compara este aluno com outro aluno para ordenação.
     * A comparação é feita primeiro pelo nome. Se os nomes forem iguais,
     * a comparação é feita pela idade.
     * 
     * @param o Outro aluno a ser comparado.
     * @return Um valor negativo, zero ou positivo conforme este aluno
     *         é menor, igual ou maior que o outro aluno.
     */
    @Override
    public int compareTo(Alunos o) {
        int nomeComparison = this.nome.compareTo(o.nome);
        if (nomeComparison != 0) {
            return nomeComparison;
        }
        return Integer.compare(this.idade, o.idade);
    }
}
