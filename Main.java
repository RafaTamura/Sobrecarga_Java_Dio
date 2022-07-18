public class Main {
    public static void main(String[] args) {
     System.out.println("Quadrilátero");

     double areaQuadrado = quadrilatero.area(20);
     System.out.println("A área do quadrado é " + areaQuadrado);

     double areaRetangulo = quadrilatero.area (30d, 20d);
     System.out.println("A área do retângulo é " + areaRetangulo);

     float areaLosango = quadrilatero.area (30f , 20f);
     System.out.println("A área do Losango é " + areaLosango);

     double areaTrapezio = quadrilatero.area (60, 30, 40);
     System.out.println("A área do Trapézio é " + areaTrapezio);

    }
    
}
