package FiguraGeometrica2D;


public class main {
    public static void main(String[] args) {
        RepositorioDeFiguras2D repositorio = new RepositorioDeFiguras2D();

        repositorio.adicionarFigura(new Circulo(2.0));
        repositorio.adicionarFigura(new Quadrado(4.0));

        System.out.println("Tipo da figura 0: " + repositorio.recuperarTipo(0));
        System.out.println("Área da figura 0: " + repositorio.recuperarArea(0));
        System.out.println("Perímetro da figura 0: " + repositorio.recuperarPerimetro(0));

        System.out.println();

        System.out.println("Tipo da figura 1: " + repositorio.recuperarTipo(1));
        System.out.println("Área da figura 1: " + repositorio.recuperarArea(1));
        System.out.println("Perímetro da figura 1: " + repositorio.recuperarPerimetro(1));

        repositorio.removerFigura(0);

        System.out.println();
        System.out.println("Após remover a posição 0:");
        System.out.println("Tipo da nova figura 0: " + repositorio.recuperarTipo(0));
    }
}

