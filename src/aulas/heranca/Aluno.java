package aulas.heranca;

public class Aluno extends Pessoa{
    
  
    String matricula;
    int nota1;
    private int nota2;
    int nota3;
    int media;

    //ExConstrutor apenas com 2 argumentos obrigatorio da super-classe
    public Aluno(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    //EX Construtor com mais de um parametro alem dos construtor obrigatorio da super classe
    public Aluno(String nome, String sobrenome, String matricula) {
        super(nome, sobrenome); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    //Obtem o nome completo (Nome e sobre nome) da Pessoa (Super classe)
    public String obterNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    // Método para obter a matrícula
    public String getMatricula() {
        return matricula;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", sobrenome=" + sobrenome + ", nota1=" + nota1
                + ", nota2=" + nota2 + ", cor=" + cor + ", nota3=" + nota3 + ", peso=" + peso + ", media=" + media
                + ", tamanho=" + tamanho + ", sexo=" + sexo + "]";
    }

    
}
