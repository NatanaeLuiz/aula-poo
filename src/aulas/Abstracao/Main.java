package aulas.Abstracao;

// Classe principal para testar a abstração
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom(); // Saída: O cachorro faz: Au Au!
        meuGato.fazerSom();      // Saída: O gato faz: Miau!
    }
}