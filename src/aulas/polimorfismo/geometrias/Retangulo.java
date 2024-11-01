package aulas.polimorfismo.geometrias;

import aulas.polimorfismo.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica{

    double largura = 5.0; // exemplo de valor para a largura
    double altura = 3.0; // exemplo de valor para a altura
    
    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String calculaArea() {
        String areaRetangulo = "Retorna a área do Retângulo: " + (largura * altura);
        return areaRetangulo;
    }
}
