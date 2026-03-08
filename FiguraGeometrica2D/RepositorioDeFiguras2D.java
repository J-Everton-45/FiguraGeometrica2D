package FiguraGeometrica2D;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<FiguraGeometrica2Dj> figuras;

    public RepositorioDeFiguras2D() {
        figuras = new ArrayList<>();
    }

    public void adicionarFigura(FiguraGeometrica2D figura) {
        figuras.add(figura);
    }

    public void removerFigura(int posicao) {
        figuras.remove(posicao);
    }

    public double recuperarArea(int posicao) {
        return figuras.get(posicao).calcularArea();
    }

    public double recuperarPerimetro(int posicao) {
        return figuras.get(posicao).calcularPerimetro();
    }

    public String recuperarTipo(int posicao) {
        return figuras.get(posicao).getTipo();
    }
}