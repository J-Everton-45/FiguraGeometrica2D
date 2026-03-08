package FiguraGeometrica2D;

public class Quadrado implements FiguraGeometrica2Dj {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }
}