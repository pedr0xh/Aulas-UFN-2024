package Testes;

public class Alunos {
    
    private String nome;
    private int idade;
    private int matricula;

    public Alunos (String nome, int idade, int matricula){
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

    @Override
    public String toString() {
        return "Aluno: " + nome + "\n" +
               "Idade: " + idade + " anos\n" +
               "Matrícula: " + matricula + "\n";
    }

    
    
    
}

