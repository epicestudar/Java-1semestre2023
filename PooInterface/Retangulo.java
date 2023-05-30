package PooInterface;

public class Retangulo implements FigurasGeometricas{
    
    // atributos do retangulo
    int base;
    int altura;

    // gerar o construtor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // métodos override
    @Override
    public double getArea() {
        return base*altura;
    }

    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        return (base + altura) * 2;
    }
}
