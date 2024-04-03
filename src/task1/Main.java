package task1;

public class Main {
    public static void main(String[] args) {
        double totalFigureArea = 0;

        Calculable[] figures = {
                new Circle(25),
                new Triangle(15, 30),
                new Square(50)
        };

        for (Calculable figure : figures) {
            totalFigureArea += figure.calculateArea();
        }

        System.out.printf ("Total area of all figures: %.2f%n", totalFigureArea);
    }
}