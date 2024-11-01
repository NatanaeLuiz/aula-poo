package aulas.Abstracao;

// Classe abstrata Animal
abstract class Animal {
    // Método abstrato que define a ação "fazer som", mas não diz como
    abstract void fazerSom();

    // Método comum que pode ser utilizado por todos os animais
    void dormir() {
        System.out.println("O animal está dormindo.");
    }
}

