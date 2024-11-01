package aulas.heranca;

public class Main {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();

        aluno1.nome = "José";
        aluno1.cor = Cor.MORENO;
        aluno1.idade = 12;
        aluno1.sexo = Genero.MASCULINO;

        //System.out.println(aluno1.obterNomeCompleto());
    }
}
