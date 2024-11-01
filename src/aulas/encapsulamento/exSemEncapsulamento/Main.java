package aulas.encapsulamento.exSemEncapsulamento;


// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Acessando diretamente os atributos da classe Pessoa
        pessoa.nome = "João";
        pessoa.idade = 25;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        // Modificando diretamente os atributos da classe Pessoa
        pessoa.nome = "Maria";
        pessoa.idade = 30;

        System.out.println("Nome atualizado: " + pessoa.nome);
        System.out.println("Idade atualizada: " + pessoa.idade);
    }
}