package PooInterface;

import PooInterface.Quadrado.Quadrado;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8); // um parâmetro
        Retangulo figura2 = new Retangulo(10, 5); // dois parâmetros
        Trapezio figura3 = new Trapezio(10, 5, 4, 2, 2);

        System.out.println(figura1.getNomeFigura() + "\n Area: " + figura1.getArea() + "\n Perímetro: " + figura1.getPerimetro());
        System.out.println(figura2.getNomeFigura() + "\n Area: " + figura2.getArea() + "\n Perímetro: " + figura2.getPerimetro());
        System.out.println(figura3.getNomeFigura() + "\n Area: " + figura3.getArea() + "\n Perímetro: " + figura3.getPerimetro());
    }
}
