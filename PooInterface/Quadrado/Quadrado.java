package PooInterface.Quadrado;

import PooInterface.FigurasGeometricas;

public class Quadrado implements FigurasGeometricas {

    // assinou um contrato com figuras geométricas
    // obrigatoriamente declarar os métodos da class FigurasGeométricas

    // atributos da classe quadrado
    int lado;

    // construtor com parâmetro
    public Quadrado(int lado) {
        this.lado = lado;
    }
    

    // métodos importados de FigurasGeométricas
    @Override
    public double getArea() {
        int area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado*4;
        return perimetro;
    }
}
