package PooInterface;

public interface FigurasGeometricas {
    // somente modelos para outras classes
    // não podemos instanciar objetos desta classe
    // métodos abstratos por padrão/default

    public String getNomeFigura();

    public double getArea();

    public double getPerimetro();
}
