package task1;

public class Square implements Calculable {
    private final double side;

    public Square (double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
