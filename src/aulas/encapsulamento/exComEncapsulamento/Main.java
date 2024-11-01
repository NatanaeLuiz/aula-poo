package aulas.encapsulamento.exComEncapsulamento;

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Usando métodos setters para definir os valores
        pessoa.setNome("João");
        pessoa.setIdade(25);

        // Usando métodos getters para acessar os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Tentando alterar a idade para um valor inválido
        pessoa.setIdade(-5);  // Imprime "Idade inválida!" e não altera o valor de idade

        // Verificando que o valor de idade não mudou
        System.out.println("Idade após tentativa inválida: " + pessoa.getIdade());
    }
}