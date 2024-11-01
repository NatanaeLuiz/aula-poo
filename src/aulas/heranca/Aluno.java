package aulas.heranca;

public class Aluno {
    
    String nome;
    int idade;
    Cor cor;
    Genero sexo;
    String matricula;
    int nota1;
    int nota2;
    int nota3;
    int media;

    // Construtor
    /*public Aluno(String nome, String sobrenome, String matricula) {
        super(nome, sobrenome); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
    }*/

    void comer(){
        //Código aqui
    }

    void beber(){
        //Código aqui
    }

    void correr() {
        //Código aqui
    }

    void obterMatricula(){
        //Código aqui
    }

    /*public String obterNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }*/

    // Método para obter a matrícula
    public String getMatricula() {
        return matricula;
    }
}
