package aulas.encapsulamento.exComEncapsulamento;


public class Pessoa {
    private String nome;  // Atributo privado, acessível apenas dentro da classe
    private int idade;    // Atributo privado, acessível apenas dentro da classe

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {  // Validação para garantir que a idade não seja negativa
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}

