package aula;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
          
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        
        if(!nome.isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("Nome em branco, digite algo!");
        }
    }

    public void setIdade(int idade) {
        if(idade>0){
            this.idade = idade;
        }else{
            System.out.println("idade zerada, digite algo!");
        }
    }
    
    
    
}
