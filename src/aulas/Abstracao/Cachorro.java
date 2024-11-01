package aulas.Abstracao;

// Classe Cachorro que estende Animal
class Cachorro extends Animal {
    // Implementação do método fazerSom específica para o Cachorro
    @Override
    void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    // Método específico para o Cachorro
    void buscarBola() {
        System.out.println("O cachorro está buscando a bola!");
    }
}
