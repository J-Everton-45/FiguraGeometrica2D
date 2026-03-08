package FiguraGeometrica2D;

public class Circulo implements FiguraGeometrica2Dj {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}