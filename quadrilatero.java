public class quadrilatero {
    public static double area(double lado) {
        return (lado *lado);
    }
    public static double area(double ladoRetangulo, double ladoRetangulo2) {
        return (ladoRetangulo *ladoRetangulo2);
    }
    
    public static double area (double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor)*altura/2);
    } 

    public static float area(float diagonalMenor, float diagonalMaior){
        return ((diagonalMenor * diagonalMaior) /2);
    }
}
