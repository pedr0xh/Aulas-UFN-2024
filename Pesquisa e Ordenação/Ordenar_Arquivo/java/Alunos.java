/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
public class Alunos implements Comparable<Alunos> {

    private String nome;
    private int idade;
    private int matricula;

    /**
     * Construtor para criar um objeto Alunos.
     * 
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     * @param matricula Número de matrícula do aluno.
     */
    public Alunos(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    /**
     * Obtém a idade do aluno.
     * 
     * @return Idade do aluno.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Obtém o número de matrícula do aluno.
     * 
     * @return Número de matrícula do aluno.
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Obtém o nome do aluno.
     * 
     * @return Nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define a idade do aluno.
     * 
     * @param idade Nova idade do aluno.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Define o número de matrícula do aluno.
     * 
     * @param matricula Novo número de matrícula do aluno.
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Define o nome do aluno.
     * 
     * @param nome Novo nome do aluno.
     */
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
        return nome + "," + idade + "," + matricula;
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
