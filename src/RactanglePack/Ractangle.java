package RactanglePack;

public class Ractangle {
    static double side1;
    static double side2;

    public static double areaCalculator ( double side1, double side2){
        double S = side1 * side2;     // площа прямокутника
        return S;  // ретюрним результат
    }

    public static double perimeterCalculator (double side1, double side2) {
        double P = 2*(side1 + side2);   // периметри прямокутника
        return P;   // ретюрним результат
    }

    public static void main(String[] args) {
        System.out.println("Площа прямокутрника " + areaCalculator(5,4));   // ретюрнутий результат S передаємо методом в sout
        System.out.println("Периметр прямокутника " + perimeterCalculator(4,4)); // ретюрнутий результат S передаємо методом в sout
    }
}

