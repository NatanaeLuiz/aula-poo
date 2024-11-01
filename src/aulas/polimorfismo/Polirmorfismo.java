package aulas.polimorfismo;

import aulas.polimorfismo.geometrias.Circulo;
import aulas.polimorfismo.geometrias.Quadrado;
import aulas.polimorfismo.geometrias.Retangulo;

public class Polirmorfismo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(2, 4);

        exibeArea(circulo);
        exibeArea(quadrado);
        exibeArea(retangulo);
    }

    public static void exibeArea(FiguraGeometrica objeto){
        System.out.println("Area da figura geometrica " + objeto.calculaArea());
    }
}
