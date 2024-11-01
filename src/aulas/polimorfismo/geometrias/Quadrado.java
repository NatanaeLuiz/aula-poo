package aulas.polimorfismo.geometrias;

import aulas.polimorfismo.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica{

    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String calculaArea() {
        
        String areaQuadrado = "Retorna a área do Quadrado " + (lado * lado);
        return areaQuadrado;
    }
}
