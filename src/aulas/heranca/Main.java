package aulas.heranca;

public class Main {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("José", "Roberto");

        //Exemplo passando valores para super classe (De forma direta)
        aluno1.cor = Cor.MORENO;
        aluno1.sexo = Genero.MASCULINO;
        aluno1.nota1 = 7;

        //Idade não pode receber o valor de forma diret, pois o seu atributo não está mais publico. E sim privado!
        //aluno1.idade = 12;

        //Forma correta de passar valor para esse atributo.
        aluno1.setIdade(12);
        aluno1.setNota2(5);

        

        System.out.println(aluno1.obterNomeCompleto());

        System.out.println("\n\n");

        System.out.println(aluno1.toString());

    }
}
