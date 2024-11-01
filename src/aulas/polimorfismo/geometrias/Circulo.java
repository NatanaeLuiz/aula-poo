package aulas.polimorfismo.geometrias;

import aulas.polimorfismo.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {

    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public String calculaArea() {
        String areaCirculo = "Retorna a área do Circulo " + Math.PI * Math.pow(raio, 2);
        return areaCirculo;
    }
}
