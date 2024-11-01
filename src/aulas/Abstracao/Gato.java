package aulas.Abstracao;

// Classe Gato que estende Animal
class Gato extends Animal {
    // Implementação do método fazerSom específica para o Gato
    @Override
    void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }

     // Método específico para o Gato
     void escalarArvore() {
        System.out.println("O gato está escalando a árvore!");
    }
}