package PooInterface;

public class Trapezio implements FigurasGeometricas {
    
    // atributos do trapézio 
     int baseMaior;
    int baseMenor;
    int altura;
    int ladoUm;
    int ladoDois;

    // gerar o construtor
     public Trapezio(int baseMaior, int baseMenor, int altura, int ladoUm, int ladoDois) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
    }

    @Override
    public double getArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getPerimetro() {
        return baseMaior+baseMenor+ladoUm+ladoDois;
    }

    // métodos override
    
}
